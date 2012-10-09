package com.aincc.seoulopenapi.openapi.culture;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

import com.aincc.lib.network.common.IPacket;
import com.aincc.lib.parse.json.JSonManager;
import com.aincc.lib.util.Logger;
import com.aincc.seoulopenapi.OpenAPI;
import com.aincc.seoulopenapi.model.PlaySimpleInfo;
import com.aincc.seoulopenapi.network.OpenBase;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * 
 * <h3><b>OpenPlaySearchBy</b></h3></br>
 * 
 * 공공정보명 : 문화정보<br>
 * 서비스명 : 공연행사 명 검색 <br>
 * 분류체계 : 문화관광>문화
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public class OpenPlaySearchBy extends OpenBase
{
	/**
	 * 결과데이터
	 */
	public Collection<PlaySimpleInfo> infos;

	@Override
	public void setPacket(IPacket packet) throws Exception
	{
		super.setPacket(packet);
	}

	@Override
	public void parse() throws Exception
	{
		infos = new ArrayList<PlaySimpleInfo>();
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
			PlaySimpleInfo info = (PlaySimpleInfo) manager.deserialize(row.toString(), PlaySimpleInfo.class);
			info.rowId = rowId;
			infos.add(info);
		}
	}
}
