FROM adoptopenjdk/openjdk11:alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} labseq-api-1.0.0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/labseq-api-1.0.0.jar"]
