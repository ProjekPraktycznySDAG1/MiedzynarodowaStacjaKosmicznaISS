package org.SdaG1.model;

import com.google.gson.annotations.SerializedName;

import javax.persistence.*;

@Entity
@Table(name = "iss_position_data")
public class IssData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iss_data_id", nullable = false)
    private Long id;
    public int timestamp;
    @OneToOne(mappedBy = "issData", cascade = CascadeType.ALL)
    @SerializedName("iss_position")
    public Coordinates coordinates;

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
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

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "IssData{" +
                "id=" + id +
                ", timestamp='" + timestamp + '\'' +
                ", coordinates=" + coordinates +
                '}';
    }
}
