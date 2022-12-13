package com.lunzhoufei.xpan.core.biz.magazine;

import com.lunzhoufei.xpan.common.bo.magazine.Mgz;
import com.lunzhoufei.xpan.common.common.Cmn;
import com.lunzhoufei.xpan.common.utils.JsonUtils;
import com.lunzhoufei.xpan.common.utils.LogUtils;
import com.lunzhoufei.xpan.repository.redis.MagazineRedis;
import com.lunzhoufei.xpan.repository.sql.MagazineSqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MagazineServiceImpl {

    @Autowired
    MagazineRedis magazineRedis;

    @Autowired
    MagazineSqlRepository magazineSqlRepository;

    public Mgz.Magazine queryMagazine() {
        Mgz.Magazine rsp = new Mgz.Magazine();
        rsp.setZid("123");
        Long mockUid = Cmn.currentTms() % 100000000;
        rsp.setUid(mockUid);
        rsp.setTitle("the magazine");
        rsp.setSubtitle("the economist");
        rsp.setReadCnt(888);
        rsp.setFavCnt(123);
        rsp.setShareCnt(888);
        rsp.setCreateTime(Cmn.currentTs());
        rsp.setDeleteTime(Cmn.currentTs());
        rsp.setContent("CONTENT");

        LogUtils.init("TEST");
        LogUtils.addLog("mgz = {}", JsonUtils.toPrettyJson(rsp));

        magazineRedis.setMagazine(rsp.getZid(), rsp);
        LogUtils.addLog("after redis set");

        magazineSqlRepository.insert(rsp);
        LogUtils.addLog("after sql insert");
        LogUtils.terminate();
        return rsp;

    }

}
