package com.ruoyi.consumer.client;


import com.ruoyi.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wayne
 * @version UserClient,  2019/9/5 5:12 下午
 */
@FeignClient(name = "server")
@RequestMapping("/user")
public interface UsersClient {

    @GetMapping("/getUserName")
    public String getUserName(@RequestParam("userId") String userId);

    @GetMapping("/getUserAge")
    public String getUserAge(@RequestParam("userId") String userId, @SpringQueryMap User user);
}
