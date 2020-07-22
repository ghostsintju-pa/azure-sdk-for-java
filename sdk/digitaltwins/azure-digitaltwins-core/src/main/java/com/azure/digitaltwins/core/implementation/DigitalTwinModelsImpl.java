/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License.
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.azure.digitaltwins.core.implementation;

import retrofit2.Retrofit;
import com.azure.digitaltwins.core.DigitalTwinModels;
import com.azure.digitaltwins.core.models.DigitalTwinModelsListOptions;
import com.azure.digitaltwins.core.models.ErrorResponseException;
import com.azure.digitaltwins.core.models.ModelData;
import com.azure.digitaltwins.core.models.PagedModelDataCollection;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.CollectionFormat;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in DigitalTwinModels.
 */
public class DigitalTwinModelsImpl implements DigitalTwinModels {
    /** The Retrofit service to perform REST calls. */
    private DigitalTwinModelsService service;
    /** The service client containing this operation class. */
    private AzureDigitalTwinsAPIImpl client;

    /**
     * Initializes an instance of DigitalTwinModels.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DigitalTwinModelsImpl(Retrofit retrofit, AzureDigitalTwinsAPIImpl client) {
        this.service = retrofit.create(DigitalTwinModelsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for DigitalTwinModels to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DigitalTwinModelsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.azure.digitaltwins.core.DigitalTwinModels add" })
        @POST("models")
        Observable<Response<ResponseBody>> add(@Body List<Object> models, @Query("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.azure.digitaltwins.core.DigitalTwinModels list" })
        @GET("models")
        Observable<Response<ResponseBody>> list(@Query("dependenciesFor") String dependenciesFor, @Query("includeModelDefinition") Boolean includeModelDefinition, @Query("api-version") String apiVersion, @Header("x-ms-max-item-count") Integer maxItemCount);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.azure.digitaltwins.core.DigitalTwinModels getById" })
        @GET("models/{id}")
        Observable<Response<ResponseBody>> getById(@Path("id") String id, @Query("includeModelDefinition") Boolean includeModelDefinition, @Query("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json-patch+json; charset=utf-8", "x-ms-logging-context: com.azure.digitaltwins.core.DigitalTwinModels update" })
        @PATCH("models/{id}")
        Observable<Response<ResponseBody>> update(@Path("id") String id, @Body List<Object> updateModel, @Query("api-version") String apiVersion);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.azure.digitaltwins.core.DigitalTwinModels delete" })
        @HTTP(path = "models/{id}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("id") String id, @Query("api-version") String apiVersion);

    }

    /**
     * Uploads one or more models. When any error occurs, no models are uploaded.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     409 (Conflict): One or more of the provided models already exist.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ModelData&gt; object if successful.
     */
    public List<ModelData> add() {
        return addWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Uploads one or more models. When any error occurs, no models are uploaded.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     409 (Conflict): One or more of the provided models already exist.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ModelData>> addAsync(final ServiceCallback<List<ModelData>> serviceCallback) {
        return ServiceFuture.fromResponse(addWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Uploads one or more models. When any error occurs, no models are uploaded.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     409 (Conflict): One or more of the provided models already exist.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ModelData&gt; object
     */
    public Observable<List<ModelData>> addAsync() {
        return addWithServiceResponseAsync().map(new Func1<ServiceResponse<List<ModelData>>, List<ModelData>>() {
            @Override
            public List<ModelData> call(ServiceResponse<List<ModelData>> response) {
                return response.body();
            }
        });
    }

    /**
     * Uploads one or more models. When any error occurs, no models are uploaded.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     409 (Conflict): One or more of the provided models already exist.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ModelData&gt; object
     */
    public Observable<ServiceResponse<List<ModelData>>> addWithServiceResponseAsync() {
        final List<Object> models = null;
        return service.add(models, this.client.apiVersion())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ModelData>>>>() {
                @Override
                public Observable<ServiceResponse<List<ModelData>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<ModelData>> clientResponse = addDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Uploads one or more models. When any error occurs, no models are uploaded.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     409 (Conflict): One or more of the provided models already exist.
     *
     * @param models An array of models to add.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ModelData&gt; object if successful.
     */
    public List<ModelData> add(List<Object> models) {
        return addWithServiceResponseAsync(models).toBlocking().single().body();
    }

    /**
     * Uploads one or more models. When any error occurs, no models are uploaded.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     409 (Conflict): One or more of the provided models already exist.
     *
     * @param models An array of models to add.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ModelData>> addAsync(List<Object> models, final ServiceCallback<List<ModelData>> serviceCallback) {
        return ServiceFuture.fromResponse(addWithServiceResponseAsync(models), serviceCallback);
    }

    /**
     * Uploads one or more models. When any error occurs, no models are uploaded.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     409 (Conflict): One or more of the provided models already exist.
     *
     * @param models An array of models to add.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ModelData&gt; object
     */
    public Observable<List<ModelData>> addAsync(List<Object> models) {
        return addWithServiceResponseAsync(models).map(new Func1<ServiceResponse<List<ModelData>>, List<ModelData>>() {
            @Override
            public List<ModelData> call(ServiceResponse<List<ModelData>> response) {
                return response.body();
            }
        });
    }

    /**
     * Uploads one or more models. When any error occurs, no models are uploaded.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     409 (Conflict): One or more of the provided models already exist.
     *
     * @param models An array of models to add.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ModelData&gt; object
     */
    public Observable<ServiceResponse<List<ModelData>>> addWithServiceResponseAsync(List<Object> models) {
        Validator.validate(models);
        return service.add(models, this.client.apiVersion())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ModelData>>>>() {
                @Override
                public Observable<ServiceResponse<List<ModelData>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<ModelData>> clientResponse = addDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<ModelData>> addDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<List<ModelData>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<ModelData>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Retrieves model metadata and, optionally, model definitions.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedModelDataCollection object if successful.
     */
    public PagedModelDataCollection list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Retrieves model metadata and, optionally, model definitions.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PagedModelDataCollection> listAsync(final ServiceCallback<PagedModelDataCollection> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Retrieves model metadata and, optionally, model definitions.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedModelDataCollection object
     */
    public Observable<PagedModelDataCollection> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<PagedModelDataCollection>, PagedModelDataCollection>() {
            @Override
            public PagedModelDataCollection call(ServiceResponse<PagedModelDataCollection> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves model metadata and, optionally, model definitions.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedModelDataCollection object
     */
    public Observable<ServiceResponse<PagedModelDataCollection>> listWithServiceResponseAsync() {
        final List<String> dependenciesFor = null;
        final Boolean includeModelDefinition = null;
        final DigitalTwinModelsListOptions digitalTwinModelsListOptions = null;
        Integer maxItemCount = null;
        String dependenciesForConverted = this.client.serializerAdapter().serializeList(dependenciesFor, CollectionFormat.MULTI);
        return service.list(dependenciesForConverted, includeModelDefinition, this.client.apiVersion(), maxItemCount)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PagedModelDataCollection>>>() {
                @Override
                public Observable<ServiceResponse<PagedModelDataCollection>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PagedModelDataCollection> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Retrieves model metadata and, optionally, model definitions.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param dependenciesFor The set of the models which will have their dependencies retrieved. If omitted, all models are retrieved.
     * @param includeModelDefinition When true the model definition will be returned as part of the result.
     * @param digitalTwinModelsListOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedModelDataCollection object if successful.
     */
    public PagedModelDataCollection list(List<String> dependenciesFor, Boolean includeModelDefinition, DigitalTwinModelsListOptions digitalTwinModelsListOptions) {
        return listWithServiceResponseAsync(dependenciesFor, includeModelDefinition, digitalTwinModelsListOptions).toBlocking().single().body();
    }

    /**
     * Retrieves model metadata and, optionally, model definitions.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param dependenciesFor The set of the models which will have their dependencies retrieved. If omitted, all models are retrieved.
     * @param includeModelDefinition When true the model definition will be returned as part of the result.
     * @param digitalTwinModelsListOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PagedModelDataCollection> listAsync(List<String> dependenciesFor, Boolean includeModelDefinition, DigitalTwinModelsListOptions digitalTwinModelsListOptions, final ServiceCallback<PagedModelDataCollection> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(dependenciesFor, includeModelDefinition, digitalTwinModelsListOptions), serviceCallback);
    }

    /**
     * Retrieves model metadata and, optionally, model definitions.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param dependenciesFor The set of the models which will have their dependencies retrieved. If omitted, all models are retrieved.
     * @param includeModelDefinition When true the model definition will be returned as part of the result.
     * @param digitalTwinModelsListOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedModelDataCollection object
     */
    public Observable<PagedModelDataCollection> listAsync(List<String> dependenciesFor, Boolean includeModelDefinition, DigitalTwinModelsListOptions digitalTwinModelsListOptions) {
        return listWithServiceResponseAsync(dependenciesFor, includeModelDefinition, digitalTwinModelsListOptions).map(new Func1<ServiceResponse<PagedModelDataCollection>, PagedModelDataCollection>() {
            @Override
            public PagedModelDataCollection call(ServiceResponse<PagedModelDataCollection> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves model metadata and, optionally, model definitions.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param dependenciesFor The set of the models which will have their dependencies retrieved. If omitted, all models are retrieved.
     * @param includeModelDefinition When true the model definition will be returned as part of the result.
     * @param digitalTwinModelsListOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedModelDataCollection object
     */
    public Observable<ServiceResponse<PagedModelDataCollection>> listWithServiceResponseAsync(List<String> dependenciesFor, Boolean includeModelDefinition, DigitalTwinModelsListOptions digitalTwinModelsListOptions) {
        Validator.validate(dependenciesFor);
        Validator.validate(digitalTwinModelsListOptions);
        Integer maxItemCount = null;
        if (digitalTwinModelsListOptions != null) {
            maxItemCount = digitalTwinModelsListOptions.maxItemCount();
        }
        String dependenciesForConverted = this.client.serializerAdapter().serializeList(dependenciesFor, CollectionFormat.MULTI);
        return service.list(dependenciesForConverted, includeModelDefinition, this.client.apiVersion(), maxItemCount)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PagedModelDataCollection>>>() {
                @Override
                public Observable<ServiceResponse<PagedModelDataCollection>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PagedModelDataCollection> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PagedModelDataCollection> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<PagedModelDataCollection, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PagedModelDataCollection>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Retrieves model metadata and optionally the model definition.
     Status codes:
     200 (OK): Success.
     404 (Not Found): There is no model with the provided id.
     *
     * @param id The id for the model. The id is globally unique and case sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ModelData object if successful.
     */
    public ModelData getById(String id) {
        return getByIdWithServiceResponseAsync(id).toBlocking().single().body();
    }

    /**
     * Retrieves model metadata and optionally the model definition.
     Status codes:
     200 (OK): Success.
     404 (Not Found): There is no model with the provided id.
     *
     * @param id The id for the model. The id is globally unique and case sensitive.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ModelData> getByIdAsync(String id, final ServiceCallback<ModelData> serviceCallback) {
        return ServiceFuture.fromResponse(getByIdWithServiceResponseAsync(id), serviceCallback);
    }

    /**
     * Retrieves model metadata and optionally the model definition.
     Status codes:
     200 (OK): Success.
     404 (Not Found): There is no model with the provided id.
     *
     * @param id The id for the model. The id is globally unique and case sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ModelData object
     */
    public Observable<ModelData> getByIdAsync(String id) {
        return getByIdWithServiceResponseAsync(id).map(new Func1<ServiceResponse<ModelData>, ModelData>() {
            @Override
            public ModelData call(ServiceResponse<ModelData> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves model metadata and optionally the model definition.
     Status codes:
     200 (OK): Success.
     404 (Not Found): There is no model with the provided id.
     *
     * @param id The id for the model. The id is globally unique and case sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ModelData object
     */
    public Observable<ServiceResponse<ModelData>> getByIdWithServiceResponseAsync(String id) {
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        final Boolean includeModelDefinition = null;
        return service.getById(id, includeModelDefinition, this.client.apiVersion())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ModelData>>>() {
                @Override
                public Observable<ServiceResponse<ModelData>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ModelData> clientResponse = getByIdDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Retrieves model metadata and optionally the model definition.
     Status codes:
     200 (OK): Success.
     404 (Not Found): There is no model with the provided id.
     *
     * @param id The id for the model. The id is globally unique and case sensitive.
     * @param includeModelDefinition When true the model definition will be returned as part of the result.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ModelData object if successful.
     */
    public ModelData getById(String id, Boolean includeModelDefinition) {
        return getByIdWithServiceResponseAsync(id, includeModelDefinition).toBlocking().single().body();
    }

    /**
     * Retrieves model metadata and optionally the model definition.
     Status codes:
     200 (OK): Success.
     404 (Not Found): There is no model with the provided id.
     *
     * @param id The id for the model. The id is globally unique and case sensitive.
     * @param includeModelDefinition When true the model definition will be returned as part of the result.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ModelData> getByIdAsync(String id, Boolean includeModelDefinition, final ServiceCallback<ModelData> serviceCallback) {
        return ServiceFuture.fromResponse(getByIdWithServiceResponseAsync(id, includeModelDefinition), serviceCallback);
    }

    /**
     * Retrieves model metadata and optionally the model definition.
     Status codes:
     200 (OK): Success.
     404 (Not Found): There is no model with the provided id.
     *
     * @param id The id for the model. The id is globally unique and case sensitive.
     * @param includeModelDefinition When true the model definition will be returned as part of the result.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ModelData object
     */
    public Observable<ModelData> getByIdAsync(String id, Boolean includeModelDefinition) {
        return getByIdWithServiceResponseAsync(id, includeModelDefinition).map(new Func1<ServiceResponse<ModelData>, ModelData>() {
            @Override
            public ModelData call(ServiceResponse<ModelData> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves model metadata and optionally the model definition.
     Status codes:
     200 (OK): Success.
     404 (Not Found): There is no model with the provided id.
     *
     * @param id The id for the model. The id is globally unique and case sensitive.
     * @param includeModelDefinition When true the model definition will be returned as part of the result.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ModelData object
     */
    public Observable<ServiceResponse<ModelData>> getByIdWithServiceResponseAsync(String id, Boolean includeModelDefinition) {
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        return service.getById(id, includeModelDefinition, this.client.apiVersion())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ModelData>>>() {
                @Override
                public Observable<ServiceResponse<ModelData>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ModelData> clientResponse = getByIdDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ModelData> getByIdDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ModelData, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ModelData>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Updates the metadata for a model.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     404 (Not Found): There is no model with the provided id.
     *
     * @param id The id for the model. The id is globally unique and case sensitive.
     * @param updateModel An update specification described by JSON Patch. Only the decommissioned property can be replaced.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void update(String id, List<Object> updateModel) {
        updateWithServiceResponseAsync(id, updateModel).toBlocking().single().body();
    }

    /**
     * Updates the metadata for a model.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     404 (Not Found): There is no model with the provided id.
     *
     * @param id The id for the model. The id is globally unique and case sensitive.
     * @param updateModel An update specification described by JSON Patch. Only the decommissioned property can be replaced.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> updateAsync(String id, List<Object> updateModel, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(id, updateModel), serviceCallback);
    }

    /**
     * Updates the metadata for a model.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     404 (Not Found): There is no model with the provided id.
     *
     * @param id The id for the model. The id is globally unique and case sensitive.
     * @param updateModel An update specification described by JSON Patch. Only the decommissioned property can be replaced.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> updateAsync(String id, List<Object> updateModel) {
        return updateWithServiceResponseAsync(id, updateModel).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates the metadata for a model.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     404 (Not Found): There is no model with the provided id.
     *
     * @param id The id for the model. The id is globally unique and case sensitive.
     * @param updateModel An update specification described by JSON Patch. Only the decommissioned property can be replaced.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> updateWithServiceResponseAsync(String id, List<Object> updateModel) {
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        if (updateModel == null) {
            throw new IllegalArgumentException("Parameter updateModel is required and cannot be null.");
        }
        Validator.validate(updateModel);
        return service.update(id, updateModel, this.client.apiVersion())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> updateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Deletes a model. A model can only be deleted if no other models reference it.
     Status codes:
     204 (No Content): Success.
     400 (Bad Request): The request is invalid.
     404 (Not Found): There is no model with the provided id.
     409 (Conflict): There are dependencies on the model that prevent it from being deleted.
     *
     * @param id The id for the model. The id is globally unique and case sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String id) {
        deleteWithServiceResponseAsync(id).toBlocking().single().body();
    }

    /**
     * Deletes a model. A model can only be deleted if no other models reference it.
     Status codes:
     204 (No Content): Success.
     400 (Bad Request): The request is invalid.
     404 (Not Found): There is no model with the provided id.
     409 (Conflict): There are dependencies on the model that prevent it from being deleted.
     *
     * @param id The id for the model. The id is globally unique and case sensitive.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String id, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(id), serviceCallback);
    }

    /**
     * Deletes a model. A model can only be deleted if no other models reference it.
     Status codes:
     204 (No Content): Success.
     400 (Bad Request): The request is invalid.
     404 (Not Found): There is no model with the provided id.
     409 (Conflict): There are dependencies on the model that prevent it from being deleted.
     *
     * @param id The id for the model. The id is globally unique and case sensitive.
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
     * Deletes a model. A model can only be deleted if no other models reference it.
     Status codes:
     204 (No Content): Success.
     400 (Bad Request): The request is invalid.
     404 (Not Found): There is no model with the provided id.
     409 (Conflict): There are dependencies on the model that prevent it from being deleted.
     *
     * @param id The id for the model. The id is globally unique and case sensitive.
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
