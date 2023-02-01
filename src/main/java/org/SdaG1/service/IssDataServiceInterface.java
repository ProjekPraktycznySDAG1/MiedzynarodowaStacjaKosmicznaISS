package org.SdaG1.service;

import org.SdaG1.model.IssDataPosition;

public interface IssDataServiceInterface {
    public double calculateSpeed();

    public IssDataPosition showCurrentIssLocation();
    public void save();


}
