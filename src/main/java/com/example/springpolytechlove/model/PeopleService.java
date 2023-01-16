package com.example.springpolytechlove.model;

import java.util.List;

public interface PeopleService {
    List<People> findById(long id);

    List<People> findAllBy();

    void save(People people);
}