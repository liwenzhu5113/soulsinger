package com.li.server.controller;

import com.li.server.pojo.User;
import com.ruoyi.common.core.web.domain.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liwenzhu
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/getUserName")
    public AjaxResult getUserName(@RequestBody User user){
        if("100".equals(user.getUserId())) {
            return AjaxResult.success("200","100");
        }else{
            return AjaxResult.success("200","不是100");
        }
    }
    @RequestMapping("/getUserAge")
    public AjaxResult getUserAge(@RequestParam("userId") String userId){
        if ("50".equals(userId)){
            return AjaxResult.success("200","10");
        }else {
            return AjaxResult.success("200","20");
        }
    }
}
