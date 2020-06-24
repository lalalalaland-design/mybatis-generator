package com.example.demo.model;

import java.util.Date;

public class tdLocationMarketingChildData {
    private String parentMktId;

    private String childMktId;

    private String userId;

    private String areaCode;

    private String areaName;

    private String taskName;

    private Date taskSubmintTimer;

    private Integer userNum;

    private Integer state;

    private Integer syncHisState;

    private Integer cacheFlush;

    public String getParentMktId() {
        return parentMktId;
    }

    public void setParentMktId(String parentMktId) {
        this.parentMktId = parentMktId == null ? null : parentMktId.trim();
    }

    public String getChildMktId() {
        return childMktId;
    }

    public void setChildMktId(String childMktId) {
        this.childMktId = childMktId == null ? null : childMktId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public Date getTaskSubmintTimer() {
        return taskSubmintTimer;
    }

    public void setTaskSubmintTimer(Date taskSubmintTimer) {
        this.taskSubmintTimer = taskSubmintTimer;
    }

    public Integer getUserNum() {
        return userNum;
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getSyncHisState() {
        return syncHisState;
    }

    public void setSyncHisState(Integer syncHisState) {
        this.syncHisState = syncHisState;
    }

    public Integer getCacheFlush() {
        return cacheFlush;
    }

    public void setCacheFlush(Integer cacheFlush) {
        this.cacheFlush = cacheFlush;
    }
}