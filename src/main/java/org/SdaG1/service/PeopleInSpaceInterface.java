package org.SdaG1.service;

import org.SdaG1.model.People;

import java.util.List;

public interface PeopleInSpaceInterface {
    public int getAmountOfPeopleInSpace() throws Exception;
    public List<People> showListOfPeopleInSpace() throws Exception;
}
