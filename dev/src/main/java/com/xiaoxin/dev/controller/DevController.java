package com.xiaoxin.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiaoxin.dev.service.DevService;

/** 
 * @author liangluxin 
 * @date 2019年4月2日 下午5:37:04 
 * @version 1.0 
 */
@RestController
public class DevController {

	@Autowired
	private DevService devService;
	
	@GetMapping("/test")
	public String test(){
		return devService.saveTest();
		//return "hello，springboot";
	}
	@GetMapping("/test1")
	public String test1(){
		String t = devService.test1();
		System.out.println("t:"+t);
		 return "hello,github!";
	}
}
