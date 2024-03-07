package it.trackme.TM_logic;

import java.time.LocalDate;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import it.trackme.TM_db.DBconnection;
import it.trackme.jooq.generated.tables.Creazionepasto;
import it.trackme.jooq.generated.tables.Pasto;
import it.trackme.jooq.generated.tables.Ricetta;
import it.trackme.jooq.generated.tables.records.PastoRecord;
import it.trackme.jooq.generated.tables.records.RicettaRecord;

public class GestisciPasto {
	public static int inserisciPasto(int idUtente, LocalDate data, String tipoPasto)
	{
		DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);
    	PastoRecord pasto = create.newRecord(Pasto.PASTO);
    	pasto.setIdutente(idUtente);
    	pasto.setData(data);
    	pasto.setTipo(tipoPasto);
    	pasto.store();
    	return pasto.getIdpasto();
	}
	public static void inserisciDoseRicettaInPasto(int idPasto, int idRicetta, int dose) {
        DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);

        // Verifica che il pasto e la ricetta esistano prima di procedere
        PastoRecord pasto = create.selectFrom(Pasto.PASTO)
                .where(Pasto.PASTO.IDPASTO.eq(idPasto))
                .fetchOne();

        RicettaRecord ricetta = create.selectFrom(Ricetta.RICETTA)
                .where(Ricetta.RICETTA.IDRICETTA.eq(idRicetta))
                .fetchOne();

        if (pasto != null && ricetta != null) {
            // Aggiunge l'associazione tra pasto e ricetta nella tabella di associazione
            create.insertInto(Creazionepasto.CREAZIONEPASTO)
                    .set(Creazionepasto.CREAZIONEPASTO.IDPASTO, idPasto)
                    .set(Creazionepasto.CREAZIONEPASTO.IDRICETTA, idRicetta)
                    .set(Creazionepasto.CREAZIONEPASTO.QUANTITÀ, dose)
                    .execute();
            

            System.out.println("Ricetta aggiunta con successo al pasto con ID: " + idPasto);
        } else {
            // Il pasto o la ricetta non esiste
            System.out.println("Pasto o ricetta non trovato.");
        }
    }

}
