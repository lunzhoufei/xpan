package com.lunzhoufei.xpan.common.bo.magazine;

import com.lunzhoufei.xpan.common.common.Cmn;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Mgz {

    @Data
    @NoArgsConstructor
    public static class Magazine extends Cmn.EntityWithMisc {
        String zid;
        Long uid;
        String title;
        String subtitle;
        Integer readCnt;
        Integer favCnt;
        Integer shareCnt;
        Long createTime;
        Long deleteTime;
        String content;
    }

}
