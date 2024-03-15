package it.trackme.TM_logic;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class GestisciPianoAlimentareTest {

	@Test
	public void test() {
		int idUtente=2;
		
		int result= GestisciPianoAlimentare.consumoDelGiorno(idUtente);
		assertTrue(result > 0);
		
		
	}

}
