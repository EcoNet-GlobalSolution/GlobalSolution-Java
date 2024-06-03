package br.com.fiap.ferramenta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class FerramentaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FerramentaApplication.class, args);
	}
	@GetMapping(value = "/")
	public String index(){
		return "NOME DA EMPRESA";
	}

}
