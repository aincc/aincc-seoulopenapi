package com.aincc.seoulopenapi.openapi.price;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

import com.aincc.lib.network.common.IPacket;
import com.aincc.lib.parse.json.JSonManager;
import com.aincc.seoulopenapi.OpenAPI;
import com.aincc.seoulopenapi.model.StablePriceProductList;
import com.aincc.seoulopenapi.network.OpenBase;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * 
 * <h3><b>OpenStablePriceProductList</b></h3></br>
 * 
 * 공공정보명 : 물가정보<br>
 * 서비스명 : 가격안정모범업소 상품리스트 <br>
 * 분류체계 : 산업경제>경제
 * <p>
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public class OpenStablePriceProductList extends OpenBase
{
	/**
	 * 결과데이터
	 */
	public Collection<StablePriceProductList> infos;

	@Override
	public void setPacket(IPacket packet) throws Exception
	{
		super.setPacket(packet);
	}

	@Override
	public void parse() throws Exception
	{
		infos = new ArrayList<StablePriceProductList>();
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
			StablePriceProductList info = (StablePriceProductList) manager.deserialize(row.toString(), StablePriceProductList.class);
			info.rowId = rowId;
			infos.add(info);
		}
	}
}
