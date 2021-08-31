package com.ruoyi.consumer.controller;


import com.ruoyi.consumer.client.UsersClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wayne
 * @version UserController,  2019/9/5 7:56 下午
 */
@Slf4j
@RestController
public class UserController {

    @Autowired
    private UsersClient usersClient;

    @RequestMapping("/getUserName")
    public String getUserName(String userId){
        return usersClient.getUserName(userId);
    }
}
