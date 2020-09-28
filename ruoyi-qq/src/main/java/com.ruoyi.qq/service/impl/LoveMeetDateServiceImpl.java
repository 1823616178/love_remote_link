package com.ruoyi.qq.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.qq.mapper.LoveMeetDateMapper;
import com.ruoyi.qq.domain.LoveMeetDate;
import com.ruoyi.qq.service.ILoveMeetDateService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
@Service
public class LoveMeetDateServiceImpl implements ILoveMeetDateService 
{
    @Autowired
    private LoveMeetDateMapper loveMeetDateMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public LoveMeetDate selectLoveMeetDateById(Long id)
    {
        return loveMeetDateMapper.selectLoveMeetDateById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param loveMeetDate 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<LoveMeetDate> selectLoveMeetDateList(LoveMeetDate loveMeetDate)
    {
        return loveMeetDateMapper.selectLoveMeetDateList(loveMeetDate);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param loveMeetDate 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertLoveMeetDate(LoveMeetDate loveMeetDate)
    {
        return loveMeetDateMapper.insertLoveMeetDate(loveMeetDate);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param loveMeetDate 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateLoveMeetDate(LoveMeetDate loveMeetDate)
    {
        return loveMeetDateMapper.updateLoveMeetDate(loveMeetDate);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLoveMeetDateByIds(String ids)
    {
        return loveMeetDateMapper.deleteLoveMeetDateByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteLoveMeetDateById(Long id)
    {
        return loveMeetDateMapper.deleteLoveMeetDateById(id);
    }
}
