package com.ruoyi.qq.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 love_log
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
public class LoveLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 今日心情 */
    @Excel(name = "今日心情")
    private String temper;

    /** 内容详情 */
    @Excel(name = "内容详情")
    private String detail;

    /** 创建日期 */
    @Excel(name = "创建日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /** 照片分享 */
    @Excel(name = "照片分享")
    private String image;

    /** 分享地址 */
    @Excel(name = "分享地址")
    private String position;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTemper(String temper) 
    {
        this.temper = temper;
    }

    public String getTemper() 
    {
        return temper;
    }
    public void setDetail(String detail) 
    {
        this.detail = detail;
    }

    public String getDetail() 
    {
        return detail;
    }
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }

    public Date getCreateDate() 
    {
        return createDate;
    }
    public void setImage(String image) 
    {
        this.image = image;
    }

    public String getImage() 
    {
        return image;
    }
    public void setPosition(String position) 
    {
        this.position = position;
    }

    public String getPosition() 
    {
        return position;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("temper", getTemper())
            .append("detail", getDetail())
            .append("createDate", getCreateDate())
            .append("createBy", getCreateBy())
            .append("image", getImage())
            .append("position", getPosition())
            .toString();
    }
}
