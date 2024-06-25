package com.withwiz.sandbeach.message;

import java.util.HashMap;
import java.util.Map;

/**
 * service delivery message class<BR/>
 * Created by uni4love on 2010. 4. 1..
 */
public class DefaultDeliveryMessage<V>
		extends AGenericDeliveryMessage<String>
{
	/**
	 * constructor
	 */
	public DefaultDeliveryMessage()
	{
	}

	@Override
	public Map createStore()
	{
		return new HashMap<String, V>();
	}

}
