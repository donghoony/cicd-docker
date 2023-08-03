package me.donghoony.cicd.dto;

public class MainResponse {
    public MainResponse(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    private String message;
}
