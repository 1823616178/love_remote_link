package com.ruoyi.web.controller.qqadminApi;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.annotation.PassToken;
import com.ruoyi.common.annotation.UserLoginToken;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.qq.domain.LoveMember;
import com.ruoyi.qq.service.ILoveMemberService;
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
    private String prefix = "qqadmin/member";

    @Autowired
    private ILoveMemberService loveMemberService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ResponseBody
    @UserLoginToken
    public AjaxResult list(LoveMember loveMember) {
//        startPage();
        List<LoveMember> list = loveMemberService.selectLoveMemberList(loveMember);
        return AjaxResult.success(list);
//        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:member:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LoveMember loveMember) {
        List<LoveMember> list = loveMemberService.selectLoveMemberList(loveMember);
        ExcelUtil<LoveMember> util = new ExcelUtil<LoveMember>(LoveMember.class);
        return util.exportExcel(list, "member");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("system:member:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LoveMember loveMember) {
        return toAjax(loveMemberService.insertLoveMember(loveMember));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String username, ModelMap mmap) {
        LoveMember loveMember = loveMemberService.selectLoveMemberByUsername(username);
        mmap.put("loveMember", loveMember);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:member:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LoveMember loveMember) {
        return toAjax(loveMemberService.updateLoveMember(loveMember));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:member:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(loveMemberService.deleteLoveMemberByIds(ids));
    }
}
