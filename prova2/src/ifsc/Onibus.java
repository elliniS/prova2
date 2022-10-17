package ifsc;

public class Onibus extends Veiculo {
	private int assentos;

	public Onibus() {

	}

	public Onibus(String placa, int ano, int assento) {
		this.setPlaca(placa);
		this.setAno(ano);
		this.setAssentos(assento);
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	@Override
	public String toString() {
		return "Placa: " + this.getPlaca() + ", Ano: " + this.getAno() + ", Assentos: " + this.getAssentos();
	}
}
