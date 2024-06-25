package com.withwiz.sandbeach.network.tcp.message;

/**
 * Network message abstract class.<BR/>
 */
abstract public class ANetworkMessage implements INetworkMessage {
    /**
     * header
     */
    private AHeaderMessage header;

    /**
     * body
     */
    private ABodyMessage body;

    @Override
    public IHeaderMessage getHeader() {
        return header;
    }

    @Override
    public IBodyMessage getBody() {
        return body;
    }

}
