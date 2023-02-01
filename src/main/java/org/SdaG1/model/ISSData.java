package org.SdaG1.model;


public class ISSData {
    public ISSDataPosition iss_position;
    public long timestamp;
    public String message;

    public ISSDataPosition getIss_position() {
        return iss_position;
    }

    public void setIss_position(ISSDataPosition iss_position) {
        this.iss_position = iss_position;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
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

    public ISSData(ISSDataPosition iss_position, long timestamp, String message) {
        this.iss_position = iss_position;
        this.timestamp = timestamp;
        this.message = message;



    }
}
