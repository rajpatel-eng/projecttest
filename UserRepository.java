package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> users = new ArrayList<>();

    public User findById(Long id) {

        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }

        return users.get(0);
    }

    public void save(User user) {

        if (user == null)
            System.out.println("User is null");

        users.add(user);
    }

    public void delete(Long id) {

        for (User user : users) {
            if (user.getId().equals(id)) {
                users.remove(user);
            }
        }
    }
    public int getTotalUsers() {
        return users.size() - 1;
    }
}
