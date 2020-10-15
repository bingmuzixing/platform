package com.bmzx.platform.core.ui.controller;

import com.bmzx.platform.core.infrastructure.bean.PlatformEnum;
import com.bmzx.platform.core.infrastructure.bean.PlatformUrlBean;
import com.bmzx.platform.core.infrastructure.bean.PlatformUserBean;
import com.bmzx.platform.core.ui.PlatformParamBean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

@Component
public class PlatformBaseController {
  protected HttpServletResponse response;

  protected HttpSession session;

  protected HttpServletRequest request;

  protected PlatformParamBean paramBean ;



  @ModelAttribute
  public void initAttribute(HttpServletRequest request, HttpServletResponse response) {
    this.response = response;
    this.request = request;
    this.session = request.getSession();
    // 组装传递过来的参数
    this.getParam(request);


  }

  protected void getParam(HttpServletRequest request) {
    paramBean = new PlatformParamBean();
    Enumeration paramNames = request.getParameterNames();
    while (paramNames.hasMoreElements()) {
      String pName = (String) paramNames.nextElement();

      String value = getStr(request, pName);
      paramBean.put(pName, value);
    }
    //构建url对象
    paramBean.put(PlatformEnum.KEY_URL.getKey(),PlatformUrlBean.buildUrlBean(request));
    //构建用户基本信息
    paramBean.put(PlatformEnum.KEY_USER.getKey(), PlatformUserBean.buildUserBean(request));
  }


  private static String getStr(HttpServletRequest request, String param) {
    String value = request.getParameter(param);
    if (value == null) {
      value = "";
    }

    return value;
  }





}
