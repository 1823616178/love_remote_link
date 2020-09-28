package com.ruoyi.qq.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.qq.mapper.LoveCardMapper;
import com.ruoyi.qq.domain.LoveCard;
import com.ruoyi.qq.service.ILoveCardService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
@Service
public class LoveCardServiceImpl implements ILoveCardService 
{
    @Autowired
    private LoveCardMapper loveCardMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public LoveCard selectLoveCardById(Long id)
    {
        return loveCardMapper.selectLoveCardById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param loveCard 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<LoveCard> selectLoveCardList(LoveCard loveCard)
    {
        return loveCardMapper.selectLoveCardList(loveCard);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param loveCard 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertLoveCard(LoveCard loveCard)
    {
        loveCard.setCreateTime(DateUtils.getNowDate());
        return loveCardMapper.insertLoveCard(loveCard);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param loveCard 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateLoveCard(LoveCard loveCard)
    {
        loveCard.setUpdateTime(DateUtils.getNowDate());
        return loveCardMapper.updateLoveCard(loveCard);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLoveCardByIds(String ids)
    {
        return loveCardMapper.deleteLoveCardByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteLoveCardById(Long id)
    {
        return loveCardMapper.deleteLoveCardById(id);
    }
}
