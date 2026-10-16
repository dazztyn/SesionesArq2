# SesionesArq2

Servicio de **Sesiones** de la plataforma de tutorías (Java 21 + Spring Boot 4).
Maneja la agenda, la disponibilidad de tutores y el ciclo de vida de las sesiones.

## Requisitos

- JDK 21
- Docker (Docker Desktop en Windows/macOS)
- No hace falta instalar Maven: el proyecto trae el wrapper `./mvnw`.

## Levantar en local

```bash
./mvnw spring-boot:run
```

Spring Boot levanta solo el PostgreSQL de `compose.yaml`, aplica las migraciones de
Flyway (`src/main/resources/db/migration`) y arranca el servicio.

Comprobar que está vivo y conectado a la base de datos:

```bash
curl http://localhost:8080/actuator/health
```

## Tests

```bash
./mvnw verify
```
