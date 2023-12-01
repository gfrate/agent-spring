package it.gfrate.agent.model;

public class UrlResponse {
    private boolean success;
    private String value;

    public UrlResponse() {
    }

    public UrlResponse(boolean success, String value) {
        this.success = success;
        this.value = value;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
