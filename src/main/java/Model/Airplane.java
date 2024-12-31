/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author mahdi
 */
public class Airplane {

    private int AirplaneId;
    protected int FirstClassSeats;
    protected int BuisnessClassSeats;
    protected int EconomyClassSeats;
    private String manufacturer;
    private String model;
    private String registrationNumber;

    public Airplane(int AirplaneId, int FirstClassSeats, int BuisnessClassSeats, int EconomyClassSeats, String manufacturer, String model, String registrationNumber) {
        this.AirplaneId = AirplaneId;
        this.FirstClassSeats = FirstClassSeats;
        this.BuisnessClassSeats = BuisnessClassSeats;
        this.EconomyClassSeats = EconomyClassSeats;
        this.manufacturer = manufacturer;
        this.model = model;
        this.registrationNumber = registrationNumber;
    }

    public int getAirplaneId() {
        return AirplaneId;
    }

    public void setAirplaneId(int AirplaneId) {
        this.AirplaneId = AirplaneId;
    }

    public int getFirstClassSeats() {
        return FirstClassSeats;
    }

    public void setFirstClassSeats(int FirstClassSeats) {
        this.FirstClassSeats = FirstClassSeats;
    }

    public int getBuisnessClassSeats() {
        return BuisnessClassSeats;
    }

    public void setBuisnessClassSeats(int BuisnessClassSeats) {
        this.BuisnessClassSeats = BuisnessClassSeats;
    }

    public int getEconomyClassSeats() {
        return EconomyClassSeats;
    }

    public void setEconomyClassSeats(int EconomyClassSeats) {
        this.EconomyClassSeats = EconomyClassSeats;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Airplane{" + "AirplaneId=" + AirplaneId + ", FirstClassSeats=" + FirstClassSeats + ", BuisnessClassSeats=" + BuisnessClassSeats + ", EconomyClassSeats=" + EconomyClassSeats + ", manufacturer=" + manufacturer + ", model=" + model + ", registrationNumber=" + registrationNumber + '}';
    }
}
