package com.innowise.projectr.command;

import lombok.Getter;

public enum PageNameList {
    SIGNIN_PAGE("/passport/signIn"),
    SIGNUP_PAGE("/passport/signUp"),
    SIGNOUT_PAGE("/passport/signOut");

    @Getter
    private final String path;

    PageNameList(String path) {
        this.path = path;
    }
}
