package com.example.sam.week11_firebasechat.model;

/**
 * Created by Sam on 4/3/17.
 */

public class ChatMessage {
    private String msg;
    private String userName;

    public ChatMessage(String msg) {
        this.msg = msg;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
