package com.example.HotelBookingSystem_server.exception;


public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message);
    }
}
