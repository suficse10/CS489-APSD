FROM openjdk:17-alpine3.14

#LABEL authors="droid"

#ENTRYPOINT ["top", "-b"]
RUN mkdir "app"

COPY ./target/Lab10-Docker-1.0-SNAPSHOT.jar /app

WORKDIR /app

CMD ["java", "-jar", "./Lab10-Docker-1.0-SNAPSHOT.jar"]