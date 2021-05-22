# Proiect Java, Popescu Mircea-Mihail

### ETAPA 1:
Clasele definite:  
* Abonament
* Angajat
* Autor
* Bibliotecar
* Carte
* Cititor
* CosCumparaturi
* Persoana
* Tehnoredactor

Actiunile implementate:  
* Ordonarea alfabetica a bibliotecarilor
* Adaugarea unui nou bibliotecar
* Majorarea salariilor bibliotecarilor in functie de gradul acestora
* Extragerea datei de nastere din CNP-urile bibliotecarilor
* Diminuarea salariilor tehnoredactorilor
* Afisarea autorilor in ordinea descrescatoare popularitatii
* Scrierea cu majuscule a numelui autorului care are popularitatea cel putin egala cu 8
* Adaugarea in Hall of Fame a autorilor care indeplinesc anumite conditii
* Reducerea pretului cartilor de securitate cibernetica
* Afisarea cartilor cu un pret mai mic decat cel introdus de la tastatura
* Verificarea valabilitatii abonamentului
* Afisarea unui mesaj pentru cititorii cu abonament Elite
* La achizitionarea a 3 carti se ofera un abonament Elite


### ETAPA 2: 
* Adaugarea serviciului de citire, respectiv de scriere in fisiere CSV: CitireCSV, ScriereCSV
* Crearea fisierului CSV, Audit.csv, in care se va scrie de fiecare data cand o actiune va fi executa. Se va afisa numele actiunii, respectiv data si ora la care a fost executata actiunea.
* Crearea celor 5 fisiere CSV (Autor, Bibliotecar, Carte, Cititor, Tehnoredactor) in care se poate scrie sau citi. Actiunile realizate in prima etapa au fost adaptate astfel incat sa permita prelucrarea datelor introduse in fisierele CSV.
* Realizarea serviciului de audit, ServiciuAudit, ce retine numele actiunii + data si ora la care actiunea a fost executata.
* Se poate citi un numar de autori, bibliotecari, carti, cititori sau tehnoredactori in fisierele CSV corespunzatoare.


### ETAPA 3:
* Realizarea serviciului ConexiuneBD care permite conectarea la baza de date.
* Operatiile CRUD pot fi aplicate urmatoarelor clase: Autor, Bibliotecar, Carte, Cititor, Tehnoredactor.
* Clasa AdaugareBDCSV permite adaugarea datelor din fisierele CSV (Autor.csv, Bibliotecar.csv, Carte.csv, Cititor.csv, Tehnoredactor.csv) direct in baza de date.
