package com.bmzx.platform.core.ui;

import com.bmzx.platform.core.infrastructure.bean.BaseBean;
import com.bmzx.platform.core.infrastructure.bean.PlatformEnum;
import com.bmzx.platform.core.infrastructure.bean.PlatformUrlBean;


/**
 * 接受外部参数对象
 */
public class PlatformParamBean  extends BaseBean {



    public PlatformUrlBean  getUrlBean(){
       Object o=this.get(PlatformEnum.KEY_URL.getKey());
       if(o!=null){
           return (PlatformUrlBean)o;
       }else{
           return null;
       }
   }

}
