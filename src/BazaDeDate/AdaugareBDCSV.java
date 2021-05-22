package BazaDeDate;

import Clase.Cititor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdaugareBDCSV {
    static String url = "jdbc:mysql://127.0.0.1:3306/biblioteca?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static String user = "root";
    static String parola = "1234";

    public static void AdaugaCititorCSV() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, parola);
            String query = "INSERT INTO cititor(cnp, nume, prenume, tip_abonament) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            BufferedReader lineReader = new BufferedReader(new FileReader("C:\\Users\\Ovidiu\\Desktop\\bibliotecaEAP\\src\\CSV\\Cititor.csv"));
            String lineText = null;
            lineReader.readLine();

            while ((lineText = lineReader.readLine()) != null) {
                String[] data = lineText.split(",");
                String cnp = data[0];
                String nume = data[1];
                String prenume = data[2];
                String tip_abon = data[3];
                preparedStatement.setString(1, cnp);
                preparedStatement.setString(2, nume);
                preparedStatement.setString(3, prenume);
                preparedStatement.setString(4, tip_abon);
                preparedStatement.executeUpdate();
            }
            con.close();
        } catch (SQLException | ClassNotFoundException | IOException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void AdaugaAutorCSV() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, parola);
            String query = "INSERT INTO autor(cnp, nume, prenume, email, popularitate, carti_publicate) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            BufferedReader lineReader = new BufferedReader(new FileReader("C:\\Users\\Ovidiu\\Desktop\\bibliotecaEAP\\src\\CSV\\Autor.csv"));
            String lineText = null;
            lineReader.readLine();

            while ((lineText = lineReader.readLine()) != null) {
                String[] data = lineText.split(",");
                String cnp = data[0];
                String nume = data[1];
                String prenume = data[2];
                String email = data[3];
                int popularitate = Integer.parseInt(data[4]);
                int carti_publicate = Integer.parseInt(data[5]);
                preparedStatement.setString(1, cnp);
                preparedStatement.setString(2, nume);
                preparedStatement.setString(3, prenume);
                preparedStatement.setString(4, email);
                preparedStatement.setInt(5, popularitate);
                preparedStatement.setInt(6, carti_publicate);
                preparedStatement.executeUpdate();
            }
            con.close();

        } catch (ClassNotFoundException | SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void AdaugaBibliotecarCSV() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, parola);
            String query = "INSERT INTO bibliotecar(cnp, nume, prenume, salariu, nr_telefon, email, grad) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            BufferedReader lineReader = new BufferedReader(new FileReader("C:\\Users\\Ovidiu\\Desktop\\bibliotecaEAP\\src\\CSV\\Bibliotecar.csv"));
            String lineText = null;
            lineReader.readLine();

            while ((lineText = lineReader.readLine()) != null) {
                String[] data = lineText.split(",");
                String cnp = data[0];
                String nume = data[1];
                String prenume = data[2];
                double salariu = Double.parseDouble(data[3]);
                String nr_telefon = data[4];
                String email = data[5];
                int grad = Integer.parseInt(data[6]);
                preparedStatement.setString(1, cnp);
                preparedStatement.setString(2, nume);
                preparedStatement.setString(3, prenume);
                preparedStatement.setDouble(4, salariu);
                preparedStatement.setString(5, nr_telefon);
                preparedStatement.setString(6, email);
                preparedStatement.setInt(7, grad);
                preparedStatement.executeUpdate();
            }
            con.close();

        } catch (ClassNotFoundException | SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void AdaugaTehnoredactorCSV() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, parola);
            String query = "INSERT INTO tehnoredactor(cnp, nume, prenume, salariu, nr_telefon, email, treapta) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            BufferedReader lineReader = new BufferedReader(new FileReader("C:\\Users\\Ovidiu\\Desktop\\bibliotecaEAP\\src\\CSV\\Tehnoredactor.csv"));
            String lineText = null;
            lineReader.readLine();

            while ((lineText = lineReader.readLine()) != null) {
                String[] data = lineText.split(",");
                String cnp = data[0];
                String nume = data[1];
                String prenume = data[2];
                double salariu = Double.parseDouble(data[3]);
                String nr_telefon = data[4];
                String email = data[5];
                int treapta = Integer.parseInt(data[6]);
                preparedStatement.setString(1, cnp);
                preparedStatement.setString(2, nume);
                preparedStatement.setString(3, prenume);
                preparedStatement.setDouble(4, salariu);
                preparedStatement.setString(5, nr_telefon);
                preparedStatement.setString(6, email);
                preparedStatement.setInt(7, treapta);
                preparedStatement.executeUpdate();
            }
            con.close();

        } catch (ClassNotFoundException | SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void AdaugaCarteCSV() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, parola);
            String query = "INSERT INTO carte(titlu, nume, prenume, categorie, pret) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            BufferedReader lineReader = new BufferedReader(new FileReader("C:\\Users\\Ovidiu\\Desktop\\bibliotecaEAP\\src\\CSV\\Carte.csv"));
            String lineText = null;
            lineReader.readLine();

            while ((lineText = lineReader.readLine()) != null) {
                String[] data = lineText.split(",");
                String titlu = data[0];
                String nume = data[1];
                String prenume = data[2];
                String categorie = data[3];
                int pret = Integer.parseInt(data[4]);
                preparedStatement.setString(1, titlu);
                preparedStatement.setString(2, nume);
                preparedStatement.setString(3, prenume);
                preparedStatement.setString(4, categorie);
                preparedStatement.setInt(5, pret);
                preparedStatement.executeUpdate();
            }
            con.close();
        } catch (SQLException | ClassNotFoundException | IOException throwables) {
            throwables.printStackTrace();
        }
    }
}
