package com.bmzx.platform.core.ui.controller;


import com.bmzx.platform.core.application.PlatformApplicationFactory;

import com.bmzx.platform.core.infrastructure.log.PlatformLog;
import com.bmzx.platform.core.infrastructure.log.PlatformLogFactory;
import com.bmzx.platform.core.infrastructure.util.JsonUtils;
import com.bmzx.platform.core.ui.PlatformOutBean;

import com.bmzx.platform.core.ui.PlatformParamBean;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/** 常用的调用方法 */
/** 建议继承该类的时候，不建议重写方法 */
@Service
public class PlatformCommonController extends PlatformBaseController {

  private static final PlatformLog log= PlatformLogFactory.getLog(PlatformCommonController.class);


  @RequestMapping("/save")
  @ResponseBody
  public PlatformOutBean save() {
    PlatformParamBean paramBean = super.paramBean;
    log.info("Save method receive parameters as:"+ JsonUtils.obj2String(paramBean));

    PlatformOutBean outBean = PlatformApplicationFactory.write(paramBean);


    return outBean;
  }

  @RequestMapping("/batchSave")
  @ResponseBody
  public PlatformOutBean batchSave() {
    PlatformParamBean paramBean = super.paramBean;

    PlatformOutBean outBean = PlatformApplicationFactory.write(paramBean);

    return outBean;
  }

  @RequestMapping("/delete")
  @ResponseBody
  public PlatformOutBean delete() {
    PlatformParamBean paramBean = super.paramBean;

    PlatformOutBean outBean = PlatformApplicationFactory.write(paramBean);

    return outBean;
  }

  @RequestMapping("/batchDelete")
  @ResponseBody
  public PlatformOutBean batchDelete() {

    PlatformParamBean paramBean = super.paramBean;

    PlatformOutBean outBean = PlatformApplicationFactory.write(paramBean);

    return outBean;
  }

  @RequestMapping("/batchUpdate")
  @ResponseBody
  public PlatformOutBean batchUpdate() {

    PlatformParamBean paramBean = super.paramBean;

    PlatformOutBean outBean = PlatformApplicationFactory.write(paramBean);

    return outBean;
  }

  @RequestMapping("/imp")
  @ResponseBody
  public PlatformOutBean imp() {

    PlatformParamBean paramBean = super.paramBean;

    PlatformOutBean outBean = PlatformApplicationFactory.write(paramBean);

    return outBean;
  }

  @RequestMapping("/exprot")
  @ResponseBody
  public PlatformOutBean exprot() {

    PlatformParamBean paramBean = super.paramBean;

    PlatformOutBean outBean = PlatformApplicationFactory.query(paramBean);

    return outBean;
  }

  @RequestMapping("/load")
  @ResponseBody
  public PlatformOutBean load() {

    PlatformParamBean paramBean = super.paramBean;

    PlatformOutBean outBean = PlatformApplicationFactory.query(paramBean);

    return outBean;
  }

  @RequestMapping("/query")
  @ResponseBody
  public PlatformOutBean query() {

    PlatformParamBean paramBean = super.paramBean;

    PlatformOutBean outBean = PlatformApplicationFactory.query(paramBean);
    return outBean;
  }

  @RequestMapping("/list")
  @ResponseBody
  public PlatformOutBean list() {

    PlatformParamBean paramBean = super.paramBean;

    PlatformOutBean outBean = PlatformApplicationFactory.query(paramBean);

    return outBean;
  }



}
