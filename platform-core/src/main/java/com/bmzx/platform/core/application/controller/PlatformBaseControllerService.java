package com.bmzx.platform.core.application.controller;


import com.bmzx.platform.core.ui.PlatformOutBean;
import com.bmzx.platform.core.ui.PlatformParamBean;

public  abstract  class PlatformBaseControllerService {







    protected abstract void beforeSave(PlatformParamBean paramBean);

    protected abstract void afterSave(PlatformOutBean outBean);


    protected abstract void beforeBatchSave(PlatformParamBean paramBean);

    protected abstract void afterBatchSave(PlatformOutBean outBean);

    protected abstract void beforeDelete(PlatformParamBean paramBean);

    protected abstract void afterDelete(PlatformOutBean outBean);

    protected abstract void beforeBatchDelete(PlatformParamBean paramBean);

    protected abstract void afterBatchDelete(PlatformOutBean outBean);
    protected abstract void beforeBatchUpdate(PlatformParamBean paramBean);

    protected abstract void afterBatchUpdate(PlatformOutBean outBean);

    protected abstract void beforeImp(PlatformParamBean paramBean);

    protected abstract void afterImp(PlatformOutBean outBean);

    protected abstract void beforeExprot(PlatformParamBean paramBean);

    protected abstract void afterExprot(PlatformOutBean outBean);


    protected abstract void beforeLoad(PlatformParamBean paramBean);

    protected abstract void afterLoad(PlatformOutBean outBean);

    protected abstract void beforeQuery(PlatformParamBean paramBean);

    protected abstract void afterQuery(PlatformOutBean outBean);

    protected abstract void beforeList(PlatformParamBean paramBean);

    protected abstract void afterList(PlatformOutBean outBean);
}
