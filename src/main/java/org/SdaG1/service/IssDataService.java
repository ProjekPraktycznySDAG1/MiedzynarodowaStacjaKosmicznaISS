package org.SdaG1.service;

import org.SdaG1.model.IssPositionData;
import org.SdaG1.utils.JsonSerializer;

public class IssDataService implements IssDataServiceInterface {

    JsonSerializer jsonSerializerService;

    public IssDataService() {
        this.jsonSerializerService = new JsonSerializer();
    }

    @Override
    public double calculateSpeed() throws Exception {
        IssPositionData issDataPointA = jsonSerializerService.getIssDataObjectFromJson().getIss_position();
        Thread.sleep(5000);
        IssPositionData issDataPointB = jsonSerializerService.getIssDataObjectFromJson().getIss_position();
        double latA = issDataPointA.getLatitude(), lonA = issDataPointA.getLongitude(),
                latB = issDataPointB.getLatitude(), lonB = issDataPointB.getLongitude();
        return getDistanceBetweenTwoPointsInKm(latA, lonA, latB, lonB) / 5 * 3600;
    }

    private static double getDistanceBetweenTwoPointsInKm(double latA, double lonA, double latB, double lonB) {
        double r = 6371; // Radius of earth in km
        double latDiff = Math.toRadians(latB - latA);
        double lonDiff = Math.toRadians(lonB - lonA);
        double a = Math.sin(latDiff / 2) * Math.sin(latDiff / 2) + Math.cos(Math.toRadians(latA)) *
                Math.cos(Math.toRadians(latB)) * Math.sin(lonDiff / 2) * Math.sin(lonDiff / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return r * c;
    }

    @Override
    public IssPositionData showCurrentIssLocation() throws Exception {
        return jsonSerializerService.getIssDataObjectFromJson().getIss_position();
    }

    @Override
    public void save() {

    }
}
