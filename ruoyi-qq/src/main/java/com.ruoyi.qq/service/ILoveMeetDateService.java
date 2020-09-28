package com.ruoyi.qq.service;

import java.util.List;
import com.ruoyi.qq.domain.LoveMeetDate;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
public interface ILoveMeetDateService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public LoveMeetDate selectLoveMeetDateById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param loveMeetDate 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<LoveMeetDate> selectLoveMeetDateList(LoveMeetDate loveMeetDate);

    /**
     * 新增【请填写功能名称】
     * 
     * @param loveMeetDate 【请填写功能名称】
     * @return 结果
     */
    public int insertLoveMeetDate(LoveMeetDate loveMeetDate);

    /**
     * 修改【请填写功能名称】
     * 
     * @param loveMeetDate 【请填写功能名称】
     * @return 结果
     */
    public int updateLoveMeetDate(LoveMeetDate loveMeetDate);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLoveMeetDateByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteLoveMeetDateById(Long id);
}
