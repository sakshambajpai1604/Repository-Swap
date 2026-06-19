package com.saksham;

public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void registerUser(int id, String name) {
        repository.save(new User(id, name));
    }

    public void displayAllUsers() {
        repository.findAll().forEach(System.out::println);
    }

    public void findUser(int id) {
        System.out.println(repository.findById(id));
    }
}
