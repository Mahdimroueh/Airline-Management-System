/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseManager {

    private static final String DB_URL ="" ;// enter your db url 
    private static final String DB_USER = ""; // enter your db username
    private static final String DB_PASSWORD = ""; //enter your db password
    private static final String JDBC = "com.mysql.cj.jdbc.Driver";
    protected Connection con;
    protected PreparedStatement stm;

    protected void Connect(String query) {
        try {
            Class.forName(JDBC);
            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            stm = con.prepareStatement(query);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
    }

    protected void close() {
        try {
            stm.close();
            con.close();
        } catch (SQLException e) {

        }
    }
}
