# transferencia bancaria agendadas 

 
# BackEnd

* Spring Boot 2.7.2
* Java 11
* h2database

## IDE Utlizada
* VScode



# Desenvolvimento FrontEnd

## Tecnologia Utlizadas
* vue 3
* vue-router 4
* axios 0.21.1
* bootstrap 4


## Publicação BackEnd
No prompt do windows, diretorio raiz do projeto, api-transacao-bancaria

* mvn spring-boot:run

`http://localhost:8080`


## Publicação FrontEnd
No prompt do windows, diretorio raiz do projeto interface-transacao-bancaria

* npm run serve 

`http://localhost:8081/`


# Teste BackEnd

* O mesmo feito no Postman 

A API possuo dois serviços:

    - Lista Agendamentos
    http://  mvn spring-boot:run
    
    - Agendamento 
    localhost:8080/transferencia/bancaria/agendada

Testes podem ser feito em uma plataforma de verificação de endpoints, mais comunentes utilizadas no mercado de desenvolvimento

# Código de retorno 
    - Lista Agendamentos
    200 - OK - Retorna as informações no formato Json, tendo dados ou não

    - Agendamentos 
    200 - Agendamento de transferencia efetuado com sucesso
    422 - Erro no calculo e aplicacao da taxa
    500 - Erro no agendamento

# Teste FrontEnd

Barra de pesquisa de qualquer browser `http://localhost:8081`
