package br.com.possege.loja.dao;

import java.util.List;

import br.com.possege.loja.domain.Produto;

public interface ProdutoDaoI {

	public void salva(Produto produto);
	
	public List<Produto> pegaTodos();
	
	public void remove(Produto produto);
	
	public Produto pegaPorId(Long id);
}
