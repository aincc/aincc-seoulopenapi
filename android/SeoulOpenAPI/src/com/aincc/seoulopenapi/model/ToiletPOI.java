package com.aincc.seoulopenapi.model;

import com.aincc.seoulopenapi.openapi.toilet.OpenToiletPOI;

/**
 * 
 * <h3><b>ToiletPOI</b></h3></br>
 * 
 * 공공화장실 위치 정보
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 * @see OpenToiletPOI
 */
public class ToiletPOI extends BaseModel
{
	/**
	 * POI ID
	 */
	public String POI_ID;

	/**
	 * 대명칭
	 */
	public String FNAME;

	/**
	 * 중명칭
	 */
	public String ANAME;

	/**
	 * 소명칭
	 */
	public String CNAME;

	/**
	 * 중앙좌표X1
	 */
	public String CENTER_X1;

	/**
	 * 중앙좌표Y1
	 */
	public String CENTER_Y1;

	/**
	 * WSG84X좌표
	 */
	public String X_WGS84;

	/**
	 * WSG84Y좌표
	 */
	public String Y_WGS84;

	/**
	 * 등록일자
	 */
	public String INSERTDATE;

	/**
	 * 수정일자
	 */
	public String UPDATEDATE;
}
