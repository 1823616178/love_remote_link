package com.ruoyi.qq.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.qq.mapper.LoveMenstrualLogMapper;
import com.ruoyi.qq.domain.LoveMenstrualLog;
import com.ruoyi.qq.service.ILoveMenstrualLogService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
@Service
public class LoveMenstrualLogServiceImpl implements ILoveMenstrualLogService 
{
    @Autowired
    private LoveMenstrualLogMapper loveMenstrualLogMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public LoveMenstrualLog selectLoveMenstrualLogById(Long id)
    {
        return loveMenstrualLogMapper.selectLoveMenstrualLogById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param loveMenstrualLog 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<LoveMenstrualLog> selectLoveMenstrualLogList(LoveMenstrualLog loveMenstrualLog)
    {
        return loveMenstrualLogMapper.selectLoveMenstrualLogList(loveMenstrualLog);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param loveMenstrualLog 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertLoveMenstrualLog(LoveMenstrualLog loveMenstrualLog)
    {
        return loveMenstrualLogMapper.insertLoveMenstrualLog(loveMenstrualLog);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param loveMenstrualLog 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateLoveMenstrualLog(LoveMenstrualLog loveMenstrualLog)
    {
        return loveMenstrualLogMapper.updateLoveMenstrualLog(loveMenstrualLog);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLoveMenstrualLogByIds(String ids)
    {
        return loveMenstrualLogMapper.deleteLoveMenstrualLogByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteLoveMenstrualLogById(Long id)
    {
        return loveMenstrualLogMapper.deleteLoveMenstrualLogById(id);
    }
}
