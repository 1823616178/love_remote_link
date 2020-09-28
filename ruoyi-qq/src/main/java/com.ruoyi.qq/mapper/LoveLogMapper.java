package com.ruoyi.qq.mapper;

import java.util.List;
import com.ruoyi.qq.domain.LoveLog;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
public interface LoveLogMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public LoveLog selectLoveLogById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param loveLog 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<LoveLog> selectLoveLogList(LoveLog loveLog);

    /**
     * 新增【请填写功能名称】
     * 
     * @param loveLog 【请填写功能名称】
     * @return 结果
     */
    public int insertLoveLog(LoveLog loveLog);

    /**
     * 修改【请填写功能名称】
     * 
     * @param loveLog 【请填写功能名称】
     * @return 结果
     */
    public int updateLoveLog(LoveLog loveLog);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteLoveLogById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLoveLogByIds(String[] ids);
}
