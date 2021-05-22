package BazaDeDate;

import Clase.*;
import com.sun.org.apache.bcel.internal.generic.Select;
import serviciu.ConexiuneBD;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class UpdateBD {

    public static void UpdateSalariu(double salariu, int id) throws SQLException {
        Connection con = ConexiuneBD.getConnection();
        String query = "UPDATE bibliotecar SET salariu=" + salariu + " WHERE id = " + id + "";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.executeUpdate();
        con.close();
        SelectBD.SelectBibliotecar();
    }

    public static void UpdateSalariuT(double salariut, int id) throws SQLException {
        Connection con = ConexiuneBD.getConnection();
        String query = "UPDATE tehnoredactor SET salariu=" + salariut + " WHERE id = " + id + "";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.executeUpdate();
        con.close();
        SelectBD.SelectTehnoredactor();

    }

    public static void UpdateCartipublicate(int carti_publicate, int id) throws SQLException {
        Connection con = ConexiuneBD.getConnection();
        String query = "UPDATE autor SET carti_publicate=" + carti_publicate + " WHERE id = " + id + "";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.executeUpdate();
        con.close();
        SelectBD.SelectAutor();

    }

    public static void UpdateCarti(double pret, int id) throws SQLException {
        Connection con = ConexiuneBD.getConnection();
        String query = "UPDATE carte SET pret=" + pret + " WHERE id = " + id + "";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.executeUpdate();
        con.close();
        SelectBD.SelectCarte();

    }

    public static void UpdateCititor(String tip, int id) throws SQLException {
        Connection con = ConexiuneBD.getConnection();
        String query = "UPDATE carte SET pret=" + tip + " WHERE id = " + id + "";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.executeUpdate();
        con.close();
        SelectBD.SelectCititor();

    }
}
