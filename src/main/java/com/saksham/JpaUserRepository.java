package com.saksham;

import java.util.ArrayList;
import java.util.List;

public class JpaUserRepository implements UserRepository {

    private final List<User> database = new ArrayList<>();

    @Override
    public void save(User user) {
        System.out.println("INSERT INTO users VALUES (" +
                user.getId() + ", '" + user.getName() + "')");

        database.add(user);
    }

    @Override
    public User findById(int id) {
        System.out.println("SELECT * FROM users WHERE id = " + id);

        return database.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> findAll() {
        System.out.println("SELECT * FROM users");
        return database;
    }
}
