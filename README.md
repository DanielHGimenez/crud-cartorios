# Docket-test

Esse projeto foi desenvolvido para um teste de admissão. A premissa do projeto é ser um crud de cartórios, onde cada cartório é composto apenas por um campo "nome".

## Tecnologias

Para o desevolvimento foram usadas as tecnologias:

 - **Java 8** como linguagem de programação.
 - **Maven** como automatizador de compilação e gerenciador de dependências.
 - **Spring Boot** como base da estrutura do projeto.
 - **Spring Boot Starter Web** para controlar a camada de comunicação.
 - **Spring Data JPA** para integração da aplicação com o banco de dados.
 - **H2 Database** para ser usado como banco de dados em memória.
 - **Thymeleaf** para ser usado na criação das views.
 - **Lombok** para facilitar o desenvolvimento.

## Endpoints

Para o projeto foram criados dois tipos de endpoints. Para acesso REST via APIs e para acesso por navegadores.

### REST

Os endpoints para acesso REST devem ser acessados com o prefixo **/cartorios**, e cada ação é diferenciada pelo método HTTP utilizado na request.

 - **GET /** <br> Use para obter todos os cartórios registrados.

 - **GET  /{id}** <br> Substitua o **{id}** pelo id do cartório que deseja consultar.

 - **POST /** <br> Use para criar um cartório. É necessário passar uma string no body da requisição representando o nome do cartório.

 - **PUT /** <br> Use para modificar um cartório. É necessário passar no body da requisição um objeto com o parâmetro **id** com o valor do id no banco do cartório alterado, e um parâmetro **nome** com o novo nome do cartório. Esse objeto representa diretamente o registro do banco. Se no futuro a quantidade de campos na tabela aumentar, q quantidade de campos no objeto usado no body também aumentará.

 - **DELETE /{id}** <br> Use para deletar um cartório. Substitue o **id** pelo id do cartório que deseja deletar.

### Navegadores

Os endpoints para acesso pelo navegador devem ser acessados com o prefixo **/cartorios**, e uma package é reservada pra cada tela.

 - **/consultar** <br> Usado para acessar a tela que exibe todos os cartórios e deleta cartórios.

 - **/cadastrar** <br> Usado para acessar a tela que faz o cadastro de cartórios.

 - **/editar** <br> Usado para acessar a tela que edita um cartório. **Não** deve ser acessado diretamente, só deve ser acessada através do fluxo normal da aplicação.
<br>

### Considerações

Essa foi a primeira documentação que eu fiz em um projeto. Caso você tenha alguma sugestão de melhoria da documentação, adicione uma issue do tipo [documentation](https://github.com/DanielHGimenez/docket-teste/labels/documentation) ao repositório me explicando como a documentação poderia ser melhorada. 

Esse projeto foi feito as pressas, com pouco tempo, então é bem provável que você encontre pontos que poderiam ser melhor implementados (eu mesmo já identifiquei alguns pontos). Caso você tenha uma sugestão de melhoria de implementação, adicione uma issue do tipo [invalid](https://github.com/DanielHGimenez/docket-teste/labels/invalid) ao repositório me explicando como a implementação poderia melhorar.
