FROM openjdk:21-jdk-oracle

WORKDIR /code_ex

COPY target .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/code_ex/code_ex-0.0.1-SNAPSHOT.jar"]
