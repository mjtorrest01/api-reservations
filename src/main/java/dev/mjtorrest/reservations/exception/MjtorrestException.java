package dev.mjtorrest.reservations.exception;

public class MjtorrestException extends RuntimeException {
    private String description;

    public MjtorrestException(String message) {
        super(message);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
