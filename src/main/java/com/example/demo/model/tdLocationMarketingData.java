package com.example.demo.model;

import java.util.Date;

public class tdLocationMarketingData {
    private String parentMktId;

    private String userId;

    private String areaCode;

    private String areaName;

    private String taskName;

    private String submitUpperLimit;

    private Integer taskDist;

    private Date taskStartTimer;

    private Date taskEndTimer;

    private String submitFreq;

    private String taskRepeat;

    private Integer baseStationNum;

    private Date createTime;

    private Date updateTime;

    private Integer state;

    private Integer version;

    private String kqIds;

    private Integer syncHisState;

    private String backPhoneTable;

    private Integer cacheFlush;

    private String accountId;

    public String getParentMktId() {
        return parentMktId;
    }

    public void setParentMktId(String parentMktId) {
        this.parentMktId = parentMktId == null ? null : parentMktId.trim();
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

    public String getSubmitUpperLimit() {
        return submitUpperLimit;
    }

    public void setSubmitUpperLimit(String submitUpperLimit) {
        this.submitUpperLimit = submitUpperLimit == null ? null : submitUpperLimit.trim();
    }

    public Integer getTaskDist() {
        return taskDist;
    }

    public void setTaskDist(Integer taskDist) {
        this.taskDist = taskDist;
    }

    public Date getTaskStartTimer() {
        return taskStartTimer;
    }

    public void setTaskStartTimer(Date taskStartTimer) {
        this.taskStartTimer = taskStartTimer;
    }

    public Date getTaskEndTimer() {
        return taskEndTimer;
    }

    public void setTaskEndTimer(Date taskEndTimer) {
        this.taskEndTimer = taskEndTimer;
    }

    public String getSubmitFreq() {
        return submitFreq;
    }

    public void setSubmitFreq(String submitFreq) {
        this.submitFreq = submitFreq == null ? null : submitFreq.trim();
    }

    public String getTaskRepeat() {
        return taskRepeat;
    }

    public void setTaskRepeat(String taskRepeat) {
        this.taskRepeat = taskRepeat == null ? null : taskRepeat.trim();
    }

    public Integer getBaseStationNum() {
        return baseStationNum;
    }

    public void setBaseStationNum(Integer baseStationNum) {
        this.baseStationNum = baseStationNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getKqIds() {
        return kqIds;
    }

    public void setKqIds(String kqIds) {
        this.kqIds = kqIds == null ? null : kqIds.trim();
    }

    public Integer getSyncHisState() {
        return syncHisState;
    }

    public void setSyncHisState(Integer syncHisState) {
        this.syncHisState = syncHisState;
    }

    public String getBackPhoneTable() {
        return backPhoneTable;
    }

    public void setBackPhoneTable(String backPhoneTable) {
        this.backPhoneTable = backPhoneTable == null ? null : backPhoneTable.trim();
    }

    public Integer getCacheFlush() {
        return cacheFlush;
    }

    public void setCacheFlush(Integer cacheFlush) {
        this.cacheFlush = cacheFlush;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }
}