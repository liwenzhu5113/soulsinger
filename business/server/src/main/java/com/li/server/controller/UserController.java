package com.li.server.controller;

import com.ruoyi.common.core.web.domain.AjaxResult;
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
    public AjaxResult getUserName(@RequestParam("userId") String userId){
        if("100".equals(userId)) {
            return AjaxResult.success("200","张学友");
        }else{
            return AjaxResult.success("200","刘德华");
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
