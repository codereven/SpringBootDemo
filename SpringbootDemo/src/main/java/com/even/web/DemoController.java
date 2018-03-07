package com.even.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @功能描述： demo
 * @创建人： Even
 * @创建时间： 2018年3月7日 下午8:05:40
 */
@RestController
public class DemoController {

	@RequestMapping("/hello")
	public String hello(){
		return "nihao!";
	}
	
}
