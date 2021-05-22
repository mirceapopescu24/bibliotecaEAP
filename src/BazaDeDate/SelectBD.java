package BazaDeDate;

import Clase.*;
import serviciu.ConexiuneBD;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class SelectBD {

    public static void SelectBibliotecar() throws SQLException {
        Connection con = ConexiuneBD.getConnection();
        String query = "SELECT * FROM bibliotecar";
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            String cnp = resultSet.getString("cnp");
            String nume = resultSet.getString("nume");
            String prenume = resultSet.getString("prenume");
            double salariu = resultSet.getDouble("salariu");
            String nr_telefon = resultSet.getString("nr_telefon");
            String email = resultSet.getString("email");
            int grad = resultSet.getInt("grad");
            System.out.println("CNP:" + cnp + "\nNume:" + nume + "\nPrenume:" + prenume + "\nSalariu:" + salariu + "\nNumar telefon:" + nr_telefon + "\nEmail:" + email + "\nGrad:" + grad);
        }
        con.close();
    }

    public static void SelectTehnoredactor() throws SQLException {
        Connection con = ConexiuneBD.getConnection();
        String query = "SELECT * FROM tehnoredactor";
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            String cnp = resultSet.getString("cnp");
            String nume = resultSet.getString("nume");
            String prenume = resultSet.getString("prenume");
            double salariu = resultSet.getDouble("salariu");
            String nr_telefon = resultSet.getString("nr_telefon");
            String email = resultSet.getString("email");
            int treapta = resultSet.getInt("treapta");
            System.out.println("CNP:" + cnp + "\nNume:" + nume + "\nPrenume:" + prenume + "\nSalariu:" + salariu + "\nNumar telefon:" + nr_telefon + "\nEmail:" + email + "\nGrad:" + treapta);
        }
        con.close();
    }

    public static void SelectAutor() throws SQLException {
        Connection con = ConexiuneBD.getConnection();
        String query = "SELECT * FROM autor";
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            String cnp = resultSet.getString("cnp");
            String nume = resultSet.getString("nume");
            String prenume = resultSet.getString("prenume");
            String email = resultSet.getString("email");
            int popularitate = resultSet.getInt("popularitate");
            int carti_publicate = resultSet.getInt("carti_publicate");
            System.out.println("CNP:" + cnp + "\nNume:" + nume + "\nPrenume:" + prenume + "\nEmail:" + email + "\nPopularitate:" + popularitate + "\nCarti Publicate:" + carti_publicate);
        }
        con.close();
    }

    public static void SelectCarte() throws SQLException {
        Connection con = ConexiuneBD.getConnection();
        String query = "SELECT * FROM carte";
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            String titlu = resultSet.getString("titlu");
            String nume = resultSet.getString("nume");
            String prenume = resultSet.getString("prenume");
            String categorie = resultSet.getString("categorie");
            double pret = resultSet.getDouble("pret");
            System.out.println("Titlu:" + titlu + "\nNume:" + nume + "\nPrenume:" + prenume + "\nCategorie:" + categorie + "\nPret:" + pret);
        }
        con.close();
    }

    public static void SelectCititor() throws SQLException {
        Connection con = ConexiuneBD.getConnection();
        String query = "SELECT * FROM cititor";
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            String cnp = resultSet.getString("cnp");
            String nume = resultSet.getString("nume");
            String prenume = resultSet.getString("prenume");
            String tip_abonament = resultSet.getString("tip_abonament");
            System.out.println("CNP:" + cnp + "\nNume:" + nume + "\nPrenume:" + prenume + "\nTipul Abonamentului:" + tip_abonament);
        }
        con.close();
    }
}
