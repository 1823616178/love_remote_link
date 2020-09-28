package com.ruoyi.web.controller.qqadmin;

import java.util.List;

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
import com.ruoyi.qq.domain.LoveMeetDate;
import com.ruoyi.qq.service.ILoveMeetDateService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2020-09-28
 */
@Controller
@RequestMapping("/qqadmin/date")
public class LoveMeetDateController extends BaseController {
    private String prefix = "qqadmin/date";

    @Autowired
    private ILoveMeetDateService loveMeetDateService;

    @RequiresPermissions("system:meet:view")
    @GetMapping()
    public String date() {
        return prefix + "/date";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:meet:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LoveMeetDate loveMeetDate) {
        startPage();
        List<LoveMeetDate> list = loveMeetDateService.selectLoveMeetDateList(loveMeetDate);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:meet:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LoveMeetDate loveMeetDate) {
        List<LoveMeetDate> list = loveMeetDateService.selectLoveMeetDateList(loveMeetDate);
        ExcelUtil<LoveMeetDate> util = new ExcelUtil<LoveMeetDate>(LoveMeetDate.class);
        return util.exportExcel(list, "date");
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
    @RequiresPermissions("system:meet:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LoveMeetDate loveMeetDate) {
        return toAjax(loveMeetDateService.insertLoveMeetDate(loveMeetDate));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        LoveMeetDate loveMeetDate = loveMeetDateService.selectLoveMeetDateById(id);
        mmap.put("loveMeetDate", loveMeetDate);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:meet:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LoveMeetDate loveMeetDate) {
        return toAjax(loveMeetDateService.updateLoveMeetDate(loveMeetDate));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:meet:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(loveMeetDateService.deleteLoveMeetDateByIds(ids));
    }
}
