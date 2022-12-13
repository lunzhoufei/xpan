package com.lunzhoufei.xpan.contract.response;

import com.lunzhoufei.xpan.contract.common.EntityWithMisc;
import lombok.Data;

@Data
public class TestXpanResponse extends EntityWithMisc {
    String cmd = "default";
    Object data;
}
