package com.withwiz.sandbeach.network.tcp.message;

/**
 * Network message interface.<BR/>
 */
public interface INetworkMessage {
    /**
     * return a header.<BR/>
     *
     * @return header
     */
    IHeaderMessage getHeader();

    /**
     * return a body.<BR/>
     *
     * @return body
     */
    IBodyMessage getBody();
}
