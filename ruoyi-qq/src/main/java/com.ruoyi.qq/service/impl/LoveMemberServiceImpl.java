package com.ruoyi.qq.service.impl;

import java.net.http.HttpClient;
import java.util.List;

import com.ruoyi.common.utils.http.HttpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.qq.mapper.LoveMemberMapper;
import com.ruoyi.qq.domain.LoveMember;
import com.ruoyi.qq.service.ILoveMemberService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2020-09-29
 */
@Service
public class LoveMemberServiceImpl implements ILoveMemberService {
    @Autowired
    private LoveMemberMapper loveMemberMapper;


    @Override
    public LoveMember selectLoveMemberByOpenid(String openid) {
        return loveMemberMapper.selectLoveMemberByOpenid(openid);
    }

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public LoveMember selectLoveMemberById(Long id) {
        return loveMemberMapper.selectLoveMemberById(id);
    }

    @Override
    public String code2Session(String code) {
        String content = HttpUtils.sendGet("https://api.q.qq.com/sns/jscode2session?appid=1111066554&secret=SECRET&js_code=JSCODE&grant_type=authorization_code", "");
        return content;
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param loveMember 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<LoveMember> selectLoveMemberList(LoveMember loveMember) {
        return loveMemberMapper.selectLoveMemberList(loveMember);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param loveMember 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertLoveMember(LoveMember loveMember) {
        return loveMemberMapper.insertLoveMember(loveMember);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param loveMember 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateLoveMember(LoveMember loveMember) {
        return loveMemberMapper.updateLoveMember(loveMember);
    }

    /**
     * 删除【请填写功能名称】对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLoveMemberByIds(String ids) {
        return loveMemberMapper.deleteLoveMemberByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteLoveMemberById(Long id) {
        return loveMemberMapper.deleteLoveMemberById(id);
    }

}
