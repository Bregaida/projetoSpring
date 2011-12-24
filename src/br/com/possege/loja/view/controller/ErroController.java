package br.com.possege.loja.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ErroController {

	@RequestMapping("/**")
	public ModelAndView erro() {
		return new ModelAndView("erro");
	}
}
