package com.socialnetwork;

public class Main {
    public static void main(String[] args) {
        // Create a new social network
        SocialNetwork network = new SocialNetwork();

        // Create users
        User alice = new User("Alice");
        User bob = new User("Bob");
        User charlie = new User("Charlie");

        // Add users to the network
        network.addUser(alice);
        network.addUser(bob);
        network.addUser(charlie);

        // Establish friendships
        alice.addFriend(bob);
        bob.addFriend(charlie);

        // Create and share posts
        network.createPost(alice, "Hello, this is Alice!");
        network.createPost(bob, "Good morning from Bob!");
        network.createPost(charlie, "Hi everyone, Charlie here!");

        // Display notifications for each user
        for (User user : network.getUsers()) {
            System.out.println(user.getUsername() + "'s notifications:");
            for (String notification : user.getNotifications()) {
                System.out.println(notification);
            }
            System.out.println();
        }
    }
}
