package com.bmzx.platform.core.application;

import com.bmzx.platform.core.PlatformContext;
import com.bmzx.platform.core.infrastructure.PlatformException;
import com.bmzx.platform.core.infrastructure.bean.PlatformUrlBean;
import com.bmzx.platform.core.infrastructure.factory.PlatformFactory;
import com.bmzx.platform.core.infrastructure.factory.PlatformFactoryException;
import com.bmzx.platform.core.infrastructure.log.PlatformLog;
import com.bmzx.platform.core.infrastructure.log.PlatformLogFactory;
import com.bmzx.platform.core.infrastructure.util.PlatformSpringUtils;
import com.bmzx.platform.core.infrastructure.util.PlatformUtils;
import com.bmzx.platform.core.ui.PlatformOutBean;
import com.bmzx.platform.core.ui.PlatformParamBean;
import io.netty.handler.codec.xml.XmlEntityReference;

/**
 * 获取上下文工厂
 */
public class PlatformContextFactory extends PlatformFactory {

    private static final PlatformLog log = PlatformLogFactory.getLog(PlatformContextFactory.class);


    public static PlatformContext getContext(PlatformParamBean paramBean) throws Exception{
        log.debug("The parameter to get the urlbean object is["+paramBean.toString()+"]");
        PlatformUrlBean urlBean=paramBean.getUrlBean();
        log.debug("The  urlbean object is["+urlBean.toString()+"]");
        if(urlBean==null){
            throw new PlatformFactoryException("The urlbean object was not found");
        }
        log.debug("The parameter to  urlbean object is["+urlBean.toString()+"]");
        String[] menuse=urlBean.getMenues();
        if(menuse==null||menuse.length==0){
            throw new PlatformFactoryException("No menu information was found in the urlbean object");
        }
        log.debug("The parameter to  menuse object is["+menuse.toString()+"]");
        String methodName=urlBean.getMethodName();
        if(PlatformUtils.isEmpty(methodName)){
            throw new PlatformFactoryException("No methodName information was found in the urlbean object");
        }
        log.debug("The parameter to  methodName object is["+methodName+"]");
        StringBuffer contextClassName=new StringBuffer();
        String menuName="";
        for(int index=0;index<menuse.length;index++){
            if(index>0){

                contextClassName.append(PlatformUtils.getFirstUpperStr(menuName));
            }else{
                contextClassName.append(menuName);
            }
        }

        contextClassName.append(PlatformUtils.getFirstUpperStr(menuName));
        contextClassName.append(ContextSuffixStr);

       PlatformContext platformContext=PlatformSpringUtils.getBean(contextClassName.toString());

       if(platformContext==null){
           throw new PlatformException("获取上下文失败"+contextClassName.toString());
       }
        return platformContext ;
    }
}
