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

- Para pegar o arquivo, clone o repositório ná sua maquina utilizando o comando a seguir:
```
git clone https://github.com/EcoNet-GlobalSolution/GlobalSolution-Java.git
```
- Ao abrir o projeto, crie um file ".env" na altura no projeto contendo os seguintes dados a seguir.
- É necessário realizar este passo para realizar a conexão com o banco da oracle!
```
DB_JDBC= "URL do seu banco"
DB_USERNAME= "Seu usuário do banco"
DB_PASSWORD= "Sua senha do banco"
```
- Para rodar a aplicação, digite o comando abaixo no terminal da IDE para executar o programa.
```
mvn spring-boot:run
```
- Lembrando que para dar certo, é necessário o Java Runtime estar atualizado, em sua versão mais recente, para ser compátivel com o plugin do maven

# Links do vídeo Pitch / Aplicação

- Link vídeo Pitch: https://youtu.be/60S74fi1rvE

- Link vídeo da aplicação: https://youtu.be/dKR2BuoE_G8


# Diagrama de Entidades e Relacionamentos

<img src="https://github.com/EcoNet-GlobalSolution/GlobalSolution-Java/blob/main/documentos/Diagramas/GS-2TDSPF-1S-D.physical.png">

# Diagrama de Classes de Entidades

<img src="https://github.com/EcoNet-GlobalSolution/GlobalSolution-Java/blob/main/documentos/Diagramas/GS-2TDSPF-1S-D.entity.png">

# Diagrama de Classe de Request (DTO'S )

<img src="https://github.com/EcoNet-GlobalSolution/GlobalSolution-Java/blob/main/documentos/Diagramas/GS-2TDSPF-1S-D.request.png">

# Diagrama de Classe de Response (DTO'S )

<img src="https://github.com/EcoNet-GlobalSolution/GlobalSolution-Java/blob/main/documentos/Diagramas/GS-2TDSPF-1S-D.response.png">

# Endpoints

**DeteccaoResource com as seguintes ROTAS e VERBOS**


"localhost/deteccao" - POST

"localhost/deteccao" - GET by example

"localhost/deteccao/{id}" - GET


**EmbarcacaoResource com as seguintes ROTAS e VERBOS**


"localhost/embarcacao" - POST

"localhost/embarcacao" - GET by example

"localhost/embarcacao/{id}" - GET


**EspecieResource com as seguintes ROTAS e VERBOS**


"localhost/especie" - POST

"localhost/especie" - GET by example

"localhost/especie/{id}" - GET
