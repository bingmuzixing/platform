package com.bmzx.platform.core.infrastructure.bean;

/**
 * 定义关键字
 */
public enum PlatformEnum {

    KEY_URL("URL"),KEY_PAGE("PAGE"),KEY_APPNAME("APPNAME"),KEY_METHODNAME("METHODNAME"),KEY_MENUES("MENUES");
    private  final static String prefix="_@@";
    private  final static String endPrefix="@@_";
    private String key;
    private PlatformEnum(String key){
        this.key=(prefix+key+endPrefix);
    }
    public String getKey(){
        return this.key;
    }
}
