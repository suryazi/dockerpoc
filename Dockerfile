FROM openjdk:8
ADD target/docker-poc.jar docker-poc.jar
EXPOSE 8000
ENTRYPOINT ["java", "-jar", "docker-poc.jar"] 