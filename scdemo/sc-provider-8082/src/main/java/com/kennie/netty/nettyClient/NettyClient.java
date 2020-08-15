package com.kennie.netty.nettyClient;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NettyClient {

    private final String host;
    private final int port;

    public NettyClient(String host, int port){
        this.host = host;
        this.port = port;
    }


    public void connect() throws Exception {

        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();

        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(eventLoopGroup)
                    .channel(NioSocketChannel.class)
                    .handler(new SimpleChatClientInitializer());

            Channel channel = bootstrap.connect(host,port).sync().channel();

            //定义向服务器发送的内容  system.in  控制台输入   in.readLine() 获取值 每次读一行。换句话说，用户输入一行内容，然后回车，这些内容一次性读取进来。
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            while(true){
                //writeAndFlush()方法分为两步, 先 write 再 flush
                channel.writeAndFlush(in.readLine() + "\r\n");
            }
        } finally {

            eventLoopGroup.shutdownGracefully();

        }

    }

    public static void main(String[] args) throws Exception {
        new NettyClient("localhost", 8090).connect();
    }
}
