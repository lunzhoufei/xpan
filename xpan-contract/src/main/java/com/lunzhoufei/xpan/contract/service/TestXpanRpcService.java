package com.lunzhoufei.xpan.contract.service;

import com.lunzhoufei.xpan.contract.common.BaseResponse;
import com.lunzhoufei.xpan.contract.request.TestXpanRequest;
import com.lunzhoufei.xpan.contract.response.TestXpanResponse;

public interface TestXpanRpcService {

    BaseResponse<TestXpanResponse> queryTestXpan(TestXpanRequest request);

}
