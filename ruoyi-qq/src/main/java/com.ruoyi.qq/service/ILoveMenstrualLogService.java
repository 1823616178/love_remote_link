package com.ruoyi.qq.service;

import java.util.List;
import com.ruoyi.qq.domain.LoveMenstrualLog;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
public interface ILoveMenstrualLogService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public LoveMenstrualLog selectLoveMenstrualLogById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param loveMenstrualLog 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<LoveMenstrualLog> selectLoveMenstrualLogList(LoveMenstrualLog loveMenstrualLog);

    /**
     * 新增【请填写功能名称】
     * 
     * @param loveMenstrualLog 【请填写功能名称】
     * @return 结果
     */
    public int insertLoveMenstrualLog(LoveMenstrualLog loveMenstrualLog);

    /**
     * 修改【请填写功能名称】
     * 
     * @param loveMenstrualLog 【请填写功能名称】
     * @return 结果
     */
    public int updateLoveMenstrualLog(LoveMenstrualLog loveMenstrualLog);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLoveMenstrualLogByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteLoveMenstrualLogById(Long id);
}
