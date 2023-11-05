## API Cadastro Cliente - Projeto Spring Boot e Angular

# Resumo
Projeto criado para fornecimento de endpoints para realização de operações de cadastro, alteração, listagem e remoção de clientes.
Foi desenvolvida utilizando as melhores práticas de desenvolvimento com separação de responsabilidades, seguindo a arquitetura MVC.

# Tecnologias
Foram utilizadas as seguintes tecnologias para o desenvolvimento do projeto:
* Spring Boot
* Spring Data JPA
* Lombok
* mySQL

# Modo de execução
* Faça o download do projeto através do repositório no Github
* Abra a pasta através do editor de sua preferência
* Execute o arquivo `ApiApplication.java`
* Para testar as rotas utilize a ferramenta de sua preferência através da porta: `http://localhost:8080/clientes`

# Endpoints disponíveis
* `POST`: Para cadastro de novo cliente é necessário passar as seguintes informações no corpo da requisição: nome, idade, cidade
* `GET`: Retorna uma lista de todos os clientes cadastrados
* `PUT`: Para atualização de um cliente é necessário passar no corpo da requisição as seguintes informações: codigo, nome, idade, cidade
* `DELETE /{codigo}`: Para remover um cliente é necessário passar o seu código na URL