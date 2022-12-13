package com.lunzhoufei.xpan.repository.sql;

import com.lunzhoufei.xpan.common.bo.order.OrderOption;
import com.lunzhoufei.xpan.common.po.OrderPo;
import com.lunzhoufei.xpan.common.po.OrderPoExample;
import com.lunzhoufei.xpan.repository.sql.mapper.OrderPoMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Slf4j
@Component
public class OrderSqlRepository {

    @Autowired
    private OrderPoMapper orderPoMapper;

    public List<OrderPo> queryOrder(long uid, List<String> orders, Long startTs, Long endTs,
                                    OrderOption.SqlOption option) {
        if (CollectionUtils.isEmpty(orders) && (startTs == null || endTs == null)) {
            return null;
        }

        OrderPoExample example = new OrderPoExample();
        OrderPoExample.Criteria c = example.createCriteria().andUidEqualTo(uid);
        if (CollectionUtils.isNotEmpty(orders)) {
            c.andOrderSnIn(orders);
        }
        if (startTs != null) {
            c.andRecordTsGreaterThanOrEqualTo(startTs);
        }
        if (endTs != null) {
            c.andRecordTsLessThanOrEqualTo(startTs);
        }
        if (option != null) {
            OrderOption.applySqlOption(example, c, option);
        }

        if (option != null && option.getMaxCnt() != null && option.getMaxCnt() >= 1) {
            return orderPoMapper.selectByExampleWithRowbounds(example, new RowBounds(0, option.getMaxCnt()));
        }
        return orderPoMapper.selectByExample(example);
    }

}
