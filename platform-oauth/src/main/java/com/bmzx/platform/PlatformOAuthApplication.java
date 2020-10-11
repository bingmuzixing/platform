package com.bmzx.platform;

import com.bmzx.platform.core.infrastructure.log.PlatformLog;
import com.bmzx.platform.core.infrastructure.log.PlatformLogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages  = "com.bmzx.platform")
public class PlatformOAuthApplication {

    private static final PlatformLog log= PlatformLogFactory.getLog(PlatformOAuthApplication.class);
  public static void main(String[] args) {
    //

      SpringApplication.run(PlatformOAuthApplication.class,args);
      log.info("统一权限平台启动！");
  }
}
