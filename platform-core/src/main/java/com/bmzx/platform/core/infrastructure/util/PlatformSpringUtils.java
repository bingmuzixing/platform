package com.bmzx.platform.core.infrastructure.util;

import com.bmzx.platform.core.infrastructure.log.PlatformLog;
import com.bmzx.platform.core.infrastructure.log.PlatformLogFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class PlatformSpringUtils implements ApplicationContextAware {

    private static final PlatformLog log= PlatformLogFactory.getLog(PlatformSpringUtils.class);
    private static ApplicationContext applicationContext;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        if (PlatformSpringUtils.applicationContext == null) {
            log.info("Spring 上下文,添加到PlatformSpringUtils 中");
            PlatformSpringUtils.applicationContext = applicationContext;
        }
    }

    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }
    /**
     * 外部调用这个getBean方法就可以手动获取到bean
     * 用bean组件的name来获取bean
     * @param beanName
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T>T getBean(String beanName){
        return (T) applicationContext.getBean(beanName);
    }

}
