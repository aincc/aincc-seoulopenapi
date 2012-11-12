package com.aincc.seoulopenapi.openapi.price;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

import com.aincc.network.common.IPacket;
import com.aincc.parse.json.JSonManager;
import com.aincc.seoulopenapi.OpenAPI;
import com.aincc.seoulopenapi.model.NecessariesPrice;
import com.aincc.seoulopenapi.network.OpenBase;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * 
 * <h3><b>OpenNecessariesPrice</b></h3></br>
 * 
 * 공공정보명 : 물가정보<br>
 * 서비스명 : 생필품가격<br>
 * 분류체계 : 산업경제>경제
 * <p>
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public class OpenNecessariesPrice extends OpenBase
{
	/**
	 * 결과데이터
	 */
	public Collection<NecessariesPrice> infos;

	@Override
	public void setPacket(IPacket packet) throws Exception
	{
		super.setPacket(packet);
	}

	@Override
	public void parse() throws Exception
	{
		infos = new ArrayList<NecessariesPrice>();
		JSonManager manager = JSonManager.getInstance();
		JsonNode content = manager.getNode(response);
		JsonNode root = content.findPath(OpenAPI.PRICE_NECESSARIES_PRICE.getServiceName());
		Iterator<Entry<String, JsonNode>> it = root.fields();
		while (it.hasNext())
		{
			Entry<String, JsonNode> entry = it.next();
			String rowId = entry.getKey();
			JsonNode row = entry.getValue();
			// Logger.v("row = " + rowId + "\n" + row.toString());
			NecessariesPrice info = (NecessariesPrice) manager.deserialize(row.toString(), NecessariesPrice.class);
			info.rowId = rowId;
			infos.add(info);
		}
	}
}
