package com.ruoyi.qq.mapper;

import java.util.List;
import com.ruoyi.qq.domain.LoveMenstrual;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
public interface LoveMenstrualMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public LoveMenstrual selectLoveMenstrualById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param loveMenstrual 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<LoveMenstrual> selectLoveMenstrualList(LoveMenstrual loveMenstrual);

    /**
     * 新增【请填写功能名称】
     * 
     * @param loveMenstrual 【请填写功能名称】
     * @return 结果
     */
    public int insertLoveMenstrual(LoveMenstrual loveMenstrual);

    /**
     * 修改【请填写功能名称】
     * 
     * @param loveMenstrual 【请填写功能名称】
     * @return 结果
     */
    public int updateLoveMenstrual(LoveMenstrual loveMenstrual);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteLoveMenstrualById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLoveMenstrualByIds(String[] ids);
}
