package com.adel.springgrpc;

import com.adel.springgrpc.server.HelloServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SpringGrpcApplication {

    public static void main(String[] args) {
        try{
            SpringApplication.run(SpringGrpcApplication.class, args);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
