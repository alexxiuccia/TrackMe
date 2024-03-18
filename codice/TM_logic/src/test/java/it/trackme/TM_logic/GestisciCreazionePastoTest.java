package it.trackme.TM_logic;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class GestisciCreazionePastoTest {

	@Test
	public void test() {
		GestisciCreazionePasto pastoFinito = new GestisciCreazionePasto();
		Integer idAlimento=0;
		
		idAlimento=GestisciAlimento.selezionaAlimento("Piadina");
		int idRicetta=GestisciRicetta.nuovaRicetta("Piadina con prosciutto e formaggio", 150 );
		GestisciComposizioneRicetta.ComposizioneRicetta(idRicetta, idAlimento, 80);
		
		idAlimento=GestisciAlimento.selezionaAlimento("Prosciutto");
		GestisciComposizioneRicetta.ComposizioneRicetta(idRicetta, idAlimento, 20);
		
		idAlimento=GestisciAlimento.selezionaAlimento("Formaggio");
		GestisciComposizioneRicetta.ComposizioneRicetta(idRicetta, idAlimento, 60);
		int idUtente=2;
		LocalDate oggi= LocalDate.now();
		int idPasto=GestisciPasto.inserisciPasto(idUtente, oggi, "pranzo");
		pastoFinito.creazionePasto(idPasto, idRicetta, 1);
		assertNotNull(pastoFinito);
	}

}
