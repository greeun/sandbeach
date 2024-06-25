package com.withwiz.sandbeach.context;

import com.withwiz.sandbeach.registry.IServiceRegistry;
import com.withwiz.sandbeach.service.IService;

/**
 * Generic service context class.<BR/>
 * Created by uni4love on 2010. 3. 27..
 */
abstract public class AGenericServiceContext implements IServiceContext
{
	/**
	 * service registry
	 */
	protected IServiceRegistry registry	= null;

	/**
	 * constructor
	 */
	public AGenericServiceContext()
	{
		registry = createRegistry();
	}

    /**
     * register service<BR/>
     *
     * @param service
     *            IService interface
     */
	@Override
	public void registerService(IService service)
	{
		registry.registerService(service.getName(), service);
	}

    /**
     * unregister service<BR/>
     *
     * @param serviceName
     *            service class name(ex: class name with full package name)
     * @return unregistered service
     */
	@Override
	public IService unregisterService(String serviceName)
	{
		return registry.unregisterService(serviceName);
	}

    /**
     * get service<BR/>
     *
     * @param serviceName
     *            service name
     * @return IService
     */
	@Override
	public IService getService(String serviceName)
	{
		return registry.getService(serviceName);
	}

	/**
	 * return created service registry.<BR/>
	 * @return IServiceRegistry
	 */
	abstract protected IServiceRegistry createRegistry();

}
