FROM openjdk:17-jdk-slim
COPY advomanager-server/target/advomanager-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]