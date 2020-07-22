/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License.
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.azure.digitaltwins.core.implementation;

import retrofit2.Retrofit;
import com.azure.digitaltwins.core.EventRoutes;
import com.azure.digitaltwins.core.models.ErrorResponseException;
import com.azure.digitaltwins.core.models.EventRoute;
import com.azure.digitaltwins.core.models.EventRouteCollection;
import com.azure.digitaltwins.core.models.EventRoutesListOptions;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in EventRoutes.
 */
public class EventRoutesImpl implements EventRoutes {
    /** The Retrofit service to perform REST calls. */
    private EventRoutesService service;
    /** The service client containing this operation class. */
    private AzureDigitalTwinsAPIImpl client;

    /**
     * Initializes an instance of EventRoutes.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public EventRoutesImpl(Retrofit retrofit, AzureDigitalTwinsAPIImpl client) {
        this.service = retrofit.create(EventRoutesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for EventRoutes to be
     * used by Retrofit to perform actually REST calls.
     */
    interface EventRoutesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.azure.digitaltwins.core.EventRoutes list" })
        @GET("eventroutes")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("x-ms-max-item-count") Integer maxItemCount);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.azure.digitaltwins.core.EventRoutes getById" })
        @GET("eventroutes/{id}")
        Observable<Response<ResponseBody>> getById(@Path("id") String id, @Query("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.azure.digitaltwins.core.EventRoutes add" })
        @PUT("eventroutes/{id}")
        Observable<Response<ResponseBody>> add(@Path("id") String id, @Body EventRoute eventRoute, @Query("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.azure.digitaltwins.core.EventRoutes delete" })
        @HTTP(path = "eventroutes/{id}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("id") String id, @Query("api-version") String apiVersion);

    }

    /**
     * Retrieves all event routes.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EventRouteCollection object if successful.
     */
    public EventRouteCollection list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Retrieves all event routes.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EventRouteCollection> listAsync(final ServiceCallback<EventRouteCollection> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Retrieves all event routes.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventRouteCollection object
     */
    public Observable<EventRouteCollection> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<EventRouteCollection>, EventRouteCollection>() {
            @Override
            public EventRouteCollection call(ServiceResponse<EventRouteCollection> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves all event routes.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventRouteCollection object
     */
    public Observable<ServiceResponse<EventRouteCollection>> listWithServiceResponseAsync() {
        final EventRoutesListOptions eventRoutesListOptions = null;
        Integer maxItemCount = null;
        return service.list(this.client.apiVersion(), maxItemCount)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EventRouteCollection>>>() {
                @Override
                public Observable<ServiceResponse<EventRouteCollection>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EventRouteCollection> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Retrieves all event routes.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param eventRoutesListOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EventRouteCollection object if successful.
     */
    public EventRouteCollection list(EventRoutesListOptions eventRoutesListOptions) {
        return listWithServiceResponseAsync(eventRoutesListOptions).toBlocking().single().body();
    }

    /**
     * Retrieves all event routes.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param eventRoutesListOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EventRouteCollection> listAsync(EventRoutesListOptions eventRoutesListOptions, final ServiceCallback<EventRouteCollection> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(eventRoutesListOptions), serviceCallback);
    }

    /**
     * Retrieves all event routes.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param eventRoutesListOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventRouteCollection object
     */
    public Observable<EventRouteCollection> listAsync(EventRoutesListOptions eventRoutesListOptions) {
        return listWithServiceResponseAsync(eventRoutesListOptions).map(new Func1<ServiceResponse<EventRouteCollection>, EventRouteCollection>() {
            @Override
            public EventRouteCollection call(ServiceResponse<EventRouteCollection> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves all event routes.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param eventRoutesListOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventRouteCollection object
     */
    public Observable<ServiceResponse<EventRouteCollection>> listWithServiceResponseAsync(EventRoutesListOptions eventRoutesListOptions) {
        Validator.validate(eventRoutesListOptions);
        Integer maxItemCount = null;
        if (eventRoutesListOptions != null) {
            maxItemCount = eventRoutesListOptions.maxItemCount();
        }
        return service.list(this.client.apiVersion(), maxItemCount)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EventRouteCollection>>>() {
                @Override
                public Observable<ServiceResponse<EventRouteCollection>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EventRouteCollection> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<EventRouteCollection> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<EventRouteCollection, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<EventRouteCollection>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Retrieves an event route.
     Status codes:
     200 (OK): Success.
     404 (Not Found): There is no event route with the provided id.
     *
     * @param id The id for an event route. The id is unique within event routes and case sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EventRoute object if successful.
     */
    public EventRoute getById(String id) {
        return getByIdWithServiceResponseAsync(id).toBlocking().single().body();
    }

    /**
     * Retrieves an event route.
     Status codes:
     200 (OK): Success.
     404 (Not Found): There is no event route with the provided id.
     *
     * @param id The id for an event route. The id is unique within event routes and case sensitive.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EventRoute> getByIdAsync(String id, final ServiceCallback<EventRoute> serviceCallback) {
        return ServiceFuture.fromResponse(getByIdWithServiceResponseAsync(id), serviceCallback);
    }

    /**
     * Retrieves an event route.
     Status codes:
     200 (OK): Success.
     404 (Not Found): There is no event route with the provided id.
     *
     * @param id The id for an event route. The id is unique within event routes and case sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventRoute object
     */
    public Observable<EventRoute> getByIdAsync(String id) {
        return getByIdWithServiceResponseAsync(id).map(new Func1<ServiceResponse<EventRoute>, EventRoute>() {
            @Override
            public EventRoute call(ServiceResponse<EventRoute> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves an event route.
     Status codes:
     200 (OK): Success.
     404 (Not Found): There is no event route with the provided id.
     *
     * @param id The id for an event route. The id is unique within event routes and case sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventRoute object
     */
    public Observable<ServiceResponse<EventRoute>> getByIdWithServiceResponseAsync(String id) {
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        return service.getById(id, this.client.apiVersion())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EventRoute>>>() {
                @Override
                public Observable<ServiceResponse<EventRoute>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EventRoute> clientResponse = getByIdDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<EventRoute> getByIdDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<EventRoute, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<EventRoute>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Adds or replaces an event route.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param id The id for an event route. The id is unique within event routes and case sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void add(String id) {
        addWithServiceResponseAsync(id).toBlocking().single().body();
    }

    /**
     * Adds or replaces an event route.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param id The id for an event route. The id is unique within event routes and case sensitive.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> addAsync(String id, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(addWithServiceResponseAsync(id), serviceCallback);
    }

    /**
     * Adds or replaces an event route.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param id The id for an event route. The id is unique within event routes and case sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> addAsync(String id) {
        return addWithServiceResponseAsync(id).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Adds or replaces an event route.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param id The id for an event route. The id is unique within event routes and case sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> addWithServiceResponseAsync(String id) {
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        final EventRoute eventRoute = null;
        return service.add(id, eventRoute, this.client.apiVersion())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = addDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Adds or replaces an event route.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param id The id for an event route. The id is unique within event routes and case sensitive.
     * @param eventRoute The event route data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void add(String id, EventRoute eventRoute) {
        addWithServiceResponseAsync(id, eventRoute).toBlocking().single().body();
    }

    /**
     * Adds or replaces an event route.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param id The id for an event route. The id is unique within event routes and case sensitive.
     * @param eventRoute The event route data
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> addAsync(String id, EventRoute eventRoute, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(addWithServiceResponseAsync(id, eventRoute), serviceCallback);
    }

    /**
     * Adds or replaces an event route.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param id The id for an event route. The id is unique within event routes and case sensitive.
     * @param eventRoute The event route data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> addAsync(String id, EventRoute eventRoute) {
        return addWithServiceResponseAsync(id, eventRoute).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Adds or replaces an event route.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param id The id for an event route. The id is unique within event routes and case sensitive.
     * @param eventRoute The event route data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> addWithServiceResponseAsync(String id, EventRoute eventRoute) {
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        Validator.validate(eventRoute);
        return service.add(id, eventRoute, this.client.apiVersion())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = addDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> addDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Deletes an event route.
     Status codes:
     200 (OK): Success.
     404 (Not Found): There is no event route with the provided id.
     *
     * @param id The id for an event route. The id is unique within event routes and case sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String id) {
        deleteWithServiceResponseAsync(id).toBlocking().single().body();
    }

    /**
     * Deletes an event route.
     Status codes:
     200 (OK): Success.
     404 (Not Found): There is no event route with the provided id.
     *
     * @param id The id for an event route. The id is unique within event routes and case sensitive.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String id, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(id), serviceCallback);
    }

    /**
     * Deletes an event route.
     Status codes:
     200 (OK): Success.
     404 (Not Found): There is no event route with the provided id.
     *
     * @param id The id for an event route. The id is unique within event routes and case sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String id) {
        return deleteWithServiceResponseAsync(id).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes an event route.
     Status codes:
     200 (OK): Success.
     404 (Not Found): There is no event route with the provided id.
     *
     * @param id The id for an event route. The id is unique within event routes and case sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String id) {
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        return service.delete(id, this.client.apiVersion())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
