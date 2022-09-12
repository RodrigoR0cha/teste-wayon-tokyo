package com.wayon.service;

import java.math.BigDecimal;

import com.wayon.entity.AgendaTransferencia;

public interface CalculoTaxaService {
    public BigDecimal calculoTaxaA(AgendaTransferencia agendaTransferencia);

    public BigDecimal calculoTaxaB(AgendaTransferencia agendaTransferencia);

    public BigDecimal calculoTaxaC(AgendaTransferencia agendaTransferencia);

    public BigDecimal calculoTaxaD(AgendaTransferencia agendaTransferencia);
}
