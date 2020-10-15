package com.bmzx.platform.core.ui;

import com.bmzx.platform.core.infrastructure.bean.BaseBean;
import com.bmzx.platform.core.infrastructure.bean.PlatformEnum;
import com.bmzx.platform.core.infrastructure.bean.PlatformUrlBean;
import com.bmzx.platform.core.infrastructure.bean.PlatformUserBean;


/**
 * 接受外部参数对象
 */
public class PlatformParamBean  extends BaseBean {



    public PlatformUrlBean  getUrlBean(){
       Object o=this.get(PlatformEnum.KEY_URL.getKey());
       if(o!=null){
           return (PlatformUrlBean)o;
       }else{
           return new PlatformUrlBean();
       }
   }

    /**
     * 获取当前登录用户信息
     * @return
     */
   public PlatformUserBean getUserBean(){
       Object o=this.get(PlatformEnum.KEY_USER.getKey());
       if(o!=null){
           return (PlatformUserBean)o;
       }else{
           return null;
       }
   }

}
