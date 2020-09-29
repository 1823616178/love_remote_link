package com.ruoyi.qq.service;

import java.util.List;

import com.ruoyi.qq.domain.LoveMember;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2020-09-29
 */
public interface ILoveMemberService {
    /**
     * 查询【通过用户名查询用户信息】
     *
     * @param username 【通过用户名查询用户信息】username
     * @return 【通过用户名查询用户信息】
     */
    public LoveMember selectLoveMemberByUsername(String username);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param loveMember 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<LoveMember> selectLoveMemberList(LoveMember loveMember);

    /**
     * 新增【请填写功能名称】
     *
     * @param loveMember 【请填写功能名称】
     * @return 结果
     */
    public int insertLoveMember(LoveMember loveMember);

    /**
     * 修改【请填写功能名称】
     *
     * @param loveMember 【请填写功能名称】
     * @return 结果
     */
    public int updateLoveMember(LoveMember loveMember);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLoveMemberByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteLoveMemberById(Long id);
}
