package com.example.car_api_test.Main;

import com.example.car_api_test.models.*;
import com.example.car_api_test.service.ConsumirApi;
import com.example.car_api_test.service.Converter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

public  class Menu {
    private ConsumirApi consumo = new ConsumirApi();
    private Converter conversor = new Converter();
    private ObjectMapper mapper = new ObjectMapper();

    private Scanner leitura = new Scanner(System.in);
    private String endereco = "https://parallelum.com.br/fipe/api/v1/";

    public void Menu() throws JsonProcessingException {
        System.out.println("***Escolha o tipo de veiculo***");
        System.out.print("*Carros*\n*Caminhões*\n*Motos*");
        System.out.println();
        var veiculo = leitura.nextLine();

        String veiculos = consumo.obterDadosApi(endereco + veiculo + "/marcas");
        System.out.println(veiculos);

        System.out.println("**Informe o codigo da marca para consulta**");
        var codigoMarca = leitura.nextLine();

        String modelos = consumo.obterDadosApi(endereco + veiculo + "/marcas/" + codigoMarca + "/modelos/");
        List<Modelo> listaModelos = conversor.converterDados(modelos, ListaModelo.class).getModelos();
        listaModelos.forEach(m -> System.out.println(m));

        System.out.println("Digite um trecho de um carro para consulta");
        String trechoConsulta = leitura.nextLine().toLowerCase().trim();


        listaModelos.stream()
                .filter(carro -> carro.nome().trim().toLowerCase().contains(trechoConsulta))
                .forEach(System.out::println);

        System.out.println("digite o codigo para consulta");
        String codigo  = leitura.nextLine();
        String dadoAnos = consumo.obterDadosApi(endereco + veiculo + "/marcas/" + codigoMarca + "/modelos/" + codigo + "/anos");
        Ano anos[] = conversor.converterDados(dadoAnos, Ano[].class);
         List<Ano> anosConvertido = Arrays.asList(anos);

        List<DadosVeiculo> dadosVeiculosCompleto = new ArrayList<>();
        anosConvertido.forEach(ano ->{
            try {
                String dadosCompletos = consumo.obterDadosApi(endereco + veiculo + "/marcas/" + codigoMarca + "/modelos/" + codigo + "/anos/" + ano.codigo());
                dadosVeiculosCompleto.add(conversor.converterDados(dadosCompletos, DadosVeiculo.class));
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }

        });
        dadosVeiculosCompleto.forEach(ano-> System.out.println(ano));

    }

}
