/**
 * 
 */
package br.com.possege.loja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.possege.loja.dao.ProdutoDao;
import br.com.possege.loja.domain.Produto;

/**
 * @author eduardobregaida
 *
 */

@Service
public class ProdutoService implements ProdutoServiceI{

	@Autowired
	private ProdutoDao	produtoDao;

	@Override
	public void salva(Produto produto) {
		produtoDao.salva(produto);
	}

	@Override
	public List<Produto> pegaTodos() {
		return produtoDao.pegaTodos();
	}

	@Override
	public void remove(Produto produto) {
		produtoDao.remove(produto);
	}

	@Override
	public Produto pegaPorId(Long id) {
		return produtoDao.pegaPorId(id);
	}
}
