package com.wayon.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.wayon.entity.AgendaTransferencia;


@Getter
@Setter
public class AgendaTransferenciaDTO {

    private String contaOrigem;

    private String contaDestino;

    private BigDecimal valorTransferencia;

    private String dataTransferencia;


    public AgendaTransferencia toAgendaTransferencia() throws ParseException {
        Date dataTransferencia = new SimpleDateFormat("yyyy-MM-dd").parse(this.dataTransferencia);

        return AgendaTransferencia.builder()
                .contaOrigem(contaOrigem)
                .contaDestino(contaDestino)
                .valorTransferencia(valorTransferencia)
                .dataTransferencia(dataTransferencia)
                .build();
    }

}
