package com.ruoyi.qq.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 love_voice
 * 
 * @author ruoyi
 * @date 2020-09-28
 */
public class LoveVoice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 留言地址 */
    @Excel(name = "留言地址")
    private String messageAddr;

    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMessageAddr(String messageAddr) 
    {
        this.messageAddr = messageAddr;
    }

    public String getMessageAddr() 
    {
        return messageAddr;
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
            .append("messageAddr", getMessageAddr())
            .append("createDate", getCreateDate())
            .append("createBy", getCreateBy())
            .toString();
    }
}
