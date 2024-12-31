/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author mahdi
 */
public class Flight {

    private String departureAirport;
    private String destinationAirport;
    private Date travelDate;
    private String travelTime;
    private int FlightID;
    private int Price;
    protected int AvailbleFirstClassSeats;
    protected int AvailableBuisnessClassSeats;
    protected int AvailableEconomyClassSeats;
    private Airplane airplane;

    public Flight(String departureAirport, String destinationAirport, Date travelDate, String travelTime, int FlightID, int Price, int AvailbleFirstClassSeats, int AvailableBuisnessClassSeats, int AvailableEconomyClassSeats, Airplane airplane) {
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.travelDate = travelDate;
        this.travelTime = travelTime;
        this.FlightID = FlightID;
        this.Price = Price;
        this.AvailbleFirstClassSeats = AvailbleFirstClassSeats;
        this.AvailableBuisnessClassSeats = AvailableBuisnessClassSeats;
        this.AvailableEconomyClassSeats = AvailableEconomyClassSeats;
        this.airplane = airplane;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public Date getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public int getFlightID() {
        return FlightID;
    }

    public void setFlightID(int FlightID) {
        this.FlightID = FlightID;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public int getAvailbleFirstClassSeats() {
        return AvailbleFirstClassSeats;
    }

    public void setAvailbleFirstClassSeats(int AvailbleFirstClassSeats) {
        this.AvailbleFirstClassSeats = AvailbleFirstClassSeats;
    }

    public int getAvailableBuisnessClassSeats() {
        return AvailableBuisnessClassSeats;
    }

    public void setAvailableBuisnessClassSeats(int AvailableBuisnessClassSeats) {
        this.AvailableBuisnessClassSeats = AvailableBuisnessClassSeats;
    }

    public int getAvailableEconomyClassSeats() {
        return AvailableEconomyClassSeats;
    }

    public void setAvailableEconomyClassSeats(int AvailableEconomyClassSeats) {
        this.AvailableEconomyClassSeats = AvailableEconomyClassSeats;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    @Override
    public String toString() {
        return "Flight{" + "departureAirport=" + departureAirport + ", destinationAirport=" + destinationAirport + ", travelDate=" + travelDate + ", travelTime=" + travelTime + ", FlightID=" + FlightID + ", Price=" + Price + ", AvailbleFirstClassSeats=" + AvailbleFirstClassSeats + ", AvailableBuisnessClassSeats=" + AvailableBuisnessClassSeats + ", AvailableEconomyClassSeats=" + AvailableEconomyClassSeats + ", airplane=" + airplane + '}';
    }

}
