Per quanto riguarda la gestione della configurazione, sia per il codice che per la documentazione, abbiamo adottato l'utilizzo di una repository condivisa su GitHub, accessibile a tutto il team.

**Organizzazione della repository:**
All'interno della repository, i file essenziali come licenza, readme e script per l'installazione sono collocati direttamente nella radice. Inoltre, sono presenti due directory principali:

- **codice:** Contiene il codice del sito web.
- **documentazione:** Tutta la documentazione prodotta viene archiviata in questa directory.

**Gestione delle modifiche:**
La baseline del progetto è situata nel branch "main". Le modifiche vengono apportate principalmente sul main, poichè prima di confermare il caricamento di una modifica ci accordiamo sulla congruenza delle modifiche effettuate. Branch aggiuntivi possono essere creati per risolvere problemi specifici o partire da un issue. Le modifiche presenti su branch secondari possono essere integrate nel main attraverso il seguente processo:

1. Chi sta lavorando su un branch crea una pull request, richiedendo una revisione.
2. Il revisore designato può approvare il lavoro svolto o richiedere modifiche.
3. Se la pull request è approvata, avviene il merge del branch nel main; in caso contrario, vengono apportate le modifiche richieste e si riparte dal punto 1.

**Assegnazione dei compiti:**
I compiti per ciascun membro del team sono disponibili nella sezione Projects di GitHub. All'inizio del progetto, è stata creata una lista di funzionalità da implementare, denominata "Product Backlog", che può essere aggiornata in seguito. Ad ogni inizio di sprint, vengono selezionate le funzionalità da implementare e spostate nella sezione "Sprint Backlog". Nel caso di funzionalità più estese assegnate a più persone, è possibile aprire delle issue per suddividere le sotto-funzionalità. 

Per segnalazioni di bug, problemi e checklist, vengono aperte issue apposite assegnando il membro designato.
