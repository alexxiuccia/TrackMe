package it.trackme.TM_logic;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import it.trackme.TM_db.DBconnection;
import it.trackme.jooq.generated.tables.Alimento;
import it.trackme.jooq.generated.tables.Composizionericetta;
import it.trackme.jooq.generated.tables.Ricetta;
import it.trackme.jooq.generated.tables.records.AlimentoRecord;
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
	public static void inserisciQuantitaAlimentoInRicetta(int idRicetta, int idAlimento, int quantita) {
        DSLContext create = DSL.using(DBconnection.getConnection(), SQLDialect.SQLITE);

        
        RicettaRecord ricetta = create.selectFrom(Ricetta.RICETTA)
                .where(Ricetta.RICETTA.IDRICETTA.eq(idRicetta))
                .fetchOne();

        AlimentoRecord alimento = create.selectFrom(Alimento.ALIMENTO)
                .where(Alimento.ALIMENTO.IDALIMENTO.eq(idAlimento))
                .fetchOne();

        if (ricetta != null && alimento != null) {
            
            create.insertInto(Composizionericetta.COMPOSIZIONERICETTA)
                    .set(Composizionericetta.COMPOSIZIONERICETTA.IDRICETTA, idRicetta)
                    .set(Composizionericetta.COMPOSIZIONERICETTA.IDALIMENTO, idAlimento)
                    .set(Composizionericetta.COMPOSIZIONERICETTA.DOSE, quantita)
                    .execute();

            System.out.println("Alimento aggiunto con successo alla ricetta con ID: " + idRicetta);
        } else {
            
            System.out.println("Ricetta o alimento non trovato.");
        }
	}	
}
