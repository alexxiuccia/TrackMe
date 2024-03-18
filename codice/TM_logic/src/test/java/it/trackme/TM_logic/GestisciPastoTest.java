package it.trackme.TM_logic;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.junit.Test;

public class GestisciPastoTest {

	@Test
	public void testPassaggioId() {
		LocalDate data = LocalDate.of(2022,11,05);
		int result= GestisciPasto.inserisciPasto(0, data, "pranzo");
		assertNotNull(result);
	}
	
	@Test
	public void testInserisciDoseRicettaInPasto() {
		int idAlimento;
		
		idAlimento=GestisciAlimento.inserisciNuovoAlimento("Pollo", 76, 20, 3.6f);
		int idRicetta=GestisciRicetta.nuovaRicetta("Pollo con riso e zucchine", 100 );
		GestisciComposizioneRicetta.ComposizioneRicetta(idRicetta, idAlimento, 80);
		
		idAlimento=GestisciAlimento.inserisciNuovoAlimento("Zucchine", 3.11f, 1.21f, 0.32f);
		GestisciComposizioneRicetta.ComposizioneRicetta(idRicetta, idAlimento, 20);
		
		idAlimento=GestisciAlimento.inserisciNuovoAlimento("Riso", 80.4f, 6.7f, 0.4f);
		GestisciComposizioneRicetta.ComposizioneRicetta(idRicetta, idAlimento, 60);
		
		int idUtente=2;
		LocalDate oggi = LocalDate.now();
		GestisciPasto pasto= new GestisciPasto();
		GestisciPasto.inserisciPasto(idUtente, oggi, "cena");
		assertNotNull(pasto);
	}

}
