package com.lunzhoufei.xpan.common.common;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class Cmn {

    // =================================================================================================================
    //                                                 Time utility
    // =================================================================================================================

    public final static Long MIN_VALID_TIME = 1620630153L;
    public final static Long MAX_VALID_TIME = 2145769352L;

    public static Long currentTs() {
        return System.currentTimeMillis() / 1000;
    }

    public static Long currentTms() {
        return System.currentTimeMillis();
    }

    // =================================================================================================================
    //                                                 Misc & Ext utility
    // =================================================================================================================

    @Data
    @NoArgsConstructor
    static public class EntityWithMisc {
        Map<String, Object> misc;

        public Map<String, Object> mergeMisc(Map<String, Object> param) {
            if (param == null) {
                return misc;
            }
            if (misc == null) {
                misc = new HashMap<>();
            }
            misc.putAll(param);
            return misc;
        }

        public Map<String, Object> mergeMisc(String key, Object value) {
            if (StringUtils.isBlank(key) || value == null) {
                return misc;
            }
            if (misc == null) {
                misc = new HashMap<>();
            }
            misc.put(key, value);
            return misc;
        }

        public <T> T getMiscAttribute(String attribute) {
            if (MapUtils.isEmpty(misc) || !misc.containsKey(attribute)) {
                return null;
            }
            return (T) misc.get(attribute);
        }
    }

    // =================================================================================================================
    //                                               period record utility
    // =================================================================================================================

    @Data
    @NoArgsConstructor
    public static class PeriodRecord extends EntityWithMisc {
        Long uid;
        Long playNum;

        Long createTime;                        // 创建时间
        Long updateTime;                        // 最近修改时间

        Long startTime;
        Long endTime;
    }

}
