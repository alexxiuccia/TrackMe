package it.trackme.TM_logic;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class GestisciPianoAlimentareTest {

	@Test
	public void CalorieGiornalieretest() {
		int idUtente=2;
		
		int result= GestisciPianoAlimentare.consumoDelGiorno(idUtente);
		assertTrue(result > 0);
		
		
	}

	@Test
	public void CaloriePeriodotest() {
		int idUtente=2;
		LocalDate dataInizio= LocalDate.of(2024,3,15);
		LocalDate dataFine= LocalDate.of(2024,3,18);
		int result= GestisciPianoAlimentare.consumoPeriodo(dataInizio, dataFine, idUtente);
		assertTrue(result > 0);
		
		
	}
}
