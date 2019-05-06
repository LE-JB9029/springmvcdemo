package com.spring.test.service;

import com.spring.test.domain.Data;

import java.util.List;

public interface DataService {

    int insert(Data condition);

    int update(Data condition);

    void save(Data condition);

    int deleteById(Long id);

    Data getById(Long id);

    List<Data> findAll(Data condition);
}
