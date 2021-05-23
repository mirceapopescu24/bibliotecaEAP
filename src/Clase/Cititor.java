package Clase;

import java.text.ParseException;
import java.util.*;

public class Cititor extends Persoana {
    private int id;
    private String tip_abonament;

    public Cititor(String cnp, String nume, String prenume, String abonament) {
        super(cnp, nume, prenume);
        this.tip_abonament = abonament;
    }

    public String getAbonamentTip() {
        return this.tip_abonament;
    }

    public int getId()
    {return this.id;}

    public void setId(int id)
    {
        this.id = id;
    }

    public void setAbonamentTip (String tip) {
        this.tip_abonament = tip;
    }

    public void CitireCititor() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti CNP:");
        this.cnp = scanner.nextLine();
        System.out.println("Introduceti numele:");
        this.nume = scanner.nextLine();
        System.out.println("Introduceti prenumele:");
        this.prenume = scanner.nextLine();
        System.out.println("Introduceti tipul abonamentului:");
        this.tip_abonament = scanner.nextLine();
    }

    public void AfisareCititor() {
        System.out.println("CNP:" + this.cnp + "\nNumele:" + this.nume + "\nPrenumele:" + this.prenume + "\nTipul abonamentului:" +
                this.tip_abonament);
    }
}
