package com.bmzx.platform.core.infrastructure.factory;

import com.bmzx.platform.core.infrastructure.log.PlatformLog;
import com.bmzx.platform.core.infrastructure.log.PlatformLogFactory;
import com.bmzx.platform.core.ui.PlatformParamBean;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PlatformFactory {

    private static final PlatformLog log = PlatformLogFactory.getLog(PlatformFactory.class);
    //定义上下文的后缀名
    protected static final String ContextSuffixStr = "Context";


    protected static Object doMethod(Object obj, String methodName, PlatformParamBean paramBean) throws IllegalAccessException, InvocationTargetException {
        Object result = null;
        Method method = null;
        Object[] params = null;
        Class cls = obj.getClass();

        try {
            method = cls.getMethod(methodName, PlatformParamBean.class);
            params = new Object[]{paramBean};
        } catch (Exception exception) {
         log.error("");
        }
        if (method != null) {
            result = method.invoke(obj, params);
        } else if (log.isDebugEnabled()) {
            log.debug(new Object[]{obj.getClass().getName() + "." + methodName + paramBean.toString() + ";指定方法不存在:" + methodName}.toString());
        }

        return result;
    }
}

