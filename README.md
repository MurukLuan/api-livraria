# api-livraria
Projeto criado para o desafio back-end CNI. 
Requisitos do projeto: construir uma API com CRUD (create, read, update, delete) ccontendo no minimo 5 campos que possam ser processados, 
que contenha uma chave primaria que não pode ser modificada. Para o banco de dados poderia escolher entre SQL e NoSQL.

Para o Projeto foram utilizadas as seguintes tecnologias:

Banco de dados Mysql;
Xamp (startar php myadmin onde tem acesso ao mysql) para dar start no servidor do banco e no banco de dados;
Framework Sprint Boot na versão 2.7.8 para facilitar no processo de criação e manutenção do projeto com mais agilidade nos processos
Sprint Tool Suit 4 como IDE "turbinada" proprio para usar em projetos spring
Spring Data JPA para fazer a persistencia dos dados da API
Validation para as validações dos campos
Spring WEB para a transferencia de dados 
Spring Dev Tools para que ao mudar uma dependencia ele gere o hot reload sem a necessidade de dar restart no servidor
Maven para gerenciar as dependencias

Foram gerados 2 bancos de dados, um para teste e um para desenvolvimento, como boa prática. O Script gerado para criar a base de dados no MySql:

CREATE DATABASE livraria_teste;
CREATE DATABASE livraria;

O banco livraria_teste está sendo usado apenas em tempo de execução mas tem 1 dado salvo que é criado no momento da sua chamada.

O banco livraria poderá ser usado em ambiente de desenvolvimento.

para que seja feita a utilização do banco desejado, no projeto na pasta src/main/resources o arquivo application.properties deve ser alterado
após o sinal de "=" para dev (ambiente desenvolvimento) ou test (para ambiente de teste)

Os demais comandos para criação das tabelas, inserção, atualização, leitura e deleção de dados já estão sendo utlizados pelas anotações em suas respectivas classes.
