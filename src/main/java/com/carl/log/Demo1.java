package com.carl.log;

import org.apache.log4j.Logger;

/**
 * @desc: 
 * @auth: zona
 * @createTime: 2017年6月1日 下午3:37:22
 */
public class Demo1 {

	public static final Logger LOGGER = Logger.getLogger(Demo1.class);
	public static void info() {
		int a = 1-1;
		LOGGER.info("i'm info level log");
	}
	
	public static void debug() {
		int b = 1-1;
		LOGGER.debug("i'm debug level log");
	}
	
	public static void warn() {
		int c = 1-1;
		LOGGER.warn("i'm warn level log");
	}
	
}
