# EcoNet

|        Integrantes do projeto
|Alunos                       |Rm        |Salas                    |
|-----------------------------|----------|-------------------------|
| Gabriel Siqueira Rodrigues  | RM98626  | 2TDSPF                  |
| Gustavo de Oliveira Azevedo | RM550548 | 2TDSPF                  |
| Isabella Jorge Ferreira     | RM552329 | 2TDSPG                  |
| Mateus Mantovani Araújo     | RM98524  | 2TDSPF                  |
| Juan de Godoy               | RM551408 | 2TDSPF                  |

# Iniciando a aplicação

- Para pegar o arquivo, copie o código do repositório e inicie o git bash no desktop, e utilize o comando a seguir:
```
git clone https://github.com/EcoNet-GlobalSolution/GlobalSolution-Java.git
```

- Depois abra o Intellij, selecione a opção "open" e procure a pasta do projeto.

- Ao abrir o programa no Intellij, crie um file ".env" na altura no projeto contendo os seguintes dados a seguir.
- É necessário realizar este passo para realizar a conexão com o banco da oracle.
```
DB_JDBC=jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL
DB_USERNAME= "Seu usuário do banco"
DB_PASSWORD= "Sua senha do banco"
```
- Para rodar a aplicação, digite o comando abaixo no terminal do Intellij para executar o programa.
```
mvn spring-boot:run
```
- Lembrando que para dar certo, é necessário o Java Runtime estar atualizado, em sua versão mais recente, para ser compátivel com o plugin do maven


# Diagramas do projeto

<img src="https://github.com/EcoNet-GlobalSolution/GlobalSolution-Java/blob/main/documentos/GS-2TDSPF-1S-D.pysical.png">

<img src="https://github.com/EcoNet-GlobalSolution/GlobalSolution-Java/blob/main/documentos/GS-2TDSPF-1S-D.entity.png">

<img src="https://github.com/EcoNet-GlobalSolution/GlobalSolution-Java/blob/main/documentos/GS-2TDSPF-1S-D.request.png">

<img src="https://github.com/EcoNet-GlobalSolution/GlobalSolution-Java/blob/main/documentos/GS-2TDSPF-1S-D.response.png">

# Endpoints

**DeteccaoResource com as seguintes ROTAS e VERBOS**

"localhost/deteccao" - POST

"localhost/deteccao" - GET by example

"localhost/deteccao/{id}" - GET

**EspecieResource com as seguintes ROTAS e VERBOS**

"localhost/especie" - POST

"localhost/especie" - GET by example

"localhost/especie/{id}" - GET
