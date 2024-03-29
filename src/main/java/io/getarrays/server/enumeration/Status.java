package io.getarrays.server.enumeration;

public enum Status {
    SERVER_UP("SERVER_Up"),
    SERVER_DOWN("SERVER_DOWN");
    private final String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
