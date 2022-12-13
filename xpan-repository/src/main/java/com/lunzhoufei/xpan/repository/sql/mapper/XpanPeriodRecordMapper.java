package com.lunzhoufei.xpan.repository.sql.mapper;

import com.lunzhoufei.xpan.common.po.XpanPeriodRecord;
import com.lunzhoufei.xpan.common.po.XpanPeriodRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface XpanPeriodRecordMapper {
    int countByExample(XpanPeriodRecordExample example);

    int deleteByExample(XpanPeriodRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XpanPeriodRecord record);

    int insertSelective(XpanPeriodRecord record);

    List<XpanPeriodRecord> selectByExampleWithRowbounds(XpanPeriodRecordExample example, RowBounds rowBounds);

    List<XpanPeriodRecord> selectByExample(XpanPeriodRecordExample example);

    XpanPeriodRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XpanPeriodRecord record, @Param("example") XpanPeriodRecordExample example);

    int updateByExample(@Param("record") XpanPeriodRecord record, @Param("example") XpanPeriodRecordExample example);

    int updateByPrimaryKeySelective(XpanPeriodRecord record);

    int updateByPrimaryKey(XpanPeriodRecord record);
}