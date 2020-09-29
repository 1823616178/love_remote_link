package com.ruoyi.common.enums;

/**
 * @ClassName: LoginTokenEnums
 * @Description: 公共错误代码（100-110）
 * @author: 许昌华耀电气科技有限公司
 * @date: 2020年1月15日 下午12:01:25
 * 
 * @Copyright: 2020 http://www.jiniantech.com/ Inc. All rights reserved.
 *             注意：本内容仅限于许昌华耀电气科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public enum CommonEnums {
	
	PARAM_EMPTY(100, "参数为空或含空值"),
	NO_BIND_COMPANT_NAME(102, "请先维护企业档案信息"),
	PARAM_FORMAT_ERROR(101, "参数格式错误");

	private int code;
	private String msg;

	CommonEnums(int code, String msg) {
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
