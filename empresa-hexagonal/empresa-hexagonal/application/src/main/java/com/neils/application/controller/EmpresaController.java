package com.neils.application.controller;

import com.neils.infrastructure.rest.response.StandardResponse;
import com.neils.domain.aggregates.dto.SunatResponse;
import com.neils.domain.ports.in.EmpresaServiceIn;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
@RequiredArgsConstructor
public class EmpresaController {

    private final EmpresaServiceIn empresaService;

    @GetMapping("/{ruc}")
    public ResponseEntity<StandardResponse> getEmpresaByRuc(@PathVariable String ruc) {
        SunatResponse response = empresaService.getEmpresa(ruc);
        return ResponseEntity.ok(
                StandardResponse.builder()
                        .codigo(200)
                        .mensaje("Empresa encontrada")
                        .data(response)
                        .build()
        );
    }

    @GetMapping
    public ResponseEntity<StandardResponse> getAllEmpresas() {
        List<SunatResponse> empresas = empresaService.getAllEmpresas();
        return ResponseEntity.ok(
                StandardResponse.builder()
                        .codigo(200)
                        .mensaje("Empresas obtenidas")
                        .data(empresas)
                        .build()
        );
    }

    @PostMapping
    public ResponseEntity<StandardResponse> createEmpresa(@RequestBody SunatResponse empresa) {
        SunatResponse saved = empresaService.createEmpresa(empresa);
        return ResponseEntity.ok(
                StandardResponse.builder()
                        .codigo(201)
                        .mensaje("Empresa creada")
                        .data(saved)
                        .build()
        );
    }

    @PutMapping
    public ResponseEntity<StandardResponse> updateEmpresa(@RequestBody SunatResponse empresa) {
        SunatResponse updated = empresaService.updateEmpresa(empresa);
        return ResponseEntity.ok(
                StandardResponse.builder()
                        .codigo(200)
                        .mensaje("Empresa actualizada")
                        .data(updated)
                        .build()
        );
    }


    @DeleteMapping("/{ruc}")
    public ResponseEntity<StandardResponse> deleteEmpresa(@PathVariable String ruc) {
        empresaService.deleteEmpresa(ruc);
        return ResponseEntity.ok(
                StandardResponse.builder()
                        .codigo(200)
                        .mensaje("Empresa eliminada")
                        .data(null)
                        .build()
        );
    }
}
