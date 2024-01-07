
# Project Plan
## 1 Introduzione
### 1.1 Cos'è TrackMe?
TrackMe è una piattaforma progettata per semplificare il monitoraggio e la gestione dell'alimentazione quotidiana. Questo strumento consente agli utenti di registrare con facilità i dettagli dei loro pasti, inclusi i macronutrienti come proteine, carboidrati e grassi, insieme al conteggio delle relative calorie. L'obiettivo è quello di offrire una piattaforma accessibile per tenere traccia degli alimenti consumati, consentendo agli utenti di impostare traguardi personalizzati, monitorare l'apporto nutrizionale e valutare il bilancio calorico giornaliero. Con un focus sulla facilità d'uso e sull'accuratezza dei dati, questa app si propone di essere un prezioso alleato per coloro che desiderano adottare abitudini alimentari più consapevoli e mantenere uno stile di vita sano.

 ### 1.2 Obiettivi 
TrackMe ha dunque 3 funzionalità principali:  
1. Calcolare il fabbisogno calorico giornaliero dell'utente basandosi sulle misure antropometriche fornite da quest'ultimo 
2. Aggiungere/rimuovere alimenti con i relativi macronutrienti
3. Fornire un registro dei progressi nel tempo, mostrando grafici e statistiche 

## 2 Metodo di processo
Il metodo di processo agile selezionato per sviluppare il progetto è il framework Scrum. Il ruolo **Scrum Master** viene ricoperto da ciascun membro del team a rotazione per permetterci di apprenderne meglio la mansione. La compilazione del **Product Backlog**, dello **Sprint Backlog** e delle fasi successive viene gestita attraverso lo strumento *Projects* di **GitHub**.

## 3 Organizzazione del processo
Ogni membro del gruppo partecipa ad incontri per discutere sull'avanzamento del progetto, avanzando proposte per migliorare ed arricchire l'idea iniziale. 
GitHub è lo strumento prescelto sia per la condivisione del codice, la gestione delle versioni e le richieste di modifica, sia per la gestione della documentazione.

Per la fase di sviluppo verrà adottato il modello **Scrum**, il quale rappresenta un approccio agile che favorisce una collaborazione dinamica all'interno del team.
Questo framework prevede cicli iterativi e incrementali (**sprint**), durante i quali la squadra Scrum si impegna a sviluppare un incremento di prodotto potenzialmente consegnabile. Tale approccio consente una maggiore flessibilità nell'affrontare i cambiamenti dei requisiti e assicura una rapida consegna di valore al cliente. Questa fase è caratterizzata da una stretta collaborazione tra i membri del team multifunzionale, che rappresenta le esigenze degli **stakeholder**.
Durante la **sprint planning**, la squadra definisce quali elementi del **product backlog** affronterà nello sprint in corso. Alla fine di ogni sprint, la **sprint review** offre l'opportunità di presentare gli incrementi completati agli stakeholder, mentre la **retrospective** permette alla squadra di riflettere sul proprio processo e identificare miglioramenti.
Questo approccio mira a massimizzare il valore del prodotto attraverso una pianificazione flessibile, feedback regolare e miglioramenti continui.

## 4 Standard, linee guida, procedure
Ci approcceremo allo sviluppo tramite 
[**Java Oracle**](https://www.oracle.com/java/#:~:text=Oracle%20Java%20is%20the%20%231,innovation%2C%20and%20improves%20application%20services.)
 per la scrittura del codice in modo da garantire coerenza e qualità. Per la documentazione adotteremo gli standard [**UML**](https://it.wikipedia.org/wiki/Unified_Modeling_Language/) **(Unified Modeling Language)**, assicurando così una rappresentazione chiara e standardizzata del progetto. Utilizzeremo i diagrammi UML per modellare requisiti, progettazione e strutture di dati, facilitando una comprensione accurata e coesa del sistema.

? Al raggiungimento della prima release del software, verrà pubblicata anche la documentazione. Per assicurare il costante aggiornamento della documentazione, ogni nuova versione del software verrà accompagnata da una nuova documentazione che includerà eventuali nuove specifiche. ?

All'interno delle linee guida dell'organizzazione del progetto, è stabilito che l'implementazione completa del sistema debba avvenire esclusivamente all'interno dell'IDE di **Eclipse**, senza l'utilizzo di servizi esterni. Questa direttiva è stata introdotta con l'obiettivo di garantire uniformità nell'ambiente di sviluppo e semplificare l'integrazione del codice all'interno del contesto dell'IDE di riferimento. Limitare l'uso di servizi esterni contribuirà a semplificare la gestione del progetto e a mantenere il pieno controllo sull'intero processo di sviluppo.

## 5 Attività di gestione
L'amministrazione delle attività è indispensabile per supervisionare e regolare tutti gli elementi creati nel corso dello sviluppo del progetto. Per quanto riguarda le attività di gestione ordinaria:
* Ogni volta che qualcuno effettuerà una modifica avviserà gli altri componenti del gruppo, in modo che tutti siano informati sul progresso.
* Alla fine di ogni sprint avrà luogo una **sprint review**, per la verifica e la validazione di questo.
Questi report constanti permetteranno un controllo continuativo dello sviluppo del progetto. 

## 6 Rischi
Nel contesto della creazione della nostra app sull'alimentazione, ci sono diversi rischi potenziali che è importante considerare e gestire. Alcuni dei rischi comuni associati a questo tipo di progetto possono essere:    
### 6.1 Comprensione Inadeguata dei Requisiti: 
* **Rischio**: Una comprensione incompleta o errata dei requisiti potrebbe portare a sviluppare una soluzione che non soddisfa le necessità degli utenti.
- **Mitigazione**: Eseguire una dettagliata analisi dei requisiti con il coinvolgimento degli stakeholder e del Product Owner. Assicurarsi di avere una chiara visione degli obiettivi e delle aspettative.

 ### 6.2 Difficoltà nell'Accesso alle Informazioni Nutrizionali:
* **Rischio**: L'incapacità di accedere a un database accurato e aggiornato di informazioni nutrizionali potrebbe influire sulla qualità delle funzionalità dell'app.
 **Mitigazione** : Creare database nutrizionali i più completi possibile e dare la possibilità all'utente di inserire alimenti non presenti precendentemente. Prevedere un piano di backup nel caso in cui le risorse principali non siano disponibili.

 ### 6.3 Privacy e Sicurezza dei Dati:
* **Rischio**: La gestione inadeguata dei dati personali degli utenti potrebbe compromettere la privacy e la sicurezza delle informazioni.
- **Mitigazione**: Implementare pratiche di sicurezza robuste, come crittografia dei dati, autenticazione sicura e gestione delle autorizzazioni. Rispettare le normative sulla privacy dei dati, come il GDPR (Regolamento generale sulla protezione dei dati).

### 6.4 Complessità Tecnologica:
* **Rischio**: L'adozione di tecnologie complesse o nuove potrebbe portare a ritardi nello sviluppo o a difficoltà di implementazione.
- **Mitigazione**: Condurre una valutazione approfondita delle tecnologie prima di adottarle. Assicurarsi che il team abbia le competenze necessarie o pianificare la formazione adeguata.

### 6.5 Resistenze al Cambiamento:
* **Rischio**: La resistenza da parte degli utenti o del team alla nuova app o ai cambiamenti nelle abitudini alimentari potrebbe influire sulla sua adozione.
- **Mitigazione**: Coinvolgere gli utenti fin dalle fasi iniziali del progetto, raccogliendo feedback e adattando il design alle loro esigenze. Fornire informazioni chiare sulle funzionalità e i benefici dell'app.

### 6.6 Difficoltà nella Collaborazione di Gruppo:
* **Rischio**: Problemi di comunicazione, mancanza di collaborazione o divergenze tra i membri del team potrebbero rallentare lo sviluppo.
- **Mitigazione**: Implementare processi di comunicazione chiari, assegnazione di ruoli e responsabilità in modo trasparente, e affrontare tempestivamente eventuali conflitti. Partecipare a sessioni di team building.

### 6.7 Vincoli di Tempo e Scadenze:
* **Rischio**: Ritardi nello sviluppo dovuti a scadenze strette o cambiamenti nei tempi previsti.
- **Mitigazione**: Pianificare realisticamente, definire milestone chiare e monitorare costantemente il progresso. Prevedere una certa flessibilità nel piano di progetto per gestire eventuali imprevisti.

### 6.8 Risposta al Feedback degli Utenti:
* **Rischio**: Una risposta lenta o inadeguata al feedback degli utenti potrebbe influire sulla reputazione e sull'adozione dell'app.
- **Mitigazione**: Implementare un sistema di raccolta e gestione del feedback degli utenti. Rispondere prontamente alle preoccupazioni e pianificare regolari aggiornamenti basati sul feedback.

### 6.9 Scarsa Adesione alle Buone Pratiche di Sviluppo:  
* **Rischio**: Ignorare buone pratiche di sviluppo, testing e documentazione potrebbe portare a problemi di qualità e manutenibilità.
- **Mitigazione**: Seguire le migliori pratiche di ingegneria del software, incluso il testing regolare, la documentazione chiara e il versionamento del codice.

È importante identificare e valutare i rischi, sviluppare piani di mitigazione e monitorare costantemente il loro impatto durante il ciclo di vita del progetto.

## 7 Personale
Il team di sviluppo è composto da tre membri:
  
  1. Aceti Alessia (1079023)
  2. De Vivo Massimo (1081227)
  4. Simoni Nicole (1080570)  

Il ruolo di Scrum Master verrà ricoperto a rotazione per permettere a tutti i membri del team di comprenderne le dinamiche ed eventuali difficoltà.
 
## 8 Metodi e tecniche
Per avere una visione più ampia sulle funzionalità del progetto useremo dei diagrammi UML. Dovremo identificare i **casi d'uso** e gli **attori** da inserire nello **USE CASE DIAGRAM**. La modellazione delle classi e la comunicazione tra di esse verrà implementata grazie al **UML CLASS DIAGRAM**, che ci permetterà di identificare attributi e metodi da inserire nelle classi. Inoltre,  essendo che ogni operazione può essere vista come un insieme di messaggi che vengono scambiati tra classi, useremo il **SEQUENCE DIAGRAM** che, fornendoci una modellazione sequenziale, riuscirà a dare un ordine di esecuzione ad ogni operazione. Infine, per modellare i dati da salvare nel nostro db, utilizzeremo un **ER CLASS DIAGRAM**, dove definiremo le varie tabelle da memorizzare e le relative relazioni con le specifiche cardinalità.

## 9 Garanzia di qualità
Per garantire che il software in fase di sviluppo soddisfi i requisiti di qualità dichiarati, è essenziale implementare un'organizzazione e procedure robuste. Alcuni aspetti chiave che dovremo considerare:

### 9.1. Pianificazione della Qualità:
* Definizione degli Obiettivi di Qualità: Stabilire chiaramente gli obiettivi di qualità che il software deve raggiungere. Questi obiettivi dovrebbero essere in linea con le aspettative degli utenti e gli standard del settore.

* Pianificazione del Controllo Qualità: Integrare attività di controllo qualità durante tutto il ciclo di vita del progetto, con focus specifici su revisioni del codice, test e validazione.

### 9.2. Gestione della Configurazione:
* Controllo delle Versioni: Utilizzeremo Github che, grazie alla cronologia, garantisce che ogni versione del software possa essere recuperata e riprodotta.

* Gestione delle modifiche: stabilire procedure chiare per la gestione delle modifiche, con revisioni e approvazioni per garantire che solo modifiche autorizzate vengano implementate.

### 9.3. Revisione del Codice:
* Revisioni regolari: programmare revisioni del codice regolari con la partecipazione dei membri del team. Queste revisioni aiutano a identificare errori, migliorare la qualità del codice e diffondere conoscenze tra i membri del team.

* Standard di codifica: definire e applicare degli standard di codifica. Ciò include la formattazione del codice, la nomenclatura delle variabili e altre pratiche che contribuiscono a una base di codice coerente e di alta qualità.

### 9.4. Attività di test:
* Test unitari: ogni componente del software dovrebbe essere accompagnato da test unitari. L'esecuzione automatica di questi test dovrebbe essere integrata nel processo di build.

* Test di Integrazione e Sistema: Effettuare test di integrazione e sistema per assicurare che le diverse parti del software funzionino correttamente insieme e che il sistema soddisfi i requisiti complessivi.

* Test di Accettazione Utente: Coinvolgere gli utenti nella fase di test di accettazione per garantire che il software soddisfi le aspettative degli utilizzatori finali.

### 9.5. Documentazione:
* Documentazione del Codice: Assicurare che il codice sorgente sia adeguatamente documentato. Ciò include commenti nel codice, ma anche documentazione esterna per facilitare la comprensione e la manutenzione futura.

* Documentazione tecnica: Preparare documentazione tecnica per tuenti e sviluppatori. Questi documenti devono essere aggiornati in modo coerente con il progresso del progetto.

### 9.6. Collaborazione e Comunicazione:
* Comunicazione Trasparente: Mantienere una comunicazione trasparente all'interno del team. Fornire aggiornamenti regolari sullo stato del progetto, sui problemi riscontrati e sulle soluzioni implementate.

* Risoluzione Rapida degli Errori: Implementare procedure per la segnalazione rapida e la risoluzione degli errori. Assicurare che la squadra risponda prontamente alle segnalazioni di bug.

### 9.7. Valutazione Continua:
* Retrospettive del Progetto: Concludere ogni fase o iterazione con retrospettive per valutare cosa è andato bene, cosa può essere migliorato e quali lezioni possono essere apprese.

* Metriche di Qualità: Utilizzare metriche di qualità, come la copertura dei test, la frequenza degli errori e il tempo di risoluzione, per valutare l'efficacia delle attività di sviluppo.

Implementare un sistema di gestione della qualità solido richiede un impegno continuo da parte del team e una cultura organizzativa incentrata sulla qualità e sul miglioramento continuo.

## 10 Risorse
### 10.1 strumenti
domanda: dobbiamo mettere il server che costruiremo tramite java? l'applicativo java come lo rappresentiamo?
Sistemi di controllo: git
Github per caricare situe 
IDE eclipse
Strumenti: intelligenza artificiale
DB  
### 10.2 risorse umane
#### 10.2.1. Sviluppatori (Team di Sviluppo):
* Ruoli: Tutti i membri del  team.
- Descrizione: Questo team è responsabile dello sviluppo effettivo dell'app sull'alimentazione. Ogni membro del team può contribuire a diversi aspetti dello sviluppo, come il front-end, il back-end, la gestione del database, ecc.
#### 10.2.2. Product Owner:
* Ruoli: a rotazione.
- Descrizione: Responsabile di definire e gestire il backlog del prodotto, stabilendo le priorità e rappresentando le esigenze degli utenti.

#### 10.2.3. Scrum Master:
* Ruoli: a rotazione.
- Descrizione: Responsabile di facilitare il processo Scrum, rimuovere gli ostacoli, promuovere la trasparenza e garantire che il team segua le pratiche Scrum.

#### 10.2.4. Utenti Beta/Testers:
* Ruoli: Tutti i membri del team, con coinvolgimento potenziale di altre persone (amici, familiari) per i test beta.
- Descrizione: Partecipano alla fase di test per fornire feedback sull'usabilità e identificare eventuali problemi o miglioramenti necessari.

#### 10.2.5. Responsabile del Controllo Qualità:
* Ruoli: a rotazione.
- Descrizione: Supervisiona le attività di controllo qualità, assicurando che il prodotto soddisfi gli standard di qualità stabiliti.

#### 10.2.6. Coinvolgimento del professore:
* Ruoli: professore.
- Descrizione: Il professore fornisce la supervisione finale, verifica l'aderenza alle linee guida didattiche, offre consigli e valuta il lavoro svolto dal team.
- 
Questa struttura semplificata riflette il fatto che siamo noi membri del team gli attori principali nello sviluppo dell'app, ma è importante includere il coinvolgimento del professore come figura di guida e verifica. Il nostro obiettivo è di comunicare chiaramente le nostre responsabilità e progressi al professore durante le revisioni periodiche.

## 11 Cambiamenti
Ogni cambiamento sarà attentamente discusso con ogni membro. Essendo una squadra agile l'obiettivo è mantenere una forte comunicazione, permessa dalle comuni app di messagistica e dalle piattaforme disponibili per chiamate e condivisione schermo. 
L'utilizzo di GitHub ci consente di tenere automaticamente traccia di tutte le versioni dei file caricati, offrendo la possibilità di recuperare facilmente versioni precedenti per valutazioni comparative o per apportare modifiche necessarie. 
L'obiettivo è apportare modifiche significative per migliorare l'applicazione.
 
## 12 Consegna
Entro il 15/01/2024 avverrà la consegna del project plan.
La data di Consegna Finale è prevista per il 15/02/2024. Potrebbero essere effettuate ultimissime manutenzioni nei giorni immediatamente successivi alla consegna, prima della discussione orale in aula col professore. Questo offre una finestra di flessibilità per apportare modifiche minori o risolvere eventuali problemi dell'ultimo minuto.
Tutti i file di lavoro vengono caricati volta per volta su GitHub.
