FROM openjdk:17-jdk-slim
ARG jar_file=advomanager-server/target/*.jar
COPY ${jar_file} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]