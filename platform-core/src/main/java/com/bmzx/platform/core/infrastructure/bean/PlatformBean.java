package com.bmzx.platform.core.infrastructure.bean;

import java.util.List;

/**
 * 对外包括业主主键，扩展数据
 */
public class PlatformBean extends BaseBean{

    //存放系统数据
    private  PlatformSysBean sysBean;
    //存放业务主键数据
    private  PlatformPKBean  pkBean;
    //存放扩展数据
    private List<PlatformExtendBean> extendBeans;





}
