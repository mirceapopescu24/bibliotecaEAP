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

public class DeleteBD {

    public static void StergeBibliotecar(int id) throws SQLException {
        Connection con = ConexiuneBD.getConnection();
        String query = "DELETE FROM bibliotecar where id = " + id + "";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.executeUpdate();
        SelectBD.SelectBibliotecar();
        con.close();
    }

    public static void StergeTehnoredactor(int id) throws SQLException {
        Connection con = ConexiuneBD.getConnection();
        String query = "DELETE FROM tehnoredactor where id = " + id + "";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.executeUpdate();
        SelectBD.SelectTehnoredactor();
        con.close();
    }

    public static void StergeAutor(int id) throws SQLException {
        Connection con = ConexiuneBD.getConnection();
        String query = "DELETE FROM autor where id = " + id + "";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.executeUpdate();
        SelectBD.SelectAutor();
        con.close();
    }

    public static void StergeCarte(int id) throws SQLException {
        Connection con = ConexiuneBD.getConnection();
        String query = "DELETE FROM carte where id = " + id + "";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.executeUpdate();
        SelectBD.SelectAutor();
        con.close();
    }

    public static void StergeCititor(int id) throws SQLException {
        Connection con = ConexiuneBD.getConnection();
        String query = "DELETE FROM cititor where id = " + id + "";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.executeUpdate();
        SelectBD.SelectCititor();
        con.close();
    }
}
