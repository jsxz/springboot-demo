package vip.anjun.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class User {
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
