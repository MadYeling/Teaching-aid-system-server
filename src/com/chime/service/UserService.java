package com.chime.service;


import com.chime.bean.UserBean;
import com.chime.dao.UserMapper;
import com.chime.service.IntUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService implements IntUserService {

    @Resource
    UserMapper mapper;

    @Override
    public boolean check(String userName, String passwd) {
        if (passwd == null) {
            return false;
        }
        UserBean userBean = mapper.queryUserByName(userName);
        if (userBean == null) {
            return false;
        }
        String queriedPassword = userBean.getPasswd();
        return passwd.equals(queriedPassword);
    }
}
