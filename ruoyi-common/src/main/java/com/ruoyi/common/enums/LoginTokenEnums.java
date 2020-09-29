package com.ruoyi.common.enums;

/**
 * @ClassName: LoginTokenEnums
 * @Description: 登录错误代码（110-115）
 * @author: 许昌华耀电气科技有限公司
 * @date: 2020年1月15日 下午12:01:25
 * 
 * @Copyright: 2020 http://www.jiniantech.com/ Inc. All rights reserved.
 *             注意：本内容仅限于许昌华耀电气科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public enum LoginTokenEnums {
	
	NO_TOKEN(110, "token为空，请重新登录"),
	
	NO_USER(111, "当前用户不存在"),
	
	TOKEN_ERROR(112, "token认证失败"),
	
	REFRESH_TOKEN(114, "刷新token失败"),

	TOKEN_EXPIRE(113, "token过期");

	private int code;
	private String msg;

	LoginTokenEnums(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}


}
