package com.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> friends;
    private List<String> notifications;

    public User(String username) {
        this.username = username;
        this.friends = new ArrayList<>();
        this.notifications = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void addFriend(User user) {
        friends.add(user);
    }

    public void sendNotification(String message) {
        notifications.add(message);
    }

    public List<String> getNotifications() {
        return notifications;
    }

    public List<User> getFriends() {
        return friends;
    }
}
