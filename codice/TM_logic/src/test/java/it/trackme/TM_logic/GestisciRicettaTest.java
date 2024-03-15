package it.trackme.TM_logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class GestisciRicettaTest {

	@Test
	public void test() {
		
		int idAlimento=0;
		GestisciRicetta ricetta= new GestisciRicetta();

		idAlimento=GestisciAlimento.inserisciNuovoAlimento("Agnello", 76, 20, 3.6f);
		int idRicetta=GestisciRicetta.nuovaRicetta("Agnello", 100 );
		ricetta.inserisciQuantitaAlimentoInRicetta(idRicetta, idAlimento, 80);
		assertNotNull(ricetta);
	}

}
