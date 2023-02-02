package org.SdaG1.model;

import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import java.util.List;

@Entity
public class PeopleInSpaceData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "people_data_id", nullable = false)
    private Long id;

    private int number;

    @OneToMany
    @JoinColumn(name = "people_id")
    @SerializedName("people")
    private List<People> peopleList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
