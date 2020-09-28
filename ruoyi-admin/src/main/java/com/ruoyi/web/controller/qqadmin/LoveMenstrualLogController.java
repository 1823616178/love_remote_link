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
import com.ruoyi.qq.domain.LoveMenstrualLog;
import com.ruoyi.qq.service.ILoveMenstrualLogService;
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
@RequestMapping("/qqadmin/menstrualLog")
public class LoveMenstrualLogController extends BaseController {
    private String prefix = "qqadmin/menstrualLog";

    @Autowired
    private ILoveMenstrualLogService loveMenstrualLogService;

    @RequiresPermissions("system:menstrualLog:view")
    @GetMapping()
    public String log() {
        return prefix + "/log";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:menstrualLog:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LoveMenstrualLog loveMenstrualLog) {
        startPage();
        List<LoveMenstrualLog> list = loveMenstrualLogService.selectLoveMenstrualLogList(loveMenstrualLog);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:menstrualLog:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LoveMenstrualLog loveMenstrualLog) {
        List<LoveMenstrualLog> list = loveMenstrualLogService.selectLoveMenstrualLogList(loveMenstrualLog);
        ExcelUtil<LoveMenstrualLog> util = new ExcelUtil<LoveMenstrualLog>(LoveMenstrualLog.class);
        return util.exportExcel(list, "log");
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
    @RequiresPermissions("system:menstrualLog:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LoveMenstrualLog loveMenstrualLog) {
        return toAjax(loveMenstrualLogService.insertLoveMenstrualLog(loveMenstrualLog));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        LoveMenstrualLog loveMenstrualLog = loveMenstrualLogService.selectLoveMenstrualLogById(id);
        mmap.put("loveMenstrualLog", loveMenstrualLog);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:menstrualLog:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LoveMenstrualLog loveMenstrualLog) {
        return toAjax(loveMenstrualLogService.updateLoveMenstrualLog(loveMenstrualLog));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:menstrualLog:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(loveMenstrualLogService.deleteLoveMenstrualLogByIds(ids));
    }
}
