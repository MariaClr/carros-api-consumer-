package com.example.car_api_test.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Carro(@JsonAlias("Marca") String marca,
                    @JsonAlias("Modelo") String modelo,
                    @JsonAlias("AnoModelo") String anoModelo,
                     @JsonAlias("Valor") String valor

) {

}
