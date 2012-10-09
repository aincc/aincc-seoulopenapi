package com.aincc.seoulopenapi.model;

import com.aincc.seoulopenapi.openapi.price.OpenMartInfo;

/**
 * 
 * <h3><b>MartInfo</b></h3></br>
 * 
 * 마트 정보
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 * @see OpenMartInfo
 */
public class MartInfo extends BaseModel
{
	/**
	 * 일련번호
	 */
	public String M_SEQ;

	/**
	 * 마트이름
	 */
	public String M_MART_NAME;

	/**
	 * 구분
	 */
	public String M_TYPE;

	/**
	 * 마트연락처
	 */
	public String M_MART_PHONE;

	/**
	 * 마트주소
	 */
	public String M_MART_ADDR;

	/**
	 * 마트홈페이지
	 */
	public String M_MART_URL;

	/**
	 * 주차장 유무
	 */
	public String M_PARK_YN;
}