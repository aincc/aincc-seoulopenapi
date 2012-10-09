package com.aincc.seoulopenapi;

/**
 * 
 * <h3><b>TrafficCode</b></h3></br>
 * 
 * 교통 정보
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public enum TrafficCode
{
	/**
	 * A : 지하철정보, 공항버스
	 */
	A("A", "지하철/공항버스"),

	/**
	 * S : 지하철정보인데 A 로 넘어오지 않아서 추가함.
	 */
	S("S", "지하철/공항버스"),

	/**
	 * Y : 순환버스
	 */
	Y("Y", "순환버스"),

	/**
	 * G : 지선버스
	 */
	G("G", "지선버스"),

	/**
	 * B : 간선버스
	 */
	B("B", "간선버스"),

	/**
	 * R : 광역버스
	 */
	R("R", "광역버스"),

	/**
	 * T : 정류장
	 */
	T("T", "정류장");

	private String code;
	private String desc;

	TrafficCode(String code, String desc)
	{
		this.code = code;
		this.desc = desc;
	}

	public String getCode()
	{
		return code;
	}

	public String getDesc()
	{
		return desc;
	}
}
