package com.company;


import java.util.UUID;

public class User {

    private String id;
    private String name;
    private String email;
    private String password;
    private int age;
    private String apiKey;  // alt + enter
    private String accessToken;

    // alt+ins
    public User(String name, int age, String email, String apiKey, String accessToken) {
        this.id = generateId();
        this.name = name;
        this.email = email;
        this.age = age;
        this.apiKey = apiKey;
        this.accessToken = accessToken;
        this.buildLog();
    }

    public User(String name, String email) {
        this.id = generateId();
        this.name = name;
        this.email = email;
        this.buildLog();
    }

    public User() {
        this("new user", -1, "-", null, null);
    }

    // Copy constructor
    public User(User toCopy) {
        this(toCopy.name, toCopy.age, toCopy.email, toCopy.apiKey, toCopy.accessToken);
        this.id = toCopy.id;
        this.setPassword(toCopy.getPassword());
    }


    private void buildLog() {
        System.out.println("User with email=" + getEmail() + " was registered. ID=" + this.id);
    }

    private static String generateId() {
        return UUID.randomUUID().toString();
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }
}
