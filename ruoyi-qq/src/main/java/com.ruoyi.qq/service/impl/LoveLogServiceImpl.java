package com.ruoyi.qq.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.qq.mapper.LoveLogMapper;
import com.ruoyi.qq.domain.LoveLog;
import com.ruoyi.qq.service.ILoveLogService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
@Service
public class LoveLogServiceImpl implements ILoveLogService 
{
    @Autowired
    private LoveLogMapper loveLogMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public LoveLog selectLoveLogById(Long id)
    {
        return loveLogMapper.selectLoveLogById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param loveLog 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<LoveLog> selectLoveLogList(LoveLog loveLog)
    {
        return loveLogMapper.selectLoveLogList(loveLog);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param loveLog 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertLoveLog(LoveLog loveLog)
    {
        return loveLogMapper.insertLoveLog(loveLog);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param loveLog 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateLoveLog(LoveLog loveLog)
    {
        return loveLogMapper.updateLoveLog(loveLog);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLoveLogByIds(String ids)
    {
        return loveLogMapper.deleteLoveLogByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteLoveLogById(Long id)
    {
        return loveLogMapper.deleteLoveLogById(id);
    }
}
