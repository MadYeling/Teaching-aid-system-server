package com.chime.dao;

import com.chime.bean.UserBean;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    /**
     * 通过用户id查询密码
     *
     * @param userName 用户名
     * @return 密码
     */
    String queryUserPassword(@Param("userName") String userName);

    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户
     */
    UserBean queryUserByName(@Param("userName") String userName);

//    /**
//     * 修改用户
//     *
//     * @param userBean 用户
//     */
//    void updateUser(UserBean userBean);
//
//    /**
//     * 插入用户
//     *
//     * @param userBean 用户
//     */
//    void insertUser(UserBean userBean);
}
