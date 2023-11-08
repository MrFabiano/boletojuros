package br.com.boletojuros.adapter.http.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class CalculoBoletoRequest {

    @NotNull
    private String codigo;
    @JsonProperty("data_pagamento")
    private LocalDateTime dataPagamento = LocalDateTime.parse(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
}

