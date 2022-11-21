package com.adel.springgrpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
