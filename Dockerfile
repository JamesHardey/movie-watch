#
# Build stage
#
#FROM maven:3.8.2-jdk-11 AS build
#COPY . .
#RUN mvn clean package -Pprod -DskipTests

#
# Package stage
#
FROM openjdk:17-jdk-slim
COPY build/libs/movie-watch-0.0.1-SNAPSHOT.jar app.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]