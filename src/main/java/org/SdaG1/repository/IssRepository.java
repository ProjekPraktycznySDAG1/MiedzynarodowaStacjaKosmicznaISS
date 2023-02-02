package org.SdaG1.repository;

import org.SdaG1.model.People;

import java.util.List;

public interface IssRepository<T> {
    public void save(T t);
    public List<People> getListOfPeopleInSpace();

}
