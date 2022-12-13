package com.lunzhoufei.xpan.common.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderPoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderPoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("`uid` is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("`uid` is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("`uid` =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("`uid` <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("`uid` >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("`uid` >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("`uid` <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("`uid` <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("`uid` in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("`uid` not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("`uid` between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("`uid` not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("order_sn like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("order_sn not like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnIsNull() {
            addCriterion("account_sn is null");
            return (Criteria) this;
        }

        public Criteria andAccountSnIsNotNull() {
            addCriterion("account_sn is not null");
            return (Criteria) this;
        }

        public Criteria andAccountSnEqualTo(String value) {
            addCriterion("account_sn =", value, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnNotEqualTo(String value) {
            addCriterion("account_sn <>", value, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnGreaterThan(String value) {
            addCriterion("account_sn >", value, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnGreaterThanOrEqualTo(String value) {
            addCriterion("account_sn >=", value, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnLessThan(String value) {
            addCriterion("account_sn <", value, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnLessThanOrEqualTo(String value) {
            addCriterion("account_sn <=", value, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnLike(String value) {
            addCriterion("account_sn like", value, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnNotLike(String value) {
            addCriterion("account_sn not like", value, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnIn(List<String> values) {
            addCriterion("account_sn in", values, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnNotIn(List<String> values) {
            addCriterion("account_sn not in", values, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnBetween(String value1, String value2) {
            addCriterion("account_sn between", value1, value2, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnNotBetween(String value1, String value2) {
            addCriterion("account_sn not between", value1, value2, "accountSn");
            return (Criteria) this;
        }

        public Criteria andRecordTsIsNull() {
            addCriterion("record_ts is null");
            return (Criteria) this;
        }

        public Criteria andRecordTsIsNotNull() {
            addCriterion("record_ts is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTsEqualTo(Long value) {
            addCriterion("record_ts =", value, "recordTs");
            return (Criteria) this;
        }

        public Criteria andRecordTsNotEqualTo(Long value) {
            addCriterion("record_ts <>", value, "recordTs");
            return (Criteria) this;
        }

        public Criteria andRecordTsGreaterThan(Long value) {
            addCriterion("record_ts >", value, "recordTs");
            return (Criteria) this;
        }

        public Criteria andRecordTsGreaterThanOrEqualTo(Long value) {
            addCriterion("record_ts >=", value, "recordTs");
            return (Criteria) this;
        }

        public Criteria andRecordTsLessThan(Long value) {
            addCriterion("record_ts <", value, "recordTs");
            return (Criteria) this;
        }

        public Criteria andRecordTsLessThanOrEqualTo(Long value) {
            addCriterion("record_ts <=", value, "recordTs");
            return (Criteria) this;
        }

        public Criteria andRecordTsIn(List<Long> values) {
            addCriterion("record_ts in", values, "recordTs");
            return (Criteria) this;
        }

        public Criteria andRecordTsNotIn(List<Long> values) {
            addCriterion("record_ts not in", values, "recordTs");
            return (Criteria) this;
        }

        public Criteria andRecordTsBetween(Long value1, Long value2) {
            addCriterion("record_ts between", value1, value2, "recordTs");
            return (Criteria) this;
        }

        public Criteria andRecordTsNotBetween(Long value1, Long value2) {
            addCriterion("record_ts not between", value1, value2, "recordTs");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIsNull() {
            addCriterion("goods_image is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIsNotNull() {
            addCriterion("goods_image is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageEqualTo(String value) {
            addCriterion("goods_image =", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotEqualTo(String value) {
            addCriterion("goods_image <>", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageGreaterThan(String value) {
            addCriterion("goods_image >", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageGreaterThanOrEqualTo(String value) {
            addCriterion("goods_image >=", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLessThan(String value) {
            addCriterion("goods_image <", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLessThanOrEqualTo(String value) {
            addCriterion("goods_image <=", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLike(String value) {
            addCriterion("goods_image like", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotLike(String value) {
            addCriterion("goods_image not like", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIn(List<String> values) {
            addCriterion("goods_image in", values, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotIn(List<String> values) {
            addCriterion("goods_image not in", values, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageBetween(String value1, String value2) {
            addCriterion("goods_image between", value1, value2, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotBetween(String value1, String value2) {
            addCriterion("goods_image not between", value1, value2, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andDisplayAmountIsNull() {
            addCriterion("display_amount is null");
            return (Criteria) this;
        }

        public Criteria andDisplayAmountIsNotNull() {
            addCriterion("display_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayAmountEqualTo(Integer value) {
            addCriterion("display_amount =", value, "displayAmount");
            return (Criteria) this;
        }

        public Criteria andDisplayAmountNotEqualTo(Integer value) {
            addCriterion("display_amount <>", value, "displayAmount");
            return (Criteria) this;
        }

        public Criteria andDisplayAmountGreaterThan(Integer value) {
            addCriterion("display_amount >", value, "displayAmount");
            return (Criteria) this;
        }

        public Criteria andDisplayAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_amount >=", value, "displayAmount");
            return (Criteria) this;
        }

        public Criteria andDisplayAmountLessThan(Integer value) {
            addCriterion("display_amount <", value, "displayAmount");
            return (Criteria) this;
        }

        public Criteria andDisplayAmountLessThanOrEqualTo(Integer value) {
            addCriterion("display_amount <=", value, "displayAmount");
            return (Criteria) this;
        }

        public Criteria andDisplayAmountIn(List<Integer> values) {
            addCriterion("display_amount in", values, "displayAmount");
            return (Criteria) this;
        }

        public Criteria andDisplayAmountNotIn(List<Integer> values) {
            addCriterion("display_amount not in", values, "displayAmount");
            return (Criteria) this;
        }

        public Criteria andDisplayAmountBetween(Integer value1, Integer value2) {
            addCriterion("display_amount between", value1, value2, "displayAmount");
            return (Criteria) this;
        }

        public Criteria andDisplayAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("display_amount not between", value1, value2, "displayAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNull() {
            addCriterion("refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(Integer value) {
            addCriterion("refund_amount =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(Integer value) {
            addCriterion("refund_amount <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(Integer value) {
            addCriterion("refund_amount >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_amount >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(Integer value) {
            addCriterion("refund_amount <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(Integer value) {
            addCriterion("refund_amount <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<Integer> values) {
            addCriterion("refund_amount in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<Integer> values) {
            addCriterion("refund_amount not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(Integer value1, Integer value2) {
            addCriterion("refund_amount between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_amount not between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(Integer value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(Integer value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(Integer value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(Integer value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<Integer> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<Integer> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(Integer value1, Integer value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andMktTrScIsNull() {
            addCriterion("mkt_tr_sc is null");
            return (Criteria) this;
        }

        public Criteria andMktTrScIsNotNull() {
            addCriterion("mkt_tr_sc is not null");
            return (Criteria) this;
        }

        public Criteria andMktTrScEqualTo(String value) {
            addCriterion("mkt_tr_sc =", value, "mktTrSc");
            return (Criteria) this;
        }

        public Criteria andMktTrScNotEqualTo(String value) {
            addCriterion("mkt_tr_sc <>", value, "mktTrSc");
            return (Criteria) this;
        }

        public Criteria andMktTrScGreaterThan(String value) {
            addCriterion("mkt_tr_sc >", value, "mktTrSc");
            return (Criteria) this;
        }

        public Criteria andMktTrScGreaterThanOrEqualTo(String value) {
            addCriterion("mkt_tr_sc >=", value, "mktTrSc");
            return (Criteria) this;
        }

        public Criteria andMktTrScLessThan(String value) {
            addCriterion("mkt_tr_sc <", value, "mktTrSc");
            return (Criteria) this;
        }

        public Criteria andMktTrScLessThanOrEqualTo(String value) {
            addCriterion("mkt_tr_sc <=", value, "mktTrSc");
            return (Criteria) this;
        }

        public Criteria andMktTrScLike(String value) {
            addCriterion("mkt_tr_sc like", value, "mktTrSc");
            return (Criteria) this;
        }

        public Criteria andMktTrScNotLike(String value) {
            addCriterion("mkt_tr_sc not like", value, "mktTrSc");
            return (Criteria) this;
        }

        public Criteria andMktTrScIn(List<String> values) {
            addCriterion("mkt_tr_sc in", values, "mktTrSc");
            return (Criteria) this;
        }

        public Criteria andMktTrScNotIn(List<String> values) {
            addCriterion("mkt_tr_sc not in", values, "mktTrSc");
            return (Criteria) this;
        }

        public Criteria andMktTrScBetween(String value1, String value2) {
            addCriterion("mkt_tr_sc between", value1, value2, "mktTrSc");
            return (Criteria) this;
        }

        public Criteria andMktTrScNotBetween(String value1, String value2) {
            addCriterion("mkt_tr_sc not between", value1, value2, "mktTrSc");
            return (Criteria) this;
        }

        public Criteria andMktTrDomainIsNull() {
            addCriterion("mkt_tr_domain is null");
            return (Criteria) this;
        }

        public Criteria andMktTrDomainIsNotNull() {
            addCriterion("mkt_tr_domain is not null");
            return (Criteria) this;
        }

        public Criteria andMktTrDomainEqualTo(String value) {
            addCriterion("mkt_tr_domain =", value, "mktTrDomain");
            return (Criteria) this;
        }

        public Criteria andMktTrDomainNotEqualTo(String value) {
            addCriterion("mkt_tr_domain <>", value, "mktTrDomain");
            return (Criteria) this;
        }

        public Criteria andMktTrDomainGreaterThan(String value) {
            addCriterion("mkt_tr_domain >", value, "mktTrDomain");
            return (Criteria) this;
        }

        public Criteria andMktTrDomainGreaterThanOrEqualTo(String value) {
            addCriterion("mkt_tr_domain >=", value, "mktTrDomain");
            return (Criteria) this;
        }

        public Criteria andMktTrDomainLessThan(String value) {
            addCriterion("mkt_tr_domain <", value, "mktTrDomain");
            return (Criteria) this;
        }

        public Criteria andMktTrDomainLessThanOrEqualTo(String value) {
            addCriterion("mkt_tr_domain <=", value, "mktTrDomain");
            return (Criteria) this;
        }

        public Criteria andMktTrDomainLike(String value) {
            addCriterion("mkt_tr_domain like", value, "mktTrDomain");
            return (Criteria) this;
        }

        public Criteria andMktTrDomainNotLike(String value) {
            addCriterion("mkt_tr_domain not like", value, "mktTrDomain");
            return (Criteria) this;
        }

        public Criteria andMktTrDomainIn(List<String> values) {
            addCriterion("mkt_tr_domain in", values, "mktTrDomain");
            return (Criteria) this;
        }

        public Criteria andMktTrDomainNotIn(List<String> values) {
            addCriterion("mkt_tr_domain not in", values, "mktTrDomain");
            return (Criteria) this;
        }

        public Criteria andMktTrDomainBetween(String value1, String value2) {
            addCriterion("mkt_tr_domain between", value1, value2, "mktTrDomain");
            return (Criteria) this;
        }

        public Criteria andMktTrDomainNotBetween(String value1, String value2) {
            addCriterion("mkt_tr_domain not between", value1, value2, "mktTrDomain");
            return (Criteria) this;
        }

        public Criteria andActivitySnIsNull() {
            addCriterion("activity_sn is null");
            return (Criteria) this;
        }

        public Criteria andActivitySnIsNotNull() {
            addCriterion("activity_sn is not null");
            return (Criteria) this;
        }

        public Criteria andActivitySnEqualTo(String value) {
            addCriterion("activity_sn =", value, "activitySn");
            return (Criteria) this;
        }

        public Criteria andActivitySnNotEqualTo(String value) {
            addCriterion("activity_sn <>", value, "activitySn");
            return (Criteria) this;
        }

        public Criteria andActivitySnGreaterThan(String value) {
            addCriterion("activity_sn >", value, "activitySn");
            return (Criteria) this;
        }

        public Criteria andActivitySnGreaterThanOrEqualTo(String value) {
            addCriterion("activity_sn >=", value, "activitySn");
            return (Criteria) this;
        }

        public Criteria andActivitySnLessThan(String value) {
            addCriterion("activity_sn <", value, "activitySn");
            return (Criteria) this;
        }

        public Criteria andActivitySnLessThanOrEqualTo(String value) {
            addCriterion("activity_sn <=", value, "activitySn");
            return (Criteria) this;
        }

        public Criteria andActivitySnLike(String value) {
            addCriterion("activity_sn like", value, "activitySn");
            return (Criteria) this;
        }

        public Criteria andActivitySnNotLike(String value) {
            addCriterion("activity_sn not like", value, "activitySn");
            return (Criteria) this;
        }

        public Criteria andActivitySnIn(List<String> values) {
            addCriterion("activity_sn in", values, "activitySn");
            return (Criteria) this;
        }

        public Criteria andActivitySnNotIn(List<String> values) {
            addCriterion("activity_sn not in", values, "activitySn");
            return (Criteria) this;
        }

        public Criteria andActivitySnBetween(String value1, String value2) {
            addCriterion("activity_sn between", value1, value2, "activitySn");
            return (Criteria) this;
        }

        public Criteria andActivitySnNotBetween(String value1, String value2) {
            addCriterion("activity_sn not between", value1, value2, "activitySn");
            return (Criteria) this;
        }

        public Criteria andExtraIsNull() {
            addCriterion("extra is null");
            return (Criteria) this;
        }

        public Criteria andExtraIsNotNull() {
            addCriterion("extra is not null");
            return (Criteria) this;
        }

        public Criteria andExtraEqualTo(String value) {
            addCriterion("extra =", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotEqualTo(String value) {
            addCriterion("extra <>", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraGreaterThan(String value) {
            addCriterion("extra >", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraGreaterThanOrEqualTo(String value) {
            addCriterion("extra >=", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLessThan(String value) {
            addCriterion("extra <", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLessThanOrEqualTo(String value) {
            addCriterion("extra <=", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLike(String value) {
            addCriterion("extra like", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotLike(String value) {
            addCriterion("extra not like", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraIn(List<String> values) {
            addCriterion("extra in", values, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotIn(List<String> values) {
            addCriterion("extra not in", values, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraBetween(String value1, String value2) {
            addCriterion("extra between", value1, value2, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotBetween(String value1, String value2) {
            addCriterion("extra not between", value1, value2, "extra");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}