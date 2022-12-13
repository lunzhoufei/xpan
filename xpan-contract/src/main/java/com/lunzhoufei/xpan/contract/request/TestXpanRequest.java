package com.lunzhoufei.xpan.contract.request;

import com.lunzhoufei.xpan.contract.common.BaseRequest;
import lombok.Data;

@Data
public class TestXpanRequest extends BaseRequest {
    String cmd = "default";
}
