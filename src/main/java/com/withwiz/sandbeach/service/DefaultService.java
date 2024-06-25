package com.withwiz.sandbeach.service;

import com.withwiz.sandbeach.message.AGenericDeliveryMessage;

/**
 * Service default class<BR/>
 * Created by uni4love on 2010. 1. 15..
 */
public class DefaultService<REQ extends AGenericDeliveryMessage, RES extends AGenericDeliveryMessage>
		extends AGenericService<REQ, RES>
{
	/**
	 * service name
	 */
	protected String	name	= null;

	/**
	 * service processes.<BR/>
	 * 
	 * @param request
	 *            request data
	 * @param response
	 *            response data
	 * @throws ServiceException
	 */
	@Override
	public void onService(REQ request, RES response) throws ServiceException
	{

	}

	@Override
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
