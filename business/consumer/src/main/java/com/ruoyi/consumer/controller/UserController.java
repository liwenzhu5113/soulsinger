package com.ruoyi.consumer.controller;


import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.consumer.client.UsersClient;
import com.ruoyi.consumer.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liwenzhu
 * @version UserController,  2019/9/5 7:56 下午
 */
@Slf4j
@RestController
public class UserController {

    @Autowired
    private UsersClient usersClient;

    //form 写法
    @RequestMapping("/getUserName")
    public AjaxResult getUserName(@RequestBody User user){
        return usersClient.getUserName(user) ;
    }
}
