package com.aincc.seoulopenapi;

import com.aincc.lib.network.NetHttpProcessor;
import com.aincc.lib.network.common.BaseTransEx;
import com.aincc.lib.network.common.INetworkListener;
import com.aincc.lib.network.common.NetworkDefine;
import com.aincc.seoulopenapi.network.OpenParam;
import com.aincc.seoulopenapi.network.OpenTask;
import com.aincc.seoulopenapi.openapi.culture.OpenAssetsCodeInfo;
import com.aincc.seoulopenapi.openapi.culture.OpenAssetsInfo;
import com.aincc.seoulopenapi.openapi.culture.OpenAssetsMedia;
import com.aincc.seoulopenapi.openapi.culture.OpenAssetsSearchBy;
import com.aincc.seoulopenapi.openapi.culture.OpenFacilCodeInfo;
import com.aincc.seoulopenapi.openapi.culture.OpenFacilDetailInfo;
import com.aincc.seoulopenapi.openapi.culture.OpenFacilInfo;
import com.aincc.seoulopenapi.openapi.culture.OpenFacilSearchBy;
import com.aincc.seoulopenapi.openapi.culture.OpenFacilTrafficInfo;
import com.aincc.seoulopenapi.openapi.culture.OpenPlayCodeInfo;
import com.aincc.seoulopenapi.openapi.culture.OpenPlayDetailInfo;
import com.aincc.seoulopenapi.openapi.culture.OpenPlayInfo;
import com.aincc.seoulopenapi.openapi.culture.OpenPlaySearchBy;
import com.aincc.seoulopenapi.openapi.park.OpenParkInfo;
import com.aincc.seoulopenapi.openapi.park.OpenParkInfoTotalCount;
import com.aincc.seoulopenapi.openapi.park.OpenParkProgramInfo;
import com.aincc.seoulopenapi.openapi.park.OpenParkProgramTotalCount;
import com.aincc.seoulopenapi.openapi.price.OpenMartInfo;
import com.aincc.seoulopenapi.openapi.price.OpenNecessariesPrice;
import com.aincc.seoulopenapi.openapi.price.OpenPrivateServiceFee;
import com.aincc.seoulopenapi.openapi.price.OpenStablePriceBusiness;
import com.aincc.seoulopenapi.openapi.price.OpenStablePriceProductList;
import com.aincc.seoulopenapi.openapi.realty.OpenPublicLandPrice;
import com.aincc.seoulopenapi.openapi.toilet.OpenToiletPOI;
import com.aincc.seoulopenapi.openapi.traditional.OpenTraditionalMartInfo;

/**
 * 
 * <h3><b>ServiceExecutor</b></h3></br>
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public class ServiceExecutor
{
	private volatile static ServiceExecutor instance;

	/**
	 * private constructor
	 * 
	 * @since 1.0.0
	 */
	private ServiceExecutor()
	{

	}

	/**
	 * 
	 * @since 1.0.0
	 * @return the service executor instance
	 */
	public static ServiceExecutor getInstance()
	{
		if (null == instance)
		{
			synchronized (ServiceExecutor.class)
			{
				if (null == instance)
				{
					instance = new ServiceExecutor();
				}
			}
		}
		return instance;
	}

	/**
	 * 
	 * @since 1.0.0
	 */
	public void cancelAll()
	{
		NetHttpProcessor.getInstance().cancelAll();
	}

	// ///////////////////////////////////////////////////////////////////////
	// price package
	/**
	 * 시장마트정보 요청
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param start
	 * @param end
	 */
	public void getMartInfo(String requestKey, INetworkListener listener, int start, int end)
	{
		OpenMartInfo tr = new OpenMartInfo();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, OpenAPI.PRICE_MART_INFO);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenMartInfo, BaseTransEx> task = new OpenTask<OpenMartInfo, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	/**
	 * 가격안정모범업소 요청
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param start
	 * @param end
	 */
	public void getStablePriceBusiness(String requestKey, INetworkListener listener, int start, int end)
	{
		OpenStablePriceBusiness tr = new OpenStablePriceBusiness();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, OpenAPI.PRICE_STABLE_PRICE_BUSINESS);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenStablePriceBusiness, BaseTransEx> task = new OpenTask<OpenStablePriceBusiness, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	/**
	 * 가격안정모범업소 상품목록 요청
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param start
	 * @param end
	 */
	public void getStablePriceProductList(String requestKey, INetworkListener listener, int start, int end)
	{
		OpenStablePriceProductList tr = new OpenStablePriceProductList();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, OpenAPI.PRICE_STABLE_PRICE_PRODUCT_LIST);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenStablePriceProductList, BaseTransEx> task = new OpenTask<OpenStablePriceProductList, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	/**
	 * 생필품가격 요청
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param start
	 * @param end
	 */
	public void getNecessariesPrice(String requestKey, INetworkListener listener, int start, int end)
	{
		OpenNecessariesPrice tr = new OpenNecessariesPrice();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, OpenAPI.PRICE_NECESSARIES_PRICE);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenNecessariesPrice, BaseTransEx> task = new OpenTask<OpenNecessariesPrice, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	/**
	 * 개인서비스요금정보 요청
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param start
	 * @param end
	 */
	public void getPrivateServiceFee(String requestKey, INetworkListener listener, int start, int end)
	{
		OpenPrivateServiceFee tr = new OpenPrivateServiceFee();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, OpenAPI.PRICE_PRIVATE_SERVICE_FEE);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenPrivateServiceFee, BaseTransEx> task = new OpenTask<OpenPrivateServiceFee, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	// ///////////////////////////////////////////////////////////////////////
	// realty package

	/**
	 * 개별공시지가 요청
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param start
	 * @param end
	 * @param sigungu
	 * @param bjdong
	 * @param bonbeon
	 * @param bubeon
	 */
	public void getPublicLandPrice(String requestKey, INetworkListener listener, int start, int end, String sigungu, String bjdong, int bonbeon, int bubeon)
	{
		OpenPublicLandPrice tr = new OpenPublicLandPrice();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, OpenAPI.REALTY_PUBLIC_LAND_PRICE);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);
		sb.append("/").append(sigungu);
		sb.append("/").append(bjdong);
		sb.append("/").append(bonbeon);
		sb.append("/").append(bubeon);
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenPublicLandPrice, BaseTransEx> task = new OpenTask<OpenPublicLandPrice, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	// ///////////////////////////////////////////////////////////////////////
	// traditional package

	/**
	 * 전통시장 정보 요청
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param start
	 * @param end
	 */
	public void getTraditionalMartInfo(String requestKey, INetworkListener listener, int start, int end)
	{
		OpenTraditionalMartInfo tr = new OpenTraditionalMartInfo();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, OpenAPI.TRADITIONAL_MART_INFO);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenTraditionalMartInfo, BaseTransEx> task = new OpenTask<OpenTraditionalMartInfo, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	// ///////////////////////////////////////////////////////////////////////
	// toilet package

	/**
	 * 서울시 화장실 공공정보 POI 정보조회 요청
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param start
	 * @param end
	 */
	public void getToiletSeoulPOI(String requestKey, INetworkListener listener, int start, int end)
	{
		OpenToiletPOI tr = new OpenToiletPOI();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, OpenAPI.TOILET_SEOUL_POI);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenToiletPOI, BaseTransEx> task = new OpenTask<OpenToiletPOI, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	// ///////////////////////////////////////////////////////////////////////
	// park package

	/**
	 * 공원 프로그램 총 건수 조회
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param apiType
	 *            PARK_PROGRAM_TOTAL_COUNT,BY_ADDRESS,BY_PARKID,BY_PARKNAME,BY_PROGRAMID,BY_PROGRAMNAME
	 * @param byFilter
	 */
	public void getParkProgramTotalCount(String requestKey, INetworkListener listener, OpenAPI apiType, String byFilter)
	{
		OpenParkProgramTotalCount tr = new OpenParkProgramTotalCount();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, apiType);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(1);
		sb.append("/").append(5);
		switch (apiType)
		{
		case PARK_PROGRAM_TOTAL_COUNT:
			break;
		case PARK_PROGRAM_TOTAL_COUNT_BY_ADDRESS:
		case PARK_PROGRAM_TOTAL_COUNT_BY_PARKID:
		case PARK_PROGRAM_TOTAL_COUNT_BY_PARKNAME:
		case PARK_PROGRAM_TOTAL_COUNT_BY_PROGRAMID:
		case PARK_PROGRAM_TOTAL_COUNT_BY_PROGRAMNAME:
			sb.append("/").append(byFilter);
			break;
		default:
			break;
		}
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(1);
		param.setEnd(5);
		tr.setParam(param);

		OpenTask<OpenParkProgramTotalCount, BaseTransEx> task = new OpenTask<OpenParkProgramTotalCount, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	/**
	 * 공원정보 총 건수 조회
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param apiType
	 *            PARK_INFO_TOTAL_COUNT,BY_ADDRESS,BY_PARKID,BY_PARKNAME
	 * @param byFilter
	 */
	public void getParkInfoTotalCount(String requestKey, INetworkListener listener, OpenAPI apiType, String byFilter)
	{
		OpenParkInfoTotalCount tr = new OpenParkInfoTotalCount();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, apiType);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(1);
		sb.append("/").append(5);
		switch (apiType)
		{
		case PARK_INFO_TOTAL_COUNT:
			break;
		case PARK_INFO_TOTAL_COUNT_BY_ADDRESS:
		case PARK_INFO_TOTAL_COUNT_BY_PARKID:
		case PARK_INFO_TOTAL_COUNT_BY_PARKNAME:
			sb.append("/").append(byFilter);
			break;
		default:
			break;
		}
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(1);
		param.setEnd(5);
		tr.setParam(param);

		OpenTask<OpenParkInfoTotalCount, BaseTransEx> task = new OpenTask<OpenParkInfoTotalCount, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	/**
	 * 공원 프로그램 정보조회
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param start
	 * @param end
	 * @param apiType
	 *            PARK_PROGRAM_INFO,BY_ADDRESS,BY_PARKID,BY_PARKNAME,BY_PROGRAMID,BY_PROGRAMNAME
	 * @param byFilter
	 */
	public void getParkProgramInfo(String requestKey, INetworkListener listener, int start, int end, OpenAPI apiType, String byFilter)
	{
		OpenParkProgramInfo tr = new OpenParkProgramInfo();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, apiType);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);
		switch (apiType)
		{
		case PARK_PROGRAM_INFO:
			break;
		case PARK_PROGRAM_INFO_BY_ADDRESS:
		case PARK_PROGRAM_INFO_BY_PARKID:
		case PARK_PROGRAM_INFO_BY_PARKNAME:
		case PARK_PROGRAM_INFO_BY_PROGRAMID:
		case PARK_PROGRAM_INFO_BY_PROGRAMNAME:
			sb.append("/").append(byFilter);
			break;
		default:
			break;
		}
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenParkProgramInfo, BaseTransEx> task = new OpenTask<OpenParkProgramInfo, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	/**
	 * 공원정보 정보조회
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param start
	 * @param end
	 * @param apiType
	 *            PARK_INFO,BY_ADDRESS,BY_PARKID,BY_PARKNAME
	 * @param byFilter
	 */
	public void getParkInfo(String requestKey, INetworkListener listener, int start, int end, OpenAPI apiType, String byFilter)
	{
		OpenParkInfo tr = new OpenParkInfo();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, apiType);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);
		switch (apiType)
		{
		case PARK_INFO:
			break;
		case PARK_INFO_BY_ADDRESS:
		case PARK_INFO_BY_PARKID:
		case PARK_INFO_BY_PARKNAME:
			sb.append("/").append(byFilter);
			break;
		default:
			break;
		}
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenParkInfo, BaseTransEx> task = new OpenTask<OpenParkInfo, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	// ///////////////////////////////////////////////////////////////////////
	// culture package

	/**
	 * 문화재 분류/세부분류 목록 검색
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param apiType
	 *            CULTURE_ASSETS_CATEGORY, CULTURE_ASSETS_DETAIL_CATEGORY
	 * @param uppercode
	 * @param start
	 * @param end
	 */
	public void getAssetsCodeInfo(String requestKey, INetworkListener listener, OpenAPI apiType, String uppercode, int start, int end)
	{
		OpenAssetsCodeInfo tr = new OpenAssetsCodeInfo();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, apiType);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);

		switch (apiType)
		{
		case CULTURE_ASSETS_CATEGORY:
			break;
		case CULTURE_ASSETS_DETAIL_CATEGORY:
			sb.append("/").append(uppercode);
			break;
		default:
			break;
		}

		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenAssetsCodeInfo, BaseTransEx> task = new OpenTask<OpenAssetsCodeInfo, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	/**
	 * 문화재 정보 제공
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param apiType
	 *            CULTURE_ASSETS_INFO, CULTURE_ASSETS_DETAIL_INFO
	 * @param lang
	 * @param code
	 *            CULTURE_ASSETS_DETAIL_INFO 인 경우
	 * @param start
	 * @param end
	 */
	public void getAssetsInfo(String requestKey, INetworkListener listener, OpenAPI apiType, LangCode lang, String code, int start, int end)
	{
		OpenAssetsInfo tr = new OpenAssetsInfo();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, apiType);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);

		switch (apiType)
		{
		case CULTURE_ASSETS_INFO:
			sb.append("/").append(lang.getCode());
			break;
		case CULTURE_ASSETS_DETAIL_INFO:
			sb.append("/").append(code);
			sb.append("/").append(lang.getCode());
			break;
		default:
			break;
		}

		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenAssetsInfo, BaseTransEx> task = new OpenTask<OpenAssetsInfo, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	/**
	 * 문화재명/세부분류코드 및 언어코드 검색
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param apiType
	 *            CULTURE_ASSETS_SEARCH_BY_CODE, CULTURE_ASSETS_SEARCH_BY_NAME
	 * @param lang
	 * @param cultasstk
	 *            CULTURE_ASSETS_SEARCH_BY_NAME 인 경우
	 * @param clsscode2
	 *            CULTURE_ASSETS_SEARCH_BY_CODE 인 경우
	 * @param start
	 * @param end
	 */
	public void getAssetsSearchBy(String requestKey, INetworkListener listener, OpenAPI apiType, LangCode lang, String cultasstk, String clsscode2, int start, int end)
	{
		OpenAssetsSearchBy tr = new OpenAssetsSearchBy();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, apiType);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);
		sb.append("/").append(lang.getCode());

		switch (apiType)
		{
		case CULTURE_ASSETS_SEARCH_BY_CODE:
			sb.append("/").append(clsscode2);
			break;
		case CULTURE_ASSETS_SEARCH_BY_NAME:
			sb.append("/").append(cultasstk);
			break;
		default:
			break;
		}
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenAssetsSearchBy, BaseTransEx> task = new OpenTask<OpenAssetsSearchBy, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	/**
	 * 문화재 이미지_파일 제공
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param apiType
	 * @param code
	 * @param start
	 * @param end
	 */
	public void getAssetsMedia(String requestKey, INetworkListener listener, OpenAPI apiType, String code, int start, int end)
	{
		OpenAssetsMedia tr = new OpenAssetsMedia();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, apiType);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);
		sb.append("/").append(code);
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenAssetsMedia, BaseTransEx> task = new OpenTask<OpenAssetsMedia, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	/**
	 * 공연행사 주제분류 목록 검색
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param apiType
	 * @param start
	 * @param end
	 */
	public void getPlayCodeInfo(String requestKey, INetworkListener listener, OpenAPI apiType, int start, int end)
	{
		OpenPlayCodeInfo tr = new OpenPlayCodeInfo();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, apiType);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenPlayCodeInfo, BaseTransEx> task = new OpenTask<OpenPlayCodeInfo, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	/**
	 * 주제분류별 공연행사 검색
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param apiType
	 * @param subjcode
	 * @param start
	 * @param end
	 */
	public void getPlayInfo(String requestKey, INetworkListener listener, OpenAPI apiType, String subjcode, int start, int end)
	{
		OpenPlayInfo tr = new OpenPlayInfo();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, apiType);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);
		sb.append("/").append(subjcode);
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenPlayInfo, BaseTransEx> task = new OpenTask<OpenPlayInfo, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	/**
	 * 공연행사 상세 정보 제공
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param apiType
	 * @param cultcode
	 * @param start
	 * @param end
	 */
	public void getPlayDetailInfo(String requestKey, INetworkListener listener, OpenAPI apiType, String cultcode, int start, int end)
	{
		OpenPlayDetailInfo tr = new OpenPlayDetailInfo();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, apiType);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);
		sb.append("/").append(cultcode);
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenPlayDetailInfo, BaseTransEx> task = new OpenTask<OpenPlayDetailInfo, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	/**
	 * 공연검색
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param apiType
	 * @param title
	 *            이름/장소명 검색일 경우
	 * @param startdate
	 *            기간 검색일 경우
	 * @param enddate
	 *            기간 검색일 경우
	 * @param start
	 * @param end
	 */
	public void getPlaySearchBy(String requestKey, INetworkListener listener, OpenAPI apiType, String title, String startdate, String enddate, int start, int end)
	{
		OpenPlaySearchBy tr = new OpenPlaySearchBy();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, apiType);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);

		switch (apiType)
		{
		case CULTURE_PLAY_SEARCH_BY_TERM:
			sb.append("/").append(startdate);
			sb.append("/").append(enddate);
			break;
		case CULTURE_PLAY_SEARCH_BY_NAME:
		case CULTURE_PLAY_SEARCH_BY_LOC:
			sb.append("/").append(title);
			break;
		default:
			break;
		}
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenPlaySearchBy, BaseTransEx> task = new OpenTask<OpenPlaySearchBy, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	/**
	 * 문화시설 테마/주제분류 목록 검색
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param apiType
	 * @param start
	 * @param end
	 */
	public void getFacilCodeInfo(String requestKey, INetworkListener listener, OpenAPI apiType, int start, int end)
	{
		OpenFacilCodeInfo tr = new OpenFacilCodeInfo();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, apiType);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenFacilCodeInfo, BaseTransEx> task = new OpenTask<OpenFacilCodeInfo, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	/**
	 * 문화시설 상세 정보 제공
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param apiType
	 * @param fac_code
	 * @param start
	 * @param end
	 */
	public void getFacilDetailInfo(String requestKey, INetworkListener listener, OpenAPI apiType, String fac_code, int start, int end)
	{
		OpenFacilDetailInfo tr = new OpenFacilDetailInfo();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, apiType);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);
		sb.append("/").append(fac_code);
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenFacilDetailInfo, BaseTransEx> task = new OpenTask<OpenFacilDetailInfo, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	/**
	 * 문화시설 교통정보 제공
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param apiType
	 * @param fac_code
	 * @param start
	 * @param end
	 */
	public void getFacilTrafficInfo(String requestKey, INetworkListener listener, OpenAPI apiType, String fac_code, int start, int end)
	{
		OpenFacilTrafficInfo tr = new OpenFacilTrafficInfo();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, apiType);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);
		sb.append("/").append(fac_code);
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenFacilTrafficInfo, BaseTransEx> task = new OpenTask<OpenFacilTrafficInfo, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	/**
	 * 문화시설 테마/주제분류 목록 제공
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param apiType
	 * @param code
	 *            테마/주제코드
	 * @param start
	 * @param end
	 */
	public void getFacilInfo(String requestKey, INetworkListener listener, OpenAPI apiType, String code, int start, int end)
	{
		OpenFacilInfo tr = new OpenFacilInfo();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, apiType);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);
		sb.append("/").append(code);
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenFacilInfo, BaseTransEx> task = new OpenTask<OpenFacilInfo, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}

	/**
	 * 문화시설명/주소 검색
	 * 
	 * @since 1.0.0
	 * @param requestKey
	 * @param listener
	 * @param apiType
	 * @param search
	 * @param start
	 * @param end
	 */
	public void getFacilSearchBy(String requestKey, INetworkListener listener, OpenAPI apiType, String search, int start, int end)
	{
		OpenFacilSearchBy tr = new OpenFacilSearchBy();
		ServiceURIBuilder builder = ServiceURIBuilder.getInstance();
		builder.build(RequestType.JSON, apiType);
		StringBuilder sb = new StringBuilder(builder.getCommandURI());
		sb.append("/").append(start);
		sb.append("/").append(end);
		sb.append("/").append(search);
		tr.setCommandUri(sb.toString());

		OpenParam param = new OpenParam(requestKey);
		param.setPostMethod(false);
		param.setEncoding(NetworkDefine.ENCODING_UTF8);
		param.setStart(start);
		param.setEnd(end);
		tr.setParam(param);

		OpenTask<OpenFacilSearchBy, BaseTransEx> task = new OpenTask<OpenFacilSearchBy, BaseTransEx>();
		task.setTr(tr);

		NetHttpProcessor.getInstance().sendHttp(builder.getServiceURI(), listener, task);
	}
}
