package com.ruoyi.qq.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 love_menstrual_log
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
public class LoveMenstrualLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 是否爱爱 */
    @Excel(name = "是否爱爱")
    private String isMake;

    /** 大姨妈来了 */
    @Excel(name = "大姨妈来了")
    private String isStart;

    /** 今日体重 */
    @Excel(name = "今日体重")
    private Long weight;

    /** 创建日期 */
    @Excel(name = "创建日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setIsMake(String isMake) 
    {
        this.isMake = isMake;
    }

    public String getIsMake() 
    {
        return isMake;
    }
    public void setIsStart(String isStart) 
    {
        this.isStart = isStart;
    }

    public String getIsStart() 
    {
        return isStart;
    }
    public void setWeight(Long weight) 
    {
        this.weight = weight;
    }

    public Long getWeight() 
    {
        return weight;
    }
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }

    public Date getCreateDate() 
    {
        return createDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("isMake", getIsMake())
            .append("isStart", getIsStart())
            .append("weight", getWeight())
            .append("createDate", getCreateDate())
            .append("createBy", getCreateBy())
            .toString();
    }
}
