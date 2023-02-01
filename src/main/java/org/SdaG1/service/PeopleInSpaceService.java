package org.SdaG1.service;

import org.SdaG1.model.People;

import java.util.List;

public class PeopleInSpaceService implements PeopleInSpaceInterface {

    JsonSerializerService jsonSerializerService = new JsonSerializerService();



    @Override
    public int getAmountOfPeopleInSpace() throws Exception {
       return jsonSerializerService.peopleData().getNumber();


    }

    @Override
    public List<People> showListOfPeopleInSpace() {
        return null;
    }
}
