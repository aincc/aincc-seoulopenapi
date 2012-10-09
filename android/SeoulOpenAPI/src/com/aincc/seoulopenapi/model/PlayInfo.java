package com.aincc.seoulopenapi.model;

import com.aincc.seoulopenapi.openapi.culture.OpenPlayDetailInfo;

/**
 * 
 * <h3><b>PlayInfo</b></h3></br>
 * 
 * 공연행사 정보 상세
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 * @see OpenPlayDetailInfo
 */
public class PlayInfo extends PlaySimpleInfo
{
	/**
	 * 문화시설코드
	 */
	public String FAC_CODE;

	/**
	 * 정보제공기관코드
	 */
	public String ORG_CODE;

	/**
	 * 시간
	 */
	public String TIME;

	/**
	 * 원문링크주소
	 */
	public String ORG_LINK;

	/**
	 * 대표이미지
	 */
	public String MAIN_IMG;

	/**
	 * 홈페이지
	 */
	public String HOMEPAGE;

	/**
	 * 이용대상
	 */
	public String USE_TRGT;

	/**
	 * 이용요금
	 */
	public String USE_FEE;

	/**
	 * 주최
	 */
	public String SPONSOR;

	/**
	 * 문의
	 */
	public String INQUIRY;

	/**
	 * 주관및후원
	 */
	public String SUPPORT;

	/**
	 * 기타내용
	 */
	public String ETC_DESC;

	/**
	 * 정보제공일자
	 */
	public String RGSTDATE;

	/**
	 * 정보수정일자
	 */
	public String MDFYDATE;

	/**
	 * 작업자ID
	 */
	public String WORKERID;

	/**
	 * 서비스시작일
	 */
	public String SRVCDATE;

	/**
	 * 연령
	 */
	public String AGELIMIT;

	/**
	 * 무료구분
	 */
	public String IS_FREE;

	/**
	 * 서울시 연계여부
	 */
	public String S_CONN_YN;

	/**
	 * 본문HTML사용여부
	 */
	public String HTML_USE;

	/**
	 * 할인_티켓_예매정보
	 */
	public String TICKET;

	/**
	 * 출연자정보
	 */
	public String PLAYER;

	/**
	 * 프로그램소개
	 */
	public String PROGRAM;

	/**
	 * 본문
	 */
	public String CONTENTS;
}
