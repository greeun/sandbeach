package com.withwiz.sandbeach.service;

/**
 * generic service class<BR/>
 * Created by uni4love on 2010. 3. 29..
 */
abstract public class AGenericService<REQ, RES> implements IGenericService<REQ, RES>
{
	/**
	 * When creating a service is started, this method will be called.<BR/>
	 * 
	 * @param request
	 *            request data
	 * @param response
	 *            response data
	 * @throws ServiceException
	 */
    @Override
	public void onCreate(REQ request, RES response)
			throws ServiceException
    {       
    }

	/**
	 * When destroying a service is started, this method will be called.<BR/>
	 *
	 * @param request
	 *            request data
	 * @param response
	 *            response data
	 * @throws ServiceException
	 */
    @Override
	public void onDestroy(REQ request, RES response)
			throws ServiceException
    {
    }
}
