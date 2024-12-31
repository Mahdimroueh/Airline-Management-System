

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import Model.ClientInformation;
import Model.EncriptionClass;
import Model.Flight;
import java.util.ArrayList;
import Model.Tickets;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author mahdi
 */
public class ClientController extends MainController {

    public ClientController() {

    }

     public boolean checkUser(String username, String password) {

        String EncryptPass = new EncriptionClass().encrypt(password);
        String query = "Select* from users where Username=? and Password=?";
        try {
            Connect(query);
            stm.setString(1, username);
            stm.setString(2, EncryptPass);
            ResultSet result = stm.executeQuery();
            return result.next();

        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            close();
        }
        return false;
    }

    public String addClientInformation(String username, String Pass, String FirstName, String LastName, String PassportID, java.sql.Date DateOfBirth, String Gender, int Contact) throws SQLException {
        String query = "INSERT INTO users (Username, Password, Firstname, Lastname, PassportID, DateOfBirth, Gender, Contact) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        Connect(query);
        stm.setString(1, username);
        stm.setString(2, new EncriptionClass().encrypt(Pass));
        stm.setString(3, FirstName);
        stm.setString(4, LastName);
        stm.setString(5, PassportID);
        stm.setDate(6, DateOfBirth);
        stm.setString(7, Gender);
        stm.setInt(8, Contact);

        int rowsInserted = stm.executeUpdate();
        if (rowsInserted > 0) {
            return null;
        }
        close();

        return "Error occurred";
    }
  
    public boolean Forgotpassword(String PassportID, String username, String password) {
        String query = "UPDATE users SET Password=? WHERE Username=? and PassportID=?";
        String EncryptedPass = new EncriptionClass().encrypt(password);
        try {
            Connect(query);
            stm.setString(1, EncryptedPass);
            stm.setString(2, username);
            stm.setString(3, PassportID);
            int result = stm.executeUpdate();
            if (result > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {

        }
        return false;

    }

    public String[][] getAllTicketsBookedByAclient(String username, String password) {
        String query = "Select* from tickets Natural join users Natural join flight  where username=? and users.password =? and status = 1";
        ArrayList<Tickets> out = new ArrayList<>();
        try {
            Connect(query);
            stm.setString(1, username);
            stm.setString(2, new EncriptionClass().encrypt(password));
            ResultSet result = stm.executeQuery();
            while (result.next()) {
                String Flightid = result.getString("FlightID");
                String seat = result.getString("seatNumber");
                String TravelClass = result.getString("seatClass");
                Tickets tickets = new Tickets(readSpecificClientInformation(username), TravelClass, new Admin1Controller().readSpecificFlight(Flightid), seat);
                out.add(tickets);
            }

        } catch (SQLException e) {

        }
        String[][] ReturnValue = new String[7][out.size()];
        for (int i = 0; i < ReturnValue[0].length; i++) {
            ReturnValue[0][i] = out.get(i).getFlight().getDepartureAirport();
            ReturnValue[1][i] = out.get(i).getFlight().getDestinationAirport();
            ReturnValue[2][i] = out.get(i).getFlight().getTravelTime();
            ReturnValue[3][i] = out.get(i).getFlight().getTravelDate() + "";
            ReturnValue[4][i] = out.get(i).getFlight().getFlightID() + "";
            ReturnValue[5][i] = out.get(i).getTravelClass();
            ReturnValue[6][i] = out.get(i).getSeats();
        }
        return ReturnValue;
    }

    public String[][] fillTableWithFlightInformation() {
        ArrayList<Flight> flight = ReadFlight();
        String[][] out = new String[9][flight.size()];
        for (int i = 0; i < flight.size(); i++) {
            out[0][i] = flight.get(i).getDepartureAirport();
            out[1][i] = flight.get(i).getDestinationAirport();
            out[2][i] = flight.get(i).getTravelDate() + "";
            out[3][i] = flight.get(i).getTravelTime();
            out[4][i] = flight.get(i).getPrice() + "$";
            out[5][i] = flight.get(i).getFlightID() + "";
            out[6][i] = flight.get(i).getAvailbleFirstClassSeats() + "";
            out[7][i] = flight.get(i).getAvailableBuisnessClassSeats() + "";
            out[8][i] = flight.get(i).getAvailableEconomyClassSeats() + "";
        }
        return out;
    }

    public String addtickets(String username, String Fligh, String TravelClass, Date bookingdate, String PayementMethod, double Price, String Cardinfo) {
        ClientInformation client = readSpecificClientInformation(username);
        Flight flight = readSpecificFlight(Fligh);
        String seatNumber = setSeats(TravelClass, flight);
        try {
            if (seatNumber != null) {
                String query = "INSERT INTO tickets(flightID ,username ,seatNumber, paymentMethod ,amountPaid ,BookingDate ,seatClass,CardInfo) VALUES(?,?,?,?,?,?,?,?)";
                Connect(query);
                stm.setString(1, Fligh);
                stm.setString(2, username);
                stm.setString(3, seatNumber);
                stm.setString(4, PayementMethod);
                stm.setDouble(5, Price);
                stm.setDate(6, bookingdate);
                stm.setString(7, TravelClass);
                stm.setString(8, Cardinfo);

                int Result = stm.executeUpdate();
                if (Result > 0) {
                    Tickets tickets = new Tickets(client, TravelClass, flight, seatNumber);
                    UpdatesSeats(Fligh, TravelClass, 1);
                    return tickets.WriteToLabel();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return null;
    }

    private void UpdatesSeats(String FlightID, String travelClass, int select) {
        Admin1Controller admin = new Admin1Controller();
        Flight UpdatedFlight = admin.readSpecificFlight(FlightID);
        if (select == 1) {
            switch (travelClass.toLowerCase()) {
                case "economy class":
                    UpdatedFlight.setAvailableEconomyClassSeats(UpdatedFlight.getAvailableEconomyClassSeats() - 1);
                    break;
                case "buisness class":
                    UpdatedFlight.setAvailableBuisnessClassSeats(UpdatedFlight.getAvailableBuisnessClassSeats() - 1);
                    break;
                case "first class":
                    UpdatedFlight.setAvailbleFirstClassSeats(UpdatedFlight.getAvailbleFirstClassSeats() - 1);
                    break;
            }
        } else {
            switch (travelClass.toLowerCase()) {
                case "economy class":
                    UpdatedFlight.setAvailableEconomyClassSeats(UpdatedFlight.getAvailableEconomyClassSeats() + 1);
                    break;
                case "buisness class":
                    UpdatedFlight.setAvailableBuisnessClassSeats(UpdatedFlight.getAvailableBuisnessClassSeats() + 1);
                    break;
                case "first class":
                    UpdatedFlight.setAvailbleFirstClassSeats(UpdatedFlight.getAvailbleFirstClassSeats() + 1);
                    break;
            }
        }
        admin.UpdateOnflightTable(UpdatedFlight);
    }

    public int setPrice(String travelClass, String flightID) {
        Flight flight = readSpecificFlight(flightID);
        int price = 0;
        if ("economy class".equals(travelClass)) {
            price = flight.getPrice();
        } else if ("Buisness class".equals(travelClass)) {
            price = flight.getPrice() + 200;
        } else {
            price = flight.getPrice() + 200;
        }
        return price;
    }
   
    private String setSeats(String travelClass, Flight flight) {
        String query = "SELECT seatNumber FROM tickets WHERE flightID = ?";
        Set<String> bookedSeats = new HashSet<>();

        try {
            Connect(query);
            stm.setInt(1, flight.getFlightID());
            ResultSet result = stm.executeQuery();

            while (result.next()) {
                bookedSeats.add(result.getString("seatNumber"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String seatPrefix;
        int totalSeats;

        if ("economy class".equalsIgnoreCase(travelClass)) {
            seatPrefix = "E";
            totalSeats = flight.getAvailableEconomyClassSeats();
        } else if ("business class".equalsIgnoreCase(travelClass)) {
            seatPrefix = "B";
            totalSeats = flight.getAvailableBuisnessClassSeats();
        } else {
            seatPrefix = "F";
            totalSeats = flight.getAvailbleFirstClassSeats();
        }

        for (int i = 1; i <= totalSeats; i++) {
            String seatNumber = seatPrefix + i;
            if (!bookedSeats.contains(seatNumber)) {
                return seatNumber;
            }
        }

        return null; // In case no seats are available
    }

// Method to handle cancellation
    public boolean cancelReservation(String seatNumber, String flightID) {
        Tickets ticket = ReadSpecificTicket(seatNumber);
        String query = "DELETE FROM tickets WHERE seatNumber = ? AND flightID = ?";
        try {
            Connect(query);
            stm.setString(1, seatNumber);
            stm.setString(2, flightID);
            if (stm.executeUpdate() > 0) {
                UpdatesSeats(flightID, ticket.getTravelClass(), 0);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public String PrintTickets(String seats) {
        return ReadSpecificTicket(seats).WriteToLabel();
    }

}
