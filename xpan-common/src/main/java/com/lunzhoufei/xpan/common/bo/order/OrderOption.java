package com.lunzhoufei.xpan.common.bo.order;

import com.lunzhoufei.xpan.common.po.OrderPo;
import com.lunzhoufei.xpan.common.po.OrderPoExample;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.LinkedList;
import java.util.List;

public class OrderOption {

    @Data
    @NoArgsConstructor
    public static class SqlOption {
        Boolean includeRefund = true;
        List<String> mktSrcExclude = new LinkedList<>();
        List<String> mktSrcInclude = new LinkedList<>();
        String orderBy;
        Integer maxCnt;
        Integer minPayment;
        Integer maxPayment;
        List<Integer> orderTypeExclude = new LinkedList<>();
        List<Integer> orderTypeInclude = new LinkedList<>();
    }

    public static boolean applySqlOption(OrderPoExample example, OrderPoExample.Criteria c, SqlOption option) {
        if (option == null) {
            return true;
        }

        if (CollectionUtils.isNotEmpty(option.getMktSrcExclude())) {
            c.andMktTrScNotIn(option.getMktSrcExclude());
        }

        if (CollectionUtils.isNotEmpty(option.getMktSrcInclude())) {
            c.andMktTrScIn(option.getMktSrcInclude());
        }

        if (CollectionUtils.isNotEmpty(option.getOrderTypeExclude())) {
            c.andOrderTypeNotIn(option.getOrderTypeExclude());
        }

        if (CollectionUtils.isNotEmpty(option.getOrderTypeInclude())) {
            c.andOrderTypeIn(option.getOrderTypeInclude());
        }

        if (Boolean.FALSE.equals(option.getIncludeRefund())) {
            c.andRefundAmountLessThanOrEqualTo(0);
        }

        if (null != option.getMinPayment()) {
            c.andPaymentGreaterThanOrEqualTo(option.getMinPayment());
        }

        if (null != option.getMaxPayment()) {
            c.andPaymentLessThanOrEqualTo(option.getMaxPayment());
        }

        if (StringUtils.isNotBlank(option.getOrderBy())) {
            example.setOrderByClause(option.getOrderBy());
        }
        return true;
    }

}
