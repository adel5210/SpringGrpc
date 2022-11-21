package com.adel.springgrpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        runServer();
    }

    public static void runServer() throws IOException, InterruptedException {
        System.out.println("Running GRPC server");
        final Server server = ServerBuilder
                .forPort(8080)
                .addService(new HelloServiceImpl())
                .build();

        server.start();
        server.awaitTermination();
    }

}
