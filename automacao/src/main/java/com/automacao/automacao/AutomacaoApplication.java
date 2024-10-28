package com.automacao.automacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AutomacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomacaoApplication.class, args);
	}

}
