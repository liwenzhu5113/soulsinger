package com.ruoyi.consumer.client;


import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

/**
 * @author liwenzhu
 * @version UserClient,  2019/9/5 5:12 下午
 */
@FeignClient(name = "server")
@RequestMapping("/user")
public interface UsersClient {

    @RequestMapping("/getUserName")
    public AjaxResult getUserName(@RequestBody User user);

    @GetMapping("/getUserAge")
    public AjaxResult getUserAge(@RequestParam("userId") String userId);
}
