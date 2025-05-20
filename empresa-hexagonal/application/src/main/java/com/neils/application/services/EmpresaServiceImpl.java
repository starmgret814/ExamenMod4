package com.neils.application.services;

import com.neils.domain.aggregates.dto.SunatResponse;
import com.neils.domain.ports.in.EmpresaServiceIn;
import com.neils.domain.ports.out.EmpresaServiceOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpresaServiceImpl implements EmpresaServiceIn {

    private final EmpresaServiceOut empresaServiceOut;

    @Override
    public SunatResponse getEmpresa(String ruc) {
        return empresaServiceOut.getEmpresa(ruc);
    }

    @Override
    public List<SunatResponse> getAllEmpresas() {
        return empresaServiceOut.getAllEmpresas();
    }

    @Override
    public SunatResponse createEmpresa(SunatResponse sunatResponse) {
        return empresaServiceOut.createEmpresa(sunatResponse);
    }

    @Override
    public SunatResponse updateEmpresa(SunatResponse sunatResponse) {
        return empresaServiceOut.updateEmpresa(sunatResponse);
    }

    @Override
    public void deleteEmpresa(String ruc) {
        empresaServiceOut.deleteEmpresa(ruc);
    }
}
