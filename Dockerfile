FROM adoptopenjdk/openjdk11:alpine-jre

EXPOSE 8080

COPY build/libs/block2resttask1-0.0.1-SNAPSHOT.jar  app.jar

CMD ["java", "-jar", "app.jar"]