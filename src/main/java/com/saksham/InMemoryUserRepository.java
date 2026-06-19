package com.saksham;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserRepository implements UserRepository {

    private final List<User> users = new ArrayList<>();

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public User findById(int id) {
        return users.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> findAll() {
        return users;
    }
}
