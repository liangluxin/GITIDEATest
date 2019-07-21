package com.xiaoxin.dev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
 * @author liangluxin 
 * @date 2019年4月2日 下午5:37:04 
 * @version 1.0 
 */
@RestController
public class DevController {

	@GetMapping("/test")
	public String test(){
		return "hello，springboot";
	}
}
