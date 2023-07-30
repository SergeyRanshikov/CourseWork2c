package com.example.coursework2c.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class StorageIsEmptysException extends RuntimeException{
    public StorageIsEmptysException() {
    }

    public StorageIsEmptysException(String message) {
        super(message);
    }

    public StorageIsEmptysException(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageIsEmptysException(Throwable cause) {
        super(cause);
    }

    public StorageIsEmptysException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
