package org.SdaG1.service;

import org.SdaG1.model.IssPositionData;

public interface IssDataServiceInterface {
    public double calculateSpeed() throws Exception;

    public IssPositionData showCurrentIssLocation() throws Exception;
    public void save();


}
