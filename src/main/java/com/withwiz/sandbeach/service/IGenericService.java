package com.withwiz.sandbeach.service;

/**
 * generic service interface<BR/>
 * Created by uni4love on 2010. 3. 31..
 */
public interface IGenericService<REQ, RES> extends IService
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
    void onCreate(REQ request, RES response)
            throws ServiceException;

    /**
     * This method must implement for service process contents.<BR/>
     *
     * @param request
     *            request data
     * @param response
     *            response data
     * @throws ServiceException
     */
    void onService(REQ request, RES response)
            throws ServiceException;

    /**
     * When destroying a service is started, this method will be called.<BR/>
     *
     * @param request
     *            request data
     * @param response
     *            response data
     * @throws ServiceException
     */
    void onDestroy(REQ request, RES response)
            throws ServiceException;
}
