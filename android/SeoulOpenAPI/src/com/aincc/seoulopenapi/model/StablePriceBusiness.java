package com.aincc.seoulopenapi.model;

import com.aincc.seoulopenapi.openapi.price.OpenStablePriceBusiness;

/**
 * 
 * <h3><b>StablePriceBusiness</b></h3></br>
 * 
 * 가격안정모범업소 정보
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 * @see OpenStablePriceBusiness
 */
public class StablePriceBusiness extends BaseModel
{
	/**
	 * 업소아이디
	 */
	public String SH_ID;

	/**
	 * 업소명
	 */
	public String SH_NAME;

	/**
	 * 분류코드
	 */
	public String INDUTY_CODE_SE;

	/**
	 * 분류코드명
	 */
	public String INDUTY_CODE_SE_NAME;

	/**
	 * 업소 주소
	 */
	public String SH_ADDR;

	/**
	 * 업소 전화번호
	 */
	public String SH_PHONE;

	/**
	 * 찾아오시는 길
	 */
	public String SH_WAY;

	/**
	 * 업소정보
	 */
	public String SH_INFO;

	/**
	 * 자랑거리
	 */
	public String SH_PRIDE;

	/**
	 * 추천수
	 */
	public String SH_RCMN;
}
