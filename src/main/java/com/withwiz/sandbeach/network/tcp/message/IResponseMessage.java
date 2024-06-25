package com.withwiz.sandbeach.network.tcp.message;

/**
 * Response message interface.<BR/>
 */
public interface IResponseMessage extends INetworkMessage {
    /**
     * return a status code.<BR/>
     *
     * @return status code
     */
    int getStatusCode();
}
