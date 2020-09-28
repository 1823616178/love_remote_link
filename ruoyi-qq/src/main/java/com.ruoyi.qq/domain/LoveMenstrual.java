package com.ruoyi.qq.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 love_menstrual
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
public class LoveMenstrual extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 月经周期 */
    @Excel(name = "月经周期")
    private String period;

    /** 月经开始时间 */
    @Excel(name = "月经开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date menstrualStartDate;

    /** 月经结束时间 */
    @Excel(name = "月经结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date menstrualEndDate;

    /** 创建日期 */
    @Excel(name = "创建日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /** 更新日期 */
    @Excel(name = "更新日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updateDate;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPeriod(String period) 
    {
        this.period = period;
    }

    public String getPeriod() 
    {
        return period;
    }
    public void setMenstrualStartDate(Date menstrualStartDate) 
    {
        this.menstrualStartDate = menstrualStartDate;
    }

    public Date getMenstrualStartDate() 
    {
        return menstrualStartDate;
    }
    public void setMenstrualEndDate(Date menstrualEndDate) 
    {
        this.menstrualEndDate = menstrualEndDate;
    }

    public Date getMenstrualEndDate() 
    {
        return menstrualEndDate;
    }
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }

    public Date getCreateDate() 
    {
        return createDate;
    }
    public void setUpdateDate(Date updateDate) 
    {
        this.updateDate = updateDate;
    }

    public Date getUpdateDate() 
    {
        return updateDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("period", getPeriod())
            .append("menstrualStartDate", getMenstrualStartDate())
            .append("menstrualEndDate", getMenstrualEndDate())
            .append("createDate", getCreateDate())
            .append("createBy", getCreateBy())
            .append("updateDate", getUpdateDate())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
