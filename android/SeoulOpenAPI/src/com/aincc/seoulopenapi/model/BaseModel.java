package com.aincc.seoulopenapi.model;

import java.lang.reflect.Field;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 
 * <h3><b>BaseModel</b></h3></br>
 * 
 * 공통 모델
 * <p>
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public class BaseModel
{
	/**
	 * rowId
	 */
	public String rowId;

	@Override
	public String toString()
	{
		return (new ReflectionToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
		{
			@Override
			protected boolean accept(Field field)
			{
				// all field accept
				return super.accept(field);
				// except rowId
				// return super.accept(field) && !field.getName().equals("rowId");
			}
		}).toString();
	}
}
