package com.withwiz.sandbeach.message;

/**
 * delivery message interface<BR/>
 * Created by uni4love on 2010. 3. 30..
 */
public interface IDeliveryMessage<K, V> extends IMessage
{
	/**
	 * add key-value.
	 *
	 * @param key
	 *            key
	 * @param value
	 *            value
	 * @return added value
	 */
	void addValue(K key, V value);

	/**
	 * get value by key.
	 *
	 * @param key
	 *            key
	 * @return value
	 */
	V getValue(K key);

	/**
	 * get key list.
	 *
	 * @return key list String[]
	 */
	String[] getKeys();

	/**
	 * clear key-value store.
	 */
	void clear();

	/**
	 * return the key contain status
	 * 
	 * @param key
	 *            key
	 * @return status
	 */
	boolean containsKey(K key);
}
