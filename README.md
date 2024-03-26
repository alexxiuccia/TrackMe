# TrackMe

  ![Logo](https://github.com/alexxiuccia/TrackMe/assets/92911810/9bcbcbcf-0611-4adf-bdf8-306c6fd02873)

Progetto di Ingegneria del Software del corso di laurea triennale in Ingegneria Informatica presso l'Università degli Studi di Bergamo.

* Aceti Alessia (1079023)
* De Vivo Massimo (1081227)
* Simoni Nicole (1080570)

# **ISTRUZIONI**

## **ESECUZIONE DA TERMINALE**
### Passaggi per eseguire l'applicativo JavaFX TrackMe da terminale:

1. **Eseguire il progetto TM_db:**
   - Assicurarsi di avere Maven installato sul sistema.
   - Navigare nella directory del progetto TM_db tramite il terminale.
   - Eseguire il comando Maven per l'installazione:
     ```bash
     mvn install
     ```

2. **Eseguire il progetto TM_logic:**
   - Navigare nella directory del progetto TM_logic tramite il terminale.
   - Eseguire il comando Maven per l'installazione:
     ```bash
     mvn install
     ```

3. **Eseguire il progetto TM_fxml:**
   - Navigare nella directory del progetto TM_fxml tramite il terminale.
   - Eseguire una build personalizzata con Maven, utilizzando i seguenti obiettivi:
     ```bash
     mvn clean javafx:run
     ```

## **ESECUZIONE TRAMITE ECLIPSE**
### Passaggi per eseguire l'applicativo JavaFX TrackMe utilizzando Eclipse:

1. **Esegui il progetto TM_db:**
   - Importa il progetto TM_db in Eclipse:
     1. Apri Eclipse e seleziona `File` > `Import...`.
     2. Seleziona `Existing Maven Projects` e premi `Next`.
     3. Naviga nella directory del progetto TM_db e premi `Finish`.
   - Esegui l'installazione del progetto TM_db:
     1. Fai clic destro sul progetto TM_db nell'esploratore di progetti.
     2. Seleziona `Run As` > `Maven install`.

2. **Esegui il progetto TM_logic:**
   - Importa il progetto TM_logic in Eclipse seguendo gli stessi passaggi di cui sopra.
   - Esegui l'installazione del progetto TM_logic come hai fatto per TM_db.

3. **Esegui il progetto TM_fxml:**
   - Importa il progetto TM_fxml in Eclipse come hai fatto per gli altri progetti.
   - Configura una build personalizzata per eseguire il progetto TM_fxml:
     1. Fai clic destro sul progetto TM_fxml nell'esploratore di progetti.
     2. Seleziona `Run As` > `Run Configurations...`.
     3. Nella finestra di configurazione, seleziona `Maven Build`.
     4. Crea una nuova configurazione e imposta i seguenti campi:
        - **Name**: TM_fxml_run
        - **Base directory**: Seleziona il percorso del progetto TM_fxml.
        - **Goals**: `clean javafx:run`
     5. Fai clic su `Apply` e poi su `Run`.

Una volta completati questi passaggi, l'applicativo TrackMe dovrebbe essere avviato correttamente da Eclipse. Assicurarsi di seguire l'ordine specificato per l'esecuzione dei progetti.
