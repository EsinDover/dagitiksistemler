FROM ubuntu:latest
LABEL authors="DESKTOP-388N91M"

ENTRYPOINT ["top", "-b"]
# OpenJDK 17 kullanarak temel imajı oluştur
FROM openjdk:17-jdk-slim

# Çalışma dizinini belirle
WORKDIR /app

# Maven ile build edilen JAR dosyasını container içine kopyala
COPY target/*.jar /app.jar

# Spring Boot uygulamasını başlat
CMD ["java", "-jar", "/app.jar"]