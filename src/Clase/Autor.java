package Clase;

import java.util.*;

public class Autor extends Persoana implements Comparable<Autor> {
    private String email;
    private int popularitate;
    private int carti_publicate; // carti publicate de-a lungul carierei

    public Autor()
    {

    }

    public Autor(String cnp, String nume, String prenume, String email, int popularitate, int carti_publicate) {
        super(cnp, nume, prenume);
        this.email = email;
        this.popularitate = popularitate;
        this.carti_publicate = carti_publicate;
    }

    public String getEmail() {
        return email;
    }

    public int getPopularitate() {
        return popularitate;
    }

    public int getCarti_publicate() {
        return carti_publicate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPopularitate(int popularitate) {
        this.popularitate = popularitate;
    }

    public void setCarti_publicate(int carti_publicate) {
        this.carti_publicate = carti_publicate;
    }

    public void CitireAutor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti CNP:");
        this.cnp = scanner.nextLine();
        System.out.println("Introduceti numele:");
        this.nume = scanner.nextLine();
        System.out.println("Introduceti prenumele:");
        this.prenume = scanner.nextLine();
        System.out.println("Introduceti adresa de email:");
        this.email = scanner.nextLine();
        System.out.println("Introduceti popularitatea autorului (de la 1 la 10):");
        this.popularitate = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti numarul de carti publicate de autorul respectiv:");
        this.carti_publicate = Integer.parseInt(scanner.nextLine());
    }

    public void AfisareAutor() {
        System.out.println("CNP:" + this.cnp + "\nNumele:" + this.nume + "\nPrenumele:" + this.prenume + "\nAdresa de email:" + this.email +
                "\nPopularitate:" + this.popularitate + "\nNumarul cartilor publicate:" + this.carti_publicate);
    }

    @Override
    public String toString() {
        return "CNP:" + this.cnp + "\nNumele:" + this.nume + "\nPrenumele:" + this.prenume + "\nAdresa de email:" + this.email +
                "\nPopularitate:" + this.popularitate + "\nNumarul cartilor publicate:" + this.carti_publicate;
    }

    @Override
    public int compareTo(Autor a) {
        return Integer.compare(a.getPopularitate(), this.getPopularitate());
    }

}
