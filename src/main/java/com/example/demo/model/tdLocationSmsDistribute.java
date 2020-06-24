package com.example.demo.model;

import java.util.Date;

public class tdLocationSmsDistribute {
    private Integer id;

    private String childMktId;

    private String smsPhone;

    private String smsContent;

    private Integer smsChannel;

    private String state;

    private Date createDate;

    private Date updateDate;

    private Integer takeCount;

    private Integer version;

    private String remark;

    private String businessId;

    private String userId;

    private String msgId;

    private String smsRepeat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChildMktId() {
        return childMktId;
    }

    public void setChildMktId(String childMktId) {
        this.childMktId = childMktId == null ? null : childMktId.trim();
    }

    public String getSmsPhone() {
        return smsPhone;
    }

    public void setSmsPhone(String smsPhone) {
        this.smsPhone = smsPhone == null ? null : smsPhone.trim();
    }

    public String getSmsContent() {
        return smsContent;
    }

    public void setSmsContent(String smsContent) {
        this.smsContent = smsContent == null ? null : smsContent.trim();
    }

    public Integer getSmsChannel() {
        return smsChannel;
    }

    public void setSmsChannel(Integer smsChannel) {
        this.smsChannel = smsChannel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getTakeCount() {
        return takeCount;
    }

    public void setTakeCount(Integer takeCount) {
        this.takeCount = takeCount;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId == null ? null : msgId.trim();
    }

    public String getSmsRepeat() {
        return smsRepeat;
    }

    public void setSmsRepeat(String smsRepeat) {
        this.smsRepeat = smsRepeat == null ? null : smsRepeat.trim();
    }
}