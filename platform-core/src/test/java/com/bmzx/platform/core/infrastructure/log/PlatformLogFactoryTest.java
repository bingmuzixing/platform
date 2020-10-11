package com.bmzx.platform.core.infrastructure.log;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlatformLogFactoryTest {


    public static void main(String[] args) {
        PlatformLog log =PlatformLogFactory.getLog(PlatformLogFactoryTest.class);
        log.info("顶顶顶顶");

        log.debug("这是测试类debug");

        log.error("这是系统错误信息");
    }

    public void getLog() {

    }
}