package com.lunzhoufei.xpan.contract.common;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class EntityWithMisc implements Serializable {
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
