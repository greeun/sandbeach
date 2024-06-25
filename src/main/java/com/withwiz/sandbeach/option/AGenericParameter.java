package com.withwiz.sandbeach.option;

/**
 * parameter abstract class.<BR/>
 * Created by uni4love on 2010. 3. 12..
 */
abstract public class AGenericParameter<N, V> implements IParameter
{
	/**
	 * return parameter name<BR/>
	 * 
	 * @return name
	 */
	abstract public N getName();

	/**
	 * return parameter value<BR/>
	 * 
	 * @return
	 */
	abstract public V getValue();
}
