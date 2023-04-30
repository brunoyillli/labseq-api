FROM maven:3.8.3-openjdk-11 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM adoptopenjdk/openjdk11:alpine
WORKDIR /app
COPY --from=build /app/target/*.jar labseq-api-1.0.0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/labseq-api-1.0.0.jar"]
