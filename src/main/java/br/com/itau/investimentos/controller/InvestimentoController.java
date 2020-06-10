package br.com.itau.investimentos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.investimentos.dto.InvestimentoDTO;
import br.com.itau.investimentos.service.InvestimentoService;

@RestController
public class InvestimentoController {
	
	@Autowired
	private InvestimentoService investimentoService;
	
	@GetMapping("/investimento")
	public List<InvestimentoDTO> getInvestimentos() {
		return investimentoService.consultaInvestimentos();
	}
	
	@PostMapping("/investimento")
	@ResponseStatus(HttpStatus.CREATED)
	public InvestimentoDTO createInvestimento(@RequestBody InvestimentoDTO novoInvestimento) {
		return investimentoService.criaInvestimento(novoInvestimento);
	}

}
