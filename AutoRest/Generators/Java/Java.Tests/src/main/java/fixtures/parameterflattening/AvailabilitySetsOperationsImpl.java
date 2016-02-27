/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.parameterflattening;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.Validator;
import fixtures.parameterflattening.models.AvailabilitySetUpdateParameters;
import java.io.IOException;
import java.util.Map;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in AvailabilitySetsOperations.
 */
public final class AvailabilitySetsOperationsImpl implements AvailabilitySetsOperations {
    /** The Retrofit service to perform REST calls. */
    private AvailabilitySetsService service;
    /** The service client containing this operation class. */
    private AutoRestParameterFlattening client;

    /**
     * Initializes an instance of AvailabilitySetsOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public AvailabilitySetsOperationsImpl(Retrofit retrofit, AutoRestParameterFlattening client) {
        this.service = retrofit.create(AvailabilitySetsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for AvailabilitySetsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AvailabilitySetsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("parameterFlattening/{resourceGroupName}/{availabilitySetName}")
        Call<ResponseBody> update(@Path("resourceGroupName") String resourceGroupName, @Path("availabilitySetName") String availabilitySetName, @Body AvailabilitySetUpdateParameters tags1);

    }

    /**
     * Updates the tags for an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the storage availability set.
     * @param tags the Map&lt;String, String&gt; value
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> update(String resourceGroupName, String availabilitySetName, Map<String, String> tags) throws ServiceException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (availabilitySetName == null) {
            throw new IllegalArgumentException("Parameter availabilitySetName is required and cannot be null.");
        }
        if (tags == null) {
            throw new IllegalArgumentException("Parameter tags is required and cannot be null.");
        }
        Validator.validate(tags);
        tags1 = new AvailabilitySetUpdateParameters();
        AvailabilitySetUpdateParameters tags1.setTags(tags);
        Call<ResponseBody> call = service.update(resourceGroupName, availabilitySetName, tags1);
        return updateDelegate(call.execute());
    }

    /**
     * Updates the tags for an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the storage availability set.
     * @param tags the Map&lt;String, String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall updateAsync(String resourceGroupName, String availabilitySetName, Map<String, String> tags, final ServiceCallback<Void> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (availabilitySetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter availabilitySetName is required and cannot be null."));
            return null;
        }
        if (tags == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter tags is required and cannot be null."));
            return null;
        }
        Validator.validate(tags, serviceCallback);
        tags1 = new AvailabilitySetUpdateParameters();
        AvailabilitySetUpdateParameters tags1.setTags(tags);
        Call<ResponseBody> call = service.update(resourceGroupName, availabilitySetName, tags1);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> updateDelegate(Response<ResponseBody> response) throws ServiceException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ServiceException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
