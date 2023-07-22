package com.springrestcrud.demo;

public class RestException extends RuntimeException {
    public RestException(String message){
        super(message);
    }
}
