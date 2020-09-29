package com.ruoyi.framework.config;

import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.YamlUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Global
 * @Description: 全局配置类
 * @author: 许昌华耀电气科技有限公司
 * @date: 2019年8月28日 上午10:47:29
 * 
 * @Copyright: 2019 http://www.jiniantech.com/ Inc. All rights reserved.
 *             注意：本内容仅限于许昌华耀电气科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class Global {
	private static final Logger log = LoggerFactory.getLogger(Global.class);

	private static String NAME = "application.yml";

	/**
	 * 当前对象实例
	 */
	private static Global global;

	/**
	 * 保存全局属性值
	 */
	private static Map<String, String> map = new HashMap<String, String>();

	private Global() {
	}

	/**
	 * 静态工厂方法
	 */
	public static synchronized Global getInstance() {
		if (global == null) {
			global = new Global();
		}
		return global;
	}

	/**
	 * 获取配置
	 */
	public static String getConfig(String key) {
		String value = map.get(key);
		if (value == null) {
			Map<?, ?> yamlMap = null;
			try {
				yamlMap = YamlUtil.loadYaml(NAME);
				value = String.valueOf(YamlUtil.getProperty(yamlMap, key));
				map.put(key, value != null ? value : StringUtils.EMPTY);
			} catch (FileNotFoundException e) {
				log.error("获取全局配置异常 {}", key);
			}
		}
		return value;
	}

	/**
	 * 获取项目名称
	 */
	public static String getName() {
		return StringUtils.nvl(getConfig("zhdqw.name"), "zhdqw");
	}

	/**
	 * 获取项目版本
	 */
	public static String getVersion() {
		return StringUtils.nvl(getConfig("zhdqw.version"), "3.4.0");
	}

	/**
	 * 获取版权年份
	 */
	public static String getCopyrightYear() {
		return StringUtils.nvl(getConfig("zhdqw.copyrightYear"), "2019");
	}

	/**
	 * 实例演示开关
	 */
	public static String isDemoEnabled() {
		return StringUtils.nvl(getConfig("zhdqw.demoEnabled"), "true");
	}

	/**
	 * 获取ip地址开关
	 */
	public static Boolean isAddressEnabled() {
		return Boolean.valueOf(getConfig("zhdqw.addressEnabled"));
	}

	/**
	 * 获取文件上传路径
	 */
	public static String getProfile() {
		return getConfig("zhdqw.profile");
	}
	/**
	 * 获取富文本文件上传路径
	 */
	public static String getRichProfile() {
		return getConfig("zhdqw.richProfile");
	}
	
	/**
	 * 获取文件上传服务器
	 */
	public static String getProfileServerPath() {
		return getConfig("zhdqw.profileServerPath");
	}

	/**
	 * 获取头像上传路径
	 */
	public static String getAvatarPath() {
		return getProfile() + "/avatar";
	}

	/**
	 * 获取下载路径
	 */
	public static String getDownloadPath() {
		return getProfile() + "/download";
	}

	/**
	 * 获取上传路径
	 */
	public static String getUploadPath() {
		return getProfile() + "/upload";
	}
	/**
	 * 获取上传路径
	 */
	public static String getRichUploadPath() {
		return getRichProfile() + "/upload";
	}
	/**
	 * 获取短信接口URL
	 */
	public static String getSmsURL() {
		return getConfig("sms.url");
	}
	
	/**
	 * 获取短信接口APPID
	 */
	public static String getSmsAPPID() {
		return getConfig("sms.account");
	}
	
	/**
	 * 获取短信接口APIKEY
	 */
	public static String getSmsAPIKEY() {
		return getConfig("sms.password");
	}
	
	/**
	 * 获取短信接口返回格式
	 */
	public static String getSmsFormat() {
		return getConfig("sms.format");
	}
	
	/**
	 * 获取JWT加密密钥
	 */
	public static String getSecret() {
		return getConfig("jwt.secret");
	}
	
	/**
	 * 获取JWT过期时间
	 */
	public static int getExpire() {
		return Integer.parseInt(getConfig("jwt.expire"));
	}
	
	/**
	 * 获取JWT的header名称
	 */
	public static String getHeader() {
		return getConfig("jwt.header");
	}
	
	/**
	 * 获取善付通卖家第三方系统ID
	 */
	public static String getSFTThirdSysID() {
		return getConfig("sft.ThirdSysID");
	}
	/**
	 * 获取善付通卖家第三方系统ID
	 */
	public static String getSellerUserIDThirdSys() {
		return getConfig("sft.SellerUserIDThirdSys");
	}
	
	/**
	 * 获取善付通卖家DES密钥
	 */
	public static String getSFTDES() {
		return getConfig("sft.DES");
	}
	
	/**
	 * 获取善付通卖家MD5密钥
	 */
	public static String getSFTMD5() {
		return getConfig("sft.MD5");
	}
	
	/**
	 * 获取百度OCR的api_key
	 */
	public static String getOCRApiKey() {
		return getConfig("ocr.api_key");
	}
	
	/**
	 * 获取百度OCR的secret_key
	 */
	public static String getOCRSecretKey() {
		return getConfig("ocr.secret_key");
	}
	
	/**
	 * 获取微信appId
	 */
	public static String getWxAppAppId() {
		return getConfig("wechat.wxAppAppId");
	}
	
	/**
	 * 获取微信secret
	 */
	public static String getWxAppSecret() {
		return getConfig("wechat.wxAppSecret");
	}
}
