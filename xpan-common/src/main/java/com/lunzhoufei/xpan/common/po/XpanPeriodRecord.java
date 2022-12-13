package com.lunzhoufei.xpan.common.po;

import java.io.Serializable;
import java.util.Date;

public class XpanPeriodRecord implements Serializable {
    private Long id;

    private Long uid;

    private Integer playNum;

    private Date endTime;

    private Date withdrawTime;

    private String strategy;

    private Long premiumPlayNum;

    private Date privilegeExpireTime;

    private String openType;

    private String adjustExt;

    private Long awardAmount;

    private String misc;

    private Date createdAt;

    private Date updatedAt;

    private Date startTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Integer getPlayNum() {
        return playNum;
    }

    public void setPlayNum(Integer playNum) {
        this.playNum = playNum;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getWithdrawTime() {
        return withdrawTime;
    }

    public void setWithdrawTime(Date withdrawTime) {
        this.withdrawTime = withdrawTime;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public Long getPremiumPlayNum() {
        return premiumPlayNum;
    }

    public void setPremiumPlayNum(Long premiumPlayNum) {
        this.premiumPlayNum = premiumPlayNum;
    }

    public Date getPrivilegeExpireTime() {
        return privilegeExpireTime;
    }

    public void setPrivilegeExpireTime(Date privilegeExpireTime) {
        this.privilegeExpireTime = privilegeExpireTime;
    }

    public String getOpenType() {
        return openType;
    }

    public void setOpenType(String openType) {
        this.openType = openType;
    }

    public String getAdjustExt() {
        return adjustExt;
    }

    public void setAdjustExt(String adjustExt) {
        this.adjustExt = adjustExt == null ? null : adjustExt.trim();
    }

    public Long getAwardAmount() {
        return awardAmount;
    }

    public void setAwardAmount(Long awardAmount) {
        this.awardAmount = awardAmount;
    }

    public String getMisc() {
        return misc;
    }

    public void setMisc(String misc) {
        this.misc = misc;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}