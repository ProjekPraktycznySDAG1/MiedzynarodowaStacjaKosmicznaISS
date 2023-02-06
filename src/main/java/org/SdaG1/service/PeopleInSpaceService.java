package org.SdaG1.service;

import org.SdaG1.model.People;
import org.SdaG1.model.PeopleInSpaceData;
import org.SdaG1.repository.PeopleDataRepository;
import org.SdaG1.utils.JsonSerializer;

import java.util.List;

public class PeopleInSpaceService implements PeopleInSpaceInterface {

    JsonSerializer jsonSerializerService;
    PeopleDataRepository peopleDataRepository;
    public PeopleInSpaceService(){
        jsonSerializerService = new JsonSerializer();
        peopleDataRepository = new PeopleDataRepository();
    }

    public void savePeopleInSpaceDataIntoDb() throws Exception {
        peopleDataRepository.save(jsonSerializerService.getPeopleInSpaceDataObjectFromJson());
    }

    public void saveIssLocationDataIntoDb() throws Exception {
        peopleDataRepository.save(jsonSerializerService.getIssDataObjectFromJson());
        System.out.println(jsonSerializerService.getIssDataObjectFromJson());
    }

    @Override
    public int getAmountOfPeopleInSpace() throws Exception {
       return jsonSerializerService.getPeopleInSpaceDataObjectFromJson().getNumber();
    }

    @Override
    public List<People> showListOfPeopleInSpace() throws Exception {
        return jsonSerializerService.getPeopleInSpaceDataObjectFromJson().getPeopleList();
    }

    public void checkIfPersonExistsInDb(PeopleInSpaceData person){
        peopleDataRepository.getPersonByName(person);
    }
}
