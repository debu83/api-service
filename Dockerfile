# Fetching latest version of Java
FROM adoptopenjdk/openjdk11:alpine-jre
 
# Setting up work directory
WORKDIR /app

# Copy the jar file into our app
COPY ./target/api-service-0.0.1-SNAPSHOT.jar /app

# Exposing port 8777
EXPOSE 8777

# Starting the application
ENTRYPOINT ["java", "-jar", "api-service-0.0.1-SNAPSHOT.jar"]
