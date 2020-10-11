package com.bmzx.platform.core.application.controller;

import com.bmzx.platform.core.application.ApplictionEnum;
import com.bmzx.platform.core.application.PlatformApplicationService;
import com.bmzx.platform.core.ui.PlatformOutBean;
import com.bmzx.platform.core.ui.PlatformParamBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** */
@Service
public class PlatformCommonControllerService extends PlatformBaseControllerService {

  @Autowired private PlatformApplicationService platformApplicationService;

    /**
     * 公共保存
     * @param paramBean
     * @return
     */
  public PlatformOutBean save(PlatformParamBean paramBean) {
    this.beforeSave(paramBean);
    PlatformOutBean outBean =
        platformApplicationService.writingService(paramBean, ApplictionEnum.SAVE);
    this.afterSave(outBean);

    return outBean;
  }

  public PlatformOutBean batchSave(PlatformParamBean paramBean) {
    this.beforeBatchSave(paramBean);
    PlatformOutBean outBean =
        platformApplicationService.writingService(paramBean, ApplictionEnum.BATCH_SAVE);
    this.afterBatchSave(outBean);
    return outBean;
  }

  public PlatformOutBean delete(PlatformParamBean paramBean) {
    this.beforeDelete(paramBean);
    PlatformOutBean outBean =
        platformApplicationService.writingService(paramBean, ApplictionEnum.DELETE);
    this.afterDelete(outBean);
    return outBean;
  }

  public PlatformOutBean batchDelete(PlatformParamBean paramBean) {
    this.beforeDelete(paramBean);
    PlatformOutBean outBean =
        platformApplicationService.writingService(paramBean, ApplictionEnum.BATCH_DELETE);
    this.afterDelete(outBean);
    return outBean;
  }

  public PlatformOutBean batchUpdate(PlatformParamBean paramBean) {
    this.beforeBatchUpdate(paramBean);
    PlatformOutBean outBean =
        platformApplicationService.writingService(paramBean, ApplictionEnum.BATCH_UPDATE);
    this.afterBatchUpdate(outBean);
    return outBean;
  }

  public PlatformOutBean imp(PlatformParamBean paramBean) {
    this.beforeImp(paramBean);
    PlatformOutBean outBean =
        platformApplicationService.writingService(paramBean, ApplictionEnum.IMP);
    this.afterImp(outBean);
    return outBean;
  }

  public PlatformOutBean exprot(PlatformParamBean paramBean) {
    this.beforeExprot(paramBean);
    PlatformOutBean outBean =
        platformApplicationService.readingService(paramBean, ApplictionEnum.EXP);
    this.afterExprot(outBean);
    return outBean;
  }

  public PlatformOutBean load(PlatformParamBean paramBean) {
    this.beforeLoad(paramBean);
    PlatformOutBean outBean =
        platformApplicationService.readingService(paramBean, ApplictionEnum.LOAD);
    this.afterLoad(outBean);
    return outBean;
  }

  public PlatformOutBean query(PlatformParamBean paramBean) {
    this.beforeQuery(paramBean);
    PlatformOutBean outBean =
        platformApplicationService.readingService(paramBean, ApplictionEnum.QUERY);
    this.afterQuery(outBean);
    return outBean;
  }

  public PlatformOutBean list(PlatformParamBean paramBean) {
    this.beforeList(paramBean);
    PlatformOutBean outBean =
        platformApplicationService.readingService(paramBean, ApplictionEnum.LIST);
    this.afterList(outBean);
    return outBean;
  }

  @Override
  protected void beforeSave(PlatformParamBean paramBean) {}

  @Override
  protected void afterSave(PlatformOutBean outBean) {}

  @Override
  protected void beforeBatchSave(PlatformParamBean paramBean) {}

  @Override
  protected void afterBatchSave(PlatformOutBean outBean) {}

  @Override
  protected void beforeDelete(PlatformParamBean paramBean) {}

  @Override
  protected void afterDelete(PlatformOutBean outBean) {}

  @Override
  protected void beforeBatchDelete(PlatformParamBean paramBean) {}

  @Override
  protected void afterBatchDelete(PlatformOutBean outBean) {}

  @Override
  protected void beforeBatchUpdate(PlatformParamBean paramBean) {}

  @Override
  protected void afterBatchUpdate(PlatformOutBean outBean) {}

  @Override
  protected void beforeImp(PlatformParamBean paramBean) {}

  @Override
  protected void afterImp(PlatformOutBean outBean) {}

  @Override
  protected void beforeExprot(PlatformParamBean paramBean) {}

  @Override
  protected void afterExprot(PlatformOutBean outBean) {}

  @Override
  protected void beforeLoad(PlatformParamBean paramBean) {}

  @Override
  protected void afterLoad(PlatformOutBean outBean) {}

  @Override
  protected void beforeQuery(PlatformParamBean paramBean) {}

  @Override
  protected void afterQuery(PlatformOutBean outBean) {}

  @Override
  protected void beforeList(PlatformParamBean paramBean) {}

  @Override
  protected void afterList(PlatformOutBean outBean) {}
}
