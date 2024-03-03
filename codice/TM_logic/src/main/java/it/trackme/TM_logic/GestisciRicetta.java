package it.trackme.TM_logic;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import it.trackme.TM_db.DBconnection;
import it.trackme.jooq.generated.tables.Ricetta;
import it.trackme.jooq.generated.tables.records.RicettaRecord;


public class GestisciRicetta {
	public static int nuovaRicetta(String nome, int quantita) {
		DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);
		RicettaRecord ricetta = create.newRecord(Ricetta.RICETTA);
		ricetta.setNome(nome);
		ricetta.setQuantità(quantita);
		ricetta.store();
		return ricetta.getIdricetta();

	}
	public static void aggiornaQuantita(int idRicetta, int quantita) {
        DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);

        // Cerca la ricetta nel database
        RicettaRecord ricetta = create.selectFrom(Ricetta.RICETTA)
                                     .where(Ricetta.RICETTA.IDRICETTA.eq(idRicetta))
                                     .fetchOne();

        if (ricetta != null) {
            // Aggiorna la quantità se la ricetta è stata trovata
            ricetta.setQuantità(quantita);
            ricetta.store();
            System.out.println("Quantità aggiornata con successo per la ricetta con ID: " + idRicetta);
        } else {
            // La ricetta non è stata trovata
            System.out.println("Ricetta non trovata con ID: " + idRicetta);
        }
    }
	
}
