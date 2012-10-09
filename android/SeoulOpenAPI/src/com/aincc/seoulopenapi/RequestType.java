package com.aincc.seoulopenapi;

/**
 * 
 * <h3><b>RequestType</b></h3></br>
 * 
 * OPENAPI 요청유형 관리
 * <p>
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public enum RequestType
{
	/**
	 * XML
	 */
	XML("xml"),

	/**
	 * XML file
	 */
	XMLF("xmlf"),

	/**
	 * excel file
	 */
	EXCEL("xls"),

	/**
	 * json file
	 */
	JSON("json");

	private String requestType;

	/**
	 * 
	 * @since 1.0.0
	 * @param requestType
	 */
	RequestType(String requestType)
	{
		this.requestType = requestType;
	}

	/**
	 * 
	 * @since 1.0.0
	 * @return the request type name
	 */
	public String getRequestType()
	{
		return this.requestType;
	}
}
