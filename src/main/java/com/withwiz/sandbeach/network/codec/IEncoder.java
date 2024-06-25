package com.withwiz.sandbeach.network.codec;

import com.withwiz.sandbeach.network.exception.CodecException;
import com.withwiz.sandbeach.network.exception.CodecException;

/**
 * encoder interface
 */
public interface IEncoder<TYPE_SOURCE, TYPE_ENCODED> {
    /**
     * create a TYPE_ENCODED instance from source
     *
     * @param source source
     * @return TYPE_ENCODED
     */
    TYPE_ENCODED encode(TYPE_SOURCE source) throws CodecException;
}
