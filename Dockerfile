FROM gradle:8.4.0-jdk21-alpine AS build
LABEL authors="Senko-san"
LABEL authors="AgniaEndie"
LABEL authors="GekkStr"
LABEL authors="xxlegendzxx22"
WORKDIR /EarthRestProject
COPY . /testbuilders
RUN gradle jar
#What diffrerence between EarthRestProject-0.0.1-SNAPSHOT and EarthRestProject-0.0.1-SNAPSHOT?
ENTRYPOINT ["java","-XX:+UseZGC","-jar", "/testbuilders/build/libs/EarthRestProject-0.0.1-SNAPSHOT.jar"]
