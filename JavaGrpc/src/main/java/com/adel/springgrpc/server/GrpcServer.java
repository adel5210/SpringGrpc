package com.adel.springgrpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Slf4j
public class GrpcServer {

    public void runServer() throws IOException, InterruptedException {
        log.info("Running GRPC server");
        final Server server = ServerBuilder
                .forPort(8080)
                .addService(new HelloServiceImpl())
                .build();

        server.start();
        server.awaitTermination();
    }

}
