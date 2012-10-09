package com.aincc.seoulopenapi;

import com.aincc.lib.util.Utils;

/**
 * 
 * <h3><b>ServiceURIBuilder</b></h3></br>
 * 
 * OpenAPI Service URI Builder
 * <p>
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public class ServiceURIBuilder
{
	private volatile static ServiceURIBuilder instance;

	private RequestType type = null;
	private OpenAPI service = null;

	/**
	 * private constructor
	 * 
	 * @since 1.0.0
	 */
	private ServiceURIBuilder()
	{

	}

	/**
	 * 
	 * @since 1.0.0
	 */
	private void reset()
	{
		type = null;
		service = null;
	}

	/**
	 * get single instance with reset
	 * 
	 * @since 1.0.0
	 * @return the builder instance
	 */
	public static ServiceURIBuilder getInstance()
	{
		if (null == instance)
		{
			synchronized (ServiceURIBuilder.class)
			{
				if (null == instance)
				{
					instance = new ServiceURIBuilder();
				}
			}
		}
		instance.reset();
		return instance;
	}

	/**
	 * @since 1.0.0
	 * @param type
	 * @param service
	 * @return the builder instance
	 */
	public ServiceURIBuilder build(RequestType type, OpenAPI service)
	{
		this.type = type;
		this.service = service;
		return this;
	}

	/**
	 * @since 1.0.0
	 * @param type
	 * @return the builder instance
	 */
	public ServiceURIBuilder asRequestType(RequestType type)
	{
		this.type = type;
		return this;
	}

	/**
	 * @since 1.0.0
	 * @param service
	 * @return the builder instance
	 */
	public ServiceURIBuilder asService(OpenAPI service)
	{
		this.service = service;
		return this;
	}

	/**
	 * 
	 * @since 1.0.0
	 * @return the service uri
	 * @throws NullPointerException
	 */
	public String getServiceURI() throws NullPointerException
	{
		return service.getServiceUri();
	}

	/**
	 * @since 1.0.0
	 * @return the command uri
	 * @throws NullPointerException
	 */
	public String getCommandURI() throws NullPointerException
	{
		StringBuilder sb = new StringBuilder();
		sb.append("/");
		sb.append(type.getRequestType()).append("/");
		sb.append(OpenAPI.AUTHEN_KEY).append("/");
		sb.append(Utils.encodedURI(service.getServiceName()));

		return sb.toString();
	}

}
