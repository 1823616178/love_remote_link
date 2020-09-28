package com.ruoyi.qq.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 love_card
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
public class LoveCard extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 打卡主题 */
    @Excel(name = "打卡主题")
    private String theme;

    /** 额定开始时间 */
    @Excel(name = "额定开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 额定结束时间 */
    @Excel(name = "额定结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 打卡频率 */
    @Excel(name = "打卡频率")
    private String freenqucy;

    /** 漏打惩罚 */
    @Excel(name = "漏打惩罚")
    private String punishment;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTheme(String theme) 
    {
        this.theme = theme;
    }

    public String getTheme() 
    {
        return theme;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setFreenqucy(String freenqucy) 
    {
        this.freenqucy = freenqucy;
    }

    public String getFreenqucy() 
    {
        return freenqucy;
    }
    public void setPunishment(String punishment) 
    {
        this.punishment = punishment;
    }

    public String getPunishment() 
    {
        return punishment;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("theme", getTheme())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("freenqucy", getFreenqucy())
            .append("punishment", getPunishment())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
