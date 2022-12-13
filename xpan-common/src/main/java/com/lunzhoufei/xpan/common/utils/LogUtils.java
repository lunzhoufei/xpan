package com.lunzhoufei.xpan.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.message.ParameterizedMessageFactory;

@Slf4j
public class LogUtils {

    // 格式化工厂
    private static final ParameterizedMessageFactory MESSAGE_FACTORY = new ParameterizedMessageFactory();

    // 日志容器
    private static final ThreadLocal<StringBuilder> logContainer = new ThreadLocal<>();


    public static void init(String logPrefix) {
        if (logPrefix != null) {
            logContainer.set(new StringBuilder(logPrefix));
        }
    }

    public static void addLog(String formatter, Object... args) {
        StringBuilder sb = logContainer.get();
        if (sb == null) {
            log.info(formatter, args);
            return;
        }
        String formattedMessage = MESSAGE_FACTORY.newMessage(formatter, args).getFormattedMessage();
        if (sb.length() == 0) {
            sb.append(formattedMessage);
        } else {
            sb.append("\n").append(formattedMessage);
        }
    }

    public static void printLog() {
        if (logContainer.get() == null) {
            return;
        }
        if (logContainer.get().length() > 0) {
            log.info(logContainer.get().toString());
        }
    }

    public static void clearLog() {
        logContainer.remove();
    }

    public static void terminate() {
        printLog();
        clearLog();
    }

    public static void addLogAndTerminate(String formatter, Object... args) {
        addLog(formatter, args);
        printLog();
        clearLog();
    }

}
