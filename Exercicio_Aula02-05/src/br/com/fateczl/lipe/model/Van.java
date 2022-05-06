package br.com.fateczl.lipe.model;

public class Van extends Veiculo {
	public int qtdePass() {
		return this.r.nextInt(9) + 3;
	}
	
	public int qtdeParadas() {
		return this.r.nextInt(9) + 3;
	}
}
