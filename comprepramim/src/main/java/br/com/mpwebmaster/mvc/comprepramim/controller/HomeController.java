package br.com.mpwebmaster.mvc.comprepramim.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.mpwebmaster.mvc.comprepramim.models.Pedido;


@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNome("Galaxy Tab A8");
		pedido.setUrlImagem("https://images.samsung.com/is/image/samsung/p6pim/br/sm-x200nzauzto/gallery/br-galaxy-a8-sm-x200-sm-x200nzauzto-531014276?$730_584_PNG$");
		pedido.setUrlProduto("https://www.samsung.com/br/tablets/galaxy-tab-a/galaxy-tab-a8-wifi-dark-gray-64gb-sm-x200nzauzto/");
		pedido.setDescricao("Descrição do pedido");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}

}
