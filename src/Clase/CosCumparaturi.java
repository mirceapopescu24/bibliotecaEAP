package Clase;

import java.util.*;

public class CosCumparaturi {
    private ArrayList<Carte> ListaCarti = new ArrayList<>();
    private ArrayList<Abonament> AbonamentPremium = new ArrayList<>();

    public void setCartiCumparate(ArrayList<Carte>ListaCarti) {
        this.ListaCarti = ListaCarti;
    }

    public void setAbonament(ArrayList<Abonament>AbonamentPremium) {
        this.AbonamentPremium = AbonamentPremium;
    }

    public void AdaugaCarte(Carte book) {
        ListaCarti.add(book);
    }

    public int DimensiuneListaCarti() {
        return ListaCarti.size();
    }

    public void AdaugaAbonament(Abonament abonament) {
        AbonamentPremium.add(abonament);
    }


    @Override
    public String toString() {
        return "Multumim pentru ca ati ales biblioteca noastra! Acestea sunt achizitiile dumneavoastra: " + ListaCarti + AbonamentPremium;
    }
}


