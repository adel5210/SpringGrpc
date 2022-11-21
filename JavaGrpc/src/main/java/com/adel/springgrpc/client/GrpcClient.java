package com.adel.springgrpc.client;

import com.adel.springgrpc.HelloRequest;
import com.adel.springgrpc.HelloResponse;
import com.adel.springgrpc.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

    public static void main(String[] args) {
        executeGrpcClient();
    }

    public static void executeGrpcClient(){
        final ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        final HelloServiceGrpc.HelloServiceBlockingStub stub =
                HelloServiceGrpc.newBlockingStub(channel);

        final HelloResponse helloResponse = stub.hello(HelloRequest.newBuilder()
                .setFirstName("Adel")
                .setLastName(" GRPC ")
                .build());

        System.out.println("Response receive\n"+helloResponse);
        channel.shutdown();
    }
}
