package it.trackme.TM_logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class GestisciAlimentoTest {

	@Test
	public void testAlimentoPresente() {
		Integer idAlimento=GestisciAlimento.inserisciNuovoAlimento("Pollo", 76, 20, 3.6f);
		assertNull(idAlimento);
	}

}
