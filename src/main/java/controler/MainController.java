/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import Model.Airplane;
import Model.ClientInformation;
import Model.EncriptionClass;
import Model.Flight;
import Model.Tickets;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mahdi
 */
public class MainController extends DatabaseManager {

    public MainController() {

    }

    public Flight readSpecificFlight(String FlightID) {
        String query = "SELECT * FROM flight WHERE FlightID = ?";
        
        try {
            Connect(query);
            stm.setString(1, FlightID);
            ResultSet resultSet = stm.executeQuery();

            if (resultSet.next()) {
                Airplane airplane = readSpecificAirplane(resultSet.getString("AirplaneID"));
                return new Flight(
                        resultSet.getString("departureAirport"),
                        resultSet.getString("destinationAirport"),
                        resultSet.getDate("travelDate"),
                        resultSet.getString("travelTime"),
                        resultSet.getInt("FlightID"),
                        resultSet.getInt("Price"),
                        resultSet.getInt("AvailableFirstClassSeats"),
                        resultSet.getInt("AvailableBusinessClassSeats"),
                        resultSet.getInt("AvailableEconomyClassSeats"),
                        airplane
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return null;
    }

    public Tickets ReadSpecificTicket(String seats ) {
        String query = "Select* from tickets Natural join users  where seatNumber= ?";
        try {
            Connect(query);
            stm.setString(1, seats);
            ResultSet result = stm.executeQuery();
            if (result.next()) {

                String flightid = result.getString("flightID");
                String Username = result.getString("username");
                Tickets tickets = new Tickets(new ClientController().readSpecificClientInformation(Username), result.getString("seatClass"), readSpecificFlight(flightid), seats);
                return tickets;
            } else {

                return null;
            }

        } catch (SQLException e) {
            return null;
        } finally {
            close();
        }

    }


    public Airplane readSpecificAirplane(String airplaneId) {
        Airplane airplane = null;
        String query = "SELECT * FROM airplane WHERE AirplaneId=?";

        try {
            Connect(query);
            stm.setString(1, airplaneId);
            ResultSet resultSet = stm.executeQuery();

            if (resultSet.next()) {
                airplane = new Airplane(
                        resultSet.getInt("AirplaneId"),
                        resultSet.getInt("FirstClassSeats"),
                        resultSet.getInt("BusinessClassSeats"),
                        resultSet.getInt("EconomyClassSeats"),
                        resultSet.getString("Manufacturer"),
                        resultSet.getString("Model"),
                        resultSet.getString("RegistrationNumber")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }

        return airplane;
    }

    public ClientInformation readSpecificClientInformation(String username) {
        String query = "SELECT * FROM users WHERE Username = ?";
        ClientInformation client = null;
        try {
            Connect(query);
            stm.setString(1, username);
            ResultSet resultSet = stm.executeQuery();
            if (resultSet.next()) {
                client = new ClientInformation(
                        resultSet.getString("Username"),
                        new EncriptionClass().decrypt(resultSet.getString("Password")),
                        resultSet.getString("Firstname"),
                        resultSet.getString("Lastname"),
                        resultSet.getString("PassportID"),
                        resultSet.getDate("DateOfBirth"),
                        resultSet.getString("Gender"),
                        resultSet.getInt("Contact")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return client;
    }

    public ArrayList<Tickets> ReadTickets() {
        ArrayList<Tickets> out = new ArrayList();
        String query = "SELECT * FROM tickets";

        try {
            Connect(query);
            ResultSet resultSet = stm.executeQuery();

            while (resultSet.next()) {

                String Flightid = resultSet.getString("FlightID");
                String username = resultSet.getString("username");
                String seat = resultSet.getString("seatNumber");
                String TravelClass = resultSet.getString("seatClass");
                Tickets tickets = new Tickets(new ClientController().readSpecificClientInformation(username), TravelClass, readSpecificFlight(Flightid), seat);
                out.add(tickets);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return out;
    }

    public ArrayList<Flight> ReadFlight() {
        ArrayList<Flight> out = new ArrayList();
        String query = "SELECT * FROM flight where Status=1 and (AvailableFirstClassSeats > 0 or AvailableBusinessClassSeats > 0 or AvailableEconomyClassSeats > 0)";

        try {
            Connect(query);
            ResultSet resultSet = stm.executeQuery();

            while (resultSet.next()) {
                int  Flightid = resultSet.getInt("FlightID");
                String DepartureAirport = resultSet.getString("departureAirport");
                String DestinationAirport = resultSet.getString("destinationAirport");
                Date TravelDate = resultSet.getDate("travelDate");
                String TravelTime = resultSet.getString("travelTime");
                int Price = resultSet.getInt("Price");
                int AvailableFirstClassSeats = resultSet.getInt("AvailableFirstClassSeats");
                int AvailableBuisnessClassSeats = resultSet.getInt("AvailableBusinessClassSeats");
                int AvailbleEconomyClassSeats = resultSet.getInt("AvailableEconomyClassSeats");
                String AirplaneID = resultSet.getString("AirplaneID");
                Airplane airplane = readSpecificAirplane(AirplaneID);
                Flight c = new Flight(DepartureAirport,DestinationAirport,TravelDate,TravelTime , Flightid,Price, AvailableFirstClassSeats , AvailableBuisnessClassSeats , AvailbleEconomyClassSeats , airplane);
                out.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return out;
    }

    public ArrayList<Airplane> readAirplanes() {
        ArrayList<Airplane> airplanes = new ArrayList<>();
        String query = "SELECT * FROM airplane";

        try {
            Connect(query);
            ResultSet resultSet = stm.executeQuery();

            while (resultSet.next()) {
                Airplane airplane = new Airplane(
                        resultSet.getInt("AirplaneId"),
                        resultSet.getInt("FirstClassSeats"),
                        resultSet.getInt("BusinessClassSeats"),
                        resultSet.getInt("EconomyClassSeats"),
                        resultSet.getString("Manufacturer"),
                        resultSet.getString("Model"),
                        resultSet.getString("RegistrationNumber")
                );
                airplanes.add(airplane);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return airplanes;
    }

    public ArrayList<ClientInformation> readClientInformation() {
        ArrayList<ClientInformation> out = new ArrayList();
        String query = "SELECT * FROM users";

        try {
            Connect(query);

            ResultSet resultSet = stm.executeQuery();

            while (resultSet.next()) {
                String username = resultSet.getString("Username");
                String password = new EncriptionClass().decrypt(resultSet.getString("Password"));
                String firstname = resultSet.getString("Firstname");
                String lastname = resultSet.getString("Lastname");
                String passportId = resultSet.getString("PassportID");
                Date dateOfBirth = resultSet.getDate("DateOfBirth");
                String gender = resultSet.getString("Gender");
                int contact = resultSet.getInt("Contact");

                ClientInformation c = new ClientInformation(username, password, firstname, lastname, passportId, dateOfBirth, gender, contact);

                out.add(c);
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            close();
        }
        return out;
    }

    public void updateStatus() {
        try {
            String query = "UPDATE flight SET Status=0 WHERE travelDate < CURDATE()";
            Connect(query);
            stm.executeUpdate();
        } catch (SQLException e) {

        }
    }

    public boolean checkForAvailabality(Date DepartureDate, String AirplaneID) {
        String query = "SELECT * FROM flight where AirplaneID =? and travelDate= ?";

        try {
            Connect(query);
            stm.setString(1, AirplaneID);
            stm.setDate(2, DepartureDate);
            ResultSet resultset = stm.executeQuery();
            return resultset.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public String[] ReturnAspecificClientInfo(String Username) {
        ClientInformation client = readSpecificClientInformation(Username);
        String[] out = new String[8];
        if (client != null) {
            out[0] = client.getUsername();
            out[1] = client.getPassword();
            out[2] = client.getFirstName();
            out[3] = client.getLastName();
            out[4] = client.getPassportId();
            out[5] = client.getDateOfBirth() + "";
            out[6] = client.getGender();
            out[7] = client.getContact() + "";
        }
        return out;
    }
}
