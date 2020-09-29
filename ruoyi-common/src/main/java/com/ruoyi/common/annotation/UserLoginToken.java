package com.ruoyi.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName: UserLoginToken
 * @Description: token验证
 * @author: 许昌华耀电气科技有限公司
 * @date: 2020年1月14日 下午6:30:33
 * 
 * @Copyright: 2020 http://www.jiniantech.com/ Inc. All rights reserved.
 *             注意：本内容仅限于许昌华耀电气科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface UserLoginToken {
	boolean required() default true;
}
