package br.com.fateczl.lipe.model;

public class Motocicleta extends Veiculo {
	private int cilindradas;

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	public double deslocamento() {
		return this.r.nextDouble(80) + 20;
	}
	
	public double frete() { 
		return this.r.nextDouble(50) + 30;
	}
}
