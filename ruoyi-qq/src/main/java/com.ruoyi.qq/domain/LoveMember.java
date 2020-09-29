package com.ruoyi.qq.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 love_member
 * 
 * @author ruoyi
 * @date 2020-09-29
 */
public class LoveMember extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 账户 */
    @Excel(name = "账户")
    private String userName;

    /** 名字 */
    @Excel(name = "名字")
    private String name;

    /** 登录地址 */
    @Excel(name = "登录地址")
    private String location;

    /** 登录ip */
    @Excel(name = "登录ip")
    private String ip;

    /** 电话号码 */
    @Excel(name = "电话号码")
    private String mebile;

    /** qq号码 */
    @Excel(name = "qq号码")
    private String qq;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setLocation(String location) 
    {
        this.location = location;
    }

    public String getLocation() 
    {
        return location;
    }
    public void setIp(String ip) 
    {
        this.ip = ip;
    }

    public String getIp() 
    {
        return ip;
    }
    public void setMebile(String mebile) 
    {
        this.mebile = mebile;
    }

    public String getMebile() 
    {
        return mebile;
    }
    public void setQq(String qq) 
    {
        this.qq = qq;
    }

    public String getQq() 
    {
        return qq;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userName", getUserName())
            .append("name", getName())
            .append("location", getLocation())
            .append("ip", getIp())
            .append("mebile", getMebile())
            .append("qq", getQq())
            .toString();
    }
}
