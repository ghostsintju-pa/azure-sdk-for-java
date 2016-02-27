/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodybyte;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import fixtures.bodybyte.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in ByteOperations.
 */
public final class ByteOperationsImpl implements ByteOperations {
    /** The Retrofit service to perform REST calls. */
    private ByteService service;
    /** The service client containing this operation class. */
    private AutoRestSwaggerBATByteService client;

    /**
     * Initializes an instance of ByteOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ByteOperationsImpl(Retrofit retrofit, AutoRestSwaggerBATByteService client) {
        this.service = retrofit.create(ByteService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ByteOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ByteService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("byte/null")
        Call<ResponseBody> getNull();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("byte/empty")
        Call<ResponseBody> getEmpty();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("byte/nonAscii")
        Call<ResponseBody> getNonAscii();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("byte/nonAscii")
        Call<ResponseBody> putNonAscii(@Body byte[] byteBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("byte/invalid")
        Call<ResponseBody> getInvalid();

    }

    /**
     * Get null byte value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the byte[] object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<byte[]> getNull() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getNull();
        return getNullDelegate(call.execute());
    }

    /**
     * Get null byte value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getNullAsync(final ServiceCallback<byte[]> serviceCallback) {
        Call<ResponseBody> call = service.getNull();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<byte[]>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getNullDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<byte[]> getNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<byte[], ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<byte[]>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get empty byte value ''.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the byte[] object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<byte[]> getEmpty() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getEmpty();
        return getEmptyDelegate(call.execute());
    }

    /**
     * Get empty byte value ''.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getEmptyAsync(final ServiceCallback<byte[]> serviceCallback) {
        Call<ResponseBody> call = service.getEmpty();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<byte[]>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getEmptyDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<byte[]> getEmptyDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<byte[], ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<byte[]>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the byte[] object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<byte[]> getNonAscii() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getNonAscii();
        return getNonAsciiDelegate(call.execute());
    }

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getNonAsciiAsync(final ServiceCallback<byte[]> serviceCallback) {
        Call<ResponseBody> call = service.getNonAscii();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<byte[]>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getNonAsciiDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<byte[]> getNonAsciiDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<byte[], ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<byte[]>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putNonAscii(byte[] byteBody) throws ErrorException, IOException, IllegalArgumentException {
        if (byteBody == null) {
            throw new IllegalArgumentException("Parameter byteBody is required and cannot be null.");
        }
        Call<ResponseBody> call = service.putNonAscii(byteBody);
        return putNonAsciiDelegate(call.execute());
    }

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall putNonAsciiAsync(byte[] byteBody, final ServiceCallback<Void> serviceCallback) {
        if (byteBody == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter byteBody is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.putNonAscii(byteBody);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putNonAsciiDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putNonAsciiDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get invalid byte value ':::SWAGGER::::'.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the byte[] object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<byte[]> getInvalid() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getInvalid();
        return getInvalidDelegate(call.execute());
    }

    /**
     * Get invalid byte value ':::SWAGGER::::'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall getInvalidAsync(final ServiceCallback<byte[]> serviceCallback) {
        Call<ResponseBody> call = service.getInvalid();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<byte[]>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getInvalidDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<byte[]> getInvalidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<byte[], ErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<byte[]>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
