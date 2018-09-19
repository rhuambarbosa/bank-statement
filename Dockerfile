FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
COPY build/libs/bank-statement-0.0.1-SNAPSHOT.jar bank-statement.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/bank-statement.jar"]