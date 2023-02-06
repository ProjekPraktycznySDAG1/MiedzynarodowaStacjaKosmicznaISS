package org.SdaG1.model;

import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "people_in_space_data")
public class PeopleInSpaceData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "people_data_id", nullable = false)
    private Integer id;

    @Column(unique = true)
    private int number;

    @OneToMany(mappedBy = "peopleInSpaceData", cascade = CascadeType.ALL)
    @SerializedName("people")
    private List<People> peopleList;

    public PeopleInSpaceData() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
