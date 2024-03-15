package it.trackme.TM_logic;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class GestisciPianoAlimentareTest {

	@Test
	public void test() {
		int idAlimento=0;
		
		idAlimento=GestisciAlimento.inserisciNuovoAlimento("Pollo", 76, 20, 3.6f);
		int idRicetta=GestisciRicetta.nuovaRicetta("Pollo con riso e zucchine", 100 );
		GestisciComposizioneRicetta.ComposizioneRicetta(idRicetta, idAlimento, 80);
		
		idAlimento=GestisciAlimento.inserisciNuovoAlimento("Zucchine", 3.11f, 1.21f, 0.32f);
		GestisciComposizioneRicetta.ComposizioneRicetta(idRicetta, idAlimento, 20);
		
		idAlimento=GestisciAlimento.inserisciNuovoAlimento("Riso", 80.4f, 6.7f, 0.4f);
		GestisciComposizioneRicetta.ComposizioneRicetta(idRicetta, idAlimento, 60);
		
		int idUtente=1;
		LocalDate oggi = LocalDate.now();
		int idPasto= GestisciPasto.inserisciPasto(idUtente, oggi, "pranzo");
		GestisciPasto.inserisciDoseRicettaInPasto(idPasto, idRicetta, 2);
		
		GestisciPianoAlimentare.consumoDelGiorno(idUtente);
		fail("Test non riuscito");
		
		
	}

}
