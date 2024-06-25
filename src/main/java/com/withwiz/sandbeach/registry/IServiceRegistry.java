package com.withwiz.sandbeach.registry;

import com.withwiz.sandbeach.service.IService;

/**
 * ServiceRegistry interface<BR/>
 * Created by uni4love on 2010. 1. 15..
 */
public interface IServiceRegistry<K> extends IRegistry
{
	/**
	 * register service<BR/>
	 * 
	 * @param key
	 *            key for service
	 * @param service
	 *            IService interface
	 */
	void registerService(K key, IService service);

	/**
	 * unregister service<BR/>
	 * 
	 * @param key
	 *            service class name(ex: class name with full package name)
	 * @return unregistered service
	 */
	IService unregisterService(String key);

	/**
	 * get service<BR/>
	 * 
	 * @param key
	 *            key for service
	 * @return IService
	 */
	IService getService(String key);
}
