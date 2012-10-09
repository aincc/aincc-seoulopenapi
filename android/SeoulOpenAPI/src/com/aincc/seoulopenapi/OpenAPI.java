package com.aincc.seoulopenapi;

/**
 * 
 * <h3><b>OpenAPI</b></h3></br>
 * 
 * OpenAPI 서비스명 관리
 * <p>
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public enum OpenAPI implements OpenAPICons
{
	/**
	 * 시장마트정보<br>
	 * SERVICE_URI/{requestType}/{authenKey}/시장마트정보/{start}/{end}/
	 */
	PRICE_MART_INFO(SERVICE_URI, "시장마트정보"),

	/**
	 * 가격안정모범업소 <br>
	 * SERVICE_URI/{requestType}/{authenKey}/가격안정모범업소/{start}/{end}/
	 */
	PRICE_STABLE_PRICE_BUSINESS(SERVICE_URI, "가격안정모범업소"),

	/**
	 * 가격안정모범업소 상품목록<br>
	 * SERVICE_URI/{requestType}/{authenKey}/가격안정모범업소 상품목록/{start}/{end}/
	 */
	PRICE_STABLE_PRICE_PRODUCT_LIST(SERVICE_URI, "가격안정모범업소 상품목록"),

	/**
	 * 생필품가격<br>
	 * SERVICE_URI/{requestType}/{authenKey}/생필품가격/{start}/{end}/
	 */
	PRICE_NECESSARIES_PRICE(SERVICE_URI, "생필품가격"),

	/**
	 * 개인서비스요금정보<br>
	 * SERVICE_URI/{requestType}/{authenKey}/개인서비스요금정보/{start}/{end}/
	 */
	PRICE_PRIVATE_SERVICE_FEE(SERVICE_URI, "개인서비스요금정보"),

	/**
	 * 서울시 화장실 공공정보 POI 정보조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/서울시 화장실 공공정보 POI 정보조회/{start}/{end}/
	 */
	TOILET_SEOUL_POI(SERVICE_URI, "서울시 화장실 공공정보 POI 정보조회"),

	/**
	 * 전통시장 정보<br>
	 * SERVICE_URI/{requestType}/{authenKey}/전통시장 정보/{start}/{end}/
	 */
	TRADITIONAL_MART_INFO(SERVICE_URI, "전통시장 정보"),

	/**
	 * 개별공시지가<br>
	 * SERVICE_URI/{requestType}/{authenKey}/개별공시지가/{start}/{end}/{sigungu_nm}/{bjdong_nm}/{bonbeon}/{bubeon}
	 * sigungu_nm: 시군구명
	 * bjdong_nm: 법정동명
	 * bonbeon: 본번 (0-9999)
	 * bubeon: 부번 (0-9999)
	 */
	REALTY_PUBLIC_LAND_PRICE(SERVICE_URI, "개별공시지가"),

	/**
	 * 공원 프로그램 총 건수 조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/공원 프로그램 총 건수 조회/{start}/{end}/
	 */
	PARK_PROGRAM_TOTAL_COUNT(SERVICE_URI, "공원 프로그램 총 건수 조회"),

	/**
	 * 공원 프로그램 정보조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/공원 프로그램 정보조회/{start}/{end}/
	 */
	PARK_PROGRAM_INFO(SERVICE_URI, "공원 프로그램 정보조회"),

	/**
	 * 공원정보 총 건수 조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/공원정보 총 건수 조회/{start}/{end}/
	 */
	PARK_INFO_TOTAL_COUNT(SERVICE_URI, "공원정보 총 건수 조회"),

	/**
	 * 공원정보 정보조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/공원정보 정보조회/{start}/{end}/
	 */
	PARK_INFO(SERVICE_URI, "공원정보 정보조회"),

	/**
	 * 프로그램ID별 공원 프로그램 총 건수 조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/프로그램ID별 공원 프로그램 총 건수 조회/{start}/{end}/{program_id}
	 */
	PARK_PROGRAM_TOTAL_COUNT_BY_PROGRAMID(SERVICE_URI, "프로그램ID별 공원 프로그램 총 건수 조회"),

	/**
	 * 공원ID별 공원 프로그램 총 건수 조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/공원ID별 공원 프로그램 총 건수 조회/{start}/{end}/{park_id}
	 */
	PARK_PROGRAM_TOTAL_COUNT_BY_PARKID(SERVICE_URI, "공원ID별 공원 프로그램 총 건수 조회"),

	/**
	 * 프로그램명별 공원 프로그램 총 건수 조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/프로그램명별 공원 프로그램 총 건수 조회/{start}/{end}/{program_name}
	 */
	PARK_PROGRAM_TOTAL_COUNT_BY_PROGRAMNAME(SERVICE_URI, "프로그램명별 공원 프로그램 총 건수 조회"),

	/**
	 * 공원명별 공원 프로그램 총 건수 조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/공원명별 공원 프로그램 총 건수 조회/{start}/{end}/{park_name}
	 */
	PARK_PROGRAM_TOTAL_COUNT_BY_PARKNAME(SERVICE_URI, "공원명별 공원 프로그램 총 건수 조회"),

	/**
	 * 주소별 공원 프로그램 총 건수 조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/주소별 공원 프로그램 총 건수 조회/{start}/{end}/{address}
	 */
	PARK_PROGRAM_TOTAL_COUNT_BY_ADDRESS(SERVICE_URI, "주소별 공원 프로그램 총 건수 조회"),

	/**
	 * 프로그램ID별 공원 프로그램 정보조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/프로그램ID별 공원 프로그램 정보조회/{start}/{end}/{program_id}
	 */
	PARK_PROGRAM_INFO_BY_PROGRAMID(SERVICE_URI, "프로그램ID별 공원 프로그램 정보조회"),

	/**
	 * 공원ID별 공원 프로그램 정보조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/공원ID별 공원 프로그램 정보조회/{start}/{end}/{park_id}
	 */
	PARK_PROGRAM_INFO_BY_PARKID(SERVICE_URI, "공원ID별 공원 프로그램 정보조회"),

	/**
	 * 프로그램명별 공원 프로그램 정보조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/프로그램명별 공원 프로그램 정보조회/{start}/{end}/{program_name}
	 */
	PARK_PROGRAM_INFO_BY_PROGRAMNAME(SERVICE_URI, "프로그램명별 공원 프로그램 정보조회"),

	/**
	 * 공원명별 공원 프로그램 정보조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/공원명별 공원 프로그램 정보조회/{start}/{end}/{park_name}
	 */
	PARK_PROGRAM_INFO_BY_PARKNAME(SERVICE_URI, "공원명별 공원 프로그램 정보조회"),

	/**
	 * 주소별 공원 프로그램 정보조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/주소별 공원 프로그램 정보조회/{start}/{end}/{address}
	 */
	PARK_PROGRAM_INFO_BY_ADDRESS(SERVICE_URI, "주소별 공원 프로그램 정보조회"),

	/**
	 * 공원ID별 공원정보 총 건수 조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/공원ID별 공원정보 총 건수 조회/{start}/{end}/{park_id}
	 */
	PARK_INFO_TOTAL_COUNT_BY_PARKID(SERVICE_URI, "공원ID별 공원정보 총 건수 조회"),

	/**
	 * 공원명별 공원정보 총 건수 조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/공원명별 공원정보 총 건수 조회/{start}/{end}/{park_name}
	 */
	PARK_INFO_TOTAL_COUNT_BY_PARKNAME(SERVICE_URI, "공원명별 공원정보 총 건수 조회"),

	/**
	 * 주소별 공원정보 총 건수 조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/주소별 공원정보 총 건수 조회/{start}/{end}/{address}
	 */
	PARK_INFO_TOTAL_COUNT_BY_ADDRESS(SERVICE_URI, "주소별 공원정보 총 건수 조회"),

	/**
	 * 공원ID별 공원정보 정보조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/공원ID별 공원정보 정보조회/{start}/{end}/{park_id}
	 */
	PARK_INFO_BY_PARKID(SERVICE_URI, "공원ID별 공원정보 정보조회"),

	/**
	 * 공원명별 공원정보 정보조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/공원명별 공원정보 정보조회/{start}/{end}/{park_name}
	 */
	PARK_INFO_BY_PARKNAME(SERVICE_URI, "공원명별 공원정보 정보조회"),

	/**
	 * 주소별 공원정보 정보조회<br>
	 * SERVICE_URI/{requestType}/{authenKey}/주소별 공원정보 정보조회/{start}/{end}/{address}
	 */
	PARK_INFO_BY_ADDRESS(SERVICE_URI, "주소별 공원정보 정보조회"),

	/**
	 * 문화재 정보 제공<br>
	 * SERVICE_URI/{requestType}/{authenKey}/문화재 정보 제공/{start}/{end}/{lang}
	 */
	CULTURE_ASSETS_INFO(SERVICE_URI, "문화재 정보 제공"),

	/**
	 * 문화재 상세 정보 제공<br>
	 * SERVICE_URI/{requestType}/{authenKey}/문화재 상세 정보 제공/{start}/{end}/{code}/{lang}
	 */
	CULTURE_ASSETS_DETAIL_INFO(SERVICE_URI, "문화재 상세 정보 제공"),

	/**
	 * 문화재 이미지_파일 제공<br>
	 * SERVICE_URI/{requestType}/{authenKey}/문화재 이미지_파일 제공/{start}/{end}/{code}
	 */
	CULTURE_ASSETS_MEDIA(SERVICE_URI, "문화재 이미지_파일 제공"),

	/**
	 * 문화재 분류 목록 검색<br>
	 * SERVICE_URI/{requestType}/{authenKey}/문화재 분류 목록 검색/{start}/{end}/
	 */
	CULTURE_ASSETS_CATEGORY(SERVICE_URI, "문화재 분류 목록 검색"),

	/**
	 * 문화재 세부분류 목록 검색<br>
	 * SERVICE_URI/{requestType}/{authenKey}/문화재 세부분류 목록 검색/{start}/{end}/{uppercode}
	 */
	CULTURE_ASSETS_DETAIL_CATEGORY(SERVICE_URI, "문화재 세부분류 목록 검색"),

	/**
	 * 문화재 세부분류코드 및 언어코드 검색<br>
	 * SERVICE_URI/{requestType}/{authenKey}/문화재 세부분류코드 및 언어코드 검색/{start}/{end}/{lang}/{clsscode2}
	 */
	CULTURE_ASSETS_SEARCH_BY_CODE(SERVICE_URI, "문화재 세부분류코드 및 언어코드 검색"),

	/**
	 * 문화재명 및 언어코드 검색<br>
	 * SERVICE_URI/{requestType}/{authenKey}/문화재명 및 언어코드 검색/{start}/{end}/{lang}/{cultasstk}
	 */
	CULTURE_ASSETS_SEARCH_BY_NAME(SERVICE_URI, "문화재명 및 언어코드 검색"),

	/**
	 * 주제분류별 공연행사 검색<br>
	 * SERVICE_URI/{requestType}/{authenKey}/주제분류별 공연행사 검색/{start}/{end}/{subjcode}
	 */
	CULTURE_PLAY_INFO(SERVICE_URI, "주제분류별 공연행사 검색"),

	/**
	 * 공연행사 주제분류 목록 검색<br>
	 * SERVICE_URI/{requestType}/{authenKey}/공연행사 주제분류 목록 검색/{start}/{end}
	 */
	CULTURE_PLAY_CATEGORY(SERVICE_URI, "공연행사 주제분류 목록 검색"),

	/**
	 * 공연행사 상세 정보 제공<br>
	 * SERVICE_URI/{requestType}/{authenKey}/공연행사 상세 정보 제공/{start}/{end}/{cultcode}
	 */
	CULTURE_PLAY_DETAIL_INFO(SERVICE_URI, "공연행사 상세 정보 제공"),

	/**
	 * 공연행사 명 검색<br>
	 * SERVICE_URI/{requestType}/{authenKey}/공연행사 명 검색/{start}/{end}/{title}(공백제거)
	 */
	CULTURE_PLAY_SEARCH_BY_NAME(SERVICE_URI, "공연행사 명 검색"),

	/**
	 * 공연행사 장소명 검색<br>
	 * SERVICE_URI/{requestType}/{authenKey}/공연행사 장소명 검색/{start}/{end}/{place}(공백제거)
	 */
	CULTURE_PLAY_SEARCH_BY_LOC(SERVICE_URI, "공연행사 장소명 검색"),

	/**
	 * 공연행사 기간 검색<br>
	 * SERVICE_URI/{requestType}/{authenKey}/공연행사 기간 검색/{start}/{end}/{startdate}/{end_date}(yyyymmdd 형식)
	 */
	CULTURE_PLAY_SEARCH_BY_TERM(SERVICE_URI, "공연행사 기간 검색"),

	/**
	 * 문화시설 주제분류 목록 검색<br>
	 * SERVICE_URI/{requestType}/{authenKey}/문화시설 주제분류 목록 검색/{start}/{end}
	 */
	CULTURE_FACIL_CATEGORY_BY_SUBJ(SERVICE_URI, "문화시설 주제분류 목록 검색"),

	/**
	 * 문화시설 테마분류 목록 검색<br>
	 * SERVICE_URI/{requestType}/{authenKey}/문화시설 테마분류 목록 검색/{start}/{end}
	 */
	CULTURE_FACIL_CATEGORY_BY_THEME(SERVICE_URI, "문화시설 테마분류 목록 검색"),

	/**
	 * 문화시설 주제분류 목록 제공<br>
	 * SERVICE_URI/{requestType}/{authenKey}/문화시설 주제분류 목록 제공/{start}/{end}/{subjcode}
	 */
	CULTURE_FACIL_INFO_BY_SUBJ(SERVICE_URI, "문화시설 주제분류 목록 제공"),

	/**
	 * 문화시설 테마분류 목록 제공<br>
	 * SERVICE_URI/{requestType}/{authenKey}/문화시설 테마분류 목록 제공/{start}/{end}/{themecode}
	 */
	CULTURE_FACIL_INFO_BY_THEME(SERVICE_URI, "문화시설 테마분류 목록 제공"),

	/**
	 * 문화시설 상세 정보 제공<br>
	 * SERVICE_URI/{requestType}/{authenKey}/문화시설 상세 정보 제공/{start}/{end}/{fac_code}
	 */
	CULTURE_FACIL_DETAIL_INFO(SERVICE_URI, "문화시설 상세 정보 제공"),

	/**
	 * 문화시설 교통정보 제공<br>
	 * SERVICE_URI/{requestType}/{authenKey}/문화시설 교통정보 제공/{start}/{end}/{fac_code}
	 */
	CULTURE_FACIL_TRAFFIC_INFO(SERVICE_URI, "문화시설 교통정보 제공"),

	/**
	 * 문화시설명 검색<br>
	 * SERVICE_URI/{requestType}/{authenKey}/문화시설명 검색/{start}/{end}/{fac_name}
	 */
	CULTURE_FACIL_SEARCH_BY_NAME(SERVICE_URI, "문화시설명 검색"),

	/**
	 * 문화시설 주소 검색<br>
	 * SERVICE_URI/{requestType}/{authenKey}/문화시설 주소 검색/{start}/{end}/{addr}
	 */
	CULTURE_FACIL_SEARCH_BY_ADDR(SERVICE_URI, "문화시설 주소 검색"),

	/**
	 * 
	 */
	UNKNOWN(UNKNOWN_URI, "UNKWNON_SERVICE_NAME");

	/**
	 * 에러코드데이터 초기화
	 */
	static
	{
		ERROR_TABLE.clear();
		ERROR_TABLE.put(ErrorInfoType.ERROR_100.getCode(), ErrorInfoType.ERROR_100);
		ERROR_TABLE.put(ErrorInfoType.ERROR_200.getCode(), ErrorInfoType.ERROR_200);
		ERROR_TABLE.put(ErrorInfoType.ERROR_300.getCode(), ErrorInfoType.ERROR_300);
		ERROR_TABLE.put(ErrorInfoType.ERROR_301.getCode(), ErrorInfoType.ERROR_301);
		ERROR_TABLE.put(ErrorInfoType.ERROR_500.getCode(), ErrorInfoType.ERROR_500);
		ERROR_TABLE.put(ErrorInfoType.ERROR_600.getCode(), ErrorInfoType.ERROR_600);
		ERROR_TABLE.put(ErrorInfoType.ERROR_601.getCode(), ErrorInfoType.ERROR_601);
		ERROR_TABLE.put(ErrorInfoType.INFO_100.getCode(), ErrorInfoType.INFO_100);
		ERROR_TABLE.put(ErrorInfoType.UNKNOWN.getCode(), ErrorInfoType.UNKNOWN);
	}

	/**
	 * 
	 */
	private String serviceUri;

	/**
	 * 
	 */
	private String serviceName;

	/**
	 * 
	 * @since 1.0.0
	 * @param serviceName
	 */
	OpenAPI(String serviceUri, String serviceName)
	{
		this.serviceUri = serviceUri;
		this.serviceName = serviceName;
	}

	/**
	 * 
	 * @since 1.0.0
	 * @return the service uri
	 */
	public String getServiceUri()
	{
		return serviceUri;
	}

	/**
	 * 
	 * @since 1.0.0
	 * @return the service name
	 */
	public String getServiceName()
	{
		return serviceName;
	}
}
