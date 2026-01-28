FROM openjdk:22-jdk
LABEL authors="mursalin"

ADD target/docker-demo.jar docker-demo.jar
ENTRYPOINT ["java", "-jar", "/docker-demo.jar"]