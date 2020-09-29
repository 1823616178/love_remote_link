package com.ruoyi.framework.interceptor;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.annotation.CrmUserLoginToken;
import com.ruoyi.common.annotation.PassToken;
import com.ruoyi.common.annotation.UserLoginToken;
import com.ruoyi.common.enums.LoginTokenEnums;
import com.ruoyi.framework.config.Global;
import com.ruoyi.framework.util.JWTUtil;
import com.ruoyi.qq.domain.LoveMember;
import com.ruoyi.qq.service.ILoveMemberService;
import com.ruoyi.system.domain.SysUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @ClassName: AuthenticationInterceptor
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author: gaoxiaochuang
 * @date: 2020年1月16日 下午5:47:43
 * @Copyright: 2020 http://www.zhonghuadianqi.com/ Inc. All rights reserved.
 * 注意：本内容仅限于许昌华耀电气科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
@Component
public class AuthenticationInterceptor extends HandlerInterceptorAdapter {

    private static final Logger log = LoggerFactory.getLogger(AuthenticationInterceptor.class);

    private static String tokenHeader = Global.getHeader();// token名称

    @Autowired
    private ILoveMemberService iLoveMemberService;
//
//    @Autowired
//    private ISysUserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
        String token = request.getHeader(tokenHeader);// 从 http 请求头中取出token
        // 如果不是映射到方法直接通过
        if (!(object instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) object;
        Method method = handlerMethod.getMethod();
        // 检查是否有passtoken注释，有则跳过认证
        if (method.isAnnotationPresent(PassToken.class)) {
            PassToken passToken = method.getAnnotation(PassToken.class);
            if (passToken.required()) {
                return true;
            }
        }
        // 检查有没有需要用户权限的注解
        if (method.isAnnotationPresent(UserLoginToken.class)) {
            UserLoginToken userLoginToken = method.getAnnotation(UserLoginToken.class);
            if (userLoginToken.required()) {
                try {
                    // 执行认证
                    if (token == null || "".equals(token)) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("code", LoginTokenEnums.NO_TOKEN.getCode());
                        jsonObject.put("msg", LoginTokenEnums.NO_TOKEN.getMsg());
                        responseMessage(request, response, jsonObject);
                        return false;
                    }
                    // 获取 token 中的 username
                    LoveMember member = null;
                    String username = JWTUtil.getUserName(token);
                    if (username == null) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("code", LoginTokenEnums.TOKEN_ERROR.getCode());
                        jsonObject.put("msg", LoginTokenEnums.TOKEN_ERROR.getMsg());
                        responseMessage(request, response, jsonObject);
                        return false;
                    } else {
                        member = iLoveMemberService.selectLoveMemberByUsername(username);
                    }
                    if (member == null) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("code", LoginTokenEnums.NO_USER.getCode());
                        jsonObject.put("msg", LoginTokenEnums.NO_USER.getMsg());
                        responseMessage(request, response, jsonObject);
                        return false;
                    }
                    String checkToken = JWTUtil.verify(token, username);
                    if ("success".equals(checkToken)) {
                        return true;
                    } else if ("tokenExpire".equals(checkToken)) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("code", LoginTokenEnums.TOKEN_EXPIRE.getCode());
                        jsonObject.put("msg", LoginTokenEnums.TOKEN_EXPIRE.getMsg());
                        responseMessage(request, response, jsonObject);
                        return false;
                    } else if ("error".equals(checkToken)) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("code", LoginTokenEnums.TOKEN_ERROR.getCode());
                        jsonObject.put("msg", LoginTokenEnums.TOKEN_ERROR.getMsg());
                        responseMessage(request, response, jsonObject);
                        return false;
                    } else {
                        return false;
                    }
                } catch (Exception e) {
                    log.error("验证token发生错误", e);
                    return false;
                }
            }
        }
        // 检查有没有需要用户权限的注解
        if (method.isAnnotationPresent(CrmUserLoginToken.class)) {
            CrmUserLoginToken userLoginToken = method.getAnnotation(CrmUserLoginToken.class);
            if (userLoginToken.required()) {
                try {
                    // 执行认证
                    if (token == null || "".equals(token)) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("code", LoginTokenEnums.NO_TOKEN.getCode());
                        jsonObject.put("msg", LoginTokenEnums.NO_TOKEN.getMsg());
                        responseMessage(request, response, jsonObject);
                        return false;
                    }
                    // 获取 token 中的 username
                    SysUser user = null;
                    String username = JWTUtil.getUserName(token);
                    if (username == null) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("code", LoginTokenEnums.TOKEN_ERROR.getCode());
                        jsonObject.put("msg", LoginTokenEnums.TOKEN_ERROR.getMsg());
                        responseMessage(request, response, jsonObject);
                        return false;
                    } else {
//                        user = userService.selectUserByLoginName(username);
                    }
                    if (user == null) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("code", LoginTokenEnums.NO_USER.getCode());
                        jsonObject.put("msg", LoginTokenEnums.NO_USER.getMsg());
                        responseMessage(request, response, jsonObject);
                        return false;
                    }
                    String checkToken = JWTUtil.verify(token, username);
                    if ("success".equals(checkToken)) {
                        return true;
                    } else if ("tokenExpire".equals(checkToken)) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("code", LoginTokenEnums.TOKEN_EXPIRE.getCode());
                        jsonObject.put("msg", LoginTokenEnums.TOKEN_EXPIRE.getMsg());
                        responseMessage(request, response, jsonObject);
                        return false;
                    } else if ("error".equals(checkToken)) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("code", LoginTokenEnums.TOKEN_ERROR.getCode());
                        jsonObject.put("msg", LoginTokenEnums.TOKEN_ERROR.getMsg());
                        responseMessage(request, response, jsonObject);
                        return false;
                    } else {
                        return false;
                    }
                } catch (Exception e) {
                    log.error("验证token发生错误", e);
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
                           ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                Object o, Exception e) throws Exception {
    }

    /**
     * <p>Title: responseMessage</p>
     * <p>Description: 请求不通过，返回错误信息给客户端</p>
     *
     * @param request
     * @param response
     * @param jsonObject
     * @throws IOException
     * @author: gaoxiaochuang
     * @date: 2020年1月16日 下午6:06:42
     */
    private void responseMessage(HttpServletRequest request, HttpServletResponse response, JSONObject jsonObject)
            throws IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json; charset=utf-8");
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS,PUT,DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", request.getHeader("Access-Control-Request-Headers"));
        PrintWriter out = null;
        out = response.getWriter();
        out.print(jsonObject);
        // 释放资源
        out.flush();
        out.close();
        out = null;
    }
}