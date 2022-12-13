package com.lunzhoufei.xpan.repository.redis;

import com.lunzhoufei.xpan.common.bo.magazine.Mgz;
import com.lunzhoufei.xpan.common.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MagazineRedis {

    @Autowired
    RedisUtil redisUtil;

    public void setMagazine(String zid, Mgz.Magazine mgz) {
        redisUtil.set("test_mgz", JsonUtils.toJson(mgz));
    }

}
