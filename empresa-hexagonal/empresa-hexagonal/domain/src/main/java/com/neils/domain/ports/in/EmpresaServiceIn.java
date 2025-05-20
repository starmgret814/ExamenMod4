package com.neils.domain.ports.in;

import com.neils.domain.aggregates.dto.SunatResponse;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmpresaServiceIn {
    SunatResponse getEmpresa(String ruc);
    List<SunatResponse> getAllEmpresas();
    SunatResponse createEmpresa(SunatResponse sunatResponse);
    SunatResponse updateEmpresa(SunatResponse sunatResponse);
    void deleteEmpresa(String ruc);
}
