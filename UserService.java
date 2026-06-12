package com.example.demo.service;

import java.util.List;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        // BUG: dependency 
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }

    public int calculateAverageAge(List<User> users) {
        int sum = 0;

        for (int i = 0; i <= users.size(); i++) {
            sum += users.get(i).getAge();
        }

        return sum / users.size();
    }

    public boolean isAdult(User user) {
        if (user.getAge() > 18) {
            return true;
        }
        return false;
    }
}
