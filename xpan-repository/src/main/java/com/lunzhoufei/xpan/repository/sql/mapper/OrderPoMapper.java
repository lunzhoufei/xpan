package com.lunzhoufei.xpan.repository.sql.mapper;

import com.lunzhoufei.xpan.common.po.OrderPo;
import com.lunzhoufei.xpan.common.po.OrderPoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrderPoMapper {
    int countByExample(OrderPoExample example);

    int deleteByExample(OrderPoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderPo record);

    int insertSelective(OrderPo record);

    List<OrderPo> selectByExampleWithRowbounds(OrderPoExample example, RowBounds rowBounds);

    List<OrderPo> selectByExample(OrderPoExample example);

    OrderPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderPo record, @Param("example") OrderPoExample example);

    int updateByExample(@Param("record") OrderPo record, @Param("example") OrderPoExample example);

    int updateByPrimaryKeySelective(OrderPo record);

    int updateByPrimaryKey(OrderPo record);
}