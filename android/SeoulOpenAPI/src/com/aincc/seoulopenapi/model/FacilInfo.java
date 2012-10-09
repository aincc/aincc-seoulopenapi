package com.aincc.seoulopenapi.model;

import com.aincc.seoulopenapi.openapi.culture.OpenFacilDetailInfo;

/**
 * 
 * <h3><b>FacilInfo</b></h3></br>
 * 
 * 문화시설 정보
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 * @see OpenFacilDetailInfo
 */
public class FacilInfo extends FacilSimpleInfo
{
	/**
	 * 관리번호
	 */
	public String MNG_CODE;

	/**
	 * 시도
	 */
	public String SIDO;

	/**
	 * 군구
	 */
	public String GNGU;

	/**
	 * 읍면동
	 */
	public String DONG;

	/**
	 * 산지여부
	 */
	public String SAN_YN;

	/**
	 * 본번
	 */
	public String BON_BUN;

	/**
	 * 부번
	 */
	public String BU_BUN;

	/**
	 * 대표이미지
	 */
	public String MAIN_IMG;

	/**
	 * 전화번호
	 */
	public String PHNE;

	/**
	 * 팩스번호
	 */
	public String FAX;

	/**
	 * 홈페이지
	 */
	public String HOMEPAGE;

	/**
	 * 관람시간
	 */
	public String OPENHOUR;

	/**
	 * 관람료
	 */
	public String ENTR_FEE;

	/**
	 * 휴관일
	 */
	public String CLOSEDAY;

	/**
	 * 개관일자
	 */
	public String OPEN_DAY;

	/**
	 * 객석수
	 */
	public String SEAT_CNT;

	/**
	 * X좌표
	 */
	public String X_COORD;

	/**
	 * Y좌표
	 */
	public String Y_COORD;

	/**
	 * 기타사항
	 */
	public String ETC_DESC;

	/**
	 * 시설소개
	 */
	public String FAC_DESC;

	/**
	 * 무료구분
	 */
	public String ENTRFREE;
}
