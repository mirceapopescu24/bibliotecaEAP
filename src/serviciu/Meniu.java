package serviciu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.text.*;
import Clase.*;
import serviciu.*;

public class Meniu {
    public void meniu() {
        System.out.println("BINE ATI VENIT LA BIBLIOTECA NATIONALA A ROMANIEI! - MENIU \n Alegeti din urmatoarele optiuni: " +
                "\n1. Veti citi un numar de bibliotecari, apoi se va afisa in mod alfabetic ordinea acestora." +
                "\n2. Bibliotecarii au un nou coleg! Optiunea permite adaugarea unui bibliotecar in vectorul corespunzator." +
                "\n3. Ziua norocoasa a bibliotecarilor! Bibliotecarii de gradul 1 vor beneficia de o majorare a salariilor cu 10 procente, iar cei de gradul 2 vor avea salariile marite cu 20%." +
                "\n4. Extragerea genului si datei de nastere a bibliotecarilor folosind CNP-ul." +
                "\n5. Colegii de la tehnoredactie nu-si fac treaba! Haideti sa le diminuam salariile cu 30 de procente." +
                "\n6. Autorii vor fi afisati in ordinea descrescatoare popularitatii." +
                "\n7. Numele autorilor cu popularitatea cel putin egala cu 8 va fi afisat cu majuscule." +
                "\n8. Autorii cu popularitatea cel putin egala cu 9 si cu cel putin 10 carti publicate vor fi adaugati in Hall of Fame" +
                "\n9. CYBER DAY este aici! Toate cartile de securitate cibernetica sunt reduse cu 50%! Afisati detaliile acestora dupa reducere." +
                "\n10. Se va citi un numar de carti si se vor afisa cartile avand pretul mai mic decat cel introdus de dumneavoastra." +
                "\n11. Verificati daca abonamentul dumneavoastra la biblioteca este valid." +
                "\n12. Biblioteca Nationala a Romaniei doreste sa multumeasca tuturor cititorilor sai care au un abonament Elite!" +
                "\n13. OFERTA! Cumpara 3 carti si primesti un abonament Premium! Grabeste-te acum!");

    }

    public Meniu() throws ParseException, IOException {
        Scanner in = new Scanner(System.in);
        meniu();
        switch (in.nextInt()) {

            case 1:
                Scanner sc = new Scanner(System.in);
                int nr_bibliotecari;
                System.out.println("Introduceti numarul de bibliotecari:");
                nr_bibliotecari = Integer.parseInt(sc.nextLine());
                FormValidation form = new FormValidation();
                Bibliotecar[] b1 = new Bibliotecar[nr_bibliotecari];
                for (int i = 0; i < nr_bibliotecari; i++) {
                    b1[i] = new Bibliotecar(" ", " ", " ", 0, " ", " ", 0);
                    b1[i].CitireAngajat();
                    if (!form.validateCNP(b1[i].getCnp())) {
                        System.out.println("Eroare la introducerea CNP-ului. Va rugam sa introduceti un CNP valid!");
                        System.exit(-1);
                    }
                    if (!form.validateName(b1[i].getNume())) {
                        System.out.println("Eroare la introducerea numelui. Va rugam sa introduceti un nume valid!");
                        System.exit(-1);
                    }
                    if (!form.validateName(b1[i].getPrenume())) {
                        System.out.println("Eroare la introducerea prenumelui. Va rugam sa introduceti un prenume valid!");
                        System.exit(-1);
                    }
                    if (!form.validateMail(b1[i].getEmail())) {
                        System.out.println("Eroare la introducerea adresei de mail. Va rugam sa introduceti o adresa de mail valida!");
                        System.exit(-1);
                    }
                    if (!form.validatePhone(b1[i].getNr_telefon())) {
                        System.out.println("Eroare la introducerea numarului de telefon. Va rugam sa introduceti un numar de telefon valid!");
                        System.exit(-1);
                    }

                }
                Arrays.sort(b1);
                for (int i = 0; i < nr_bibliotecari; i++) {
                    System.out.println("\nBibliotecarul cu numarul " + (i + 1));
                    b1[i].AfisareAngajat();
                }
                ServiciuAudit.scrieAudit("S-au ordonat alfabetic bibliotecarii introdusi de la tastatura.");
                break;

            case 2:
                Scanner sc2 = new Scanner(System.in);
                int numar_bibliotecari;
                System.out.println("Introduceti numarul de bibliotecari:");
                numar_bibliotecari = Integer.parseInt(sc2.nextLine());
                FormValidation form2 = new FormValidation();
                Bibliotecar[] b2 = new Bibliotecar[numar_bibliotecari + 1];
                for (int i = 0; i < numar_bibliotecari; i++) {
                    b2[i] = new Bibliotecar(" ", " ", " ", 0, " ", " ", 0);
                    b2[i].CitireAngajat();
                    if (!form2.validateCNP(b2[i].getCnp())) {
                        System.out.println("Eroare la introducerea CNP-ului. Va rugam sa introduceti un CNP valid!");
                        System.exit(-1);
                    }
                    if (!form2.validateName(b2[i].getNume())) {
                        System.out.println("Eroare la introducerea numelui. Va rugam sa introduceti un nume valid!");
                        System.exit(-1);
                    }
                    if (!form2.validateName(b2[i].getPrenume())) {
                        System.out.println("Eroare la introducerea prenumelui. Va rugam sa introduceti un prenume valid!");
                        System.exit(-1);
                    }
                    if (!form2.validateMail(b2[i].getEmail())) {
                        System.out.println("Eroare la introducerea adresei de mail. Va rugam sa introduceti o adresa de mail valida!");
                        System.exit(-1);
                    }
                    if (!form2.validatePhone(b2[i].getNr_telefon())) {
                        System.out.println("Eroare la introducerea numarului de telefon. Va rugam sa introduceti un numar de telefon valid!");
                        System.exit(-1);
                    }
                }
                System.out.println("Bibliotecarul nou:");
                b2[numar_bibliotecari] = new Bibliotecar(" ", " ", " ", 0, " ", " ", 0);
                b2[numar_bibliotecari].CitireAngajat();
                if (!form2.validateCNP(b2[numar_bibliotecari].getCnp())) {
                    System.out.println("Eroare la introducerea CNP-ului. Va rugam sa introduceti un CNP valid!");
                    System.exit(-1);
                }
                if (!form2.validateName(b2[numar_bibliotecari].getNume())) {
                    System.out.println("Eroare la introducerea numelui. Va rugam sa introduceti un nume valid!");
                    System.exit(-1);
                }
                if (!form2.validateName(b2[numar_bibliotecari].getPrenume())) {
                    System.out.println("Eroare la introducerea prenumelui. Va rugam sa introduceti un prenume valid!");
                    System.exit(-1);
                }
                if (!form2.validateMail(b2[numar_bibliotecari].getEmail())) {
                    System.out.println("Eroare la introducerea adresei de mail. Va rugam sa introduceti o adresa de mail valida!");
                    System.exit(-1);
                }
                if (!form2.validatePhone(b2[numar_bibliotecari].getNr_telefon())) {
                    System.out.println("Eroare la introducerea numarului de telefon. Va rugam sa introduceti un numar de telefon valid!");
                    System.exit(-1);
                }
                System.out.println("Dupa adaugarea bibliotecarului:");
                for (int i = 0; i <= numar_bibliotecari; i++) {
                    System.out.println("\nBibliotecarul cu numarul " + (i + 1));
                    b2[i].AfisareAngajat();
                }
                ServiciuAudit.scrieAudit("S-a adaugat un nou bibliotecar.");
                break;

            case 3:
                Scanner sc3 = new Scanner(System.in);
                int nr_bbl;
                System.out.println("Introduceti numarul de bibliotecari:");
                nr_bbl = Integer.parseInt(sc3.nextLine());
                FormValidation form3 = new FormValidation();
                Bibliotecar[] b3 = new Bibliotecar[nr_bbl];
                for (int i = 0; i < nr_bbl; i++) {
                    b3[i] = new Bibliotecar(" ", " ", " ", 0, " ", " ", 0);
                    b3[i].CitireAngajat();
                    if (!form3.validateCNP(b3[i].getCnp())) {
                        System.out.println("Eroare la introducerea CNP-ului. Va rugam sa introduceti un CNP valid!");
                        System.exit(-1);
                    }
                    if (!form3.validateName(b3[i].getNume())) {
                        System.out.println("Eroare la introducerea numelui. Va rugam sa introduceti un nume valid!");
                        System.exit(-1);
                    }
                    if (!form3.validateName(b3[i].getPrenume())) {
                        System.out.println("Eroare la introducerea prenumelui. Va rugam sa introduceti un prenume valid!");
                        System.exit(-1);
                    }
                    if (!form3.validateMail(b3[i].getEmail())) {
                        System.out.println("Eroare la introducerea adresei de mail. Va rugam sa introduceti o adresa de mail valida!");
                        System.exit(-1);
                    }
                    if (!form3.validatePhone(b3[i].getNr_telefon())) {
                        System.out.println("Eroare la introducerea numarului de telefon. Va rugam sa introduceti un numar de telefon valid!");
                        System.exit(-1);
                    }
                }
                for (int i = 0; i < nr_bbl; i++) {
                    if (b3[i].getGrad() == 1) b3[i].MarireSalariu1();
                    else if (b3[i].getGrad() == 2) b3[i].MarireSalariu2();
                }
                System.out.println("Vectorul de bibliotecari dupa majorarea salariilor:");
                for (int i = 0; i < nr_bbl; i++) {
                    System.out.println("\nBibliotecarul cu numarul " + (i + 1));
                    b3[i].AfisareAngajat();
                }
                ServiciuAudit.scrieAudit("S-au marit salariile bibliotecarilor.");
                break;

            case 4:
                Scanner sc4 = new Scanner(System.in);
                int numar_b;
                System.out.println("Introduceti numarul bibliotecarilor:");
                numar_b = Integer.parseInt(sc4.nextLine());
                FormValidation form4 = new FormValidation();
                Bibliotecar[] b4 = new Bibliotecar[numar_b];
                for (int i = 0; i < numar_b; i++) {
                    b4[i] = new Bibliotecar(" ", " ", " ", 0, " ", " ", 0);
                    b4[i].CitireAngajat();
                    if (!form4.validateCNP(b4[i].getCnp())) {
                        System.out.println("Eroare la introducerea CNP-ului. Va rugam sa introduceti un CNP valid!");
                        System.exit(-1);
                    }
                    if (!form4.validateName(b4[i].getNume())) {
                        System.out.println("Eroare la introducerea numelui. Va rugam sa introduceti un nume valid!");
                        System.exit(-1);
                    }
                    if (!form4.validateName(b4[i].getPrenume())) {
                        System.out.println("Eroare la introducerea prenumelui. Va rugam sa introduceti un prenume valid!");
                        System.exit(-1);
                    }
                    if (!form4.validateMail(b4[i].getEmail())) {
                        System.out.println("Eroare la introducerea adresei de mail. Va rugam sa introduceti o adresa de mail valida!");
                        System.exit(-1);
                    }
                    if (!form4.validatePhone(b4[i].getNr_telefon())) {
                        System.out.println("Eroare la introducerea numarului de telefon. Va rugam sa introduceti un numar de telefon valid!");
                        System.exit(-1);
                    }
                }
                for (int i = 0; i < numar_b; i++)
                    b4[i].AfisareDataNastere();
                ServiciuAudit.scrieAudit("S-a extras data de nastere din CNP-urile bibliotecarilor.");
                break;

            case 5:
                Scanner sc5 = new Scanner(System.in);
                int nr_tehnoredactori;
                System.out.println("Introduceti numarul tehnoredactorilor:");
                nr_tehnoredactori = Integer.parseInt(sc5.nextLine());
                FormValidation form5 = new FormValidation();
                Tehnoredactor[] t1 = new Tehnoredactor[nr_tehnoredactori];
                for (int i = 0; i < nr_tehnoredactori; i++) {
                    t1[i] = new Tehnoredactor(" ", " ", "", 0, " ", " ", 0);
                    t1[i].CitireAngajat();
                    if (!form5.validateCNP(t1[i].getCnp())) {
                        System.out.println("Eroare la introducerea CNP-ului. Va rugam sa introduceti un CNP valid!");
                        System.exit(-1);
                    }
                    if (!form5.validateName(t1[i].getNume())) {
                        System.out.println("Eroare la introducerea numelui. Va rugam sa introduceti un nume valid!");
                        System.exit(-1);
                    }
                    if (!form5.validateName(t1[i].getPrenume())) {
                        System.out.println("Eroare la introducerea prenumelui. Va rugam sa introduceti un prenume valid!");
                        System.exit(-1);
                    }
                    if (!form5.validateMail(t1[i].getEmail())) {
                        System.out.println("Eroare la introducerea adresei de mail. Va rugam sa introduceti o adresa de mail valida!");
                        System.exit(-1);
                    }
                    if (!form5.validatePhone(t1[i].getNr_telefon())) {
                        System.out.println("Eroare la introducerea numarului de telefon. Va rugam sa introduceti un numar de telefon valid!");
                        System.exit(-1);
                    }
                }
                for (int i = 0; i < nr_tehnoredactori; i++)
                    t1[i].DiminuareSalariu();
                System.out.println("Vectorul de tehnoredactori dupa diminuarea salariilor:");
                for (int i = 0; i < nr_tehnoredactori; i++) {
                    System.out.println("Tehnoredactorul cu numarul " + (i + 1));
                    t1[i].AfisareAngajat();
                }
                ServiciuAudit.scrieAudit("S-au diminuat salariile tehnoredactorilor.");
                break;

            case 6:
                Scanner sc6 = new Scanner(System.in);
                int nr_autori;
                System.out.println("Introduceti numarul autorilor:");
                nr_autori = Integer.parseInt(sc6.nextLine());
                FormValidation form6 = new FormValidation();
                Autor[] a1 = new Autor[nr_autori];
                for (int i = 0; i < nr_autori; i++) {
                    a1[i] = new Autor(" ", " ", " ", " ", 0, 0);
                    a1[i].CitireAutor();
                    if (!form6.validateCNP(a1[i].getCnp())) {
                        System.out.println("Eroare la introducerea CNP-ului. Va rugam sa introduceti un CNP valid!");
                        System.exit(-1);
                    }
                    if (!form6.validateName(a1[i].getNume())) {
                        System.out.println("Eroare la introducerea numelui. Va rugam sa introduceti un nume valid!");
                        System.exit(-1);
                    }
                    if (!form6.validateName(a1[i].getPrenume())) {
                        System.out.println("Eroare la introducerea prenumelui. Va rugam sa introduceti un prenume valid!");
                        System.exit(-1);
                    }
                    if (!form6.validateMail(a1[i].getEmail())) {
                        System.out.println("Eroare la introducerea adresei de mail. Va rugam sa introduceti o adresa de mail valida!");
                        System.exit(-1);
                    }
                }
                Arrays.sort(a1);
                for (int i = 0; i < nr_autori; i++) {
                    System.out.println("\nAutorul cu numarul " + (i + 1));
                    a1[i].AfisareAutor();
                }
                ServiciuAudit.scrieAudit("S-au ordonat autorii in ordinea descrescatoare popularitatii.");
                break;

            case 7:
                Scanner sc7 = new Scanner(System.in);
                int nr_aut;
                System.out.println("Introduceti numarul autorilor:");
                nr_aut = Integer.parseInt(sc7.nextLine());
                FormValidation form7 = new FormValidation();
                ScriereMajuscule scriere = new ScriereMajuscule();
                Autor[] a2 = new Autor[nr_aut];
                for (int i = 0; i < nr_aut; i++) {
                    a2[i] = new Autor(" ", " ", " ", " ", 0, 0);
                    a2[i].CitireAutor();
                    if (!form7.validateCNP(a2[i].getCnp())) {
                        System.out.println("Eroare la introducerea CNP-ului. Va rugam sa introduceti un CNP valid!");
                        System.exit(-1);
                    }
                    if (!form7.validateName(a2[i].getNume())) {
                        System.out.println("Eroare la introducerea numelui. Va rugam sa introduceti un nume valid!");
                        System.exit(-1);
                    }
                    if (!form7.validateName(a2[i].getPrenume())) {
                        System.out.println("Eroare la introducerea prenumelui. Va rugam sa introduceti un prenume valid!");
                        System.exit(-1);
                    }
                    if (!form7.validateMail(a2[i].getEmail())) {
                        System.out.println("Eroare la introducerea adresei de mail. Va rugam sa introduceti o adresa de mail valida!");
                        System.exit(-1);
                    }
                }
                System.out.println("Numele autorilor cu popularitatea cel putin egala cu 8 afisate cu majuscule:");
                for (int i = 0; i < nr_aut; i++) {
                    if (a2[i].getPopularitate() >= 8) {
                        System.out.print(scriere.TransformareMajuscule(a2[i].getNume()) + " ");
                        System.out.println(scriere.TransformareMajuscule(a2[i].getPrenume()));
                    }
                }
                ServiciuAudit.scrieAudit("Numele autorilor cu popularitatea cel putin egala cu 8 au fost afisate cu majuscule.");
                break;

            case 8:
                Scanner sc8 = new Scanner(System.in);
                int n_aut;
                System.out.println("Introduceti numarul autorilor:");
                n_aut = Integer.parseInt(sc8.nextLine());
                FormValidation form8 = new FormValidation();
                Autor[] a3 = new Autor[n_aut];
                ArrayList<Autor> HallOfFame = new ArrayList<>();
                for (int i = 0; i < n_aut; i++) {
                    a3[i] = new Autor(" ", " ", " ", " ", 0, 0);
                    a3[i].CitireAutor();
                    if (!form8.validateCNP(a3[i].getCnp())) {
                        System.out.println("Eroare la introducerea CNP-ului. Va rugam sa introduceti un CNP valid!");
                        System.exit(-1);
                    }
                    if (!form8.validateName(a3[i].getNume())) {
                        System.out.println("Eroare la introducerea numelui. Va rugam sa introduceti un nume valid!");
                        System.exit(-1);
                    }
                    if (!form8.validateName(a3[i].getPrenume())) {
                        System.out.println("Eroare la introducerea prenumelui. Va rugam sa introduceti un prenume valid!");
                        System.exit(-1);
                    }
                    if (!form8.validateMail(a3[i].getEmail())) {
                        System.out.println("Eroare la introducerea adresei de mail. Va rugam sa introduceti o adresa de mail valida!");
                        System.exit(-1);
                    }
                }
                System.out.println("Autorii introdusi in Hall of Fame:");
                for (int i = 0; i < n_aut; i++) {
                    if (a3[i].getPopularitate() >= 9 && a3[i].getCarti_publicate() >= 10) {
                        HallOfFame.add(a3[i]);
                    }
                }
                for (Autor s : HallOfFame)
                    System.out.println(s.getNume() + ' ' + s.getPrenume());
                ServiciuAudit.scrieAudit("Autorii au fost adaugati in Hall of Fame.");
                break;

            case 9:
                Scanner sc9 = new Scanner(System.in);
                int nr_carti;
                System.out.println("Introduceti numarul cartilor");
                nr_carti = Integer.parseInt(sc9.nextLine());
                Carte[] c1 = new Carte[nr_carti];
                for (int i = 0; i < nr_carti; i++) {
                    c1[i] = new Carte(" ", " ", " ", " ", 0);
                    c1[i].CitireCarte();
                }
                for (int i = 0; i < nr_carti; i++) {
                    if (c1[i].getCategorie().equals("securitate cibernetica")) {
                        c1[i].ReducereCyber();
                    }
                }
                System.out.println("Cartile reduse:");
                for (int i = 0; i < nr_carti; i++) {
                    if (c1[i].getCategorie().equals("securitate cibernetica")) {
                        c1[i].AfisareCarte();
                        System.out.println();
                    }
                }
                ServiciuAudit.scrieAudit("Pretul cartilor de securitate cibernetica a fost redus.");
                break;

            case 10:
                Scanner sc10 = new Scanner(System.in);
                int n_carti, pret_comparare;
                System.out.println("Introduceti numarul cartilor");
                n_carti = Integer.parseInt(sc10.nextLine());
                AfisarePret pret = new AfisarePret();
                Carte[] c2 = new Carte[n_carti];
                for (int i = 0; i < n_carti; i ++) {
                    c2[i] =new Carte(" ", " ", " ", " ", 0);
                    c2[i].CitireCarte();
                }
                System.out.println("Introduceti pretul cu care doriti sa comparati:");
                pret_comparare = Integer.parseInt(sc10.nextLine());
                for (int i = 0; i < n_carti; i ++) {
                    if (c2[i].getPret() < pret_comparare)
                        System.out.println("Titlul cartii cu pretul mai mic decat cel introdus de dumneavoastra:");
                    pret.VerificarePret(c2[i].getTitlu());
                    System.out.println();
                }
                ServiciuAudit.scrieAudit("Au fost afisate cartile avand un pret mai mic decat cel introdus la tastatura.");
                break;

            case 11:
                Scanner sc11 = new Scanner(System.in);
                Abonament[] ab = new Abonament[1];
                VerificareAbonament verificare = new VerificareAbonament();
                System.out.println("Introduceti data de azi pentru a verifica valabilitatea abonamentului:");
                String data = sc11.nextLine();
                Date data1 = new SimpleDateFormat("dd-MM-yyyy").parse(data);
                for (int i = 0; i < 1; i ++) {
                    ab[i] = new Abonament(" ", " ");
                    ab[i].CitireAbonament();
                    verificare.verificare_abonament(ab[i].getData_sfarsit(), data1);
                }
                ServiciuAudit.scrieAudit("S-a verificat daca abonamentul este sau nu valabil.");
                break;

            case 12:
                Scanner sc12 = new Scanner(System.in);
                int nr_cititori;
                System.out.println("Introduceti numarul cititorilor:");
                nr_cititori = Integer.parseInt(sc12.nextLine());
                Cititor[] ct = new Cititor[nr_cititori];
                AbonamentElite ab_elite = new AbonamentElite();
                for (int i = 0; i < nr_cititori; i ++) {
                    ct[i] = new Cititor(" ", " ", " ", " ");
                    ct[i].CitireCititor();
                }
                for (int i = 0; i < nr_cititori; i ++)
                    ab_elite.abonamentelite(ct[i].getAbonamentTip(), nr_cititori, ct[i].getNume(), ct[i].getPrenume(), "Elite");
                ServiciuAudit.scrieAudit("Mesaj de multumire din partea bibliotecii.");
                break;

            case 13:
                CosCumparaturi cos = new CosCumparaturi();
                Scanner sc13 = new Scanner(System.in);
                int nr_books;
                System.out.println("Introduceti numarul de carti pe care doriti sa le achizitionati:");
                nr_books = Integer.parseInt(sc13.nextLine());
                Carte[] books = new Carte[nr_books];
                for (int i = 0; i < nr_books; i ++) {
                    books[i] = new Carte(" ", " ", " ", " ", 0);
                    books[i].CitireCarte();
                    cos.AdaugaCarte(books[i]);
                }
                if (cos.DimensiuneListaCarti() >= 3) {
                    System.out.println(" Veti primi un abonament Elite!");
                    Abonament[] abon = new Abonament[1];
                    for (int i = 0; i < 1; i++) {
                        abon[i] = new Abonament(" ", " ");
                        abon[i].CitireAbonament();
                        if (abon[i].getTip().equals("Elite"))
                            cos.AdaugaAbonament(abon[i]);
                        else
                            System.out.println("Va rugam sa luati abonamentul Elite!");
                    }
                }
                String bon_cumparaturi = cos.toString();
                System.out.println(bon_cumparaturi);
                ServiciuAudit.scrieAudit("La achizitionarea a 3 carti se va primi un abonament Elite.");
        }
    }

    public static void main(String[] args) throws ParseException, IOException {
        new Meniu();
    }
}
