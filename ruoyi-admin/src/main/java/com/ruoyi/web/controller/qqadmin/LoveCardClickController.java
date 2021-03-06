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
import com.ruoyi.qq.domain.LoveCardClick;
import com.ruoyi.qq.service.ILoveCardClickService;
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
@RequestMapping("/qqadmin/click")
public class LoveCardClickController extends BaseController {
    private String prefix = "qqadmin/click";

    @Autowired
    private ILoveCardClickService loveCardClickService;

    @RequiresPermissions("system:click:view")
    @GetMapping()
    public String click() {
        return prefix + "/click";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:click:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LoveCardClick loveCardClick) {
        startPage();
        List<LoveCardClick> list = loveCardClickService.selectLoveCardClickList(loveCardClick);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:click:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LoveCardClick loveCardClick) {
        List<LoveCardClick> list = loveCardClickService.selectLoveCardClickList(loveCardClick);
        ExcelUtil<LoveCardClick> util = new ExcelUtil<LoveCardClick>(LoveCardClick.class);
        return util.exportExcel(list, "click");
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
    @RequiresPermissions("system:click:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LoveCardClick loveCardClick) {
        return toAjax(loveCardClickService.insertLoveCardClick(loveCardClick));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        LoveCardClick loveCardClick = loveCardClickService.selectLoveCardClickById(id);
        mmap.put("loveCardClick", loveCardClick);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:click:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LoveCardClick loveCardClick) {
        return toAjax(loveCardClickService.updateLoveCardClick(loveCardClick));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:click:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(loveCardClickService.deleteLoveCardClickByIds(ids));
    }
}
