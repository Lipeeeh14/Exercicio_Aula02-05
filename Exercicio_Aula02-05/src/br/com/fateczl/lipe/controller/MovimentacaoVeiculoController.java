package br.com.fateczl.lipe.controller;

import br.com.fateczl.lipe.model.Automovel;
import br.com.fateczl.lipe.model.Caminhao;
import br.com.fateczl.lipe.model.Motocicleta;
import br.com.fateczl.lipe.model.Van;
import br.com.fateczl.lipe.model.Veiculo;

public class MovimentacaoVeiculoController {
	
	public void inicioMovimentacao(Veiculo veiculo) {
		System.out.println("Veiculo em movimentação...");
		veiculo.toString();
	}
	
	public void movimentacaoVeiculo(Veiculo veiculo) {
		if (veiculo.getClass().getSimpleName().equals(Automovel.class.getSimpleName())) {
			Automovel a = (Automovel) veiculo;
			System.out.println("Tempo levado para chegar a 100 km/h: "+ a.tempo() + "s");
		} else if (veiculo.getClass().getSimpleName().equals(Caminhao.class.getSimpleName())) {
			Caminhao c = (Caminhao) veiculo;
			System.out.println("Carga: " + c.carga() + "Kg\n" +
					"Tamanho do deslocamento: " + c.deslocamento() + "Km\n" +
					"Frete: R$ " + c.frete());
		} else if (veiculo.getClass().getSimpleName().equals(Motocicleta.class.getSimpleName())) {
			Motocicleta m = (Motocicleta) veiculo;
			System.out.println("Tamanho do deslocamento: " + m.deslocamento() + "Km\n" +
			"Frete: R$ " + m.frete());
		} else {
			Van v = (Van) veiculo;
			System.out.println("Número de passageiros: " + v.qtdePass() + "\n" +
			"Número de paradas: " + v.qtdeParadas());
		}
	}
}
