package com.bmzx.platform.oauth.ui;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/l")
public class HelloController extends BaseController {
    @GetMapping("/")
    @ResponseBody
    public String hello(){
        return "hello gradle!";
    }
}
