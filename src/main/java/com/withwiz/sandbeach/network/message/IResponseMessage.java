package com.withwiz.sandbeach.network.message;

/**
 * Response message object common interface
 */
public interface IResponseMessage extends IMessage {
    /**
     * get message header
     *
     * @return IResponseMessageHeader
     */
    @Override
    IResponseMessageHeader getHeader();

    /**
     * get message body
     *
     * @return IResponseMessageBody
     */
    @Override
    IResponseMessageBody getBody();
}
