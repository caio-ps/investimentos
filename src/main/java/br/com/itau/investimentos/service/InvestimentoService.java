package br.com.itau.investimentos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.itau.investimentos.data.InvestimentoEntity;
import br.com.itau.investimentos.data.InvestimentoRepository;
import br.com.itau.investimentos.dto.InvestimentoDTO;

@Service
public class InvestimentoService {

	@Autowired
	private InvestimentoRepository investimentoRepository;
	private final double taxaJuros = 0.007;
	
	public List<InvestimentoDTO> consultaInvestimentos() {
		
		final Iterable<InvestimentoEntity> investimentosBD = investimentoRepository.findAll();
		final List<InvestimentoDTO> investimentos = new ArrayList<>();
		
		for (InvestimentoEntity entity: investimentosBD) {
			final InvestimentoDTO dto = new InvestimentoDTO(
					entity.getValor(),
					entity.getQuantidadeMeses(),
					entity.getMontante());
			investimentos.add(dto);
		}
		
		return investimentos;
		
	}
	
	public InvestimentoDTO criaInvestimento(InvestimentoDTO novoInvestimento) {
		
		//M = C(1+i)t
		final int tempo = novoInvestimento.getQuantidadeMeses();
		final double valor = novoInvestimento.getValor();
		
		final double taxaMultiplicador = Math.pow((1+taxaJuros), tempo);
		final double montante = valor * taxaMultiplicador;
		
		final InvestimentoEntity entity = new InvestimentoEntity(
				novoInvestimento.getValor(),
				novoInvestimento.getQuantidadeMeses(),
				montante);
		
		final InvestimentoEntity created = investimentoRepository.save(entity);
		return new InvestimentoDTO(created.getValor(), created.getQuantidadeMeses(), created.getMontante());
		
	}
	
}
