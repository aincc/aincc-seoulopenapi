package com.aincc.seoulopenapi.openapi.culture;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

import com.aincc.parse.json.JSonManager;
import com.aincc.network.common.IPacket;
import com.aincc.seoulopenapi.OpenAPI;
import com.aincc.seoulopenapi.model.CodeInfo;
import com.aincc.seoulopenapi.network.OpenBase;
import com.aincc.util.Logger;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * 
 * <h3><b>OpenFacilCodeInfo</b></h3></br>
 * 
 * 공공정보명 : 문화정보<br>
 * 서비스명 : 문화시설 테마분류 목록 검색 <br>
 * 서비스명 : 문화시설 주제분류 목록 검색 <br>
 * 분류체계 : 문화관광>문화
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public class OpenFacilCodeInfo extends OpenBase
{
	/**
	 * 결과데이터
	 */
	public Collection<CodeInfo> infos;

	@Override
	public void setPacket(IPacket packet) throws Exception
	{
		super.setPacket(packet);
	}

	@Override
	public void parse() throws Exception
	{
		infos = new ArrayList<CodeInfo>();
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
			CodeInfo info = (CodeInfo) manager.deserialize(row.toString(), CodeInfo.class);
			info.rowId = rowId;
			infos.add(info);
		}
	}
}
