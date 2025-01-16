package br.com.cnpj.cnpjApi.model;

public record Cnpj(String cnpj, String razao_social, String nome_fantasia, String descricao_situacao_cadastral, String data_inicio_atividade,
		String uf, String municipio) {

}
