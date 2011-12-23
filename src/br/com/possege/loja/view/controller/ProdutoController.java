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
	private ProdutoService			produtoService;

	private ProdutoForm		produtoForm		= new ProdutoForm();

	private Produto produto;
	
	@RequestMapping("/produto/formulario")
	public ModelAndView formulario() {
		return new ModelAndView("formulario").addObject("produtoForm", produtoForm);
	}
	
	@RequestMapping("/produto/adiciona")
	public ModelAndView adiciona(ProdutoForm produtoForm, BindingResult result) {
		
		produto = produtoForm.getProduto();
		produtoService.salva(produto);
		return new ModelAndView("lista").addObject("produtos", produtoService.pegaTodos());
	}
	
	@RequestMapping(value = "/produto/remove", method = RequestMethod.GET)
	public ModelAndView remove(@RequestParam(value = "produto.id") long id) {
		produto = new Produto();
		produto.setId(id);
		produtoService.remove(produto);
		return new ModelAndView("lista").addObject("produtos", produtoService.pegaTodos());
	}
	
	@RequestMapping("/produto/lista")
	public ModelAndView lista() {
		return new ModelAndView("lista").addObject("produtos", produtoService.pegaTodos());
	}
	
	@RequestMapping("/produto/consulta")
	public ModelAndView consulta() {
		return new ModelAndView("consulta").addObject("produtoForm", new ProdutoForm());
	}
	
	@RequestMapping("/produto/pesquisa")
	public ModelAndView pesquisa(@Valid ProdutoForm produtoForm, BindingResult result) {
		produtoForm.setProduto(produtoService.pegaPorId(produtoForm.getProduto().getId()));
		return new ModelAndView("exibeProduto").addObject("produtoForm", produtoForm);
	}
	
	public ProdutoService getProdutoService() {
		return produtoService;
	}

	public void setProdutoService(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}

	public ProdutoForm getProdutoForm() {
		return produtoForm;
	}

	public void setProdutoForm(ProdutoForm produtoForm) {
		this.produtoForm = produtoForm;
	}
	
}
