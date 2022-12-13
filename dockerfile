FROM openjdk:11
COPY demo-0.0.1-SNAPSHOT.jar /tmp/app.jar
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "app.jar"]