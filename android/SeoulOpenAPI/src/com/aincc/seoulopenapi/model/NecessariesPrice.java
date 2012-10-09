package com.aincc.seoulopenapi.model;

import com.aincc.seoulopenapi.openapi.price.OpenNecessariesPrice;

/**
 * 
 * <h3><b>NecessariesPrice</b></h3></br>
 * 
 * 생필품 가격 정보
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 * @see OpenNecessariesPrice
 */
public class NecessariesPrice extends BaseModel
{
	/**
	 * 일련번호
	 */
	public String P_SEQ;

	/**
	 * 시장/마트 번호
	 */
	public String M_SEQ;

	/**
	 * 시장/마트 이름
	 */
	public String M_NAME;

	/**
	 * 품목 번호
	 */
	public String A_SEQ;

	/**
	 * 품목 이름
	 */
	public String A_NAME;

	/**
	 * 실판매규격
	 */
	public String A_UNIT;

	/**
	 * 가격
	 */
	public String A_PRICE;

	/**
	 * 년도-월
	 */
	public String P_YEAR_MONTH;

	/**
	 * 비고
	 */
	public String ADD_COL;

	/**
	 * 시장유형 구분 코드
	 */
	public String M_TYPE_CODE;

	/**
	 * 시장유형 구분 이름
	 */
	public String M_TYPE_NAME;

	/**
	 * 자치구 코드
	 */
	public String M_GU_CODE;

	/**
	 * 자치구 이름
	 */
	public String M_GU_NAME;
}
