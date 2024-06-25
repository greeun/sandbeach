package com.withwiz.sandbeach.context;

import com.withwiz.sandbeach.service.IService;

/**
 * Service context interface<BR/>
 * Created by uni4love on 2010. 3. 27..
 */
public interface IServiceContext extends IContext
{
	/**
	 * register a service.<BR/>
	 *
	 * @param service
	 *            IService
	 */
	void registerService(IService service);

	/**
	 * unregister a service.<BR/>
	 *
	 * @param serviceName
	 *            service class name(with full package name)
	 * @return unregistered service
	 */
	IService unregisterService(String serviceName);

	/**
	 * get a service.<BR/>
	 *
	 * @param serviceName
	 *            service class name(with full package name)
	 * @return IService
	 */
	IService getService(String serviceName);
}
