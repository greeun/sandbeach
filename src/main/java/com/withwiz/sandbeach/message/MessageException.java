package com.withwiz.sandbeach.message;

import com.withwiz.sandbeach.exception.SandbeachException;

/**
 * message exception<BR/>
 * Created by uni4love on 2010. 3. 30..
 */
public class MessageException extends SandbeachException
{
	/**
	 * constructor
	 *
	 * @param message
	 *            exception message
	 */
	public MessageException(String message)
	{
		super(message);
	}

	/**
	 * constructor
	 *
	 * @param throwable
	 *            throwable instance
	 */
	public MessageException(Throwable throwable)
	{
		super(throwable);
	}
}
