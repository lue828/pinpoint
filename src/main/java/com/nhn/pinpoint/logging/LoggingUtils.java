package com.nhn.pinpoint.logging;

import java.util.Arrays;

/**
 *
 */
public class LoggingUtils {


    public static void logBefore(Logger logger, Object target, String className, String methodName, String parameterDescription, Object[] args) {
        StringBuilder sb = new StringBuilder(512);
        sb.append("before ");
        logMethod(sb, target, className, methodName, parameterDescription, args);
        logger.debug(sb.toString());
    }

    public static void logAfter(Logger logger, Object target, String className, String methodName, String parameterDescription, Object[] args, Object result) {
        StringBuilder sb = new StringBuilder(512);
        sb.append("after ");
        logMethod(sb, target, className, methodName, parameterDescription, args);
        sb.append(" result:");
        sb.append(result);
        logger.debug(sb.toString());
    }

    public static void logAfter(Logger logger, Object target, String className, String methodName, String parameterDescription, Object[] args) {
        StringBuilder sb = new StringBuilder(512);
        sb.append("after ");
        logMethod(sb, target, className, methodName, parameterDescription, args);
        logger.debug(sb.toString());
    }

    private static void logMethod(StringBuilder sb, Object target, String className, String methodName, String parameterDescription, Object[] args) {
        sb.append(target);
        sb.append(' ');
        sb.append(className);
        sb.append(' ');
        sb.append(methodName);
        sb.append(parameterDescription);
        sb.append(" args:");
        sb.append(Arrays.toString(args));
    }


}