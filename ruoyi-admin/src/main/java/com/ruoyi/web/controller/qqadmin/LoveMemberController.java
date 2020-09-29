package com.ruoyi.web.controller.qqadmin;

import java.util.List;

import com.ruoyi.common.annotation.PassToken;
import com.ruoyi.framework.util.JWTUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.qq.domain.LoveMember;
import com.ruoyi.qq.service.ILoveMemberService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2020-09-29
 */
@Controller
@RequestMapping("/api/qqadmin/member")
public class LoveMemberController extends BaseController {
    @Autowired
    private ILoveMemberService loveMemberService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/createToken")
    @ResponseBody
    @PassToken
    public String list() {
        String createToken = JWTUtil.createToken("admin");
        return createToken;
    }

}
