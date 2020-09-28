package com.ruoyi.qq.service;

import java.util.List;
import com.ruoyi.qq.domain.LoveVoice;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
public interface ILoveVoiceService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public LoveVoice selectLoveVoiceById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param loveVoice 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<LoveVoice> selectLoveVoiceList(LoveVoice loveVoice);

    /**
     * 新增【请填写功能名称】
     * 
     * @param loveVoice 【请填写功能名称】
     * @return 结果
     */
    public int insertLoveVoice(LoveVoice loveVoice);

    /**
     * 修改【请填写功能名称】
     * 
     * @param loveVoice 【请填写功能名称】
     * @return 结果
     */
    public int updateLoveVoice(LoveVoice loveVoice);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLoveVoiceByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteLoveVoiceById(Long id);
}
