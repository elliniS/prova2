package ifsc;

public class Caminhao extends Veiculo {
	private int eixos;

	public Caminhao() {

	}

	public Caminhao(String placa, int ano, int eixos) {
		this.setPlaca(placa);
		this.setAno(ano);
		this.setEixos(eixos);
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixo) {
		this.eixos = eixo;
	}

	@Override
	public String toString() {
		return "Placa: " + this.getPlaca() + ", Ano: " + this.getAno() + ", eixos: " + this.getEixos();
	}

}
