package cl.tutorias.sesiones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Punto de entrada del servicio de Sesiones.
 *
 * <p>{@code @SpringBootApplication} activa tres cosas:
 * <ul>
 *   <li>configuración: esta clase puede declarar beans;</li>
 *   <li>escaneo de componentes: Spring busca clases anotadas ({@code @Service},
 *       {@code @Repository}, etc.) en este paquete y sus subpaquetes;</li>
 *   <li>autoconfiguración: según las dependencias del pom, Spring crea por su cuenta
 *       el DataSource, Hibernate, Flyway, Tomcat...</li>
 * </ul>
 */
@SpringBootApplication
public class SesionesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SesionesApplication.class, args);
    }
}
