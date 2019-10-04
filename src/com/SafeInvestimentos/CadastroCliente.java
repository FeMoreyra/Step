package com.SafeInvestimentos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CadastroCliente {
	Scanner entrada = new Scanner(System.in);
	private String nomeCompleto, apelido, email, cpf, naturalidade;
	private String rua, bairro, cidade, numero, complemento;

	DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
	private Calendar dataDeNascimento = new GregorianCalendar();

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

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Calendar dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public void Cadastro() {
		System.out.println("Olá, bem vindo a Safe Investimentos! \n" + " O modo mais seguro de investir seu dinheiro");
		System.out.println("\nAgora vamos abrir a sua conta! ");
		System.out.println("\nPrecisamos de alguns dados.");
		System.out.print("\n 1 - Digite um apelido: ");
		this.setApelido(entrada.next());
		System.out.print("\n 2 - Digite seu e-mail:");
		this.setEmail(entrada.next());
				
			}
			


				

}
