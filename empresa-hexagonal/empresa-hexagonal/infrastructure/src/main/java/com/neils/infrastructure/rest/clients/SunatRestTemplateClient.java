package com.neils.infrastructure.rest.clients;

import com.neils.domain.aggregates.dto.SunatResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class SunatRestTemplateClient {

    private final RestTemplate restTemplate;

    private static final String URL = "https://api.apis.net.pe/v2/sunat/ruc/full?numero={ruc}";

    public SunatResponse getEmpresaByRuc(String ruc) {
        return restTemplate.getForObject(URL, SunatResponse.class, ruc);
    }
}