package com.aincc.seoulopenapi.network;

import com.aincc.lib.network.common.BaseParam;
import com.aincc.lib.network.http.HttpTask;
import com.aincc.lib.network.http.HttpTrans;
import com.aincc.lib.util.Logger;

/**
 * 
 * <h3><b>OpenTask</b></h3></br>
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 * @param <T>
 * @param <E>
 */
public class OpenTask<T, E> extends HttpTask<T, E>
{
	@SuppressWarnings("unchecked")
	@Override
	protected T parse(StringBuffer buffer, Class<? extends HttpTrans> transactionClass, BaseParam param) throws Exception
	{
		PacketBuilder pb = new PacketBuilder(buffer);
		return (T) HttpTrans.newInstance(pb, transactionClass, param);
	}

	@Override
	protected void prepare()
	{
		super.prepare();
		Logger.i("uri = " + uri);
	}

}
