package com.example.demo.dao;

import com.example.demo.model.tdLocationMarketingData;

public interface tdLocationMarketingDataMapper {
    int deleteByPrimaryKey(String parentMktId);

    int insert(tdLocationMarketingData record);

    int insertSelective(tdLocationMarketingData record);

    tdLocationMarketingData selectByPrimaryKey(String parentMktId);

    int updateByPrimaryKeySelective(tdLocationMarketingData record);

    int updateByPrimaryKey(tdLocationMarketingData record);
}