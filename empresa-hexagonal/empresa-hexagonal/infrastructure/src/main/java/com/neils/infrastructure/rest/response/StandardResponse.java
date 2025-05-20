package com.neils.infrastructure.rest.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class StandardResponse {
    private int codigo;
    private String mensaje;
    private Object data;
}
