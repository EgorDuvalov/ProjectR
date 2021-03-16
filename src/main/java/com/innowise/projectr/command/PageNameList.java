package com.innowise.projectr.command;

import lombok.Getter;

public enum PageNameList {
    HOME_PAGE("/home"),
    SIGNIN_PAGE("/passport/login"),
    SIGNUP_PAGE("/passport/signUp"),
    SIGNOUT_PAGE("/passport/signOut");

    @Getter
    private final String path;

    PageNameList(String path) {
        this.path = path;
    }
}
