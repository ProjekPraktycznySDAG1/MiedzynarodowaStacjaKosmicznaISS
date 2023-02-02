package org.SdaG1.service;

import org.SdaG1.model.IssPositionData;

public interface IssDataServiceInterface {
    public double calculateSpeed();

    public IssPositionData showCurrentIssLocation();
    public void save();


}
