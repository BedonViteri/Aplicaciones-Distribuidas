package ec.edu.uteq.distribuidas.grpc.gen;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * -- Definicion del servicio gRPC -------------------
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mensajeria.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServicioMensajeriaGrpc {

  private ServicioMensajeriaGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ec.edu.uteq.distribuidas.grpc.ServicioMensajeria";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje,
      ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje> getEnviarMensajeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnviarMensaje",
      requestType = ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje.class,
      responseType = ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje,
      ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje> getEnviarMensajeMethod() {
    io.grpc.MethodDescriptor<ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje, ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje> getEnviarMensajeMethod;
    if ((getEnviarMensajeMethod = ServicioMensajeriaGrpc.getEnviarMensajeMethod) == null) {
      synchronized (ServicioMensajeriaGrpc.class) {
        if ((getEnviarMensajeMethod = ServicioMensajeriaGrpc.getEnviarMensajeMethod) == null) {
          ServicioMensajeriaGrpc.getEnviarMensajeMethod = getEnviarMensajeMethod =
              io.grpc.MethodDescriptor.<ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje, ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnviarMensaje"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje.getDefaultInstance()))
              .setSchemaDescriptor(new ServicioMensajeriaMethodDescriptorSupplier("EnviarMensaje"))
              .build();
        }
      }
    }
    return getEnviarMensajeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ec.edu.uteq.distribuidas.grpc.gen.SolicitudStream,
      ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje> getRecibirNoticiasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecibirNoticias",
      requestType = ec.edu.uteq.distribuidas.grpc.gen.SolicitudStream.class,
      responseType = ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ec.edu.uteq.distribuidas.grpc.gen.SolicitudStream,
      ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje> getRecibirNoticiasMethod() {
    io.grpc.MethodDescriptor<ec.edu.uteq.distribuidas.grpc.gen.SolicitudStream, ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje> getRecibirNoticiasMethod;
    if ((getRecibirNoticiasMethod = ServicioMensajeriaGrpc.getRecibirNoticiasMethod) == null) {
      synchronized (ServicioMensajeriaGrpc.class) {
        if ((getRecibirNoticiasMethod = ServicioMensajeriaGrpc.getRecibirNoticiasMethod) == null) {
          ServicioMensajeriaGrpc.getRecibirNoticiasMethod = getRecibirNoticiasMethod =
              io.grpc.MethodDescriptor.<ec.edu.uteq.distribuidas.grpc.gen.SolicitudStream, ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecibirNoticias"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ec.edu.uteq.distribuidas.grpc.gen.SolicitudStream.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje.getDefaultInstance()))
              .setSchemaDescriptor(new ServicioMensajeriaMethodDescriptorSupplier("RecibirNoticias"))
              .build();
        }
      }
    }
    return getRecibirNoticiasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje,
      ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje> getChatBidireccionalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChatBidireccional",
      requestType = ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje.class,
      responseType = ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje,
      ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje> getChatBidireccionalMethod() {
    io.grpc.MethodDescriptor<ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje, ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje> getChatBidireccionalMethod;
    if ((getChatBidireccionalMethod = ServicioMensajeriaGrpc.getChatBidireccionalMethod) == null) {
      synchronized (ServicioMensajeriaGrpc.class) {
        if ((getChatBidireccionalMethod = ServicioMensajeriaGrpc.getChatBidireccionalMethod) == null) {
          ServicioMensajeriaGrpc.getChatBidireccionalMethod = getChatBidireccionalMethod =
              io.grpc.MethodDescriptor.<ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje, ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChatBidireccional"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje.getDefaultInstance()))
              .setSchemaDescriptor(new ServicioMensajeriaMethodDescriptorSupplier("ChatBidireccional"))
              .build();
        }
      }
    }
    return getChatBidireccionalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServicioMensajeriaStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServicioMensajeriaStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServicioMensajeriaStub>() {
        @java.lang.Override
        public ServicioMensajeriaStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServicioMensajeriaStub(channel, callOptions);
        }
      };
    return ServicioMensajeriaStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServicioMensajeriaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServicioMensajeriaBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServicioMensajeriaBlockingStub>() {
        @java.lang.Override
        public ServicioMensajeriaBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServicioMensajeriaBlockingStub(channel, callOptions);
        }
      };
    return ServicioMensajeriaBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServicioMensajeriaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServicioMensajeriaFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServicioMensajeriaFutureStub>() {
        @java.lang.Override
        public ServicioMensajeriaFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServicioMensajeriaFutureStub(channel, callOptions);
        }
      };
    return ServicioMensajeriaFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * -- Definicion del servicio gRPC -------------------
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Llamada unaria
     * </pre>
     */
    default void enviarMensaje(ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje request,
        io.grpc.stub.StreamObserver<ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnviarMensajeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server streaming
     * </pre>
     */
    default void recibirNoticias(ec.edu.uteq.distribuidas.grpc.gen.SolicitudStream request,
        io.grpc.stub.StreamObserver<ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecibirNoticiasMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidireccional
     * </pre>
     */
    default io.grpc.stub.StreamObserver<ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje> chatBidireccional(
        io.grpc.stub.StreamObserver<ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getChatBidireccionalMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ServicioMensajeria.
   * <pre>
   * -- Definicion del servicio gRPC -------------------
   * </pre>
   */
  public static abstract class ServicioMensajeriaImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServicioMensajeriaGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ServicioMensajeria.
   * <pre>
   * -- Definicion del servicio gRPC -------------------
   * </pre>
   */
  public static final class ServicioMensajeriaStub
      extends io.grpc.stub.AbstractAsyncStub<ServicioMensajeriaStub> {
    private ServicioMensajeriaStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServicioMensajeriaStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServicioMensajeriaStub(channel, callOptions);
    }

    /**
     * <pre>
     * Llamada unaria
     * </pre>
     */
    public void enviarMensaje(ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje request,
        io.grpc.stub.StreamObserver<ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnviarMensajeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server streaming
     * </pre>
     */
    public void recibirNoticias(ec.edu.uteq.distribuidas.grpc.gen.SolicitudStream request,
        io.grpc.stub.StreamObserver<ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getRecibirNoticiasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bidireccional
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje> chatBidireccional(
        io.grpc.stub.StreamObserver<ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getChatBidireccionalMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ServicioMensajeria.
   * <pre>
   * -- Definicion del servicio gRPC -------------------
   * </pre>
   */
  public static final class ServicioMensajeriaBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServicioMensajeriaBlockingStub> {
    private ServicioMensajeriaBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServicioMensajeriaBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServicioMensajeriaBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Llamada unaria
     * </pre>
     */
    public ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje enviarMensaje(ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnviarMensajeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server streaming
     * </pre>
     */
    public java.util.Iterator<ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje> recibirNoticias(
        ec.edu.uteq.distribuidas.grpc.gen.SolicitudStream request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getRecibirNoticiasMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ServicioMensajeria.
   * <pre>
   * -- Definicion del servicio gRPC -------------------
   * </pre>
   */
  public static final class ServicioMensajeriaFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServicioMensajeriaFutureStub> {
    private ServicioMensajeriaFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServicioMensajeriaFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServicioMensajeriaFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Llamada unaria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje> enviarMensaje(
        ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnviarMensajeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENVIAR_MENSAJE = 0;
  private static final int METHODID_RECIBIR_NOTICIAS = 1;
  private static final int METHODID_CHAT_BIDIRECCIONAL = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENVIAR_MENSAJE:
          serviceImpl.enviarMensaje((ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje) request,
              (io.grpc.stub.StreamObserver<ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje>) responseObserver);
          break;
        case METHODID_RECIBIR_NOTICIAS:
          serviceImpl.recibirNoticias((ec.edu.uteq.distribuidas.grpc.gen.SolicitudStream) request,
              (io.grpc.stub.StreamObserver<ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHAT_BIDIRECCIONAL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.chatBidireccional(
              (io.grpc.stub.StreamObserver<ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getEnviarMensajeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje,
              ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje>(
                service, METHODID_ENVIAR_MENSAJE)))
        .addMethod(
          getRecibirNoticiasMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              ec.edu.uteq.distribuidas.grpc.gen.SolicitudStream,
              ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje>(
                service, METHODID_RECIBIR_NOTICIAS)))
        .addMethod(
          getChatBidireccionalMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              ec.edu.uteq.distribuidas.grpc.gen.SolicitudMensaje,
              ec.edu.uteq.distribuidas.grpc.gen.RespuestaMensaje>(
                service, METHODID_CHAT_BIDIRECCIONAL)))
        .build();
  }

  private static abstract class ServicioMensajeriaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServicioMensajeriaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ec.edu.uteq.distribuidas.grpc.gen.MensajeriaProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServicioMensajeria");
    }
  }

  private static final class ServicioMensajeriaFileDescriptorSupplier
      extends ServicioMensajeriaBaseDescriptorSupplier {
    ServicioMensajeriaFileDescriptorSupplier() {}
  }

  private static final class ServicioMensajeriaMethodDescriptorSupplier
      extends ServicioMensajeriaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ServicioMensajeriaMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ServicioMensajeriaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServicioMensajeriaFileDescriptorSupplier())
              .addMethod(getEnviarMensajeMethod())
              .addMethod(getRecibirNoticiasMethod())
              .addMethod(getChatBidireccionalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
