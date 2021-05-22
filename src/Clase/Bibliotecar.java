package Clase;

import java.util.*;

public class Bibliotecar extends Angajat {
    private int grad; // aparent bibliotecarii au grad

    public Bibliotecar()
    {

    }

    public Bibliotecar(String cnp, String nume, String prenume, double salariu, String nr_telefon, String email, int grad) {
        super(cnp, nume, prenume, salariu, nr_telefon, email);
        this.grad = grad;
    }

    public int getGrad() {
        return grad;
    }

    public void setGrad(int grad) {
        this.grad = grad;
    }


    @Override
    public void CitireAngajat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti CNP:");
        this.cnp = scanner.nextLine();
        System.out.println("Introduceti numele:");
        this.nume = scanner.nextLine();
        System.out.println("Introduceti prenumele:");
        this.prenume = scanner.nextLine();
        System.out.println("Introduceti salariul:");
        this.salariu = Double.parseDouble(scanner.nextLine());
        System.out.println("Introduceti numarul de telefon:");
        this.nr_telefon = scanner.nextLine();
        System.out.println("Introduceti adresa de email:");
        this.email = scanner.nextLine();
        System.out.println("Introduceti gradul (1 sau 2):");
        this.grad = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void AfisareAngajat() {
        System.out.println("CNP:" + this.cnp + "\nNumele:" + this.nume + "\nPrenumele:" + this.prenume + "\nSalariul:" + this.salariu
                + "\nNumarul de telefon:" + this.nr_telefon + "\nAdresa de email:" + this.email + "\nGradul:" + this.grad);
    }

    public void MarireSalariu1() {
        this.salariu = 1.1 * this.salariu;
    }

    public void MarireSalariu2() {
        this.salariu = 1.2 * this.salariu;
    }

    // program preluat din laboratorul 1
    @Override
    public void AfisareDataNastere() {
        String gen;
        String prefixAn;
        String sufixAn;
        Integer luna;
        Integer zi;
        if(cnp.length() != 13) {
            System.out.println("CNP invalid!");
        } else {
            int genInt = Integer.parseInt(cnp.substring(0,1));
            if(genInt == 1 || genInt == 2) {
                prefixAn = "19";
            } else {
                prefixAn = "20";
            }

            gen =  genInt == 1 || genInt == 5 ? "M" : "F";
            sufixAn = cnp.substring(1, 3);
            luna = new Integer(cnp.substring(3, 5));
            zi = new Integer(cnp.substring(5,7));
            String lunaM = aflaLuna(luna);
            String dataNasterii = zi.toString().concat(" ").concat(lunaM).concat(" ").concat(prefixAn).concat(sufixAn);
            System.out.println("Gen ".concat(gen).concat(" data nasterii:").concat(dataNasterii));
        }

    }

    @Override
    public String toString()
    {
        return "CNP:" + this.cnp + "\nNumele:" + this.nume + "\nPrenumele:" + this.prenume + "\nSalariul:" + this.salariu
                + "\nNumarul de telefon:" + this.nr_telefon + "\nAdresa de email:" + this.email + "\nGradul:" + this.grad;
    }

    public static String aflaLuna(int luna) {
        switch (luna) {
            case 1:
                return "Ianuarie";

            case 2:
                return "Februarie";

            case 3:
                return "Martie";

            case 4:
                return "Aprilie";

            case 5:
                return "Mai";

            case 6:
                return "Iunie";

            case 7:
                return "Iulie";

            case 8:
                return "August";

            case 9:
                return "Septembrie";

            case 10:
                return "Obtombrie";

            case 11:
                return "Noiembrie";

            case 12:
                return "Decembrie";

            default:
                return "Nu exista";
        }
    }
}
