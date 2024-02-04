package com.anbruvic.exception;

public class BadRequestException extends RuntimeException {

    private static final long serialVersionUID = 8859398090711563762L;

    public BadRequestException(String message) {
        super(message);
    }
}
