FROM openjdk:17-jdk-slim

COPY target/todoapp.jar /usr/app/
WORKDIR /usr/app
VOLUME /tmp
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "todoapp.jar"]