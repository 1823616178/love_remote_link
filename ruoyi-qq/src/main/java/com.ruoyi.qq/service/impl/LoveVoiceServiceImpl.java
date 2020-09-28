package com.ruoyi.qq.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.qq.mapper.LoveVoiceMapper;
import com.ruoyi.qq.domain.LoveVoice;
import com.ruoyi.qq.service.ILoveVoiceService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
@Service
public class LoveVoiceServiceImpl implements ILoveVoiceService 
{
    @Autowired
    private LoveVoiceMapper loveVoiceMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public LoveVoice selectLoveVoiceById(Long id)
    {
        return loveVoiceMapper.selectLoveVoiceById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param loveVoice 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<LoveVoice> selectLoveVoiceList(LoveVoice loveVoice)
    {
        return loveVoiceMapper.selectLoveVoiceList(loveVoice);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param loveVoice 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertLoveVoice(LoveVoice loveVoice)
    {
        return loveVoiceMapper.insertLoveVoice(loveVoice);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param loveVoice 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateLoveVoice(LoveVoice loveVoice)
    {
        return loveVoiceMapper.updateLoveVoice(loveVoice);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLoveVoiceByIds(String ids)
    {
        return loveVoiceMapper.deleteLoveVoiceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteLoveVoiceById(Long id)
    {
        return loveVoiceMapper.deleteLoveVoiceById(id);
    }
}
