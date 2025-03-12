package br.com.brittospring.webtestapp.controller;

import br.com.brittospring.webtestapp.model.Produto;
import br.com.brittospring.webtestapp.services.IService;
import io.britto.brittospring.annotations.BrittoBody;
import io.britto.brittospring.annotations.BrittoController;
import io.britto.brittospring.annotations.BrittoGetMethod;
import io.britto.brittospring.annotations.BrittoInjected;
import io.britto.brittospring.annotations.BrittoPostMethod;

@BrittoController
public class HelloController {
	
	@BrittoInjected IService service;

	@BrittoGetMethod("/britto")
	public String sayHelloWorld() {
		return "Hello World";
	}
	
	@BrittoGetMethod("/teste")
	public String sayTeste() {
		return "Teste funcionando!";
	}
	
	@BrittoGetMethod("/produto")
	public Produto exibirProduto() {
		Produto p = new Produto();
		p.setNome("Computador");
		p.setPreco(2500.00);
		p.setLinkFoto("computador.jpg");
		return p;
	}
	
	@BrittoPostMethod("/produto")
	public Produto cadastrarProduto(@BrittoBody Produto novoProduto) {
		System.out.println(novoProduto);
		return novoProduto;
		
	}
	
	@BrittoGetMethod("/injected")
	public String sayCustomMessage() {
		return service.sayCustomMessage("Hello World!");
	}
}
