package com.SafeInvestimentos;

public class Cliente {
	
	
	private String nomeCompleto, apelido, email, cpf, naturalidade;
	
	
	public void CadastroCliente() {
		System.out.println("Olá, bem vindo a Safe Investimentos! \n"
				+ " O modo mais seguro de investir seu dinheiro");
		System.out.println("\n Agora vamos abrir a sua conta! ");
		System.out.println("\n Precisamos de alguns dados.");
		System.out.println("\n");
		
		
		
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	} 
	
	
	

}
