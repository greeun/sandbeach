package com.withwiz.sandbeach.filter;

import com.withwiz.sandbeach.message.IMessage;
import com.withwiz.sandbeach.service.ServiceException;

/**
 * message filter class<BR/>
 * Created by uni4love on 2010. 3. 29..
 */
abstract public class AMessageFilter<T extends IMessage> implements IFilter<T>
{
	/**
	 * service filtering<BR/>
	 * 
	 * @param message
	 *            message
	 * @return message message
	 * @throws ServiceException
	 */
	@Override
	public T filtering(T message) throws ServiceException
	{
		return filterMessage(message);
	}

	/**
	 * message filtering interface
	 * 
	 * @param message
	 *            message
	 * @return message message
	 * @throws ServiceException
	 */
	abstract public T filterMessage(T message) throws ServiceException;
}
