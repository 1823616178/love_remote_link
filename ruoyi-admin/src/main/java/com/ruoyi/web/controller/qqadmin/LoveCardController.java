package com.ruoyi.web.controller.qqadmin;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.qq.domain.LoveCard;
import com.ruoyi.qq.service.ILoveCardService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 挑战首页
 *
 * @author ruoyi
 * @date 2020-09-28
 */
@Controller
@RequestMapping("/qqadmin/card")
public class LoveCardController extends BaseController {
    private String prefix = "qqadmin/card";

    @Autowired
    private ILoveCardService loveCardService;

    @RequiresPermissions("system:card:view")
    @GetMapping()
    public String card() {
        return prefix + "/card";
    }

    /**
     * 查询打卡数据列表
     */
    @RequiresPermissions("system:card:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LoveCard loveCard) {
        startPage();
        List<LoveCard> list = loveCardService.selectLoveCardList(loveCard);
        return getDataTable(list);
    }

    /**
     * Excel导出
     */
    @RequiresPermissions("system:card:export")
    @Log(title = "Excel导出", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LoveCard loveCard) {
        List<LoveCard> list = loveCardService.selectLoveCardList(loveCard);
        ExcelUtil<LoveCard> util = new ExcelUtil<LoveCard>(LoveCard.class);
        return util.exportExcel(list, "card");
    }

    /**
     * 新增跳转
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增数据
     */
    @RequiresPermissions("system:card:add")
    @Log(title = "新增数据", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LoveCard loveCard) {
        return toAjax(loveCardService.insertLoveCard(loveCard));
    }

    /**
     * 修改跳转
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        LoveCard loveCard = loveCardService.selectLoveCardById(id);
        mmap.put("loveCard", loveCard);
        return prefix + "/edit";
    }

    /**
     * 修改保存
     */
    @RequiresPermissions("system:card:edit")
    @Log(title = "修改保存", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LoveCard loveCard) {
        return toAjax(loveCardService.updateLoveCard(loveCard));
    }

    /**
     * 删除
     */
    @RequiresPermissions("system:card:remove")
    @Log(title = "删除", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(loveCardService.deleteLoveCardByIds(ids));
    }
}
