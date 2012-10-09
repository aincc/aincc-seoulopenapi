package com.aincc.seoulopenapi.network;

import com.aincc.lib.network.common.IPacket;
import com.aincc.lib.network.http.HttpTrans;
import com.aincc.lib.util.Logger;
import com.aincc.seoulopenapi.ErrorInfoType;
import com.aincc.seoulopenapi.OpenAPICons;

/**
 * 
 * <h3><b>OpenBase</b></h3></br>
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public abstract class OpenBase extends HttpTrans
{

	/**
	 * packet builder
	 * 
	 * @since 1.0.0
	 */
	protected PacketBuilder pb = null;

	/**
	 * 에러여부
	 */
	protected boolean isError = false;

	/**
	 * 에러유형
	 */
	protected ErrorInfoType errorInfoType = ErrorInfoType.SUCCESS;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.baru.core.network.BaseTrans#setPacket(com.baru.core.network.IPacket)
	 */
	@Override
	public void setPacket(IPacket packet) throws Exception
	{
		super.setPacket(packet);
		setResponse(packet.toString());
		// Logger.d(response);
		try
		{
			parse();
			Logger.i(getParam().getRequestKey() + " response parse OK.");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			parseError();
			Logger.e(getParam().getRequestKey() + "response parse Error!");
		}
	}

	/**
	 * TODO: OpenAPI 오류내용 파싱.
	 * 
	 * @since 1.0.0
	 */
	private void parseError()
	{
		isError = true;

		// 처음 나오는 ':' 의 인덱스 가져오기
		int last = response.indexOf(":");
		if (0 < last)
		{
			// last 위치 이전까지의 문자열이 코드값.
			String code = response.substring(0, last).trim();
			if (OpenAPICons.ERROR_TABLE.containsKey(code))
			{
				errorInfoType = OpenAPICons.ERROR_TABLE.get(code);
				return;
			}
		}
		errorInfoType = ErrorInfoType.UNKNOWN;
	}

	/**
	 * 
	 * @since 1.0.0
	 * @return
	 */
	public boolean isError()
	{
		return isError;
	}

	/**
	 * 
	 * @since 1.0.0
	 * @return
	 */
	public ErrorInfoType getErrorInfoType()
	{
		return errorInfoType;
	}

	/**
	 * 서브클래스에서 응답결과 파싱처리를 구현한다.
	 * 
	 * @since 1.0.0
	 */
	abstract public void parse() throws Exception;
}
