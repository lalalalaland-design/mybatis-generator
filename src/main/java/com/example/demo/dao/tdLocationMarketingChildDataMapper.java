package com.example.demo.dao;

import com.example.demo.model.tdLocationMarketingChildData;

public interface tdLocationMarketingChildDataMapper {
    int deleteByPrimaryKey(String parentMktId);

    int insert(tdLocationMarketingChildData record);

    int insertSelective(tdLocationMarketingChildData record);

    tdLocationMarketingChildData selectByPrimaryKey(String parentMktId);

    int updateByPrimaryKeySelective(tdLocationMarketingChildData record);

    int updateByPrimaryKey(tdLocationMarketingChildData record);
}