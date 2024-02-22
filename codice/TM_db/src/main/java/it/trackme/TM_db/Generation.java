package it.trackme.TM_db;

import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.Configuration;
import org.jooq.meta.jaxb.Database;
import org.jooq.meta.jaxb.Generator;
import org.jooq.meta.jaxb.Jdbc;
import org.jooq.meta.jaxb.Target;

public class Generation {

	public static void main(String[] args) {
		Configuration configuration = new Configuration()
				.withJdbc(new Jdbc().withDriver("org.sqlite.JDBC")
				.withUrl(DBconnection.DB_URL))
				.withGenerator(new Generator()
				.withDatabase(new Database().withName("org.jooq.meta.sqlite.SQLiteDatabase").withIncludes(".*")
				.withExcludes(""))
				.withTarget(new Target().withPackageName("it.trackme.jooq.generated")
				.withDirectory("src-generated/")));
		try {
			GenerationTool.generate(configuration);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
