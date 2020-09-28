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
import com.ruoyi.qq.domain.LoveMenstrual;
import com.ruoyi.qq.service.ILoveMenstrualService;
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
@RequestMapping("/qqadmin/menstrual")
public class LoveMenstrualController extends BaseController
{
    private String prefix = "qqadmin/menstrual";

    @Autowired
    private ILoveMenstrualService loveMenstrualService;

    @RequiresPermissions("system:menstrual:view")
    @GetMapping()
    public String menstrual()
    {
        return prefix + "/menstrual";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:menstrual:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LoveMenstrual loveMenstrual)
    {
        startPage();
        List<LoveMenstrual> list = loveMenstrualService.selectLoveMenstrualList(loveMenstrual);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:menstrual:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LoveMenstrual loveMenstrual)
    {
        List<LoveMenstrual> list = loveMenstrualService.selectLoveMenstrualList(loveMenstrual);
        ExcelUtil<LoveMenstrual> util = new ExcelUtil<LoveMenstrual>(LoveMenstrual.class);
        return util.exportExcel(list, "menstrual");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("system:menstrual:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LoveMenstrual loveMenstrual)
    {
        return toAjax(loveMenstrualService.insertLoveMenstrual(loveMenstrual));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        LoveMenstrual loveMenstrual = loveMenstrualService.selectLoveMenstrualById(id);
        mmap.put("loveMenstrual", loveMenstrual);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:menstrual:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LoveMenstrual loveMenstrual)
    {
        return toAjax(loveMenstrualService.updateLoveMenstrual(loveMenstrual));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:menstrual:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(loveMenstrualService.deleteLoveMenstrualByIds(ids));
    }
}
