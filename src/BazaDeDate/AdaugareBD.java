package BazaDeDate;

import Clase.*;
import serviciu.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class AdaugareBD {

    public static void AdaugaBibliotecar(Bibliotecar bibliotecar) throws SQLException {
        Connection con = ConexiuneBD.getConnection();
        String query = "INSERT INTO bibliotecar(cnp, nume, prenume, salariu, nr_telefon, email, grad) VALUES ('" + bibliotecar.getCnp() + "', '" + bibliotecar.getNume() + "', '" + bibliotecar.getPrenume() + "', '" +  bibliotecar.getSalariu() +"', '" +  bibliotecar.getNr_telefon() + "', '" +  bibliotecar.getEmail() + "', '"  + bibliotecar.getGrad() + "')";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.executeUpdate();
        con.close();
    }

    public static void AdaugaTehnoredactor(Tehnoredactor tehno) throws SQLException {
        Connection con = ConexiuneBD.getConnection();
        String query = "INSERT INTO tehnoredactor(cnp, nume, prenume, salariu, nr_telefon, email, treapta) VALUES ('" + tehno.getCnp() + "', '" + tehno.getNume() + "', '" + tehno.getPrenume() + "', '" + tehno.getSalariu() +"', '" +  tehno.getNr_telefon() + "', '" +  tehno.getEmail() + "', '"  + tehno.getTreapta() + "')";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.executeUpdate();
        con.close();
    }

    public static void AdaugaAutor(Autor autor) throws SQLException {
        Connection con = ConexiuneBD.getConnection();
        String query = "INSERT INTO autor(cnp, nume, prenume, email, popularitate, carti_publicate) VALUES ('" + autor.getCnp() + "', '" + autor.getNume() + "', '" + autor.getPrenume() + "', '" + autor.getEmail() + "', '" +  autor.getPopularitate() +"', '" +  autor.getCarti_publicate() + "')";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.executeUpdate();
        con.close();
    }

    public static void AdaugaCarte(Carte carte) throws SQLException {
        Connection con = ConexiuneBD.getConnection();
        String query = "INSERT INTO carte(titlu, nume, prenume, categorie, pret) VALUES ('" + carte.getTitlu() + "', '" + carte.getNume() + "', '" + carte.getPrenume() + "', '" + carte.getCategorie() + "', '" +  carte.getPret() + "')";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.executeUpdate();
        con.close();
    }


    public static void AdaugaCititor(Cititor cititor) throws SQLException {
        Connection con = ConexiuneBD.getConnection();
        String query = "INSERT INTO cititor(cnp, nume, prenume, tip_abonament) VALUES ('" + cititor.getCnp() + "', '" + cititor.getNume() + "', '" + cititor.getPrenume() + "', '" + cititor.getAbonamentTip() +  "')";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.executeUpdate();
        con.close();
    }
}
