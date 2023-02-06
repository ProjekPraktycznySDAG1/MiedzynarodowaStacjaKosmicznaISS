package org.SdaG1.model;

import com.google.gson.annotations.SerializedName;

import javax.persistence.*;

@Entity
@Table(name = "iss_position_data")
public class IssData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "issData_id", nullable = false)
    private Long id;

    @OneToOne(mappedBy = "issData")
    @JoinColumn(name = "coord_id")
    @SerializedName("iss_position")
    public Coordinates coordinates;
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

    public Coordinates getIss_position() {
        return coordinates;
    }

    public void setIss_position(Coordinates iss_position) {
        this.coordinates = iss_position;
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
                "iss_position=" + coordinates +
                ", timestamp=" + timestamp +
                ", message='" + message + '\'' +
                '}';
    }


    public IssData(Coordinates iss_position, String timestamp, String message) {
        this.coordinates = iss_position;
        this.timestamp = timestamp;
        this.message = message;
    }
}
