package com.lunzhoufei.xpan.common.bo.magazine;
import java.util.Date;

import com.lunzhoufei.xpan.common.po.XpanPeriodRecord;
import com.lunzhoufei.xpan.common.utils.JsonUtils;

public class MgzAdaptor {

    public static XpanPeriodRecord bo2po(Mgz.Magazine bo) {
        XpanPeriodRecord rsp = new XpanPeriodRecord();
        rsp.setUid(bo.getUid());
        rsp.setPlayNum(bo.getFavCnt());
        rsp.setEndTime(new Date());
        rsp.setWithdrawTime(new Date());
        rsp.setStrategy(bo.getTitle());
        rsp.setPremiumPlayNum(0L);
        rsp.setPrivilegeExpireTime(new Date());
        rsp.setOpenType("");
        rsp.setAdjustExt(bo.getSubtitle());
        rsp.setAwardAmount(0L);
        rsp.setMisc(JsonUtils.toJson(bo.getMisc()));
        rsp.setCreatedAt(new Date());
        rsp.setUpdatedAt(new Date());
        rsp.setStartTime(new Date());
        return rsp;
    }

}
