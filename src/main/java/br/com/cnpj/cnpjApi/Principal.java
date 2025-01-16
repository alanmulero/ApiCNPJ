package br.com.cnpj.cnpjApi;

import java.util.Scanner;

import com.google.gson.Gson;

import br.com.cnpj.cnpjApi.model.Cnpj;
import br.com.cnpj.cnpjApi.service.Conexao;

public class Principal {
	
	
	Conexao conexao = new Conexao();
	Scanner leitura = new Scanner(System.in);
	String json = conexao.endPoint("");
	Gson gson = new Gson();
	Cnpj cnpj = gson.fromJson(json, Cnpj.class);

}
