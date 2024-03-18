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
	

}
