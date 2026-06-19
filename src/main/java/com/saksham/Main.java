package com.saksham;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== In Memory Repository ===");

        UserRepository memoryRepo = new InMemoryUserRepository();
        UserService memoryService = new UserService(memoryRepo);

        memoryService.registerUser(1, "Alice");
        memoryService.registerUser(2, "Bob");

        memoryService.displayAllUsers();
        memoryService.findUser(1);

        System.out.println();

        System.out.println("=== JPA Style Repository ===");

        UserRepository jpaRepo = new JpaUserRepository();
        UserService jpaService = new UserService(jpaRepo);

        jpaService.registerUser(1, "Alice");
        jpaService.registerUser(2, "Bob");

        jpaService.displayAllUsers();
        jpaService.findUser(1);
    }
}