package com.ruoyi.web.controller.qqadminApi;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.annotation.PassToken;
import com.ruoyi.common.annotation.UserLoginToken;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.util.JWTUtil;
import com.ruoyi.qq.domain.LoveMember;
import com.ruoyi.qq.service.ILoveMemberService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2020-09-29
 */
@RestController
@RequestMapping("/api/qqadmin/member")
public class LoveMemberApiController extends BaseController {

    @Autowired
    private ILoveMemberService loveMemberService;

    /**
     * 创建用户token
     */
    @PostMapping("/createToken")
    @PassToken
    @ApiOperation("创建用户token")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "openid", required = true, dataType = "string", paramType = "query")
    })
    public AjaxResult createToken(@RequestParam(value = "openid", required = true) String openid) {
        try {
            String token = JWTUtil.createToken(openid);
            return AjaxResult.success(token);
        } catch (Exception e) {
            return error("获取Token失败");
        }
    }
}
