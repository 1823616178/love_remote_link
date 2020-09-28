package com.ruoyi.qq.service;

import java.util.List;
import com.ruoyi.qq.domain.LoveCardClick;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
public interface ILoveCardClickService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public LoveCardClick selectLoveCardClickById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param loveCardClick 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<LoveCardClick> selectLoveCardClickList(LoveCardClick loveCardClick);

    /**
     * 新增【请填写功能名称】
     * 
     * @param loveCardClick 【请填写功能名称】
     * @return 结果
     */
    public int insertLoveCardClick(LoveCardClick loveCardClick);

    /**
     * 修改【请填写功能名称】
     * 
     * @param loveCardClick 【请填写功能名称】
     * @return 结果
     */
    public int updateLoveCardClick(LoveCardClick loveCardClick);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLoveCardClickByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteLoveCardClickById(Long id);
}
