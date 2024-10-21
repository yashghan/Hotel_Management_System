package com.example.HotelBookingSystem_server.exception;



public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
