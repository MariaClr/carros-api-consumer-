package com.example.car_api_test.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumirApi {
    private ObjectMapper mapper = new ObjectMapper();

    public String obterDadosApi(String endereco) throws JsonProcessingException {

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest requisicao = HttpRequest.newBuilder(URI.create(endereco)).build();
        HttpResponse<String> resposta = null;
        try{
            resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());
            JsonNode jsonNode = mapper.readTree(resposta.body());
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
