FROM maven:3.9.8-amazoncorretto-17-al2023 as builder

#Cope local code the the container image.
WORKDIR /app
COPY pom.xml .
COPY src ./src

#Build a release artiface
RUN mvn package -DskipTests

#Run the web service on container startup.
CMD ["java","-jar","/app/target/cloud-dentist-backend-0.0.1-SNAPSHOT.jar","--spring.profiles.ative=prod"]

