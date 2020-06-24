package com.example.demo.dao;

import com.example.demo.model.tdLocationSmsDistribute;

public interface tdLocationSmsDistributeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tdLocationSmsDistribute record);

    int insertSelective(tdLocationSmsDistribute record);

    tdLocationSmsDistribute selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tdLocationSmsDistribute record);

    int updateByPrimaryKey(tdLocationSmsDistribute record);
}