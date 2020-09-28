package com.ruoyi.qq.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.qq.mapper.LoveCardClickMapper;
import com.ruoyi.qq.domain.LoveCardClick;
import com.ruoyi.qq.service.ILoveCardClickService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
@Service
public class LoveCardClickServiceImpl implements ILoveCardClickService 
{
    @Autowired
    private LoveCardClickMapper loveCardClickMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public LoveCardClick selectLoveCardClickById(Long id)
    {
        return loveCardClickMapper.selectLoveCardClickById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param loveCardClick 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<LoveCardClick> selectLoveCardClickList(LoveCardClick loveCardClick)
    {
        return loveCardClickMapper.selectLoveCardClickList(loveCardClick);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param loveCardClick 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertLoveCardClick(LoveCardClick loveCardClick)
    {
        return loveCardClickMapper.insertLoveCardClick(loveCardClick);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param loveCardClick 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateLoveCardClick(LoveCardClick loveCardClick)
    {
        return loveCardClickMapper.updateLoveCardClick(loveCardClick);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLoveCardClickByIds(String ids)
    {
        return loveCardClickMapper.deleteLoveCardClickByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteLoveCardClickById(Long id)
    {
        return loveCardClickMapper.deleteLoveCardClickById(id);
    }
}
