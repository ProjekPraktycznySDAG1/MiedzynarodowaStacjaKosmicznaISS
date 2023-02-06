package org.SdaG1.controller;

import org.SdaG1.model.People;

import org.SdaG1.model.PeopleInSpaceData;

import org.SdaG1.service.IssDataService;

import org.SdaG1.service.PeopleInSpaceService;


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ConsoleController {


    boolean running = true;
    PeopleInSpaceService peopleInSpaceService = new PeopleInSpaceService();
    IssDataService issDataService = new IssDataService();

    public void showMenuOptions() throws Exception {

        while (running) {

            System.out.println("International Space Station Information Centre");
            System.out.println("1. Current ISS location");
            System.out.println("2. Calculate ISS Speed");
            System.out.println("3. Number of People in Space");
            System.out.println("4. List of People in Space");
            System.out.println("5. Exit");


            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int choice = Integer.parseInt(bufferedReader.readLine());

            switch (choice) {
                case 1:

                    //   showCurrentIssLocation();


                    System.out.println(issDataService.showCurrentIssLocation());
                    break;
                case 2:
                    System.out.println("Average speed for the last 5 seconds is: " + issDataService.calculateSpeed() + " km/h");

                    break;
                case 3:
                    peopleInSpaceService.savePeopleInSpaceDataIntoDb();
                    System.out.println("Amount of People in Space: " + peopleInSpaceService.getAmountOfPeopleInSpace());
                    break;

                case 4:

                    System.out.println("List of People in Space: \n");
                    for (People people : peopleInSpaceService.showListOfPeopleInSpace()) {
                        System.out.println(people.getName());
                    }
                    break;

                case 5:
                    running = false;
                    break;


            }
        }
    }


}

