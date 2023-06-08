package com.wsdev.ecommerce.services.exceptions;

public class DatabaseException extends RuntimeException {
    public DatabaseException(String msg) {

        super(msg);
    }
}
