package br.com.fateczl.lipe.view;

import br.com.fateczl.lipe.controller.MovimentacaoVeiculoController;
import br.com.fateczl.lipe.model.Automovel;

public class Main {

	public static void main(String[] args) {
		Automovel a = new Automovel();
		a.setAno(2000);
		a.setCor("Cinza");
		a.setMarca("Fiat");
		a.setModelo("Sei lá");
		a.setPlaca("ABC-0303");
		a.setQtdePortas(2);
		a.setVelocidadeMaxima(100);
		
		MovimentacaoVeiculoController mov = new MovimentacaoVeiculoController();
		mov.inicioMovimentacao(a);
		mov.movimentacaoVeiculo(a);
	}
	
	
}
