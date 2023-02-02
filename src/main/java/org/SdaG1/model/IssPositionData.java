package org.SdaG1.model;

import javax.persistence.*;

@Entity
public class IssPositionData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "iss_position_id", nullable = false)
    private Long id;

    private double latitude;
    private double longitude;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "IssDataPosition{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}