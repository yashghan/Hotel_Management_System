package com.example.HotelBookingSystem_server.exception;

public class RoleAlreadyExistException extends RuntimeException {
    public RoleAlreadyExistException(String message) {
        super(message);
    }
}
