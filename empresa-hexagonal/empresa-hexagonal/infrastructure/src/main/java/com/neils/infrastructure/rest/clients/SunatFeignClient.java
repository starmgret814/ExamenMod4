package com.neils.infrastructure.rest.clients;

import com.neils.domain.aggregates.dto.SunatResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.neils.infrastructure.config.FeignConfig;


@FeignClient(name = "sunatFeignClient", url = "https://api.apis.net.pe", configuration = FeignConfig.class)
public interface SunatFeignClient {

    @GetMapping("/v2/sunat/ruc/full")
    SunatResponse getEmpresaByRuc(@RequestParam("numero") String ruc);
}
