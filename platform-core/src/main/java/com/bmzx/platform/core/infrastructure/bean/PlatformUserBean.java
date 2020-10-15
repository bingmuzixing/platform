package com.bmzx.platform.core.infrastructure.bean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 当前登录用户的基本信息
 */
public class PlatformUserBean extends BaseBean {


    public static PlatformUserBean buildUserBean(HttpServletRequest request) {
        PlatformUserBean userBean = new PlatformUserBean();
        HttpSession session = request.getSession();
        Object o = session.getAttribute(PlatformEnum.SESSION_KEY.getKey());
        if (o != null) {
            userBean = (PlatformUserBean) o;
        }
        return userBean;
    }

}
