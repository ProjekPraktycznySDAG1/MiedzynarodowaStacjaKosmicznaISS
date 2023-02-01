package org.SdaG1.model;

public class People {
    String name;
    String craft;

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
