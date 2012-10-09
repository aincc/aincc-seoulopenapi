package com.aincc.seoulopenapi.model;

import com.aincc.seoulopenapi.openapi.price.OpenPrivateServiceFee;

/**
 * 
 * <h3><b>PrivateServiceFee</b></h3></br>
 * 
 * 개인서비스 요금 정보
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 * @see OpenPrivateServiceFee
 */
public class PrivateServiceFee extends BaseModel
{
	/**
	 * 업소명
	 */
	public String BSSH_NM;

	/**
	 * 업소일련번호
	 */
	public String BSSH_SEQ_NO;

	/**
	 * 업종코드
	 */
	public String INDUTY_CODE_SE;

	/**
	 * 업종
	 */
	public String INDUTY_DESC;

	/**
	 * 전화번호
	 */
	public String TLPHON_NO_CN;

	/**
	 * 면적(㎡)
	 */
	public String AR;

	/**
	 * 동코드
	 */
	public String DONG_CODE_SE;

	/**
	 * 동명
	 */
	public String LEGALDONG_NM;

	/**
	 * 주소
	 */
	public String ADRES_CN2;

	/**
	 * 품목코드
	 */
	public String PRDLST_CODE_SE;

	/**
	 * 품목
	 */
	public String PRDLST_DESC;

	/**
	 * 가격
	 */
	public String PC;

	/**
	 * 점검일자
	 */
	public String CHCK_MD;

	/**
	 * 착한가게여부
	 */
	public String PRGN_BSSH_YN;
}
