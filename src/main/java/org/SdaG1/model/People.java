package org.SdaG1.model;

import javax.persistence.*;

@Entity
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "people_id", nullable = false)
    private Long id;

    String name;
    String craft;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCraft() {
        return craft;
    }

    public void setCraft(String craft) {
        this.craft = craft;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", craft='" + craft + '\'' +
                "} \n " ;
    }
}
