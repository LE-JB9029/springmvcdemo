package com.spring.test.dao;

import com.spring.common.datasources.DataSourceNames;
import com.spring.common.datasources.annotation.DataSource;
import com.spring.test.domain.Data;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
@DataSource(name = DataSourceNames.FIRST)
public interface DataDao {
    int insert(Data condition);

    int update(Data condition);

    int deleteById(Long id);

    Data getById(Long id);

    List<Data> findAll(Data condition);
}
