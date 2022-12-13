package com.lunzhoufei.xpan.core.api;

import com.lunzhoufei.xpan.contract.common.BaseResponse;
import com.lunzhoufei.xpan.contract.request.TestXpanRequest;
import com.lunzhoufei.xpan.contract.response.TestXpanResponse;
import com.lunzhoufei.xpan.contract.service.TestXpanRpcService;
import com.lunzhoufei.xpan.core.biz.magazine.MagazineServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestXpanRpcServiceImpl implements TestXpanRpcService {

    @Autowired
    MagazineServiceImpl magazineService;

    @Override
    public BaseResponse<TestXpanResponse> queryTestXpan(TestXpanRequest request) {
        TestXpanResponse rsp = new TestXpanResponse();
        rsp.setData(magazineService.queryMagazine());
        return BaseResponse.success(rsp).build();
    }

}
