package com.aincc.seoulopenapi;

/**
 * 
 * <h3><b>LangCode</b></h3></br>
 * 
 * 언어코드 정보
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public enum LangCode
{
	/**
	 * K : 한글
	 */
	KOREAN("K", "한글"),

	/**
	 * J : 일본어
	 */
	JAPANESE("J", "일본어"),

	/**
	 * E : 영어
	 */
	ENGLISH("E", "영어"),

	/**
	 * G : 중국간체
	 */
	CHINAG("G", "중국간체"),

	/**
	 * B : 중국번체
	 */
	CHINAB("B", "중국번체"),

	/**
	 * 
	 */
	UNKNOWN("UNKNOWN", "알수없음");

	private String code;
	private String desc;

	LangCode(String code, String desc)
	{
		this.code = code;
		this.desc = desc;
	}

	public String getCode()
	{
		return code;
	}

	public String getDesc()
	{
		return desc;
	}
}
