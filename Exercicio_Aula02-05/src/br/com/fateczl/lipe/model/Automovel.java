package br.com.fateczl.lipe.model;

public class Automovel extends Veiculo {
	private int qtdePortas;
	private int ano;
	
	public int getQtdePortas() {
		return qtdePortas;
	}
	
	public void setQtdePortas(int qtdePortas) {
		if (qtdePortas >= 3 && qtdePortas <= 5)
			this.qtdePortas = qtdePortas;
		else
			System.out.println("Quantidade de portas inválida.");
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int tempo() {
		return r.nextInt(20) + 10;
	}
	public double deslocamento() { return 0; }
	public int qtdePassageiros() { return 0; }
}
