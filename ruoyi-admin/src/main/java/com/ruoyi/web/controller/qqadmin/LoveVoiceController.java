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
import com.ruoyi.qq.domain.LoveVoice;
import com.ruoyi.qq.service.ILoveVoiceService;
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
@RequestMapping("/system/voice")
public class LoveVoiceController extends BaseController
{
    private String prefix = "system/voice";

    @Autowired
    private ILoveVoiceService loveVoiceService;

    @RequiresPermissions("system:voice:view")
    @GetMapping()
    public String voice()
    {
        return prefix + "/voice";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:voice:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LoveVoice loveVoice)
    {
        startPage();
        List<LoveVoice> list = loveVoiceService.selectLoveVoiceList(loveVoice);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:voice:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LoveVoice loveVoice)
    {
        List<LoveVoice> list = loveVoiceService.selectLoveVoiceList(loveVoice);
        ExcelUtil<LoveVoice> util = new ExcelUtil<LoveVoice>(LoveVoice.class);
        return util.exportExcel(list, "voice");
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
    @RequiresPermissions("system:voice:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LoveVoice loveVoice)
    {
        return toAjax(loveVoiceService.insertLoveVoice(loveVoice));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        LoveVoice loveVoice = loveVoiceService.selectLoveVoiceById(id);
        mmap.put("loveVoice", loveVoice);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:voice:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LoveVoice loveVoice)
    {
        return toAjax(loveVoiceService.updateLoveVoice(loveVoice));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:voice:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(loveVoiceService.deleteLoveVoiceByIds(ids));
    }
}
