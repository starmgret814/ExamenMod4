package com.neils.infrastructure.config;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

@Configuration
public class RetrofitConfig {

    private static final String AUTH_TOKEN = "Bearer apis-token-15139.r2Vp7T6Z7HCBI6gKWoH6DqibAH3b5D0v";

    @Bean
    public OkHttpClient okHttpClient() {
        return new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request().newBuilder()
                                .addHeader("Authorization", AUTH_TOKEN)
                                .build();
                        return chain.proceed(request);
                    }
                }).build();
    }

    @Bean
    public Retrofit retrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl("https://api.apis.net.pe/")
                .addConverterFactory(JacksonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }
}
