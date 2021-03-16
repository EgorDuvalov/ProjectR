package com.innowise.projectr.controller;


import com.innowise.projectr.command.PageNameList;
import com.innowise.projectr.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/passport")
public class PassportController {

    @GetMapping("/signin")
    public String signIn() {
        User user = new User();

        return PageNameList.SIGNIN_PAGE.getPath();
    }

    @GetMapping("/signup")
    public String signUp() {
        return PageNameList.SIGNUP_PAGE.getPath();
    }

    @GetMapping("/signout")
    public String signOut() {
        return PageNameList.SIGNOUT_PAGE.getPath();
    }
}
