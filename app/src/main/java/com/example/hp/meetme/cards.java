package com.example.hp.meetme;

public class cards {
    private String userId;
    private String name;
    private String ProfileImageUrl;

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

    public String getProfileImageUrl() {
        return ProfileImageUrl;
    }
    public void setProfileImageUrl(String profileImageUrl) {
        this.ProfileImageUrl = ProfileImageUrl;
    }

    public cards(String userId, String name, String ProfileImageUrl){
        this.userId = userId;
        this.name = name;
        this.ProfileImageUrl = ProfileImageUrl;


    }
}
