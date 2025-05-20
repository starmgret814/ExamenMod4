package com.neils.infrastructure.adapters;

import com.neils.domain.aggregates.dto.SunatResponse;
import com.neils.domain.ports.out.EmpresaServiceOut;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmpresaServiceOutImpl implements EmpresaServiceOut {

    private final Map<String, SunatResponse> empresaDB = new HashMap<>();

    @Override
    public SunatResponse getEmpresa(String ruc) {
        return empresaDB.get(ruc);
    }

    @Override
    public List<SunatResponse> getAllEmpresas() {
        return new ArrayList<>(empresaDB.values());
    }

    @Override
    public SunatResponse createEmpresa(SunatResponse sunatResponse) {
        empresaDB.put(sunatResponse.getNumeroDocumento(), sunatResponse);
        return sunatResponse;
    }

    @Override
    public SunatResponse updateEmpresa(SunatResponse sunatResponse) {
        String ruc = sunatResponse.getNumeroDocumento();
        if (empresaDB.containsKey(ruc)) {
            empresaDB.put(ruc, sunatResponse);
            return sunatResponse;
        }
        return null;
    }

    @Override
    public void deleteEmpresa(String ruc) {
        empresaDB.remove(ruc);
    }
}
