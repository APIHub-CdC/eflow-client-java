package io.EFLOW.client.api;

import io.EFLOW.client.ApiClient;
import io.EFLOW.client.ApiException;
import io.EFLOW.client.model.Peticion;
import io.EFLOW.client.model.Respuesta;
import io.EFLOW.interceptor.SignerInterceptor;
import okhttp3.OkHttpClient;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Assert;
import org.junit.Before;
import java.util.concurrent.TimeUnit;

public class ApiTest {
	
	private Logger logger = LoggerFactory.getLogger(ApiTest.class.getName());
	private final EFLOWApi api = new EFLOWApi();
	private ApiClient apiClient = null;

	@Before()
	public void setUp() {
		this.apiClient = api.getApiClient();
		this.apiClient.setBasePath("the_url");
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(new SignerInterceptor())
                .build();
        apiClient.setHttpClient(okHttpClient);    	
	}
	
    @Test
    public void eflowTest() throws ApiException {
    	
		String xApiKey = "your_api_key";
		String username = "your_username";
		String password = "your_password";	

        Peticion persona = new Peticion();
        
        persona.setFolio("000016");
        persona.setTipoDocumento("1");
        persona.setNumeroDocumento("00000002");
        
		try {
			Respuesta response = api.eflow(xApiKey, username, password, persona);
	        Assert.assertTrue(response != null);
	        if(response != null) {
	        	logger.info(response.toString());
	        }
		} catch (ApiException e) {
			logger.info(e.getResponseBody());
		}
    }
    
}
