package com.bmzx.platform.core.infrastructure.bean;

import com.bmzx.platform.core.infrastructure.PlatformResources;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

import java.util.List;

/**
 * 记录参数对应的URL相关信息
 */
public class PlatformUrlBean extends PlatformBean{



    public static PlatformUrlBean buildUrlBean(HttpServletRequest request) {

        PlatformUrlBean urlBean = new PlatformUrlBean();
        String appName = request.getContextPath().substring(1);
        urlBean.put(PlatformEnum.KEY_APPNAME.getKey(),appName);
        ///oauthPlatform/group/save
        String uri = request.getRequestURI();
        //去掉后缀
        int lastIndex = uri.lastIndexOf(".");
        if (lastIndex > -1) {
            uri = uri.substring(0, lastIndex);
        }
        String[] pathes = uri.substring(1).split("/");
        String method = pathes[pathes.length - 1];
       urlBean.put(PlatformEnum.KEY_METHODNAME.getKey(),method);
        String temp = null;
        List<String> list = new ArrayList<>();
        for (int index = 0; index < pathes.length; index++) {
            temp = pathes[index];
            if (!appName.equals(temp) && !method.equals(temp)) {//
                list.add(temp);

            }
        }
        String[] strings = new String[list.size()];
        urlBean.put(PlatformEnum.KEY_MENUES.getKey(),list.toArray(strings));
       
        return urlBean;
    }


    public String getAppName() {
        return PlatformResources.to(this.get(PlatformEnum.KEY_APPNAME.getKey()),"");
    }
    
    public String[] getMenues(){
        return PlatformResources.convertArray(String.class,(Object[]) this.get(PlatformEnum.KEY_MENUES));
    }

    public String getMethodName(){
        return PlatformResources.to(this.get(PlatformEnum.KEY_METHODNAME.getKey()),"");
    }
}
