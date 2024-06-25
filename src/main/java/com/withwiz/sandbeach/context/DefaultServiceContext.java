package com.withwiz.sandbeach.context;

import com.withwiz.sandbeach.registry.DefaultServiceRegistry;
import com.withwiz.sandbeach.registry.IServiceRegistry;

/**
 * Default service context class.<BR/>
 * Created by uni4love on 2014.04.02..
 */
public class DefaultServiceContext extends AGenericServiceContext
{
    /**
     * constructor
     */
    public DefaultServiceContext()
    {
    }

    @Override
    protected IServiceRegistry createRegistry() {
        return new DefaultServiceRegistry();
    }
}
