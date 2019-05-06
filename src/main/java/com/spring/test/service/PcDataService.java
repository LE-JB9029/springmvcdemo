package com.spring.test.service;

import com.spring.test.domain.PcData;

import java.util.List;

public interface PcDataService {

    int insert(PcData condition);

    int update(PcData condition);

    void save(PcData condition);

    int deleteById(Long id);

    PcData getById(Long id);

    List<PcData> findAll(PcData condition);
}
