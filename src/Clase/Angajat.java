package Clase;

import java.util.*;
import java.io.*;

abstract public class Angajat extends Persoana implements Comparable<Angajat> {
    protected double salariu;
    protected String nr_telefon;
    protected String email;

    public Angajat()
    {

    }

    public Angajat(String cnp, String nume, String prenume, double salariu, String nr_telefon, String email) {
        super(cnp, nume, prenume);
        this.salariu = salariu;
        this.nr_telefon = nr_telefon;
        this.email = email;
    }

    public double getSalariu() {
        return salariu;
    }

    public String getNr_telefon() {
        return nr_telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public void setNr_telefon(String nr_telefon) {
        this.nr_telefon = nr_telefon;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    abstract public void CitireAngajat();
    abstract public void AfisareAngajat();
    abstract public void AfisareDataNastere();

    @Override
    public int compareTo(Angajat angajat) {
        return this.nume.compareTo(angajat.nume);
    }
}
