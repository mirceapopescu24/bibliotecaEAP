package serviciu;

import java.io.FileWriter;
import java.io.IOException;

public class ScriereCSV {

    public static ScriereCSV instanta = null;

    private ScriereCSV() {

    }

    public static ScriereCSV getInstance() {
        if (instanta == null)
            instanta = new ScriereCSV();
        return instanta;
    }


    public void Scrie_Autor(String cnp, String nume, String prenume, String email, int popularitate, int carti_publicate){
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(("C:\\Users\\Ovidiu\\Desktop\\bibliotecaEAP\\src\\CSV\\Autor.csv"), true);

            String stringBuilder = cnp +
                    "," +
                    nume +
                    "," +
                    prenume +
                    "," +
                    email +
                    "," +
                    popularitate +
                    "," +
                    carti_publicate +
                    "\n";
            fileWriter.write(stringBuilder);
            fileWriter.flush();
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Scrie_Bibliotecar(String cnp, String nume, String prenume, Double salariu, String nr_telefon, String email, int grad){
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(("C:\\Users\\Ovidiu\\Desktop\\bibliotecaEAP\\src\\CSV\\Bibliotecar.csv"), true);

            String stringBuilder = cnp +
                    "," +
                    nume +
                    "," +
                    prenume +
                    "," +
                    salariu +
                    "," +
                    nr_telefon +
                    "," +
                    email +
                    "," +
                    grad +
                    "\n";
            fileWriter.write(stringBuilder);
            fileWriter.flush();
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Scrie_Carte(String titlu, String nume, String prenume, String categorie, double pret){
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(("C:\\Users\\Ovidiu\\Desktop\\bibliotecaEAP\\src\\CSV\\Carte.csv"), true);

            String stringBuilder = titlu +
                    "," +
                    nume +
                    "," +
                    prenume +
                    "," +
                    categorie +
                    "," +
                    pret +
                    "\n";
            fileWriter.write(stringBuilder);
            fileWriter.flush();
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Scrie_Cititor(String cnp, String nume, String prenume, String tip_abonament){
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(("C:\\Users\\Ovidiu\\Desktop\\bibliotecaEAP\\src\\CSV\\Cititor.csv"), true);

            String stringBuilder = cnp +
                    "," +
                    nume +
                    "," +
                    prenume +
                    "," +
                    tip_abonament
                    +
                    "\n";
            fileWriter.write(stringBuilder);
            fileWriter.flush();
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Scrie_Tehnoredactor(String cnp, String nume, String prenume, Double salariu, String nr_telefon, String email, int treapta){
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(("C:\\Users\\Ovidiu\\Desktop\\bibliotecaEAP\\src\\CSV\\Tehnoredactor.csv"), true);

            String stringBuilder = cnp +
                    "," +
                    nume +
                    "," +
                    prenume +
                    "," +
                    salariu +
                    "," +
                    nr_telefon +
                    "," +
                    email +
                    "," +
                    treapta +
                    "\n";
            fileWriter.write(stringBuilder);
            fileWriter.flush();
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
