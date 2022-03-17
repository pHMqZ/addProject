<h1> RESTApi - Cadastro de Alunos</h1>

<h3> Projeto para implemantação de RESTApi - .add</h3>

<p> Aplicação possue 4 entidades, sendo elas:</p>
<ol>
    <li> Aluno;</li>
    <li> Turma;</li>
    <li> Escola;</li>
    <li> Endereço.</li>
</ol>

<p> Para todas as entidades a partir de seus controlleres, é possivel realizar os seguintes métodos:<p>
<ol>
    <li> Create;</li>
    <li> Get all;</li>
    <li> Get By Id;</li>
    <li> Update;</li>
    <li> Remove.</li>
</ol>

<h3> Pré-requisitos para rodar o projeto:</h3>
<ol>
    <li> Java 11 ou superior;</li>
    <li> Maven 3.6.3 ou superior;</li>
    <li> IDE de sua preferência</li>
    <li> MySQL server ou Xampp.</li>
    <li> Angular 8</li>
</ol>

<h3> Como rodar a aplicação:</h3>
<p> Back-end:</p>
<ol> Pela IDE:
    <li> Garantir que o server MySQL está rodando ou ativar utilizando o programa Xampp;</li>
    <li> No nome da API, clicar com o botão direito, ir até run as e por final clicar na opção 'Spring Boot App';</li>
    <li>Aguardar a API terminar de inicializar</li>
</ol>
<ol> Pelo CMD:
    <li> Garantir que o server MySQL está rodando ou ativar utilizando o programa Xampp;</li>
    <li> Iniciar o prompt de comando na pasta onde está a API;</li>
    <li> Rodar o seguinte comando:</li>
    ``` 
    mvn spring-boot:run
    ```
    <li> Aguardar a API terminar de inicializar</li>
</ol>
<p>Front-end:</p>
    <li> Iniciar o prompt de comando na pasta do frontend da API;</li>
    <li> Rodar o seguinte comando:</li>
    ```
    ng serve
    ```
    <li>Apos o frontend estiver inicializado, acessar o link abaixo e utilizar a API</li>
    ```
    http://localhost:4200
    ```
    


Projeto realizado por [Phillip Marques](https://www.linkedin.com/in/phillip-marques-201832161/ "Phillip Marques")
