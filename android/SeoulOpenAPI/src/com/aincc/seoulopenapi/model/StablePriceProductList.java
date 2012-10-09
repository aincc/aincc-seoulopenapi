package com.aincc.seoulopenapi.model;

import com.aincc.seoulopenapi.openapi.price.OpenStablePriceProductList;

/**
 * 
 * <h3><b>StablePriceProductList</b></h3></br>
 * 
 * 가격안정모범업소 상품 정보
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 * @see OpenStablePriceProductList
 */
public class StablePriceProductList extends BaseModel
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
	 * 추천수
	 */
	public String SH_RCMN;

	/**
	 * 상품명
	 */
	public String IM_NAME;

	/**
	 * 상품가격(일반)
	 */
	public String IM_PRICE;
}
