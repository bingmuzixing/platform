package com.bmzx.platform.core.infrastructure;

/**
 * 定义平台的异常类
 */
public class PlatformException extends Exception{
    private static final long serialVersionUID = 1L;

    // 提供无参数的构造方法
    public PlatformException() {
    }

    // 提供一个有参数的构造方法，可自动生成
    public PlatformException(String message) {
        super(message);// 把参数传递给Throwable的带String参数的构造方法
    }
}
