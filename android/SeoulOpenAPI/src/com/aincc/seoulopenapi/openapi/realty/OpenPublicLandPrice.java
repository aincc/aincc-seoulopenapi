package com.aincc.seoulopenapi.openapi.realty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

import com.aincc.lib.network.common.IPacket;
import com.aincc.lib.parse.json.JSonManager;
import com.aincc.seoulopenapi.OpenAPI;
import com.aincc.seoulopenapi.model.PublicLandPrice;
import com.aincc.seoulopenapi.network.OpenBase;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * 
 * <h3><b>OpenPublicLandPrice</b></h3></br>
 * 
 * 공공정보명 : 부동산 가격정보 <br>
 * 서비스명 : 개별공시지가 <br>
 * 분류체계 : 도시관리>부동산
 * <p>
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public class OpenPublicLandPrice extends OpenBase
{
	/**
	 * 결과데이터
	 */
	public Collection<PublicLandPrice> infos;

	@Override
	public void setPacket(IPacket packet) throws Exception
	{
		super.setPacket(packet);
	}

	@Override
	public void parse() throws Exception
	{
		infos = new ArrayList<PublicLandPrice>();
		JSonManager manager = JSonManager.getInstance();
		JsonNode content = manager.getNode(response);
		JsonNode root = content.findPath(OpenAPI.REALTY_PUBLIC_LAND_PRICE.getServiceName());
		Iterator<Entry<String, JsonNode>> it = root.fields();
		while (it.hasNext())
		{
			Entry<String, JsonNode> entry = it.next();
			String rowId = entry.getKey();
			JsonNode row = entry.getValue();
			// Logger.v("row = " + rowId + "\n" + row.toString());
			PublicLandPrice info = (PublicLandPrice) manager.deserialize(row.toString(), PublicLandPrice.class);
			info.rowId = rowId;
			infos.add(info);
		}
	}

}
