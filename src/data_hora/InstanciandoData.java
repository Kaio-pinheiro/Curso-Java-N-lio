package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciandoData {

	public static void main(String[] args) {
		// Documentação 
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		//https://docs-oracle-com.translate.goog/javase/jp/17/docs/api/java.base/java/time/format/DateTimeFormatter.html?_x_tr_sl=ja&_x_tr_tl=pt&_x_tr_hl=pt-BR&_x_tr_pto=sc
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate dataSemHora = LocalDate.now();
		LocalDateTime dataComHora = LocalDateTime.now();
		Instant dataComHoraDeLondres = Instant.now();
		LocalDate d04 = LocalDate.parse("2024-10-24");
		LocalDateTime d05 = LocalDateTime.parse("2024-10-24T01:20:25");
		Instant d06 = Instant.parse("2024-10-24T01:20:25Z");
		Instant d07 = Instant.parse("2024-10-24T01:20:25-03:00");
		LocalDate d08 = LocalDate.parse("20/02/2024", fmt1);
		LocalDate d09 = LocalDate.parse("20/02/2024 01:30", fmt2);
		LocalDate d10 = LocalDate.of(2024,  10, 20);
		LocalDateTime d11 = LocalDateTime.of(2024,  10, 20, 1, 30);
		
		
		System.out.println("Data sem hora: " + dataSemHora);
		System.out.println();
		System.out.println("Data com hora: " + dataComHora);
		System.out.println();
		System.out.println("Data com horario de Londres: " + dataComHoraDeLondres);
		System.out.println();
		System.out.println("Pega um texto ISO e gera uma data apartir dele: " + d04);
		System.out.println();
		System.out.println("Pega um texto ISO e gera uma data e hora apartir dele: " + d05);
		System.out.println();
		System.out.println("Pega um texto ISO e gera uma data e hora apartir dele no horario de Londres: " + d06);
		System.out.println();
		System.out.println("Pega um texto ISO e gera uma data e hora do Brasil no horario de Londres: " + d07);
		System.out.println();
		System.out.println(d08);
		System.out.println();
		System.out.println("Era pra ter vindo o horario junto, porem nao está vindo: " + d09);
		System.out.println();
		System.out.println(d10);
		System.out.println();
		System.out.println(d11);
	}

}
