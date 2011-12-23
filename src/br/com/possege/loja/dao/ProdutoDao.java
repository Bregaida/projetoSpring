package br.com.possege.loja.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.possege.loja.domain.Produto;

@Repository
public class ProdutoDao implements ProdutoDaoI {

	private final static List<Produto> produtos = new ArrayList<Produto>();
	
	static {
		populaProdutos();
	}
	
	public void salva(Produto produto) {
		produto.setId(produtos.size() +1l);
		produtos.add(produto);
	}

	public List<Produto> pegaTodos() {
		return Collections.unmodifiableList(produtos);
	}

	public void remove(Produto produto) {
		Iterator<Produto> it = produtos.iterator();
		while(it.hasNext()) {
			Produto existente = it.next();
			if(existente.getId().equals(produto.getId())) {
				it.remove();
				break;
			}
		}
	}

	private static void populaProdutos() {
		produtos.add(new Produto(1l, "iPhone", "Celular da apple", 299.90, "prata", 10L));
		produtos.add(new Produto(2l, "DVD Yu Yu Hakusho", "Anime sobre Yusuke Urameshi um detetive sobrenatural.", 1999.99, "prata", 20L));
		produtos.add(new Produto(3l, "Caelum OnLine", "Cursos online da Caelum", 249.00, "verde", 60L));
		produtos.add(new Produto(4l, "Fred Rovella Show", "cd de mœsicas italianas", 29.90, "azul", 100L));
	}

	public Produto pegaPorId(Long id) {
		for(Produto produto : produtos) {
			if(produto.getId().equals(id)) return produto;
		}
		return null;
	}

}
