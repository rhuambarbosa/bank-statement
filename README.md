# Bank Statement

Aplicação que realiza a leitura de um arquivo json e disponibiliza em uma API rest.

- Java 8
- Spring MVC

Iniciando aplicação

Run na classe BankStatementApplication

http://localhost:8080/bank-statement/

Possui o Dockefile, pode-se gerar uma imagem docker com o seguinte comando:

- sudo docker build . -t bank-statement

Subir imagem no docker

docker run -p8080:8080 bank-statement

com a imagem gerada pode ser utilizada para o deploy em algum gerenciador de microserviços como o Docker Swarm, kubernetes, mesos.

Criando serviço para o Docker Swarm
 - docker service create --name bank-statement --network swarm-internal --replicas 20 -p 8080:8080 bank-statement-0.0.1-SNAPSHOT
 
 