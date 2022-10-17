package ifsc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Onibus> listOnibus = new ArrayList<>();
		ArrayList<Caminhao> listCaminhao = new ArrayList<>();

		listOnibus.add(new Onibus("O1111", 10, 4));
		listOnibus.add(new Onibus("O2222", 20, 8));
		listOnibus.add(new Onibus("O3333", 30, 16));

		listCaminhao.add(new Caminhao("C1111", 01, 3));
		listCaminhao.add(new Caminhao("C2222", 02, 6));
		listCaminhao.add(new Caminhao("C3333", 03, 14));

		for (Onibus onibus : listOnibus) {
			System.out.println(onibus);
		}

		System.out.println("");

		for (Caminhao caminhao : listCaminhao) {
			System.out.println(caminhao);
		}

	}

}
