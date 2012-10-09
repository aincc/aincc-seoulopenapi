package com.aincc.seoulopenapi.model;

import com.aincc.seoulopenapi.openapi.culture.OpenAssetsInfo;

/**
 * 
 * <h3><b>AssetsInfo</b></h3></br>
 * 
 * 문화재 정보
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 * @see OpenAssetsInfo
 */
public class AssetsInfo extends AssetsSimpleInfo
{
	/**
	 * 언어코드
	 */
	public String LANG;

	/**
	 * 관리번호
	 */
	public String MNG_CODE;

	/**
	 * 지정번호
	 */
	public String ASSIGNNUM;

	/**
	 * 지정연월일
	 */
	public String ASSIGNYMD;

	/**
	 * 시대
	 */
	public String PERIOD;

	/**
	 * 규모_양식
	 */
	public String SCALE;

	/**
	 * 재료
	 */
	public String MATERIAL;

	/**
	 * 종별
	 */
	public String CLASSIFY;

	/**
	 * 장정
	 */
	public String BINDING;

	/**
	 * 수량
	 */
	public String QUANTITY;

	/**
	 * 크기
	 */
	public String SIZING;

	/**
	 * 소유자
	 */
	public String OWNER;

	/**
	 * 소재지
	 */
	public String LOCATION;

	/**
	 * 설계자
	 */
	public String DESIGNER;

	/**
	 * 시공자
	 */
	public String BUILDER;

	/**
	 * 보유자
	 */
	public String HOLDER;

	/**
	 * 전승자
	 */
	public String SUCCESSOR;

	/**
	 * 천연기념물분류
	 */
	public String ETC_CLSS;

	/**
	 * 부속문화재
	 */
	public String ASSIGNETC;

	/**
	 * 설명
	 */
	public String CONTENTS;
}
