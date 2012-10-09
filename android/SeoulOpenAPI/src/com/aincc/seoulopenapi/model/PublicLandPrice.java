package com.aincc.seoulopenapi.model;

import com.aincc.seoulopenapi.openapi.realty.OpenPublicLandPrice;

/**
 * 
 * <h3><b>PublicLandPrice</b></h3></br>
 * 
 * 개별 공시 지가
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 * @see OpenPublicLandPrice
 */
public class PublicLandPrice extends BaseModel
{
	/**
	 * 시군구명
	 */
	public String SIGUNGU_NM;

	/**
	 * 시군구코드
	 */
	public String SIGUNGU_CD;

	/**
	 * 법정동명
	 */
	public String BJDONG_NM;

	/**
	 * 법정동코드
	 */
	public String BJDONG_CD;

	/**
	 * 본번
	 */
	public String BONBEON;

	/**
	 * 부번
	 */
	public String BUBEON;

	/**
	 * 필지구분명
	 */
	public String PILGI_NM;

	/**
	 * 필지구분코드
	 */
	public String PILGI_CD;

	/**
	 * 기준년월
	 */
	public String BASE_MON;

	/**
	 * 공시지가(원/㎡)
	 */
	public String JIGA;
}
