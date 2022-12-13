package com.lunzhoufei.xpan.common.po;

import java.io.Serializable;
import java.util.Date;

public class OrderPo implements Serializable {
    private Long id;

    private Long uid;

    private String orderSn;

    private String accountSn;

    private Long recordTs;

    private String goodsName;

    private String goodsImage;

    private Integer orderType;

    private Integer displayAmount;

    private Integer refundAmount;

    private Integer payment;

    private String mktTrSc;

    private String mktTrDomain;

    private String activitySn;

    private String extra;

    private Date createdAt;

    private Date updatedAt;

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

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public String getAccountSn() {
        return accountSn;
    }

    public void setAccountSn(String accountSn) {
        this.accountSn = accountSn == null ? null : accountSn.trim();
    }

    public Long getRecordTs() {
        return recordTs;
    }

    public void setRecordTs(Long recordTs) {
        this.recordTs = recordTs;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage == null ? null : goodsImage.trim();
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getDisplayAmount() {
        return displayAmount;
    }

    public void setDisplayAmount(Integer displayAmount) {
        this.displayAmount = displayAmount;
    }

    public Integer getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Integer refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public String getMktTrSc() {
        return mktTrSc;
    }

    public void setMktTrSc(String mktTrSc) {
        this.mktTrSc = mktTrSc == null ? null : mktTrSc.trim();
    }

    public String getMktTrDomain() {
        return mktTrDomain;
    }

    public void setMktTrDomain(String mktTrDomain) {
        this.mktTrDomain = mktTrDomain == null ? null : mktTrDomain.trim();
    }

    public String getActivitySn() {
        return activitySn;
    }

    public void setActivitySn(String activitySn) {
        this.activitySn = activitySn == null ? null : activitySn.trim();
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra == null ? null : extra.trim();
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
}