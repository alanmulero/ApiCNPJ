package br.com.cnpj.cnpjApi;

import java.util.Iterator;
import java.util.Scanner;

import com.google.gson.Gson;

import br.com.cnpj.cnpjApi.model.Cnpj;
import br.com.cnpj.cnpjApi.service.Conexao;

public class Principal {

	String endereco = "https://brasilapi.com.br/api/cnpj/v1/";
	Conexao conexao = new Conexao();
	Scanner leitura = new Scanner(System.in);
	Gson gson = new Gson();
	

	public void consulta() {

		System.out.println("Digite os númros do seu CNPJ sem (- ou /)");
		var resposta = leitura.nextLine();
		String json = conexao.endPoint(endereco + resposta);

		System.out.println(json);
		Cnpj cnpj = gson.fromJson(json, Cnpj.class);
		System.out.println(cnpj);
		
		
		
		

	}

}
