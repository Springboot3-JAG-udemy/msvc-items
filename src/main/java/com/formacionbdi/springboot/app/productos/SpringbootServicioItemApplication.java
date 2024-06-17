package com.formacionbdi.springboot.app.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
// import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

// Habilitar hystrix
@EnableCircuitBreaker
// No es obligatorio, pero es recomendable habilitarla de manera explicita
@EnableEurekaClient
// Se quita si se usa eureka client, ya que esta ya treae ribbon embebido
// @RibbonClient(name = "servicio-productos") // Balanceador de carga Ribbon
@EnableFeignClients
@SpringBootApplication
public class SpringbootServicioItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioItemApplication.class, args);
	}

}
