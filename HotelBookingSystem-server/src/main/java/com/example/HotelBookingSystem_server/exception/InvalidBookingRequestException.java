package com.example.HotelBookingSystem_server.exception;


public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}
