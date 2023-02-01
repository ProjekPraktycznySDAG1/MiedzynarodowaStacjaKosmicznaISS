package org.SdaG1.model;


public class IssData {
    public IssDataPosition iss_position;
    public String timestamp;
    public String message;

    public IssDataPosition getIss_position() {
        return iss_position;
    }

    public void setIss_position(IssDataPosition iss_position) {
        this.iss_position = iss_position;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ISSData{" +
                "iss_position=" + iss_position +
                ", timestamp=" + timestamp +
                ", message='" + message + '\'' +
                '}';
    }


    public IssData(IssDataPosition iss_position, String timestamp, String message) {
        this.iss_position = iss_position;
        this.timestamp = timestamp;
        this.message = message;
    }
}
