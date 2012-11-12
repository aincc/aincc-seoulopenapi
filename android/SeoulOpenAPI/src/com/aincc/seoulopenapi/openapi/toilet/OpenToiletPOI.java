package com.aincc.seoulopenapi.openapi.toilet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

import com.aincc.network.common.IPacket;
import com.aincc.parse.json.JSonManager;
import com.aincc.seoulopenapi.OpenAPI;
import com.aincc.seoulopenapi.model.ToiletPOI;
import com.aincc.seoulopenapi.network.OpenBase;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * 
 * <h3><b>OpenToiletPOI</b></h3></br>
 * 
 * 공공정보명 : 화장실정보<br>
 * 서비스명 : 서울시 화장실 공공정보 POI 정보조회<br>
 * 분류체계 : 보건>보건의료
 * <p>
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public class OpenToiletPOI extends OpenBase
{
	/**
	 * 결과데이터
	 */
	public Collection<ToiletPOI> infos;

	@Override
	public void setPacket(IPacket packet) throws Exception
	{
		super.setPacket(packet);
	}

	@Override
	public void parse() throws Exception
	{
		infos = new ArrayList<ToiletPOI>();
		JSonManager manager = JSonManager.getInstance();
		JsonNode content = manager.getNode(response);
		JsonNode root = content.findPath(OpenAPI.TRADITIONAL_MART_INFO.getServiceName());
		Iterator<Entry<String, JsonNode>> it = root.fields();
		while (it.hasNext())
		{
			Entry<String, JsonNode> entry = it.next();
			String rowId = entry.getKey();
			JsonNode row = entry.getValue();
			// Logger.v("row = " + rowId + "\n" + row.toString());
			ToiletPOI info = (ToiletPOI) manager.deserialize(row.toString(), ToiletPOI.class);
			info.rowId = rowId;
			infos.add(info);
		}
	}
}
