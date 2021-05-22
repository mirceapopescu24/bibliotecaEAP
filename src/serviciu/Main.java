package serviciu;

import BazaDeDate.*;
import Clase.*;

import java.io.*;
import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        ArrayList<Bibliotecar> bibliotecar = new ArrayList<>();
        ArrayList<Tehnoredactor> tehno = new ArrayList<>();
        ArrayList<Autor> autor = new ArrayList<>();
        ArrayList<Carte> carte = new ArrayList<>();
        ArrayList<Cititor> cititori = new ArrayList<>();
        CitesteCSV.getInstance().Citeste_Carte(carte);
        CitesteCSV.getInstance().Citeste_Autor(autor);
        CitesteCSV.getInstance().Citeste_Cititor(cititori);
        CitesteCSV.getInstance().Citeste_Tehnoredactor(tehno);
        CitesteCSV.getInstance().Citeste_Bibliotecar(bibliotecar);
        System.out.println("Apasati tasta 1 pentru ordonarea crescatoare a bibliotecarilor din fisier.");
        System.out.println("Apasati tasta 2 pentru introducerea unui bibliotecar in fisier.");
        System.out.println("Apasati tasta 3 pentru marirea salariilor bibliotecarilor din fisier.");
        System.out.println("Apasati tasta 4 pentru aflarea datei de nastere.");
        System.out.println("Apasati tasta 5 pentru diminuarea salariilor tehnoredactorilor.");
        System.out.println("Apasati tasta 6 pentru afisarea autorilor in ordinea descrescatoare popularitatii.");
        System.out.println("Apasati tasta 7 pentru scrierea cu majuscule a numelor autorilor avand popularitatea cel putin egala cu 8.");
        System.out.println("Apasati tasta 8 pentru afisarea autorilor din Hall of Fame.");
        System.out.println("Apasati tasta 9 pentru reducerea si afisarea cartilor de cybersecurity.");
        System.out.println("Apasati tasta 10 pentru afisarea cartilor cu un pret mai mic decat cel introdus de la tastatura.");
        System.out.println("Apasati tasta 11 pentru a scrie in fisierul Bibliotecar.csv");
        System.out.println("Apasati tasta 12 pentru a scrie in fisierul Tehnoredactor.csv");
        System.out.println("Apasati tasta 13 pentru a scrie in fisierul Autor.csv");
        System.out.println("Apasati tasta 14 pentru a scrie in fisierul Carte.csv");
        System.out.println("Apasati tasta 15 pentru a introduce un numar de bibliotecari in baza de date.");
        System.out.println("Apasati tasta 16 pentru a afisa bibliotecarii din baza de date.");
        System.out.println("Apasati tasta 17 pentru actualizarea salariului unui bibliotecar.");
        System.out.println("Apasati tasta 18 pentru a sterge un bibliotecar din baza de date.");
        System.out.println("Apasati tasta 19 pentru a introduce un numar de tehnoredactori in baza de date.");
        System.out.println("Apasati tasta 20 pentru a afisa tehnoredactorii din baza de date.");
        System.out.println("Apasati tasta 21 pentru actualizarea salariului unui tehnoredactor.");
        System.out.println("Apasati tasta 22 pentru a sterge un tehnoredactor din baza de date.");
        System.out.println("Apasati tasta 23 pentru a introduce un numar de autori in baza de date.");
        System.out.println("Apasati tasta 24 pentru a afisa autorii din baza de date.");
        System.out.println("Apasati tasta 25 pentru actualizarea numarului cartilor publicate de un autor.");
        System.out.println("Apasati tasta 26 pentru stergerea unui autor din baza de date.");
        System.out.println("Apasati tasta 27 pentru adaugarea unui numar de carti in baza de date.");
        System.out.println("Apasati tasta 28 pentru afisarea cartilor din baza de date.");
        System.out.println("Apasati tasta 29 pentru actualizarea pretului unei carti din baza de date.");
        System.out.println("Apasati tasta 30 pentru stergerea unei carti din baza de date.");
        System.out.println("Apasati tasta 31 pentru adaugarea unui numar de cititori in baza de date.");
        System.out.println("Apasati tasta 32 pentru afisarea cititorilor din baza de date.");
        System.out.println("Apasati tasta 33 pentru actualizarea abonamentului unui cititor din baza de date.");
        System.out.println("Apasati tasta 34 pentru a sterge un cititor din baza de date.");
        System.out.println("Apasati tasta 35 pentru a scrie in fisierul Cititor.csv");
        System.out.println("Apasati tasta 36 pentru a adauga cititori in baza de date din fisierul Cititor.csv");
        System.out.println("Apasati tasta 37 pentru a adauga autori in baza de date din fisierul Autor.csv");
        System.out.println("Apasati tasta 38 pentru a adauga bibliotecari in baza de date din fisierul Bibliotecar.csv");
        System.out.println("Apasati tasta 39 pentru a adauga tehnoredactori in baza de date din fisierul Tehnoredactor.csv");
        System.out.println("Apasati tasta 40 pentru a adauga carti in baza de date din fisierul Carte.csv.");
        System.out.println("Apasati tasta 41 pentru a afisa un mesaj de multumire din partea bibliotecii pentru cititorii cu abonamente Elite din fisierul Cititor.csv.");


        System.out.println("");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1:
                Collections.sort(bibliotecar);
                for (Bibliotecar bibl : bibliotecar)
                    System.out.println(bibl);
                ServiciuAudit.scrieAudit("S-au ordonat alfabetic bibliotecarii din fisier.");
                break;

            case 2:
                String cnpb;
                String numeb;
                String prenumeb;
                double salariub;
                String nr_telefonb;
                String emailb;
                int gradb;
                Scanner sc21 = new Scanner(System.in);
                System.out.println("Introduceti CNP-ul bibliotecarului pe care doriti sa-l adaugati:");
                cnpb = sc21.nextLine();
                System.out.println("Introduceti numele bibliotecarului:");
                numeb = sc21.nextLine();
                System.out.println("Introduceti prenumele bibliotecarului:");
                prenumeb = sc21.nextLine();
                System.out.println("Introduceti salariul bibliotecarului:");
                salariub = Double.parseDouble(sc21.nextLine());
                System.out.println("Introduceti numarul de telefon al bibliotecarului:");
                nr_telefonb = sc21.nextLine();
                System.out.println("Introduceti email-ul:");
                emailb = sc21.nextLine();
                System.out.println("Introduceti gradul:");
                gradb = Integer.parseInt(sc21.nextLine());
                ScriereCSV.getInstance().Scrie_Bibliotecar(cnpb, numeb, prenumeb, salariub, nr_telefonb, emailb, gradb);
                for (Bibliotecar bibl : bibliotecar)
                    System.out.println(bibl);
                ServiciuAudit.scrieAudit("S-a introdus un nou bibliotecar in fisier.");
                break;

            case 3:
                for (Bibliotecar bibl : bibliotecar) {
                    if (bibl.getGrad() == 1) bibl.MarireSalariu1();
                    else if (bibl.getGrad() == 2) bibl.MarireSalariu2();
                    System.out.println(bibl);
                }
                ServiciuAudit.scrieAudit("S-au marit salariile bibliotecarilor din fisier.");
                break;

            case 4:
                for (Bibliotecar bibl : bibliotecar)
                    bibl.AfisareDataNastere();
                ServiciuAudit.scrieAudit("S-a extras data de nastere din CNP-urile bibliotecarilor din fisier.");
                break;

            case 5:
                for (Tehnoredactor t : tehno)
                    t.DiminuareSalariu();
                for (Tehnoredactor t : tehno)
                    System.out.println(t);
                ServiciuAudit.scrieAudit("S-au diminuat salariile tehnoredactorilor din fisier.");
                break;

            case 6:
                Collections.sort(autor);
                for (Autor a : autor)
                    System.out.println(a);
                ServiciuAudit.scrieAudit("S-au ordonat autorii din fisier in ordinea descrescatoare a popularitatii.");
                break;

            case 7:
                ScriereMajuscule scriere = new ScriereMajuscule();
                for (Autor a : autor)
                    if (a.getPopularitate() >= 8)
                    {
                        System.out.print(scriere.TransformareMajuscule(a.getNume()) + " ");
                        System.out.println(scriere.TransformareMajuscule(a.getPrenume()));
                    }
                ServiciuAudit.scrieAudit("Numele autorilor din fisier avand popularitatea cel putin egala cu 8 au fost afisate cu majuscule.");
                break;

            case 8:
                ArrayList<Autor> HallOfFame = new ArrayList<>();
                for (Autor a : autor)
                {
                    if (a.getPopularitate() >= 9 && a.getCarti_publicate() >= 10)
                        HallOfFame.add(a);
                }
                for (Autor aut : HallOfFame)
                    System.out.println(aut.getNume() + ' ' + aut.getPrenume());
                ServiciuAudit.scrieAudit("Autorii din fisier care au indeplinit anumite conditii au fost adaugati in Hall of Fame");
                break;

            case 9:
                for (Carte c : carte)
                {
                    if (c.getCategorie().equals("securitate cibernetica"))
                    {
                        c.ReducereCyber();
                    }
                }
                for (Carte c : carte)
                {
                    if (c.getCategorie().equals("securitate cibernetica")) {
                        c.AfisareCarte();
                        System.out.println();
                    }
                }
                ServiciuAudit.scrieAudit("Pretul cartilor de securitate cibernetica a fost redus.");
                break;

            case 10:
                AfisarePret pret = new AfisarePret();
                int pret_comparare;
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduceti pretul cu care doriti sa comparati:");
                pret_comparare = Integer.parseInt(sc.nextLine());
                for (Carte c : carte)
                {
                    if (c.getPret() < pret_comparare)
                        System.out.println(c);
                }
                ServiciuAudit.scrieAudit("Au fost afisate cartile avand un pret mai mic decat cel introdus de la tastatura.");
                break;

            case 11:
                int nr_bibl;
                String cnp;
                String nume;
                String prenume;
                double salariu;
                String nr_telefon;
                String email;
                int grad;
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Introduceti numarul bibliotecarilor: ");
                nr_bibl = Integer.parseInt(sc1.nextLine());
                for (int i = 1; i <= nr_bibl; i ++)
                {
                    System.out.println("Introduceti CNP-ul: ");
                    cnp = sc1.nextLine();
                    System.out.println("Introduceti numele:");
                    nume = sc1.nextLine();
                    System.out.println("Introduceti prenumele:");
                    prenume = sc1.nextLine();
                    System.out.println("Introduceti salariul:");
                    salariu = Double.parseDouble(sc1.nextLine());
                    System.out.println("Introduceti numarul de telefon:");
                    nr_telefon = sc1.nextLine();
                    System.out.println("Introduceti emailul:");
                    email = sc1.nextLine();
                    System.out.println("Introduceti gradul:");
                    grad = Integer.parseInt(sc1.nextLine());
                    ScriereCSV.getInstance().Scrie_Bibliotecar(cnp, nume, prenume, salariu, nr_telefon, email, grad);
                }
                ServiciuAudit.scrieAudit("S-au adaugat bibliotecari in fisier.");
                break;

            case 12:
                int nr_tehno;
                String cnp1;
                String nume1;
                String prenume1;
                double salariu1;
                String nr_telefon1;
                String email1;
                int treapta;
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Introduceti numarul tehnoredactorilor: ");
                nr_tehno = Integer.parseInt(sc2.nextLine());
                for (int i = 1; i <= nr_tehno; i ++)
                {
                    System.out.println("Introduceti CNP-ul: ");
                    cnp1 = sc2.nextLine();
                    System.out.println("Introduceti numele:");
                    nume1 = sc2.nextLine();
                    System.out.println("Introduceti prenumele:");
                    prenume1 = sc2.nextLine();
                    System.out.println("Introduceti salariul:");
                    salariu1 = Double.parseDouble(sc2.nextLine());
                    System.out.println("Introduceti numarul de telefon:");
                    nr_telefon1 = sc2.nextLine();
                    System.out.println("Introduceti emailul:");
                    email1 = sc2.nextLine();
                    System.out.println("Introduceti treapta:");
                    treapta = Integer.parseInt(sc2.nextLine());
                    ScriereCSV.getInstance().Scrie_Tehnoredactor(cnp1, nume1, prenume1, salariu1, nr_telefon1, email1, treapta);
                }
                ServiciuAudit.scrieAudit("S-au adaugat tehnoredactori in fisier.");
                break;

            case 13:
                int nr_autori;
                String cnp2;
                String nume2;
                String prenume2;
                String email2;
                int popularitate;
                int carti;
                Scanner sc3 = new Scanner(System.in);
                System.out.println("Introduceti numarul autorilor: ");
                nr_autori = Integer.parseInt(sc3.nextLine());
                for (int i = 1; i <= nr_autori; i ++)
                {
                    System.out.println("Introduceti CNP-ul:");
                    cnp2 = sc3.nextLine();
                    System.out.println("Introduceti numele:");
                    nume2 = sc3.nextLine();
                    System.out.println("Introduceti prenumele:");
                    prenume2 = sc3.nextLine();
                    System.out.println("Introduceti email-ul:");
                    email2 = sc3.nextLine();
                    System.out.println("Introduceti popularitate:");
                    popularitate = Integer.parseInt(sc3.nextLine());
                    System.out.println("Introduceti numarul cartilor publicate:");
                    carti = Integer.parseInt(sc3.nextLine());
                    ScriereCSV.getInstance().Scrie_Autor(cnp2, nume2, prenume2, email2, popularitate, carti);
                }
                ServiciuAudit.scrieAudit("S-au adaugat autori in fisier.");
                break;

            case 14:
                int nr_carti;
                String titlu;
                String nume3;
                String prenume3;
                String categorie;
                double pret1;
                Scanner sc4 = new Scanner(System.in);
                System.out.println("Introduceti numarul cartilor: ");
                nr_carti = Integer.parseInt(sc4.nextLine());
                for (int i = 1; i <= nr_carti; i ++)
                {
                    System.out.println("Introduceti titlul cartii:");
                    titlu = sc4.nextLine();
                    System.out.println("Introduceti numele autorului:");
                    nume3 = sc4.nextLine();
                    System.out.println("Introduceti prenumele autorului:");
                    prenume3 = sc4.nextLine();
                    System.out.println("Introduceti categoria cartii:");
                    categorie = sc4.nextLine();
                    System.out.println("Introduceti pretul cartii:");
                    pret1 = Double.parseDouble(sc4.nextLine());
                    ScriereCSV.getInstance().Scrie_Carte(titlu, nume3, prenume3, categorie, pret1);
                }
                ServiciuAudit.scrieAudit("S-au adaugat carti in fisier.");
                break;

            case 15:
                String cnpbibliotecar;
                String numebibliotecar;
                String prenumebibliotecar;
                double salariubibliotecar;
                int nr;
                String telefonbibliotecar;
                String emailbibliotecar;
                int gradbibliotecar;
                Scanner sc5 = new Scanner(System.in);
                System.out.println("Introduceti numarul de bibliotecari pe care doriti sa-i adaugati in baza de date: ");
                nr = Integer.parseInt(sc5.nextLine());
                for (int i = 1; i <= nr; i ++)
                {
                    System.out.println("Introduceti CNP-ul bibliotecarului: ");
                    cnpbibliotecar = sc5.nextLine();
                    System.out.println("Introduceti numele bibliotecarului: ");
                    numebibliotecar = sc5.nextLine();
                    System.out.println("Introduceti prenumele bibliotecarului: ");
                    prenumebibliotecar = sc5.nextLine();
                    System.out.println("Introduceti salariul bibliotecarului: ");
                    salariubibliotecar = Double.parseDouble(sc5.nextLine());
                    System.out.println("Introduceti numarul de telefon: ");
                    telefonbibliotecar = sc5.nextLine();
                    System.out.println("Introduceti email-ul: ");
                    emailbibliotecar = sc5.nextLine();
                    System.out.println("Introduceti gradul bibliotecarului: ");
                    gradbibliotecar = Integer.parseInt(sc5.nextLine());
                    Bibliotecar b = new Bibliotecar(cnpbibliotecar, numebibliotecar, prenumebibliotecar, salariubibliotecar, telefonbibliotecar, emailbibliotecar, gradbibliotecar);
                    AdaugareBD.AdaugaBibliotecar(b);
                }
                ServiciuAudit.scrieAudit("S-au adaugat bibliotecari in baza de date.");
                break;

            case 16:
                BazaDeDate.SelectBD.SelectBibliotecar();
                ServiciuAudit.scrieAudit("S-au afisat bibliotecarii din baza de date.");
                break;

            case 17:
                int idupdate;
                double salariuupdate;
                Scanner sc6 = new Scanner(System.in);
                System.out.println("Introduceti CNP-ul bibliotecarului pentru care doriti sa modificati salariul: ");
                idupdate = Integer.parseInt(sc6.nextLine());
                System.out.println("Introduceti salariul modificat: ");
                salariuupdate = Double.parseDouble(sc6.nextLine());
                UpdateBD.UpdateSalariu(salariuupdate, idupdate);
                ServiciuAudit.scrieAudit("S-a actualizat salariul unui bibliotecar din baza de date.");
                break;

            case 18:
                int idb;
                Scanner sc7 = new Scanner(System.in);
                System.out.println("Introduceti id-ul bibliotecarului pe care doriti sa-l stergeti: ");
                idb = Integer.parseInt(sc7.nextLine());
                DeleteBD.StergeBibliotecar(idb);
                ServiciuAudit.scrieAudit("S-a sters un bibliotecar din baza de date.");
                break;

            case 19:
                String cnptehno;
                String numetehno;
                String prenumetehno;
                double salariutehno;
                int nrtehno;
                String telefontehno;
                String emailtehno;
                int treaptatehno;
                Scanner sc8 = new Scanner(System.in);
                System.out.println("Introduceti numarul de tehnoredactori pe care doriti sa-i adaugati in baza de date: ");
                nrtehno = Integer.parseInt(sc8.nextLine());
                for (int i = 1; i <= nrtehno; i ++)
                {
                    System.out.println("Introduceti CNP-ul tehnoredactorului: ");
                    cnptehno = sc8.nextLine();
                    System.out.println("Introduceti numele tehnoredactorului: ");
                    numetehno = sc8.nextLine();
                    System.out.println("Introduceti prenumele tehnoredactorului: ");
                    prenumetehno = sc8.nextLine();
                    System.out.println("Introduceti salariul tehnoredactorului: ");
                    salariutehno = Double.parseDouble(sc8.nextLine());
                    System.out.println("Introduceti numarul de telefon: ");
                    telefontehno = sc8.nextLine();
                    System.out.println("Introduceti email-ul: ");
                    emailtehno = sc8.nextLine();
                    System.out.println("Introduceti treapta tehnoredactorului: ");
                    treaptatehno = Integer.parseInt(sc8.nextLine());
                    Tehnoredactor t = new Tehnoredactor(cnptehno, numetehno, prenumetehno, salariutehno, telefontehno, emailtehno, treaptatehno);
                    AdaugareBD.AdaugaTehnoredactor(t);
                }
                ServiciuAudit.scrieAudit("S-au adaugat tehnoredactori in baza de date.");
                break;

            case 20:
                SelectBD.SelectTehnoredactor();
                break;

            case 21:
                int idupdatet;
                double salariuupdatet;
                Scanner sc9 = new Scanner(System.in);
                System.out.println("Introduceti id-ul tehnoredactorului pentru care doriti sa modificati salariul: ");
                idupdatet = Integer.parseInt(sc9.nextLine());
                System.out.println("Introduceti salariul modificat: ");
                salariuupdatet = Double.parseDouble(sc9.nextLine());
                UpdateBD.UpdateSalariuT(salariuupdatet, idupdatet);
                ServiciuAudit.scrieAudit("S-a actualizat salariul unui tehnoredactor din baza de date.");
                break;

            case 22:
                int idt;
                Scanner sc10 = new Scanner(System.in);
                System.out.println("Introduceti id-ul tehnoredactorului pe care doriti sa-l stergeti: ");
                idt = Integer.parseInt(sc10.nextLine());
                DeleteBD.StergeTehnoredactor(idt);
                ServiciuAudit.scrieAudit("S-a sters un tehnoredactor din baza de date.");
                break;

            case 23:
                String cnpa;
                String numea;
                String prenumea;
                String emaila;
                int popularitatea;
                int cartipublicatea;
                int nrautori;
                Scanner sc11 = new Scanner(System.in);
                System.out.println("Introduceti numarul de autori pe care doriti sa-i adaugati in baza de date: ");
                nrautori = Integer.parseInt(sc11.nextLine());
                for (int i = 1; i <= nrautori; i ++)
                {
                    System.out.println("Introduceti CNP-ul autorului: ");
                    cnpa = sc11.nextLine();
                    System.out.println("Introduceti numele autorului: ");
                    numea = sc11.nextLine();
                    System.out.println("Introduceti prenumele autorului: ");
                    prenumea = sc11.nextLine();
                    System.out.println("Introduceti emailul autorului: ");
                    emaila = sc11.nextLine();
                    System.out.println("Introduceti popularitatea autorului: ");
                    popularitatea = Integer.parseInt(sc11.nextLine());
                    System.out.println("Introduceti numarul cartilor publicate: ");
                    cartipublicatea = Integer.parseInt(sc11.nextLine());
                    Autor a = new Autor(cnpa, numea, prenumea, emaila, popularitatea, cartipublicatea);
                    AdaugareBD.AdaugaAutor(a);
                }
                ServiciuAudit.scrieAudit("S-au adaugat autori in baza de date.");
                break;

            case 24:
                SelectBD.SelectAutor();
                ServiciuAudit.scrieAudit("S-au afisat autorii din baza de date.");
                break;

            case 25:
                int idupdatea;
                int cartia;
                Scanner sc12 = new Scanner(System.in);
                System.out.println("Introduceti id-ul autorului pentru care doriti sa modificati numarul cartilor publicate: ");
                idupdatea = Integer.parseInt(sc12.nextLine());
                System.out.println("Introduceti noul numar de carti publicate: ");
                cartia = Integer.parseInt(sc12.nextLine());
                UpdateBD.UpdateCartipublicate(cartia, idupdatea);
                ServiciuAudit.scrieAudit("S-a actualizat numarul cartilor publicate de un autor din baza de date.");
                break;

            case 26:
                int ida;
                Scanner sc13 = new Scanner(System.in);
                System.out.println("Introduceti id-ul autorului pe care doriti sa-l stergeti: ");
                ida = Integer.parseInt(sc13.nextLine());
                DeleteBD.StergeAutor(ida);
                ServiciuAudit.scrieAudit("S-a sters un autor din baza de date.");
                break;

            case 27:
                int nrcarti;
                String titluc;
                String numec;
                String prenumec;
                String categoriec;
                double pretc;
                Scanner sc14 = new Scanner(System.in);
                System.out.println("Introduceti numarul de carti pe care doriti sa le adaugati in baza de date: ");
                nrcarti = Integer.parseInt(sc14.nextLine());
                for (int i = 1; i <= nrcarti; i ++)
                {
                    System.out.println("Introduceti titlul cartii: ");
                    titluc = sc14.nextLine();
                    System.out.println("Introduceti numele autorului: ");
                    numec = sc14.nextLine();
                    System.out.println("Introduceti prenumele autorului: ");
                    prenumec = sc14.nextLine();
                    System.out.println("Introduceti categoria cartii: ");
                    categoriec = sc14.nextLine();
                    System.out.println("Introduceti pretul cartii: ");
                    pretc = Double.parseDouble(sc14.nextLine());
                    Carte c = new Carte(titluc, numec, prenumec, categoriec, pretc);
                    AdaugareBD.AdaugaCarte(c);
                }
                ServiciuAudit.scrieAudit("S-au adaugat carti in baza de date.");
                break;

            case 28:
                SelectBD.SelectCarte();
                ServiciuAudit.scrieAudit("S-au afisat cartile din baza de date.");
                break;

            case 29:
                int id;
                double pretnou;
                Scanner sc15 = new Scanner(System.in);
                System.out.println("Introduceti ID-ul cartii pentru care doriti sa modificati pretul: ");
                id = Integer.parseInt(sc15.nextLine());
                System.out.println("Introduceti noul pret al cartii: ");
                pretnou = Double.parseDouble(sc15.nextLine());
                UpdateBD.UpdateCarti(pretnou, id);
                ServiciuAudit.scrieAudit("S-a actualizat pretul unei carti din baza de date.");
                break;

            case 30:
                int idsterge;
                Scanner sc16 = new Scanner(System.in);
                System.out.println("Introduceti ID-ul cartii pe care doriti sa o stergeti: ");
                idsterge = Integer.parseInt(sc16.nextLine());
                DeleteBD.StergeCarte(idsterge);
                ServiciuAudit.scrieAudit("S-a sters o carte din baza de date.");
                break;

            case 31:
                int nrcititori;
                String cnpcititor;
                String numeci;
                String prenumeci;
                String tip_abonament;
                Scanner sc17 = new Scanner(System.in);
                System.out.println("Introduceti numarul de cititori pe care doriti sa le adaugati in baza de date: ");
                nrcititori = Integer.parseInt(sc17.nextLine());
                for (int i = 1; i <= nrcititori; i ++)
                {
                    System.out.println("Introduceti CNP-ul cititorului: ");
                    cnpcititor = sc17.nextLine();
                    System.out.println("Introduceti numele cititorului:");
                    numeci = sc17.nextLine();
                    System.out.println("Introduceti prenumele cititorului:");
                    prenumeci = sc17.nextLine();
                    System.out.println("Introduceti tipul abonamentului pe care cititorul il are:");
                    tip_abonament = sc17.nextLine();
                    Cititor cititor = new Cititor(cnpcititor, numeci, prenumeci, tip_abonament);
                    AdaugareBD.AdaugaCititor(cititor);
                }
                ServiciuAudit.scrieAudit("S-au adaugat cititori in baza de date.");
                break;

            case 32:
                SelectBD.SelectCititor();
                ServiciuAudit.scrieAudit("S-au afisat cititorii din baza de date.");
                break;

            case 33:
                int id1;
                String tipnou;
                Scanner sc18 = new Scanner(System.in);
                System.out.println("Introduceti ID-ul cititorului pentru care doriti sa modificati tipul abonamentului: ");
                id = Integer.parseInt(sc18.nextLine());
                System.out.println("Introduceti noul tip al abonamentului: ");
                tipnou = sc18.nextLine();
                UpdateBD.UpdateCititor(tipnou, id);
                ServiciuAudit.scrieAudit("S-a actualizat abonamentul unui cititor din baza de date.");
                break;

            case 34:
                int id2;
                Scanner sc19 = new Scanner(System.in);
                System.out.println("Introduceti ID-ul cititorului pe care doriti sa-l stergeti: ");
                id2 = Integer.parseInt(sc19.nextLine());
                DeleteBD.StergeCititor(id2);
                ServiciuAudit.scrieAudit("S-a sters un cititor din baza de date.");
                break;

            case 35:
                int nr_cititori;
                String cnp3;
                String nume4;
                String prenume4;
                String tip;
                Scanner sc20 = new Scanner(System.in);
                System.out.println("Introduceti numarul cititorilor: ");
                nr_cititori = Integer.parseInt(sc20.nextLine());
                for (int i = 1; i <= nr_cititori; i ++)
                {
                    System.out.println("Introduceti CNP-ul:");
                    cnp3 = sc20.nextLine();
                    System.out.println("Introduceti numele:");
                    nume4 = sc20.nextLine();
                    System.out.println("Introduceti prenumele:");
                    prenume4 = sc20.nextLine();
                    System.out.println("Introduceti tipul abonamentului:");
                    tip = sc20.nextLine();
                    ScriereCSV.getInstance().Scrie_Cititor(cnp3, nume4, prenume4, tip);
                }
                ServiciuAudit.scrieAudit("S-au adaugat cititori in fisier.");
                break;

            case 36:
                AdaugareBDCSV.AdaugaCititorCSV();
                ServiciuAudit.scrieAudit("S-au adaugat cititori din fisierul CSV in baza de date.");
                break;

            case 37:
                AdaugareBDCSV.AdaugaAutorCSV();
                ServiciuAudit.scrieAudit("S-au adaugat autori din fisierul CSV in baza de date.");
                break;

            case 38:
                AdaugareBDCSV.AdaugaBibliotecarCSV();
                ServiciuAudit.scrieAudit("S-au adaugat bibliotecari din fisierul CSV in baza de date.");
                break;

            case 39:
                AdaugareBDCSV.AdaugaTehnoredactorCSV();
                ServiciuAudit.scrieAudit("S-au adaugat tehnoredactori din fisierul CSV in baza de date.");
                break;

            case 40:
                AdaugareBDCSV.AdaugaCarteCSV();
                ServiciuAudit.scrieAudit("S-au adaugat carti din fisierul CSV in baza de date.");
                break;

            case 41:
                AbonamentElite abonamentElite = new AbonamentElite();
                for (Cititor c : cititori)
                {
                    if (c.getAbonamentTip().equals("Elite"))
                        System.out.println("Multumim, " + c.getNume() + ' ' + c.getPrenume());
                }
                ServiciuAudit.scrieAudit("S-a afisat un mesaj de multumire din partea bibliotecii.");
                break;
        }
    }
}
