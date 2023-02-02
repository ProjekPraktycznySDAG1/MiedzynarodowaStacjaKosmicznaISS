package org.SdaG1.model;

import javax.persistence.*;

@Entity
public class IssData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "iss_position_id")
    public IssPositionData iss_position;
    public String timestamp;
    public String message;


    public IssData() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IssPositionData getIss_position() {
        return iss_position;
    }

    public void setIss_position(IssPositionData iss_position) {
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


    public IssData(IssPositionData iss_position, String timestamp, String message) {
        this.iss_position = iss_position;
        this.timestamp = timestamp;
        this.message = message;
    }
}
