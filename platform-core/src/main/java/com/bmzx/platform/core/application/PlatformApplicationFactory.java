package com.bmzx.platform.core.application;


import com.bmzx.platform.core.PlatformContext;
import com.bmzx.platform.core.infrastructure.bean.PlatformEnum;

import com.bmzx.platform.core.ui.PlatformOutBean;
import com.bmzx.platform.core.ui.PlatformParamBean;

/**
 * 获取处理application
 */
public class PlatformApplicationFactory {



    /**
     *执行写的方法
     * @param paramBean
     * @return
     */
    public static PlatformOutBean write(PlatformParamBean paramBean){
        {
            PlatformOutBean outBean=new PlatformOutBean();
            try{
                PlatformContext context=PlatformContextFactory.getContext(paramBean);
                //验证当前用户是否有权操作数据
                boolean havPermissions=context.verifyUserPermissions(paramBean.getUserBean());
                if(!havPermissions){
                    outBean.put(PlatformEnum.KEY_ERROR.toString(),"无权限执行该操作");
                    return outBean;
                }
                //获取上下文，验证数据是否正确
                boolean validationData=context.validationData(paramBean);
                if(!validationData){
                    outBean.put(PlatformEnum.KEY_ERROR.toString(),"数据验证不通过");
                    return outBean;
                }
               // outBean=m
                //根据上下文处理返回数据
                context.formatOutBean(outBean);
            }catch (Exception exception){

            }

            return outBean;
        }
    }

    public static PlatformOutBean query(PlatformParamBean paramBean){
        {
            PlatformOutBean outBean=new PlatformOutBean();
            try{
                PlatformContext context=PlatformContextFactory.getContext(paramBean);
                //验证当前用户是否有权操作数据
                boolean havPermissions=context.verifyUserPermissions(paramBean.getUserBean());
                if(!havPermissions){
                    outBean.put(PlatformEnum.KEY_ERROR.toString(),"无权限执行该操作");
                    return outBean;
                }
                //获取上下文，验证数据是否正确
                boolean validationData=context.validationData(paramBean);
                if(!validationData){
                    outBean.put(PlatformEnum.KEY_ERROR.toString(),"数据验证不通过");
                    return outBean;
                }
                //outBean=m
                //根据上下文处理返回数据
                context.formatOutBean(outBean);
            }catch (Exception exception){

            }

            return outBean;
        }
    }



}
