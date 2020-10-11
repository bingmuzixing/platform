package com.bmzx.platform.core.application;

import com.bmzx.platform.core.ui.PlatformOutBean;
import com.bmzx.platform.core.ui.PlatformParamBean;
import org.springframework.stereotype.Service;

/**
 * 定义支持应用成的业务类
 */
@Service
public class PlatformApplicationService {



    /**
     * 支持写数据
     * @param paramBean
     * @return
     */
    public PlatformOutBean writingService(PlatformParamBean paramBean,ApplictionEnum applictionEnum){
          PlatformOutBean outBean=new PlatformOutBean();


        return outBean;
    }

    /**
     * 支持读数据
     * @param paramBean
     * @return
     */
    public PlatformOutBean   readingService(PlatformParamBean paramBean,ApplictionEnum applictionEnum){
        PlatformOutBean outBean=new PlatformOutBean();
        return outBean;
    }
}
