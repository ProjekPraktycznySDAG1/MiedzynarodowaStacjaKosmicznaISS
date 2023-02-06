package org.SdaG1.service;

import org.SdaG1.model.Coordinates;

public interface IssDataServiceInterface {
    public double calculateSpeed() throws Exception;

    public Coordinates showCurrentIssLocation() throws Exception;
    public void save();


}
