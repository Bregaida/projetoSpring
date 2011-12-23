package br.com.possege.loja.service;

import java.util.List;

import br.com.possege.loja.domain.Produto;

public interface ProdutoServiceI {

	public void salva(Produto produto);

	public List<Produto> pegaTodos();

	public void remove(Produto produto);

	public Produto pegaPorId(Long id);
}
