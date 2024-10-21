package com.example.HotelBookingSystem_server.service;



import com.example.HotelBookingSystem_server.model.User;

import java.util.List;


public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}
