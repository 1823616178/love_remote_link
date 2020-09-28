package com.ruoyi.qq.mapper;

import java.util.List;
import com.ruoyi.qq.domain.LoveCard;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
public interface LoveCardMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public LoveCard selectLoveCardById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param loveCard 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<LoveCard> selectLoveCardList(LoveCard loveCard);

    /**
     * 新增【请填写功能名称】
     * 
     * @param loveCard 【请填写功能名称】
     * @return 结果
     */
    public int insertLoveCard(LoveCard loveCard);

    /**
     * 修改【请填写功能名称】
     * 
     * @param loveCard 【请填写功能名称】
     * @return 结果
     */
    public int updateLoveCard(LoveCard loveCard);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteLoveCardById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLoveCardByIds(String[] ids);
}
