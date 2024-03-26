package it.trackme.TM_logic;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import it.trackme.jooq.generated.tables.records.UserRecord;


public class GestisciUtenteTest {

	@Test
	public void testUtenteGiaRegistrato() {
        String nomeUtente = new String("MarcoRossi10"); 
        boolean result = GestisciUtente.registraUtente( nomeUtente,"Marco", "Rossi", LocalDate.of(1990, 5, 20), 70.5f, 170, 30, "Attivo", "password",1800);
        assertFalse(result);
	}
	@Test
	public void testdataNascitaErrore() {
		LocalDate data = LocalDate.of(2026,11,05);
        boolean result = GestisciUtente.registraUtente( "Luca18 ","Luca", "Rossi", data, 80f, 175, 18, "Leggermente attivo", "password",1600);
        assertFalse(result);
	}
	
	@Test
	public void testNuovoUtente() {
		LocalDate data= LocalDate.of(2001, 5,21);
		boolean result = GestisciUtente.registraUtente( "Giovanni2 ","Giovanni", "Totti", data, 80f, 175, 18, "Leggermente attivo", "password",1700);
		//assertTrue(result);
		
	}
	
	@Test
	public void testAccesso() {
		LocalDate data= LocalDate.of(2001, 5,21);
		UserRecord result = GestisciUtente.accessoUtente( "Giovanni2 ", "password");
		//assertTrue(result);
		
	}
}
