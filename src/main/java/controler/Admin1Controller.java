/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import Model.Airplane;
import Model.Flight;
import Model.Tickets;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author mahdi
 */
public class Admin1Controller extends MainController {

    public Admin1Controller() {

    }

    public int ReadAdmin(String user, String password) {
        String query = "SELECT id FROM adminlogin WHERE username = ? AND password = ?";
        try {
            Connect(query);
            stm.setString(1, user);
            stm.setString(2, password);
            try (ResultSet resultSet = stm.executeQuery()) {
                if (resultSet.next()) {
                    int userID = resultSet.getInt("id");
                    return userID;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return 0;
    }

    public int addFlight(String DepartureAirport, String DestinationAirport, java.sql.Date TravelDate, String TravelTime, int Price, String AirplaneID) throws SQLException {
        String query = "INSERT INTO flight (departureAirport, destinationAirport, travelDate, travelTime, Price, AvailableFirstClassSeats, AvailableBusinessClassSeats, AvailableEconomyClassSeats, AirplaneID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Airplane airplane = readSpecificAirplane(AirplaneID);
        if (!checkForAvailabality(TravelDate, AirplaneID)) {
            Connect(query);
            stm.setString(1, DepartureAirport);
            stm.setString(2, DestinationAirport);
            stm.setDate(3, TravelDate);
            stm.setString(4, TravelTime);
            stm.setInt(5, Price);
            stm.setInt(6, airplane.getFirstClassSeats());
            stm.setInt(7, airplane.getBuisnessClassSeats());
            stm.setInt(8, airplane.getEconomyClassSeats());
            stm.setString(9, AirplaneID);
            int Result = stm.executeUpdate();
            close();
            return Result;
        } else {
            return 0;
        }
    }

    public boolean UpdateOnflightTable(Flight flight) {
        String query = "UPDATE flight SET departureAirport=?, destinationAirport=?, travelDate=?, travelTime=?, Price=?, AvailableFirstClassSeats=?, AvailableEconomyClassSeats=?, AvailableBusinessClassSeats=? WHERE FlightID=?";

        try {
            Connect(query);

            stm.setString(1, flight.getDepartureAirport());
            stm.setString(2, flight.getDestinationAirport());
            stm.setDate(3, flight.getTravelDate());
            stm.setString(4, flight.getTravelTime());
            stm.setDouble(5, flight.getPrice());
            stm.setInt(6, flight.getAvailbleFirstClassSeats());
            stm.setInt(7, flight.getAvailableBuisnessClassSeats());
            stm.setInt(8, flight.getAvailableEconomyClassSeats());
            stm.setInt(9, flight.getFlightID());

            int rowsAffected = stm.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Flight information updated successfully.");
                return true;
            } else {
                System.out.println("No flight found with the specified FlightID.");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            close();
        }
    }

    public boolean UpdateOnTicketsTable(Tickets ticket) {
        String query = "UPDATE tickets SET seatNumber=?, seatClass=? WHERE username=? AND flightID=?";
        try {
            Connect(query);

            stm.setString(1, ticket.getSeats());
            stm.setString(2, ticket.getTravelClass());
            stm.setString(3, ticket.getClient().getUsername());
            stm.setInt(4, ticket.getFlight().getFlightID());

            int rowsAffected = stm.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Ticket information updated successfully.");
                return true;
            } else {
                System.out.println("No ticket found with the specified username and flightID.");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            close();
        }
    }

    public void ChangeFlightDestination(String FlightID, String destination) {
        Flight flight = readSpecificFlight(FlightID);
        flight.setDestinationAirport(destination);
        UpdateOnflightTable(flight);

    }

    public void ChangeTime(String FlightID, String travelTime) {
        Flight flight = readSpecificFlight(FlightID);
        flight.setTravelTime(travelTime);
        UpdateOnflightTable(flight);
    }

    public void ChangeDate(String FlightID, Date travelDate) {

        Flight flight = readSpecificFlight(FlightID);
        flight.setTravelDate(travelDate);
        UpdateOnflightTable(flight);
    }

    public void ChangeFlightPrice(String FlightID, int price) {
        Flight flight = readSpecificFlight(FlightID);
        flight.setPrice(price);
        UpdateOnflightTable(flight);
    }

    public void ChangeFlightDeparture(String FlightID, String departure) {
        Flight flight = readSpecificFlight(FlightID);
        flight.setDepartureAirport(departure);
        UpdateOnflightTable(flight);
    }
    public void ChangeAirplane(String FlightID , int Airplane){
        Flight flight = readSpecificFlight(FlightID); 
        flight.getAirplane().setAirplaneId(Airplane);
        UpdateOnflightTable(flight);
    }
    public boolean deleteFlight(String flightID) {
        String query = "DELETE FROM flight WHERE FlightID = ?";
        try {
            Connect(query);
            stm.setString(1, flightID);
            int rowsAffected = stm.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            close();
        }
    }

    public ArrayList<String> getAllAirplaneID() {
        ArrayList<String> out = new ArrayList<>();
        String query = "Select AirplaneId from airplane";
        try {
            Connect(query);
            ResultSet set = stm.executeQuery();
            while (set.next()) {
                out.add(set.getString("AirplaneId"));
            }
            return out;
        } catch (SQLException e) {
            return null;
        } finally {
            close();
        }

    }

    public boolean addAirplane( int FirstClassSeats, int BuisnessClassSeats, int EconomyClassSeats, String manufacturer, String model, String registrationNumber) {
        String query = "INSERT INTO airplane (FirstClassSeats, BusinessClassSeats, EconomyClassSeats, Manufacturer, Model,RegistrationNumber) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            Connect(query);
            stm.setInt(1, FirstClassSeats);
            stm.setInt(2, BuisnessClassSeats);
            stm.setInt(3, EconomyClassSeats);
            stm.setString(4, manufacturer);
            stm.setString(5, model);
            stm.setString(6, registrationNumber);
            int Update = stm.executeUpdate();
            if (Update > 0) {
                return true;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            close();
        }
    }

    public void updateAirplane(Airplane airplane) {
        String query = "UPDATE airplane SET FirstClassSeats=?, BuisnessClassSeats=?, EconomyClassSeats=?, Manufacturer=?, Model=?,RegistrationNumber=? WHERE AirplaneId=?";

        try {
            Connect(query);
            stm.setInt(1, airplane.getFirstClassSeats());
            stm.setInt(2, airplane.getBuisnessClassSeats());
            stm.setInt(3, airplane.getEconomyClassSeats());
            stm.setString(4, airplane.getManufacturer());
            stm.setString(5, airplane.getModel());
            stm.setString(6, airplane.getRegistrationNumber());
            stm.setInt(7, airplane.getAirplaneId());

            stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public boolean deleteAirplane(String airplaneId) {
        String query = "DELETE FROM airplane WHERE AirplaneId = ?";
        try {
            Connect(query);
            stm.setString(1, airplaneId);
            int rowsAffected = stm.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            close();
        }

    }

    public String[][] fillTableWithFlightInformation() {
        String[][] out = new String[7][ReadFlight().size()];
        ArrayList<Flight> flight = ReadFlight();
        for (int i = 0; i < ReadFlight().size(); i++) {
            out[0][i] = flight.get(i).getDepartureAirport();
            out[1][i] = flight.get(i).getDestinationAirport();
            out[2][i] = flight.get(i).getTravelDate() + "";
            out[3][i] = flight.get(i).getTravelTime();
            out[4][i] = flight.get(i).getPrice() + "$";
            out[5][i] = flight.get(i).getFlightID()+"";
            out[6][i] = flight.get(i).getAirplane().getAirplaneId() + "";
        }
        return out;
    }
}
