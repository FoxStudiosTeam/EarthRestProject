FROM gradle:8.4.0-jdk21-alpine AS build
LABEL authors="Senko-san"
LABEL authors="AgniaEndie"
LABEL authors="GekkStr"
LABEL authors="xxlegendzxx22"
WORKDIR /EarthRestProject
COPY . /EarthRestProject
RUN gradle jar
#ENTRYPOINT ["java","-XX:+UseZGC","-jar", "/EarthRestProject/build/libs/EarthRestProject-0.0.1-SNAPSHOT.jar"]
WORKDIR /EarthRestProject/build/libs/
ENTRYPOINT ["sh", "ls"]
