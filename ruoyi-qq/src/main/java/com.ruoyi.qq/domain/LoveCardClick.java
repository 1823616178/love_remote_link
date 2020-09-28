package com.ruoyi.qq.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 love_card_click
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
public class LoveCardClick extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  主键 */
    private Long id;

    /** 打卡时间 */
    @Excel(name = "打卡时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date clickTime;

    /** 打卡位置 */
    @Excel(name = "打卡位置")
    private String position;

    /** 任务完成详情 */
    @Excel(name = "任务完成详情")
    private String detail;

    /** 打卡照片 */
    @Excel(name = "打卡照片")
    private String imageList;

    /** 打卡人 */
    @Excel(name = "打卡人")
    private String clickPerson;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setClickTime(Date clickTime) 
    {
        this.clickTime = clickTime;
    }

    public Date getClickTime() 
    {
        return clickTime;
    }
    public void setPosition(String position) 
    {
        this.position = position;
    }

    public String getPosition() 
    {
        return position;
    }
    public void setDetail(String detail) 
    {
        this.detail = detail;
    }

    public String getDetail() 
    {
        return detail;
    }
    public void setImageList(String imageList) 
    {
        this.imageList = imageList;
    }

    public String getImageList() 
    {
        return imageList;
    }
    public void setClickPerson(String clickPerson) 
    {
        this.clickPerson = clickPerson;
    }

    public String getClickPerson() 
    {
        return clickPerson;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("clickTime", getClickTime())
            .append("position", getPosition())
            .append("detail", getDetail())
            .append("imageList", getImageList())
            .append("remark", getRemark())
            .append("clickPerson", getClickPerson())
            .toString();
    }
}
