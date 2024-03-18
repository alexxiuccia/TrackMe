package it.trackme.TM_logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class GestisciComposizioneRicettaTest {

	@Test
	public void test() {
		GestisciComposizioneRicetta ricettaFinita = new GestisciComposizioneRicetta();
		int idAlimento=0;
		
		idAlimento=GestisciAlimento.selezionaAlimento("Pollo");
		int idRicetta=GestisciRicetta.nuovaRicetta("Pollo con riso e zucchine", 100 );
		GestisciComposizioneRicetta.ComposizioneRicetta(idRicetta, idAlimento, 80);
		
		idAlimento=GestisciAlimento.selezionaAlimento("Zucchine");
		GestisciComposizioneRicetta.ComposizioneRicetta(idRicetta, idAlimento, 20);
		
		idAlimento=GestisciAlimento.selezionaAlimento("Riso");
		GestisciComposizioneRicetta.ComposizioneRicetta(idRicetta, idAlimento, 60);
		
		assertNotNull(ricettaFinita);
		
		
	}

}
