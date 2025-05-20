package com.neils.domain.aggregates.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SunatResponse {

    private String razonSocial;

    @JsonProperty("ruc")
    private String numeroDocumento;

    private String estado;
    private String condicion;
    private String direccion;
    private String departamento;
    private String provincia;
    private String distrito;

    @JsonProperty("actividadEconomica")
    private List<ActividadEconomica> actividadEconomica;

    private Integer numeroTrabajadores;

    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ActividadEconomica {
        private String codigo;
        private String descripcion;
    }
}
