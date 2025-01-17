package br.com.cnpj.cnpjApi;

import java.util.Scanner;

import com.google.gson.Gson;

import br.com.cnpj.cnpjApi.model.Cnpj;
import br.com.cnpj.cnpjApi.service.Conexao;

public class Principal {
	
	
	Conexao conexao = new Conexao();
	String json = conexao.endPoint("https://brasilapi.com.br/api/cnpj/v1/27049688000150");
	Scanner leitura = new Scanner(System.in);
	Gson gson = new Gson();
	Cnpj cnpj = gson.fromJson(json, Cnpj.class);
	
	
	
	public void consulta() {
		
		
		System.out.println("Digite os númros do seu CNPJ sem (- ou /)" );
		//var resposta = leitura.nextLine();
		
		
		System.out.println(cnpj);
		
		
		
		
		
		
		
	}

}
