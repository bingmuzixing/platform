package com.bmzx.platform.core;

import com.bmzx.platform.core.infrastructure.bean.PlatformUserBean;
import com.bmzx.platform.core.ui.PlatformOutBean;
import com.bmzx.platform.core.ui.PlatformParamBean;

/**
 * 定义平台的上下文关系
 */
public interface PlatformContext {

    /**
     * 验证当前用户是否有权限操作
     * @param userBean
     * @return
     */
    boolean verifyUserPermissions(PlatformUserBean userBean);

    /**
     * 验证数据的有效性，
     * @param paramBean
     * @return
     */
    boolean validationData(PlatformParamBean paramBean);


    void formatOutBean(PlatformOutBean outBean);

}
