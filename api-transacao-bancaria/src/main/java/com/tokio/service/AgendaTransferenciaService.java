package com.wayon.service;

import java.util.List;

import com.wayon.entity.AgendaTransferencia;

public interface AgendaTransferenciaService {
    void save(AgendaTransferencia agendaTransferencia);

    List<AgendaTransferencia> findAll();


}
