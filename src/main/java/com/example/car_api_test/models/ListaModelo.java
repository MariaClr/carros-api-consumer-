package com.example.car_api_test.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListaModelo {
    private List<Modelo> modelos;


    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }

    @Override
    public String toString() {
        return "ListaModelo: " +
                "modelos=" + modelos +
                "\n}";
    }
}
