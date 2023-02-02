package org.SdaG1.service;

import org.SdaG1.model.People;
import org.SdaG1.repository.PeopleDataRepository;

import java.util.List;

public class PeopleInSpaceService implements PeopleInSpaceInterface {

    JsonSerializerService jsonSerializerService;
    PeopleDataRepository peopleDataRepository;
    public PeopleInSpaceService(){
        jsonSerializerService = new JsonSerializerService();
        peopleDataRepository = new PeopleDataRepository();
    }

    public void savePeopleInSpaceDataIntoDb() throws Exception {
        peopleDataRepository.save(jsonSerializerService.peopleInSpaceData());
    }

    @Override
    public int getAmountOfPeopleInSpace() throws Exception {
       return jsonSerializerService.peopleInSpaceData().getNumber();
    }

    @Override
    public List<People> showListOfPeopleInSpace() throws Exception {
        return jsonSerializerService.peopleInSpaceData().getPeopleList();
    }
}
