package com.aincc.seoulopenapi.model;

import com.aincc.seoulopenapi.openapi.traditional.OpenTraditionalMartInfo;

/**
 * 
 * <h3><b>TraditionalMartInfo</b></h3></br>
 * 
 * 전통시장 정보
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 * @see OpenTraditionalMartInfo
 */
public class TraditionalMartInfo extends BaseModel
{
	/**
	 * 자치구명
	 */
	public String GUNAME;

	/**
	 * 전통시장명
	 */
	public String M_NAME;

	/**
	 * 주소명
	 */
	public String M_ADDR;

	/**
	 * 상인회 연락처명
	 */
	public String M_TEL;

	/**
	 * 버스 노선명
	 */
	public String M_BUS;

	/**
	 * 시장 인근 지하철 역명
	 */
	public String M_SUBWAY;

	/**
	 * 주차장 유무
	 */
	public String M_PARKING;

	/**
	 * 시장 홈페이지 주소
	 */
	public String M_HOMEP;
}
