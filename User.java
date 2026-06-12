package com.example.demo.model;

public class User {

    private Long id;
    private String name;
    private Integer age;
    private String email;
    public User(Long id, String name, Integer age, String email) {
        id = id;
        name = name;
        age = age;
        email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email.trim();
    }

    @Override
    public boolean equals(Object obj) {

        User other = (User) obj;

        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
