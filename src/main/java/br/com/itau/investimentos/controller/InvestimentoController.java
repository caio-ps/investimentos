package br.com.itau.investimentos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.investimentos.dto.InvestimentoDTO;
import br.com.itau.investimentos.service.InvestimentoService;

@RestController
public class InvestimentoController {
	
	@Autowired
	private InvestimentoService investimentoService;
	
	@GetMapping("/investimento")
	public List<InvestimentoDTO> getInvestimentos() {
		
		List<InvestimentoDTO> lista = new ArrayList<>();
		InvestimentoDTO teste = new InvestimentoDTO();
		teste.setMontante(99.99);
		teste.setQuantidadeMeses(12);
		teste.setValor(80.27);
		
		lista.add(teste);
		
		return lista;
		
	}
	
	@PostMapping("/investimento")
	public InvestimentoDTO createInvestimento(@RequestBody InvestimentoDTO novoInvestimento) {
		return investimentoService.criaInvestimento(novoInvestimento);
	}

}
