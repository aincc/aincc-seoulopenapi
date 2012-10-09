package com.aincc.seoulopenapi;

import java.util.HashMap;


/**
 * 
 * <h3><b>OpenAPICons</b></h3></br>
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public interface OpenAPICons
{
	public static final String UNKNOWN_URI = "UNKNOWN_URI";
	public static final String SERVICE_URI = "http://openapi.seoul.go.kr:8088";
	public static final String SERVICE_URI2 = "http://openapi.seoul.go.kr:8089";
	public static final String AUTHEN_KEY = "4150495f3231353261696e6363";

	public static HashMap<String, ErrorInfoType> ERROR_TABLE = new HashMap<String, ErrorInfoType>();
}
