FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} hero_app.jar
ENTRYPOINT ["java","-jar","/hero_app.jar"]