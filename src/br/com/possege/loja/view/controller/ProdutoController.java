package br.com.possege.loja.view.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.possege.loja.domain.Produto;
import br.com.possege.loja.service.ProdutoService;
import br.com.possege.loja.view.form.ProdutoForm;

@Controller
@RequestMapping("/produto/**")
public class ProdutoController {

	@Autowired
	private ProdutoService	produtoService;

	private ProdutoForm		produtoForm;

	private Produto 		produto;
	
	@RequestMapping("/produto/formulario")
	public ModelAndView formulario() {
		return new ModelAndView("formulario").addObject("produtoForm", new ProdutoForm());
	}
	
	@RequestMapping("/produto/adiciona")
	public ModelAndView adiciona(@Valid ProdutoForm produtoForm, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("formulario").addAllObjects(result.getModel());
		}
		populaBean(produtoForm);
		produtoService.salva(produto);
		return new ModelAndView("lista").addObject("produtos", produtoService.pegaTodos());
	}

	@RequestMapping("/produto/lista")
	public ModelAndView lista() {
		return new ModelAndView("lista").addObject("produtos", produtoService.pegaTodos());
	}
	
	@RequestMapping(value = "/produto/remove", method = RequestMethod.GET)
	public ModelAndView remove(@Valid @RequestParam(value = "produto.id") long id) {
		produto = new Produto();
		produto.setId(id);
		produtoService.remove(produto);
		return new ModelAndView("lista").addObject("produtos", produtoService.pegaTodos());
	}
	
	@RequestMapping("/produto/consulta")
	public ModelAndView consulta() {
		return new ModelAndView("consulta").addObject("produtoForm", new ProdutoForm());
	}
	
	@RequestMapping("/produto/pesquisa")
	public ModelAndView pesquisa(@Valid ProdutoForm produtoForm, BindingResult result) {
		produto = produtoService.pegaPorId(produtoForm.getId());
		produtoForm = populaForm(produto, produtoForm);
		return new ModelAndView("exibeProduto").addObject("produtoForm", produtoForm);
	}
	
	private void populaBean(ProdutoForm produtoForm) {
		produto = new Produto();
		produto.setId(produtoForm.getId());
		produto.setCor(produtoForm.getCor());
		produto.setDescricao(produtoForm.getDescricao());
		produto.setNome(produtoForm.getNome());
		produto.setPreco(produtoForm.getPreco());
		produto.setQuantidade(produtoForm.getQuantidade());
	}
	
	private ProdutoForm populaForm(Produto produto, ProdutoForm produtoForm) {
		produtoForm.setId(produto.getId());
		produtoForm.setCor(produto.getCor());
		produtoForm.setDescricao(produto.getDescricao());
		produtoForm.setNome(produto.getNome());
		produtoForm.setPreco(produto.getPreco());
		produtoForm.setQuantidade(produto.getQuantidade());
		return produtoForm;
	}
	

	public ProdutoForm getProdutoForm() {
		return produtoForm;
	}

	public void setProdutoForm(ProdutoForm produtoForm) {
		this.produtoForm = produtoForm;
	}
	
}
