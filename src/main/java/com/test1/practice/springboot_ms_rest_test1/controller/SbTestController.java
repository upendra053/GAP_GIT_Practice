package com.test1.practice.springboot_ms_rest_test1.controller;

import com.test1.practice.springboot_ms_rest_test1.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
public class SbTestController {

    @RequestMapping("/")
    public String sampleTest()
    {
        return "Sample Test Text";
    }

    @RequestMapping("/userDtls")
    public User userDetails()
    {
        User user = new User();
        user.setUserId(1);
        user.setUserName("Brave");
        user.setEmailId("brave.123@gmail.com");

        return user;
    }
}
