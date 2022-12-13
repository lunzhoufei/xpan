package com.lunzhoufei.xpan.core.mq;

import com.lunzhoufei.xpan.common.common.MsgLogProcess;

public class CouponUse {

    @MsgLogProcess(biz = "coupon use", logReq = true)
    public boolean onEvent(String msg) {
        return true;
    }

}
