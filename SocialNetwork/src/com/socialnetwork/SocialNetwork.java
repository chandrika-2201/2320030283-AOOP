package com.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
    private List<User> users;
    private List<Post> posts;

    public SocialNetwork() {
        users = new ArrayList<>();
        posts = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void createPost(User author, String content) {
        Post post = new Post(author, content);
        posts.add(post);
        notifyFriends(author, "New post by " + author.getUsername() + ": " + content);
    }

    private void notifyFriends(User author, String message) {
        for (User friend : author.getFriends()) {
            friend.sendNotification(message);
        }
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<User> getUsers() {
        return users;
    }
}
