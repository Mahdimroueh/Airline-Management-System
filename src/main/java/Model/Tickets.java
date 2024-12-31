/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author mahdi
 */
public class Tickets {

    private ClientInformation client;
    private String travelClass; 
    private Flight flight;
    private String Seats;
    private PaymentMethod paymentmethod;
    private double AmounPaid;
    private String CardInfo;



    public Tickets(ClientInformation client, String travelClass, Flight ticketCommun, String seats) {
        this.client = client;
        this.travelClass = travelClass;
        this.flight = ticketCommun;
        this.Seats = seats;
    }

    public String getSeats() {
        return Seats;
    }

    public ClientInformation getClient() {
        return client;
    }

    public void setClient(ClientInformation client) {
        this.client = client;
    }

    public PaymentMethod getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(PaymentMethod paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public double getAmounPaid() {
        return AmounPaid;
    }

    public void setAmounPaid(double AmounPaid) {
        this.AmounPaid = AmounPaid;
    }

    public String getCardInfo() {
        return CardInfo;
    }

    public void setCardInfo(String CardInfo) {
        this.CardInfo = CardInfo;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    public void setPriceForTravelClass(String travelclass) {
        if ("economy class".equals(travelClass)) {
            int price = getFlight().getPrice();
            getFlight().setPrice(price);
        } else if ("Buisness class".equals(travelClass)) {
            int price = getFlight().getPrice();
            getFlight().setPrice(200 + price);
        } else {
            int price = getFlight().getPrice();
            getFlight().setPrice(300 + price);
        }
    }


    public String WriteToLabel() {

        return "***************************************************************************\n"
                + "Name :" + getClient().getFirstName() + " " + getClient().getLastName() + "                         " + "Passport ID :" + getClient().getPassportId() + "\n"
                + "From:" + getFlight().getDepartureAirport() + "                                     " + "To:" + getFlight().getDestinationAirport() + "\n"
                + "Travel Date:" + getFlight().getTravelDate() + "                       " + "Travel Time:" + getFlight().getTravelTime() + "\n"
                + "Travel Class:" + getTravelClass() + "                        " + "Seats:" + getSeats() + "\n"
                + "Flight ID:" + getFlight().getFlightID() + "\n"
                + "*****************************************************************************\n";

    }

    @Override
    public String toString() {
        return client + " , " + "departureAirport : " + getFlight().getDepartureAirport() + " , " + "destinationAirport : "
                + getFlight().getDepartureAirport() + " , " + " travelDate : " + getFlight().getTravelDate() + " , " + " travelTime : "
                + getFlight().getTravelTime() + "  , " + " FlightID : " + getFlight().getFlightID() + " , " + "SEATS : " + Seats + " , " + "TRAVEL CLASS : " + travelClass;
    }

}
