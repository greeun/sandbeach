package com.withwiz.sandbeach.option;

/**
 * default parameter class.<BR/>
 * Created by uni4love on 2010. 3. 12..
 */
public class DefaultParameter<V> extends AGenericParameter<String, V>
{
	/**
	 * parameter name
	 */
	protected String	name;

	/**
	 * parameter value
	 */
	protected V			value;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public V getValue()
	{
		return value;
	}

	public void setValue(V value)
	{
		this.value = value;
	}

	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer("--Parameter(N:V): ").append(name)
				.append(':').append(value).append("\n");
		return sb.toString();
	}
}
