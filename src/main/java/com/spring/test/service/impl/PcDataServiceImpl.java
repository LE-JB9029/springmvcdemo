package com.spring.test.service.impl;

import com.spring.test.dao.PcDataDao;
import com.spring.test.domain.PcData;
import com.spring.test.service.PcDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcDataServiceImpl implements PcDataService {

    @Autowired
    private PcDataDao pcDataDao;

    @Override
    public int insert(PcData condition) {
        return pcDataDao.insert(condition);
    }

    @Override
    public int update(PcData condition) {
        return pcDataDao.update(condition);
    }

    @Override
    public void save(PcData condition) {
        if (condition.getId() != null) {
            update(condition);
        } else {
            insert(condition);
        }
    }

    @Override
    public int deleteById(Long id) {
        return pcDataDao.deleteById(id);
    }

    @Override
    public PcData getById(Long id) {
        return pcDataDao.getById(id);
    }

    @Override
    public List<PcData> findAll(PcData condition) {
        return pcDataDao.findAll(condition);
    }
}
