package com.aincc.seoulopenapi.openapi.price;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

import com.aincc.network.common.IPacket;
import com.aincc.parse.json.JSonManager;
import com.aincc.seoulopenapi.OpenAPI;
import com.aincc.seoulopenapi.model.PrivateServiceFee;
import com.aincc.seoulopenapi.network.OpenBase;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * 
 * <h3><b>OpenPrivateServiceFee</b></h3></br>
 * 
 * 공공정보명 : 물가정보<br>
 * 서비스명 : 개인서비스요금정보 <br>
 * 분류체계 : 환경>생활환경
 * <p>
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public class OpenPrivateServiceFee extends OpenBase
{
	/**
	 * 결과데이터
	 */
	public Collection<PrivateServiceFee> infos;

	@Override
	public void setPacket(IPacket packet) throws Exception
	{
		super.setPacket(packet);
	}

	@Override
	public void parse() throws Exception
	{
		infos = new ArrayList<PrivateServiceFee>();
		JSonManager manager = JSonManager.getInstance();
		JsonNode content = manager.getNode(response);
		JsonNode root = content.findPath(OpenAPI.PRICE_MART_INFO.getServiceName());
		Iterator<Entry<String, JsonNode>> it = root.fields();
		while (it.hasNext())
		{
			Entry<String, JsonNode> entry = it.next();
			String rowId = entry.getKey();
			JsonNode row = entry.getValue();
			// Logger.v("row = " + rowId + "\n" + row.toString());
			PrivateServiceFee info = (PrivateServiceFee) manager.deserialize(row.toString(), PrivateServiceFee.class);
			info.rowId = rowId;
			infos.add(info);
		}
	}
}
