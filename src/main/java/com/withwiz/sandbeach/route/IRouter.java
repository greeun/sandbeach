package com.withwiz.sandbeach.route;

/**
 * router interface>BR/>
 * Created by uni4love on 2010. 4. 20..
 */
public interface IRouter<T>
{
    /**
     * This method must implement for target action.
     */
    void route(T... str);
}
