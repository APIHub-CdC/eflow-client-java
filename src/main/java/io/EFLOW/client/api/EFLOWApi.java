package io.EFLOW.client.api;

import io.EFLOW.client.ApiClient;
import io.EFLOW.client.ApiException;
import io.EFLOW.client.ApiResponse;
import io.EFLOW.client.Configuration;
import io.EFLOW.client.Pair;
import io.EFLOW.client.ProgressRequestBody;
import io.EFLOW.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.EFLOW.client.model.Peticion;
import io.EFLOW.client.model.Respuesta;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EFLOWApi {
    private ApiClient apiClient;
    public EFLOWApi() {
        this(Configuration.getDefaultApiClient());
    }
    public EFLOWApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call eflowCall(String xApiKey, String username, String password, Peticion request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        String localVarPath = "";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    private okhttp3.Call eflowValidateBeforeCall(String xApiKey, String username, String password, Peticion request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling eflow(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling eflow(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling eflow(Async)");
        }
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling eflow(Async)");
        }
        
        okhttp3.Call call = eflowCall(xApiKey, username, password, request, progressListener, progressRequestListener);
        return call;
    }
    
    public Respuesta eflow(String xApiKey, String username, String password, Peticion request) throws ApiException {
        ApiResponse<Respuesta> resp = eflowWithHttpInfo(xApiKey, username, password, request);
        return resp.getData();
    }
    
    public ApiResponse<Respuesta> eflowWithHttpInfo(String xApiKey, String username, String password, Peticion request) throws ApiException {
        okhttp3.Call call = eflowValidateBeforeCall(xApiKey, username, password, request, null, null);
        Type localVarReturnType = new TypeToken<Respuesta>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
}
