package com.codenotefound;

import com.codenotfound.grpc.helloworld.Number;
import com.codenotfound.grpc.helloworld.CalculatorReponse;
import com.codenotfound.grpc.helloworld.CalculatorRequest;
import com.codenotfound.grpc.helloworld.CalculatorGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
            .usePlaintext()
            .build();

        CalculatorGrpc.CalculatorBlockingStub stub 
          = CalculatorGrpc.newBlockingStub(channel);

       Number result = stub.squareRoot(Number.newBuilder() .setValue(36) .build());

       System.out.println("Response received from server:\n" + result);

        channel.shutdown();
    }
}