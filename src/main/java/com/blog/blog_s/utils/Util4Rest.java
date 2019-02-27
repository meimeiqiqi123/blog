package com.blog.blog_s.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * util 4 restaurant plugin.
 * 
 * @author wenjie
 */
public class Util4Rest {
	
	private static final String RET = "ret";
	private static final String MSG = "msg";
	private static final String DATA = "data";
	private static final String ORDER = "order";
	private static final String OTHER = "other";
	private static final String PAGE = "page";
	
	//private static final Logger logger = LoggerFactory.getLogger(Util4Rest.class);
	
	public static final Map<String, Object> retJson(Integer ret, String msg,
			Object data) {
		Map<String, Object> result = new HashMap<>();
		result.put(RET, ret);
		result.put(MSG, msg);
		result.put(DATA, data);
		return result;
	}
	public static final Map<String, Object> retJson(Integer ret, String msg,
			Object data, Object order) {
		Map<String, Object> result = new HashMap<>();
		result.put(RET, ret);
		result.put(MSG, msg);
		result.put(DATA, data);
		result.put(ORDER, order);
		return result;
	}
	public static final Map<String, Object> retJson(Integer ret, String msg,
			Object data, Object order,Object other) {
		Map<String, Object> result = new HashMap<>();
		result.put(RET, ret);
		result.put(MSG, msg);
		result.put(DATA, data);
		result.put(ORDER, order);
		result.put(OTHER, other);
		return result;
	}
	public static final Map<String, Object> retPageJson(Integer ret, String msg,
			Object data, Object page) {
		Map<String, Object> result = new HashMap<>();
		result.put(RET, ret);
		result.put(MSG, msg);
		result.put(DATA, data);
		result.put(PAGE, page);
		return result;
	}
	public static final Map<String, Object> successJson(String msg, Object data) {
		return retJson(1, msg, data);
	}
	
	public static final Map<String, Object> successJson(Object data) {
		return retJson(1, "操作成功", data);
	}
	
	public static final Map<String, Object> successJson() {
		return retJson(1, null, null);
	}
	
	
	
}