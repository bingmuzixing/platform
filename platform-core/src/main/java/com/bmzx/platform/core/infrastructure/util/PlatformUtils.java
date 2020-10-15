package com.bmzx.platform.core.infrastructure.util;

public class PlatformUtils {

    public static boolean isEmpty(String str){

        return str==null||str.trim().length()==0;
    }


    public static String  getFirstUpperStr(String str){
        if(isEmpty(str))return "";
        if(str.length()==1)return str;

        String firstChar=str.substring(0,1).toUpperCase();
        String endChar=str.substring(1,str.length()-1);

        return firstChar+endChar;
    }
}
