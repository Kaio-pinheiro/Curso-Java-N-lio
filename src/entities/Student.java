package entities;

import java.util.ArrayList;
import java.util.List;

public class Student {

	public String name;
	public List<Double> listaNotas = new ArrayList<>();
	
	public double media() {
		for(double notas : listaNotas) {
			return listaNotas.get(0) + listaNotas.get(1) + listaNotas.get(2);
		}
		return 0;
	}
	
	public double result() {
		if (media() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", pontosFaltam());
		} else {
			System.out.println("PASS");
		}
		return 0;
	}
	
	public double pontosFaltam() {
		if (media()< 60.0) {
			return 60.0 - media();
		}else {
			return 0.0;
		}
		
	}
}
