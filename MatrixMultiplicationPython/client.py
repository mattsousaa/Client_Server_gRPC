import grpc
import time

# import the generated classes
import calculator_pb2
import calculator_pb2_grpc

# open a gRPC channel
channel = grpc.insecure_channel('localhost:50051')

# create a stub (client)
stub = calculator_pb2_grpc.CalculatorStub(channel)

# define the rows and columns
row1 = 7
col1 = 8
row2 = 8
col2 = 2

start = time.clock()

# create a valid request message
number = calculator_pb2.Number(value1=row1, value2=col1, value3=row2, value4=col2)

# make the call
response = stub.MatMult(number)

print("Matriz resultante: ")
print('Ordem: {one}x{two}'.format(one=row1,two=col2))

# you make it
print(response.msg)

print time.clock() - start