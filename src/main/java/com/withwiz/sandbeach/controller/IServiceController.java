package com.withwiz.sandbeach.controller;

/**
 * service controller interface<BR/>
 * Created by uni4love on 2010. 3. 31..
 */
public interface IServiceController<T, E> extends IController
{
	/**
	 * service controller processor
	 * 
	 * @param obj
	 *            object
	 */
	void process(T obj);

	/**
	 * add a filter before service<BR/>
	 * 
	 * @param filter
	 *            filter
	 */
	void addFilterBeforeService(E filter);

    /**
     * add a filter after service<BR/>
     * @param filter
     */
	void addFilterAfterService(E filter);
}
