package com.lunzhoufei.xpan.api.controller;

import com.lunzhoufei.xpan.contract.request.TestXpanRequest;
import com.lunzhoufei.xpan.contract.service.TestXpanRpcService;
import com.lunzhoufei.xpan.core.biz.magazine.MagazineServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/lomo")
@Slf4j
public class HttpController {

    @Autowired
    MagazineServiceImpl magazineService;

    @Autowired
    TestXpanRpcService testXpanRpcService;

    @ResponseBody
    @RequestMapping(value = "/echo")
    public Object echo(@RequestBody(required = false) Object request) {
        return "Hello, test raw SPRING!!!!!!!!!!!!!!!!!!!!!!!!!";
    }

    @ResponseBody
    @RequestMapping(value = "/mgz")
    public Object getMgz(@RequestBody(required = false) Object request) {
        return magazineService.queryMagazine();
    }

    @ResponseBody
    @RequestMapping(value = "/test")
    public Object testXpan(@RequestBody(required = false) Object request) {
        return testXpanRpcService.queryTestXpan((TestXpanRequest) request);
    }
}
