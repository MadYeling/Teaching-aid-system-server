package com.chime.controller;

import com.chime.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@Controller
@RequestMapping("LoginController")
public class LoginController {

    private UserService userService;

    public LoginController() throws IOException {
        userService = CtxUtil.getBean(UserService.class);
    }

    @RequestMapping(value = "login.json", produces = "application/x-www-form-urlencoded")
    public void login(HttpServletResponse response, @RequestParam Map<String, String> map) {
        String userName = map.get("userName");
        String password = map.get("password");
        System.out.println("接收到了对接口LoginController/login.json的访问，用户名：" + userName + ",密码：" + password);
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = null;
        JSONObject json = new JSONObject();

        try {
            out = response.getWriter();
            json.put("MyStatus", userService.check(userName, password) ? 1 : 0);
            out.write(json.toString());
        } catch (Exception e) {
            e.printStackTrace();
            json.put("MyStatus", -1);
            if (out != null) {
                out.write(json.toString());
            }
        } finally {
            if (out != null) {
                out.flush();
                out.close();
            }
        }
    }
}
