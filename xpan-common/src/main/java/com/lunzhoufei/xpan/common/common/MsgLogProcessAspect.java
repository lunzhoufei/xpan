package com.lunzhoufei.xpan.common.common;

import com.fasterxml.jackson.core.type.TypeReference;
import com.lunzhoufei.xpan.common.utils.JsonUtils;
import com.lunzhoufei.xpan.common.utils.LogUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Map;

@Aspect
@Slf4j
@Component
public class MsgLogProcessAspect {

    @Around("@annotation(com.lunzhoufei.xpan.common.common.MsgLogProcess) && args(request)")
    public Object process(ProceedingJoinPoint pjp, String request) throws Throwable {
        Method method = ((MethodSignature) pjp.getSignature()).getMethod();
        String methodName = pjp.getSignature().getName();
        MsgLogProcess msgLogProcess = method.getAnnotation(MsgLogProcess.class);
        try {
            LogUtils.init("MSG on [ " + msgLogProcess.biz() + " ]");
            if (msgLogProcess.logReq()) {
                Map<String, Object> data = JsonUtils.fromJson(request, new TypeReference<Map<String, Object>>() {
                        });
                LogUtils.addLog("\nMSG:\n{}\n", JsonUtils.toPrettyJson(data));
            }
            return pjp.proceed();
        } catch (Exception e) {
            LogUtils.addLog("msg@{} exception = {}", methodName, e);
            throw e;
        } finally {
            LogUtils.terminate();
        }
    }

}
