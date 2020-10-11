package com.bmzx.platform.gateway;

import com.bmzx.platform.core.infrastructure.log.PlatformLog;
import com.bmzx.platform.core.infrastructure.log.PlatformLogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages  = "com.bmzx.platform")
public class PlatformGatewayApplication {

    private final static PlatformLog log= PlatformLogFactory.getLog(PlatformGatewayApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(PlatformGatewayApplication.class,args);
        log.info("网关平台启动！");
    }
}
