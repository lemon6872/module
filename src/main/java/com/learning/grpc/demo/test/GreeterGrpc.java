package com.learning.grpc.demo.test;

import com.page.awesome.dto.proto.HelloReply;
import com.page.awesome.dto.proto.HelloRequest;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.15.0)",
    comments = "Source: helloWord.proto")
public class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "Greeter";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<HelloRequest,
          HelloReply> METHOD_SAY_HELLO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "Greeter", "SayHello"),
          io.grpc.protobuf.ProtoUtils.marshaller(HelloRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(HelloReply.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<HelloRequest,
      HelloReply> METHOD_SAY_HELLO_AGAIN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "Greeter", "SayHelloAgain"),
          io.grpc.protobuf.ProtoUtils.marshaller(HelloRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(HelloReply.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    return new GreeterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreeterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreeterFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  @Deprecated public static interface Greeter {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(HelloRequest request,
                         io.grpc.stub.StreamObserver<HelloReply> responseObserver);

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public void sayHelloAgain(HelloRequest request,
                              io.grpc.stub.StreamObserver<HelloReply> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class GreeterImplBase implements Greeter, io.grpc.BindableService {

    @Override
    public void sayHello(HelloRequest request,
                         io.grpc.stub.StreamObserver<HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAY_HELLO, responseObserver);
    }

    @Override
    public void sayHelloAgain(HelloRequest request,
                              io.grpc.stub.StreamObserver<HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAY_HELLO_AGAIN, responseObserver);
    }

    @Override public io.grpc.ServerServiceDefinition bindService() {
      return GreeterGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  @Deprecated public static interface GreeterBlockingClient {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public HelloReply sayHello(HelloRequest request);

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public HelloReply sayHelloAgain(HelloRequest request);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  @Deprecated public static interface GreeterFutureClient {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<HelloReply> sayHello(
            HelloRequest request);

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<HelloReply> sayHelloAgain(
            HelloRequest request);
  }

  public static class GreeterStub extends io.grpc.stub.AbstractStub<GreeterStub>
      implements Greeter {
    private GreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    @Override
    public void sayHello(HelloRequest request,
                         io.grpc.stub.StreamObserver<HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO, getCallOptions()), request, responseObserver);
    }

    @Override
    public void sayHelloAgain(HelloRequest request,
                              io.grpc.stub.StreamObserver<HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO_AGAIN, getCallOptions()), request, responseObserver);
    }
  }

  public static class GreeterBlockingStub extends io.grpc.stub.AbstractStub<GreeterBlockingStub>
      implements GreeterBlockingClient {
    private GreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    @Override
    public HelloReply sayHello(HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAY_HELLO, getCallOptions(), request);
    }

    @Override
    public HelloReply sayHelloAgain(HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAY_HELLO_AGAIN, getCallOptions(), request);
    }
  }

  public static class GreeterFutureStub extends io.grpc.stub.AbstractStub<GreeterFutureStub>
      implements GreeterFutureClient {
    private GreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    @Override
    public com.google.common.util.concurrent.ListenableFuture<HelloReply> sayHello(
        HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO, getCallOptions()), request);
    }

    @Override
    public com.google.common.util.concurrent.ListenableFuture<HelloReply> sayHelloAgain(
        HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO_AGAIN, getCallOptions()), request);
    }
  }

  @Deprecated public static abstract class AbstractGreeter extends GreeterImplBase {}

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_HELLO_AGAIN = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Greeter serviceImpl;
    private final int methodId;

    public MethodHandlers(Greeter serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((HelloRequest) request,
              (io.grpc.stub.StreamObserver<HelloReply>) responseObserver);
          break;
        case METHODID_SAY_HELLO_AGAIN:
          serviceImpl.sayHelloAgain((HelloRequest) request,
              (io.grpc.stub.StreamObserver<HelloReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_SAY_HELLO,
        METHOD_SAY_HELLO_AGAIN);
  }

  @Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final Greeter serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_SAY_HELLO,
          asyncUnaryCall(
            new MethodHandlers<
              HelloRequest,
              HelloReply>(
                serviceImpl, METHODID_SAY_HELLO)))
        .addMethod(
          METHOD_SAY_HELLO_AGAIN,
          asyncUnaryCall(
            new MethodHandlers<
              HelloRequest,
              HelloReply>(
                serviceImpl, METHODID_SAY_HELLO_AGAIN)))
        .build();
  }
}
