FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY target/*.jar car-maintanace.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "car-maintanace.jar"]