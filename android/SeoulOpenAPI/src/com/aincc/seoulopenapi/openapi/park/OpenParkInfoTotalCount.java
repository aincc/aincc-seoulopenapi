package com.aincc.seoulopenapi.openapi.park;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

import com.aincc.lib.parse.json.JSonManager;
import com.aincc.lib.util.Logger;
import com.aincc.seoulopenapi.OpenAPI;
import com.aincc.seoulopenapi.model.TotalCount;
import com.aincc.seoulopenapi.network.OpenBase;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * 
 * <h3><b>OpenParkInfoTotalCount</b></h3></br>
 * 
 * 공공정보명 : 공원정보<br>
 * 서비스명 : 공원정보 총 건수 조회<br>
 * 서비스명 : 공원ID별 공원정보 총 건수 조회<br>
 * 서비스명 : 공원명별 공원정보 총 건수 조회<br>
 * 서비스명 : 주소별 공원정보 총 건수 조회<br>
 * 분류체계 : 환경>공원녹지
 * <p>
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public class OpenParkInfoTotalCount extends OpenBase
{
	/**
	 * 결과데이터
	 */
	public Collection<TotalCount> infos;

	@Override
	public void parse() throws Exception
	{
		infos = new ArrayList<TotalCount>();
		OpenAPI apiType = OpenAPI.valueOf(getParam().getRequestKey());
		JSonManager manager = JSonManager.getInstance();
		JsonNode content = manager.getNode(response);
		if (null == content)
		{
			Logger.d("response is not json format.");
			return;
		}
		JsonNode root = content.findPath(apiType.getServiceName());
		if (null == root)
		{
			Logger.d("response has not OpenAPI " + apiType.getServiceName());
			return;
		}
		Iterator<Entry<String, JsonNode>> it = root.fields();
		while (it.hasNext())
		{
			Entry<String, JsonNode> entry = it.next();
			String rowId = entry.getKey();
			JsonNode row = entry.getValue();
			// Logger.v("row = " + rowId + "\n" + row.toString());
			TotalCount info = (TotalCount) manager.deserialize(row.toString(), TotalCount.class);
			info.rowId = rowId;
			infos.add(info);
		}
	}
}
