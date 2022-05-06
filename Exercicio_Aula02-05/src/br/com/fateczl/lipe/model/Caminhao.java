package br.com.fateczl.lipe.model;

public class Caminhao extends Veiculo {
	private int qtdeEixos;
	private int cargaMaxima;
	
	public int getQtdeEixos() {
		return qtdeEixos;
	}
	public void setQtdeEixos(int qtdeEixos) {
		this.qtdeEixos = qtdeEixos;
	}
	public int getCargaMaxima() {
		return cargaMaxima;
	}
	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	
	public int carga() { 
		return this.r.nextInt(2000) + 1000;
	}
	
	public double deslocamento() { 
		return this.r.nextDouble(2500) + 500; 
	}
	
	public double frete() { 
		return this.r.nextDouble(50) + 30;
	}
}
