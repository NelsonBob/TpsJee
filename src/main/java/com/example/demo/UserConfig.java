package com.example.demo;

import org.springframework.beans.factory.annotation.Value;

public class UserConfig {
    @Value("myapp.getMax:5")
    private int maxUsers;

    public int getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }
}
