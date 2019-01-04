package org.mattsousaa.boot;

import org.mattsousaa.boot.mat_mult.Number;
import org.mattsousaa.boot.mat_mult.CalculatorGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
	public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
            .usePlaintext()
            .build();

        CalculatorGrpc.CalculatorBlockingStub stub 
          = CalculatorGrpc.newBlockingStub(channel);
    
        int row1 = 7;
        int col1 = 8;
        int row2 = 8;
        int col2 = 2;
        
      Number result = stub.matMult(Number.newBuilder() 
    		   .setValue1(row1) 
    		   .setValue2(col1) 
    		   .setValue3(row2) 
    		   .setValue4(col2) 
    		   .build());

       System.out.println("Response received from server:\n" + result);

        channel.shutdown();
        
	}
	
}
