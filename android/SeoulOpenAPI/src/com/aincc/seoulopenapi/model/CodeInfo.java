package com.aincc.seoulopenapi.model;

import java.util.Comparator;

import com.aincc.seoulopenapi.openapi.culture.OpenAssetsCodeInfo;
import com.aincc.seoulopenapi.openapi.culture.OpenPlayCodeInfo;

/**
 * 
 * <h3><b>CodeInfo</b></h3></br>
 * 
 * 분류 코드 정보
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 * @see OpenAssetsCodeInfo
 * @see OpenPlayCodeInfo
 */
public class CodeInfo extends BaseModel implements Comparator<CodeInfo>
{
	/**
	 * 코드
	 */
	public String CODE;

	/**
	 * 코드명
	 */
	public String CODENAME;

	@Override
	public int compare(CodeInfo lhs, CodeInfo rhs)
	{
		return lhs.CODE.compareTo(rhs.CODE);
	}

	@Override
	public String toString()
	{
		return CODENAME;
	}
}
