package com.neils.infrastructure.rest.clients;

import com.neils.domain.aggregates.dto.SunatResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SunatRetrofitClient {

    @GET("v2/sunat/ruc/full")
    Call<SunatResponse> getEmpresaByRuc(@Query("numero") String ruc);
}
