package com.example.hp.meetme;

public class cards {
    private String userId;
    private String name;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public cards(String userId, String name){
        this.userId = userId;
        this.name = name;


    }
}
