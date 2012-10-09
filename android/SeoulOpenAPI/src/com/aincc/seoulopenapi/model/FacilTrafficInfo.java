package com.aincc.seoulopenapi.model;


/**
 * 
 * <h3><b>FacilTrafficInfo</b></h3></br>
 * 
 * 문화시설 교통정보
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public class FacilTrafficInfo extends BaseModel
{
	/**
	 * 교통구분
	 * (A : 지하철 정보, 공항버스, T : 버스정류장, Y, G, B, R : 버스 종류)
	 */
	public String TRAFTYPE;

	/**
	 * 교통정보
	 */
	public String TRAFINFO;
}
