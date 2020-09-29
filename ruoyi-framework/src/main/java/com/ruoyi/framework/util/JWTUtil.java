package com.ruoyi.framework.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.ruoyi.framework.config.Global;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: JWTUtil
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author: gaoxiaochuang
 * @date: 2020年1月16日 下午5:48:22
 * @Copyright: 2020 http://www.zhonghuadianqi.com/ Inc. All rights reserved.
 * 注意：本内容仅限于许昌华耀电气科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class JWTUtil {

    private static final Logger log = LoggerFactory.getLogger(JWTUtil.class);

    // 过期时间 30分钟
    private static long EXPIRE_TIME = Global.getExpire();
    // 密钥
    private static String TOKEN_SECRET = Global.getSecret();

    /**
     * 生成 token, 5min后过期
     *
     * @param username 用户名
     * @return 加密的token
     */
    public static String createToken(String username) {
        try {
            // 设置过期时间
            Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME * 60 * 1000);
            // 私钥和加密算法
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            // 设置头部信息
            Map<String, Object> header = new HashMap<>(2);
            header.put("Type", "Jwt");
            header.put("alg", "HS256");
            // 返回token字符串，附带username信息
            return JWT.create().withHeader(header).withClaim("username", username)
                    // 到期时间
                    .withExpiresAt(date)
                    // 创建一个新的JWT，并使用给定的算法进行标记
                    .sign(algorithm);
        } catch (UnsupportedEncodingException e) {
            log.error("创建token发生异常", e);
            return null;
        }
    }

    /**
     * 校验 token 是否正确
     *
     * @param token    密钥
     * @param username 用户名
     * @return 是否正确
     */
    public static String verify(String token, String username) {
        try {
            // 根据密码生成JWT效验器
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            // 在token中附带了username信息
            JWTVerifier verifier = JWT.require(algorithm).withClaim("username", username).build();
            // 验证 token
            verifier.verify(token);
            return "success";
        } catch (TokenExpiredException tokenExpiredException) {
            log.error("token过期");
            return "tokenExpire";
        } catch (Exception exception) {
            log.error("token验证错误");
            return "error";
        }
    }

    /**
     * 获得token中的信息，无需secret解密也能获得
     *
     * @return token中包含的用户名
     */
    public static String getUserName(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("username").asString();
        } catch (JWTDecodeException e) {
            log.error("获得token中的信息失败", e);
            return null;
        }
    }

    public static void main(String[] args) {
        /**
         * 测试生成一个token
         */
        String token = createToken("18888888888");
        System.out.println("token: " + token);
    }
}
