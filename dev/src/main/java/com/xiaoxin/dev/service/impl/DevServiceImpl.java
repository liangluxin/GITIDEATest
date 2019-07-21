package com.xiaoxin.dev.service.impl;

import com.xiaoxin.dev.service.DevService;

/** 
 * @author liangluxin 
 * @date 2019年7月21日 下午4:09:12 
 * @version 1.0 
 */
public class DevServiceImpl implements DevService {
	@Override
	public String saveTest() {
		System.out.println("测试方法执行。。。。");
		return "true";
	}

	@Override
	public String test1() {
		return "hello，github！";
	}

}
