package com.withwiz.sandbeach.filter;

/**
 * Filter interface<BR/>
 * Created by uni4love on 2010. 1. 12..
 */
public interface IFilter<T>
{
	/**
	 * filtering method
	 * 
	 * @param obj
	 *            filter target object
	 * @return filtered target object
	 * @throws FilterException
	 */
	T filtering(T obj) throws Exception;
}
