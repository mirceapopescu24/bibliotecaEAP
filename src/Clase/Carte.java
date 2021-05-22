package Clase;

import java.util.Scanner;
import java.util.*;


public class Carte {
    private int id;
    private String titlu;
    private String nume;
    private String prenume;
    private String categorie;
    private double pret;

    public Carte(String titlu, String nume, String prenume, String categorie, double pret) {
        this.titlu = titlu;
        this.nume = nume;
        this.prenume = prenume;
        this.categorie = categorie;
        this.pret = pret;
    }


    public String getTitlu() {
        return titlu;
    }

    public String getNume()
    {return nume;}

    public String getPrenume()
    {return prenume;}

    public int getId()
    {return id;}

    public void setId(int id)
    {this.id = id;}

    public void setNume(String nume)
    {
        this.nume = nume;
    }

    public void setPrenume(String prenume)
    {
        this.prenume = prenume;
    }

    public String getCategorie() {
        return categorie;
    }

    public double getPret() {
        return pret;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }


    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public void CitireCarte() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti titlul:");
        this.titlu = scanner.nextLine();
        System.out.println("Introduceti numele autorului:");
        this.nume = scanner.nextLine();
        System.out.println("Introduceti prenumele autorului:");
        this.prenume = scanner.nextLine();
        System.out.println("Introduceti categoria:");
        this.categorie = scanner.nextLine();
        System.out.println("Introduceti pretul");
        this.pret = Double.parseDouble(scanner.nextLine());

    }

    @Override
    public String toString() {
        return "Titlu:" + this.titlu + "\nNumele autorului:" + this.nume + "\nPrenumele autorului:" + this.prenume + "\nCategorie:" + this.categorie + "\nPret:" + this.pret;
    }

    public void AfisareCarte() {
        System.out.println("Titlu:" + this.titlu + "\nNumele autorului:" + this.nume + "\nPrenumele autorului:" + this.prenume + "\nCategorie:" + this.categorie + "\nPret:" + this.pret);
    }

    public void ReducereCyber() {
        this.pret = 0.5 * this.pret;
    }
}
