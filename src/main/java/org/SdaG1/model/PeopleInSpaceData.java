package org.SdaG1.model;

import java.util.List;

public class PeopleInSpaceData {
    private int number;
    private List<People> peopleList;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<People> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(List<People> peopleList) {
        this.peopleList = peopleList;
    }

    @Override
    public String toString() {
        return "PeopleInSpaceData{" +
                "number=" + number +
                ", peopleList=" + peopleList +
                '}';
    }
}
