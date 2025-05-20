package com.neils.domain.ports.out;

import com.neils.domain.aggregates.dto.SunatResponse;
import java.util.List;

public interface EmpresaServiceOut {
    SunatResponse getEmpresa(String ruc);
    List<SunatResponse> getAllEmpresas();
    SunatResponse createEmpresa(SunatResponse sunatResponse);
    SunatResponse updateEmpresa(SunatResponse sunatResponse);
    void deleteEmpresa(String ruc);
}
