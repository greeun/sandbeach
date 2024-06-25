package com.withwiz.sandbeach.network.client.netty;

import com.withwiz.sandbeach.network.server.netty.util.NettyNetworkUtil;
import io.netty.bootstrap.Bootstrap;

/**
 * netty client with Unix Domain Socket
 */
public abstract class AbstractNettyUnixDomainSocketClient extends AbstractNettyClient {

    @Override
    public Bootstrap createBootstrap() {
        return new Bootstrap().group(getWorkerEventLoopGroup(getWorkerThreadSize()))
                .channel(NettyNetworkUtil.getClientSocketChannelClass(isUseNativeIO(), isUseUds()))
                .handler(getServiceHandler());
    }

    /**
     * get use uds(Unix Domain Socket).<BR>
     *
     * @return true/false
     */
    public abstract boolean isUseUds();
}
