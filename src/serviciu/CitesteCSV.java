package serviciu;

import Clase.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CitesteCSV {

    public static CitesteCSV instanta = null;

    private CitesteCSV() {

    }

    public static CitesteCSV getInstance() {
        if (instanta == null)
            instanta = new CitesteCSV();
        return instanta;
    }

    public void Citeste_Autor(ArrayList<Autor> au) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Ovidiu\\Desktop\\bibliotecaEAP\\src\\CSV\\Autor.csv"));
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                au.add(new Autor(strings[0], strings[1], strings[2], strings[3], Integer.parseInt(strings[4]), Integer.parseInt(strings[5])));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Citeste_Bibliotecar(ArrayList<Bibliotecar> bibl) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Ovidiu\\Desktop\\bibliotecaEAP\\src\\CSV\\Bibliotecar.csv"));
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                bibl.add(new Bibliotecar(strings[0], strings[1], strings[2], Double.parseDouble(strings[3]), strings[4], strings[5], Integer.parseInt(strings[6])));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Citeste_Carte(ArrayList<Carte> carte) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Ovidiu\\Desktop\\bibliotecaEAP\\src\\CSV\\Carte.csv"));
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                carte.add(new Carte(strings[0], strings[1], strings[2], strings[3], Double.parseDouble(strings[4])));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Citeste_Cititor(ArrayList<Cititor> cititori) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Ovidiu\\Desktop\\bibliotecaEAP\\src\\CSV\\Cititor.csv"));
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                cititori.add(new Cititor(strings[0], strings[1], strings[2], strings[3]));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Citeste_Tehnoredactor(ArrayList<Tehnoredactor> tehno) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Ovidiu\\Desktop\\bibliotecaEAP\\src\\CSV\\Tehnoredactor.csv"));
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                tehno.add(new Tehnoredactor(strings[0], strings[1], strings[2], Double.parseDouble(strings[3]), strings[4], strings[5], Integer.parseInt(strings[6])));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
