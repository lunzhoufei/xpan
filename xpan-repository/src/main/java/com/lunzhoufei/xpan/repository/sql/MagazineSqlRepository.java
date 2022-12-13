package com.lunzhoufei.xpan.repository.sql;

import com.lunzhoufei.xpan.common.bo.magazine.Mgz;
import com.lunzhoufei.xpan.common.bo.magazine.MgzAdaptor;
import com.lunzhoufei.xpan.common.utils.LogUtils;
import com.lunzhoufei.xpan.repository.sql.mapper.XpanPeriodRecordMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MagazineSqlRepository {

    @Autowired
    private XpanPeriodRecordMapper xpanPeriodRecordMapper;

    public boolean insert(Mgz.Magazine mgz) {
        if (mgz == null) {
            return false;
        }
        try {
            return xpanPeriodRecordMapper.insertSelective(MgzAdaptor.bo2po(mgz)) == 1;
        } catch (Exception e) {
            LogUtils.addLog("insert failed! e = {}", e);
            return false;
        }
    }

}
