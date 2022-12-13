package com.lunzhoufei.xpan.contract.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseRequest extends EntityWithMisc implements Serializable {
    Long uid;
    String ip;
    String referer;
    String ua;
    String installToken;
    String antiContent;
}
