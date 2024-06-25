package com.withwiz.sandbeach.filter;

/**
 * This class defines processes, while filtering, if happened exception.<BR/>
 * Created by uni4love on 2010. 1. 12..
 */
public class FilterException extends Exception
{
	/**
	 * constructor
	 */
	public FilterException()
	{
	}

	/**
	 * constructor
	 * 
	 * @param message
	 *            exception message
	 */
	public FilterException(String message)
	{
		super(message);
	}

	/**
	 * constructor
	 * 
	 * @param throwable
	 *            throwable object
	 */
	public FilterException(Throwable throwable)
	{
		super(throwable);
	}
}
