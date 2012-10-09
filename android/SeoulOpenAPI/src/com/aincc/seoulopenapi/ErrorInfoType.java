package com.aincc.seoulopenapi;

import android.content.Context;

/**
 * 
 * <h3><b>ErrorType</b></h3></br>
 * 
 * OPENAPI 오류 및 정보메시지 관리
 * <p>
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public enum ErrorInfoType
{
	/**
	 * 정상
	 */
	SUCCESS("SUCCESS", R.string.success_title, R.string.success_msg),

	/**
	 * ERROR-100 : 필수 값이 누락되어 있습니다. 필수 값을 확인하십시오!
	 * 필수 값이 누락되어 있으면 오류를 발생합니다. 요청 변수를 참고 하십시오!
	 */
	ERROR_100("ERROR-100", R.string.error_100_title, R.string.error_100_msg),

	/**
	 * ERROR-200 : 파일타입 값이 누락 혹은 유효하지 않습니다. 파일타입 값을 확인하십시오!
	 * 파일타입 값이 누락 혹은 유효하지 않으면 오류를 발생합니다. 요청 변수를 참고 하십시오!
	 */
	ERROR_200("ERROR-200", R.string.error_200_title, R.string.error_200_msg),

	/**
	 * ERROR-300 : 조회건수 값이 누락되어 있습니다. 조회건수 값을 확인하십시오!
	 * 조회건수 값이 누락되어 있으면 오류를 발생합니다.
	 */
	ERROR_300("ERROR-300", R.string.error_300_title, R.string.error_300_msg),

	/**
	 * ERROR-301 : 조회건수 값의 타입이 유효하지 않습니다. 조회건수 값을 확인하십시오!
	 * 조회건수 값의 타입이 유효하지 않으면 오류를 발생합니다. 정수를 입력하세요.
	 */
	ERROR_301("ERROR-301", R.string.error_301_title, R.string.error_301_msg),

	/**
	 * ERROR-500 : 서버 에러
	 * OpenAPI 호출시 서버에서 오류가 발생하였습니다.
	 */
	ERROR_500("ERROR-500", R.string.error_500_title, R.string.error_500_msg),

	/**
	 * ERROR-600 : DB Connection 오류입니다.
	 * OpenAPI 호출시 서버에서 DB접속 오류가 발생했습니다.
	 */
	ERROR_600("ERROR-600", R.string.error_600_title, R.string.error_600_msg),

	/**
	 * ERROR-601 : SQL 오류입니다.
	 * OpenAPI 호출시 서버에서 SQL 오류가 발생했습니다.
	 */
	ERROR_601("ERROR-601", R.string.error_601_title, R.string.error_601_msg),

	/**
	 * INFO-100 : 인증키가 유효하지 않습니다. 인증키를 확인하십시오!
	 * 인증키가 없는 경우, 서울시청 OPENAPI(http://data.seoul.go.kr)에서 인증키를 신청하십시오!
	 */
	INFO_100("INFO-100", R.string.info_100_title, R.string.info_100_msg),

	/**
	 * 
	 */
	UNKNOWN("UNKNOWN", R.string.unknown_title, R.string.unknown_msg);

	private String code;
	private int title;
	private int msg;

	/**
	 * 
	 * @since 1.0.0
	 * @param code
	 * @param title
	 * @param msg
	 */
	ErrorInfoType(String code, int title, int msg)
	{
		this.code = code;
		this.title = title;
		this.msg = msg;
	}

	/**
	 * 
	 * @since 1.0.0
	 * @return the code
	 */
	public String getCode()
	{
		return code;
	}

	/**
	 * 
	 * @since 1.0.0
	 * @return the title
	 */
	public int getTitle()
	{
		return title;
	}

	/**
	 * 
	 * @since 1.0.0
	 * @return the message
	 */
	public int getMsg()
	{
		return msg;
	}

	/**
	 * 
	 * @since 1.0.0
	 * @param context
	 * @return the title
	 */
	public String getTitle(Context context)
	{
		return context.getResources().getString(title);
	}

	/**
	 * 
	 * @since 1.0.0
	 * @param context
	 * @return the message
	 */
	public String getMsg(Context context)
	{
		return context.getResources().getString(msg);
	}

}
