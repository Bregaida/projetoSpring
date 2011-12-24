/**
 * 
 */
package br.com.possege.loja.view.form;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class ProdutoForm {

	private Long id;
	@NotEmpty(message = "Valor n‹o pode ser vazio")
	private String nome;
	@NotEmpty(message = "Valor n‹o pode ser vazio")
	private String descricao;
	private double preco;
	@NotEmpty(message = "Valor n‹o pode ser vazio")
	private String cor;
	@NotNull(message = "Valor n‹o pode ser nulo")
	private Long quantidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

}
