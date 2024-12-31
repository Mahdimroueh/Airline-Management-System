/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import Model.ClientInformation;
import Model.EncriptionClass;
import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author mahdi
 */
public class Admin2Controller extends MainController {

    public Admin2Controller() {

    }
    public boolean updateOnUsername(String username, String newPassport) throws SQLException {
        String query = "UPDATE users SET Username = ? WHERE PassportID = ?";

        Connect(query);
        stm.setString(1, username);
        stm.setString(2, newPassport);
        int rowsAffected = stm.executeUpdate();
        close();
        if (rowsAffected > 0) {
            System.out.println("Username updated successfully.");
            return true;
        } else {
            System.out.println("Username update failed.");
            return false;
        }
    }

    public boolean deleteClientInformation(String username) {
        String query = "DELETE FROM users WHERE Username = ?";
        try {
            Connect(query);
            stm.setString(1, username);
            int rowsAffected = stm.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            close();
        }
    }
   
    public boolean UpdateOnclientTable(String username, String password, String Fn, String Ln, String PId, Date sqlDate, String gender, int nbr) {
        ClientInformation client = new ClientInformation(username, password, Fn, Ln, PId, sqlDate, gender, nbr);
        String Query = "UPDATE users SET Password=?, Firstname=?, Lastname=?, PassportID=?, DateOfBirth=?, Gender=?, Contact=? WHERE Username=?";
        try {
            Connect(Query);
            stm.setString(1, new EncriptionClass().encrypt(client.getPassword()));
            stm.setString(2, client.getFirstName());
            stm.setString(3, client.getLastName());
            stm.setString(4, client.getPassportId());
            stm.setDate(5, client.getDateOfBirth());
            stm.setString(6, client.getGender());
            stm.setInt(7, client.getContact());
            stm.setString(8, client.getUsername());

            int rowsAffected = stm.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Client information updated successfully.");
                return true;
            } else {
                System.out.println("No client found with the specified username.");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            close();
        }
    }

    public boolean deleteTicket(String username, String password, String flightID, String travelClass) {
        String query = "DELETE FROM tickets WHERE username = ? AND flightID = ? AND seatClass = ?";
        try {
            Connect(query);
            stm.setString(1, username);
            stm.setString(2, flightID);
            stm.setString(3, travelClass);
            int rowsAffected = stm.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            close();
        }
    }
}
