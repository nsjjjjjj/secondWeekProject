package com.springboot.api.dto;

public class PostRequestDto {
    private String name;
    private String email;
    private String age;
    private String address;
    private String phoneNumber;

    public PostRequestDto() {}

    public PostRequestDto(String name, String email, String age, String address, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAge() { return age; }
    public void setAge(String age) { this.age = age; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}