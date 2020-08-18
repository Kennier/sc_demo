package com.kennie.netty.nettyServer;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

public class SimpleChatServerInitializer extends ChannelInitializer<SocketChannel> {


    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline channelPipeline = socketChannel.pipeline();

        channelPipeline.addLast("HttpServerCodec",new HttpServerCodec())
                .addLast(new HttpObjectAggregator(1024 * 64))
//                .addLast("decoder", new StringDecoder())
//                .addLast("encoder", new StringEncoder())
                .addLast(new WebSocketServerProtocolHandler("/ws"))
                .addLast("selfHandler", new SimpleChatServerHandler());

        System.out.println("SimpleChatClient:"+socketChannel.remoteAddress() +"连接上");
    }
}
