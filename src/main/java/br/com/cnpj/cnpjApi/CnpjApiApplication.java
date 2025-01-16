package br.com.cnpj.cnpjApi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;

@SpringBootApplication
public class CnpjApiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CnpjApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Instanciando.
		
		Principal principal = new Principal();
		principal.consulta();
		
		
	}

}
