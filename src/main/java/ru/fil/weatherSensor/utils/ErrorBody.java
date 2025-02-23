package ru.fil.weatherSensor.utils;

import java.time.LocalDateTime;

public class ErrorBody {

    private String message;
    private LocalDateTime timestamp;

    public ErrorBody(String message) {
        this.message = message;
        timestamp=LocalDateTime.now();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
