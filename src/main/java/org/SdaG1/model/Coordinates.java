package org.SdaG1.model;

import javax.persistence.*;

@Entity
@Table(name = "coordinates")
public class Coordinates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coord_id", nullable = false)
    private Long id;

    private double latitude;
    private double longitude;
    @OneToOne
    private IssData issData;

    public IssData getIssData() {
        return issData;
    }

    public void setIssData(IssData issData) {
        this.issData = issData;
    }

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