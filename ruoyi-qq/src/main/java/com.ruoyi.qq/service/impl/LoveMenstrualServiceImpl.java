package com.ruoyi.qq.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.qq.mapper.LoveMenstrualMapper;
import com.ruoyi.qq.domain.LoveMenstrual;
import com.ruoyi.qq.service.ILoveMenstrualService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
@Service
public class LoveMenstrualServiceImpl implements ILoveMenstrualService 
{
    @Autowired
    private LoveMenstrualMapper loveMenstrualMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public LoveMenstrual selectLoveMenstrualById(Long id)
    {
        return loveMenstrualMapper.selectLoveMenstrualById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param loveMenstrual 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<LoveMenstrual> selectLoveMenstrualList(LoveMenstrual loveMenstrual)
    {
        return loveMenstrualMapper.selectLoveMenstrualList(loveMenstrual);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param loveMenstrual 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertLoveMenstrual(LoveMenstrual loveMenstrual)
    {
        return loveMenstrualMapper.insertLoveMenstrual(loveMenstrual);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param loveMenstrual 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateLoveMenstrual(LoveMenstrual loveMenstrual)
    {
        return loveMenstrualMapper.updateLoveMenstrual(loveMenstrual);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLoveMenstrualByIds(String ids)
    {
        return loveMenstrualMapper.deleteLoveMenstrualByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteLoveMenstrualById(Long id)
    {
        return loveMenstrualMapper.deleteLoveMenstrualById(id);
    }
}
