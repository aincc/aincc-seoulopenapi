package com.aincc.seoulopenapi.network;

import com.aincc.lib.network.http.HttpParam;

/**
 * 
 * <h3><b>OpenParam</b></h3></br>
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public class OpenParam extends HttpParam
{
	private int start;
	private int end;

	public OpenParam(String requestKey)
	{
		super(requestKey);
	}

	public int getStart()
	{
		return start;
	}

	public void setStart(int start)
	{
		this.start = start;
	}

	public int getEnd()
	{
		return end;
	}

	public void setEnd(int end)
	{
		this.end = end;
	}

}
