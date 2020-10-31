package me.project.throwingmoney.error;

import lombok.Getter;

@Getter
public class ErrorResponse {

    private String message;

    public ErrorResponse(String message) {
        this.message = message;
    }

    public static ErrorResponse messageOf(String message) {
        return new ErrorResponse(message);
    }
}
