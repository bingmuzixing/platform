package com.bmzx.platform.core.infrastructure.log;

/**
 * 定义平台日志接口
 */
public interface PlatformLog {

    boolean isDebugEnabled();

    void error(String msg, Throwable e);

    void error(String msg);

    boolean isInfoEnabled();

    void info(String msg);

    void debug(String msg);

    void debug(String msg, Throwable e);

    boolean isWarnEnabled();

    void warn(String msg);

    void warn(String msg, Throwable e);

    boolean isErrorEnabled();

    int getErrorCount();

    int getWarnCount();

    int getInfoCount();

    int getDebugCount();

    void resetStat();
}
