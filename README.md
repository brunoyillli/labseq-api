
<h1 align="center">
    labseq-api
</h1>


<h3>
Acessar o Swagger
</h3>

http://localhost:8080/swagger-ui/index.html

<h3>
 instruções para criar o container da aplicação pelo docker
</h3>

Use o seguinte comando para gerar a imagem docker:
sudo docker build -t labseq-api:1.0.0 .

então dê o seguinte comnando para gerar o container e subir a aplicação:
sudo docker run --name labseq-api -p 8080:8080 -d labseq-api:1.0.0

Para ver os logs para executar no terminal

docker logs labseq-api

Caso queira parar a aplicação basta executar

docker stop labseq-api

Ou, caso queira iniciar novamente basta executar

docker start labseq-api
