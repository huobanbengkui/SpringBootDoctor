package com.huobanbengkui.MyBatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String getUserName(int id) {
        String str = userService.Sel(id).toString();
        return str;
    }
}
