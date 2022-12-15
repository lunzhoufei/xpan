FROM openjdk:11
COPY xpan-api/build/libs/xpan-api-0.0.7-SNAPSHOT.jar /app.jar
CMD ["--server.port=8080"]
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
