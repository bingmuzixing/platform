package com.bmzx.platform.oauth.ui;


import com.bmzx.platform.core.application.PlatformApplicationFactory;
import com.bmzx.platform.core.infrastructure.log.PlatformLog;
import com.bmzx.platform.core.infrastructure.log.PlatformLogFactory;
import com.bmzx.platform.core.infrastructure.util.JsonUtils;
import com.bmzx.platform.core.ui.PlatformOutBean;
import com.bmzx.platform.core.ui.PlatformParamBean;
import com.bmzx.platform.core.ui.controller.PlatformCommonController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/group")
public class GroupController extends PlatformCommonController {
 private static final PlatformLog log= PlatformLogFactory.getLog(GroupController.class);
    @RequestMapping("/tree")
    @ResponseBody
    public PlatformOutBean tree() {
        PlatformParamBean paramBean = super.paramBean;
        log.info("tree method receive parameters as:"+ JsonUtils.obj2String(paramBean));
        //根据请求的urlBean 获取处理的service
        PlatformOutBean outBean = PlatformApplicationFactory.query(paramBean);


        return outBean;
    }

}
