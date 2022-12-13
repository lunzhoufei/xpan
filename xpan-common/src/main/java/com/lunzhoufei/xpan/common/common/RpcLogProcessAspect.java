package com.lunzhoufei.xpan.common.common;

import com.lunzhoufei.xpan.common.utils.JsonUtils;
import com.lunzhoufei.xpan.common.utils.LogUtils;
import com.lunzhoufei.xpan.contract.common.BaseRequest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Slf4j
@Component
public class RpcLogProcessAspect {

    @Around("@annotation(com.lunzhoufei.xpan.common.common.RpcLogProcess) && args(request)")
    public Object process(ProceedingJoinPoint pjp, BaseRequest request) throws Throwable {
        Method method = ((MethodSignature) pjp.getSignature()).getMethod();
        String methodName = pjp.getSignature().getName();
        RpcLogProcess rpcLogProcess = method.getAnnotation(RpcLogProcess.class);
        boolean inLogWl = logEnabled(request.getUid());
        try {
            beforeProcess(request, methodName, rpcLogProcess);
            if (inLogWl || rpcLogProcess.logReq()) {
                LogUtils.addLog("\nREQ:\n{}\n", JsonUtils.toPrettyJson(request));
            }
            Object rsp = pjp.proceed();
            if (inLogWl || rpcLogProcess.logReq()) {
                LogUtils.addLog("\nRSP:\n{}\n", JsonUtils.toPrettyJson(rsp));
            }
            return rsp;
        } catch (Exception e) {
            LogUtils.addLog("rpc@{} exception = {}", methodName, e);
            throw e;
        } finally {
            afterProcess(rpcLogProcess, inLogWl);
        }
    }

    void beforeProcess(BaseRequest request, String methodName, RpcLogProcess rpcProcess) {
        String prefix = "\n【" + request.getUid().toString() + " @OS=TODO "
                + "@" + rpcProcess.biz() + "." + methodName
                + " 】";
        LogUtils.init(prefix);
    }

    void afterProcess(RpcLogProcess process, boolean inLogWl) {
        LogUtils.terminate();
    }


    boolean logEnabled(Long uid) {
        return false;
    }


}
