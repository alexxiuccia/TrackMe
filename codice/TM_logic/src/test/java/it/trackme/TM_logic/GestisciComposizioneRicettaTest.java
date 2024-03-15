package it.trackme.TM_logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class GestisciComposizioneRicettaTest {

	@Test
	public void test() {
		GestisciComposizioneRicetta ricettaFinita = new GestisciComposizioneRicetta();
		int idAlimento=0;
		
		idAlimento=GestisciAlimento.inserisciNuovoAlimento("Pollo", 76, 20, 3.6f);
		int idRicetta=GestisciRicetta.nuovaRicetta("Pollo con riso e zucchine", 100 );
		GestisciComposizioneRicetta.ComposizioneRicetta(idRicetta, idAlimento, 80);
		
		idAlimento=GestisciAlimento.inserisciNuovoAlimento("Zucchine", 3.11f, 1.21f, 0.32f);
		GestisciComposizioneRicetta.ComposizioneRicetta(idRicetta, idAlimento, 20);
		
		idAlimento=GestisciAlimento.inserisciNuovoAlimento("Riso", 80.4f, 6.7f, 0.4f);
		GestisciComposizioneRicetta.ComposizioneRicetta(idRicetta, idAlimento, 60);
		
		assertNotNull(ricettaFinita);
		
		
	}

}
