package com.example.car_api_test.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Moto(@JsonAlias("Marca") String marca,
                   @JsonAlias("Valor") String valor,
                   @JsonAlias("AnoModelo") String anoModelo,
                   @JsonAlias("Modelo") String modelo) {
}
