package com.bmzx.platform.oauth.ui;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class BaseController {

    @RequestMapping("/save")
    public String save(){

        return "你好";
    }
}
