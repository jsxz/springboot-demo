package vip.anjun.db.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.anjun.db.domain.User;
import vip.anjun.db.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User u) {
        int r = userService.add(u);
        System.out.println("insert resutl:" + r);
        return "ok";
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
