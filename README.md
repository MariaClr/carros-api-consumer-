
---

# Vehicle API Consumer

**Status do Projeto:** ✔️ Concluído

## Tópicos

- [Descrição do Projeto](#descrição-do-projeto)
- [Funcionalidades](#funcionalidades)
- [Pré-requisitos](#pré-requisitos)
- [Como Rodar a Aplicação](#como-rodar-a-aplicação)
- [Casos de Uso](#casos-de-uso)
- [JSON](#json)
- [Iniciando/Configurando Banco de Dados](#iniciando-configurando-banco-de-dados)
- [Linguagens, Dependências e libs Utilizadas](#linguagens-dependencias-e-libs-utilizadas)
- [Resolvendo Problemas](#resolvendo-problemas)
- [Tarefas em Aberto](#tarefas-em-aberto)
- [Desenvolvedores/Contribuintes](#desenvolvedorescontribuintes)

## Descrição do Projeto

O projeto **Vehicle API Consumer** é uma aplicação que consome uma API de veículos para fornecer informações sobre veículos específicos solicitados pelo usuário. A aplicação retorna detalhes como o modelo, o ano e o preço do veículo. Inclui um menu interativo para facilitar a navegação e a escolha dos veículos. O projeto foi desenvolvido utilizando recursos básicos do Spring, Stream e Jackson para manipulação e processamento dos dados.

## Funcionalidades

✔️ Consulta de veículos por modelo

✔️ Exibição de anos e preços dos veículos

✔️ Menu interativo para seleção e consulta de veículos


## Pré-requisitos

⚠️ Java JDK 11 ou superior

⚠️ Maven 3.8 ou superior

⚠️ Biblioteca Jackson para processamento de JSON

## Como Rodar a Aplicação ▶️

No terminal, clone o projeto:

```bash
git clone https://github.com/MariaClr/carros-api-consumer-.git
cd carros-api-consumer-
mvn spring-boot:run
```

A aplicação será iniciada e você poderá interagir com o menu para consultar informações sobre veículos.

## Casos de Uso

- **Consulta de Veículos**: Utilize o menu para selecionar um modelo de veículo e obter informações detalhadas sobre anos e preços disponíveis.

## JSON 💾

Exemplo de resposta da API:

```json
{
  "vehicles": [
    {
      "model": "Modelo Exemplo",
      "years": [
        {
          "year": 2022,
          "price": 30000
        },
        {
          "year": 2021,
          "price": 28000
        }
      ]
    }
  ]
}
```

## Iniciando/Configurando Banco de Dados

Não é necessário configurar um banco de dados para este projeto.

## Linguagens, Dependências e libs Utilizadas 📚

- Java
- Spring Boot
- Maven
- Jackson

## Resolvendo Problemas ❗

Problemas encontrados durante o desenvolvimento foram documentados nas issues do projeto no GitHub.

## Tarefas em Aberto

📝 Melhorar a interface do menu para uma experiência mais intuitiva

📝 Adicionar funcionalidades de filtro por preço e ano

## Desenvolvedores/Contribuintes :octocat:

- [Maria Clara](https://github.com/MariaClr)

---

