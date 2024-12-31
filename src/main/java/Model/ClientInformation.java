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
public class ClientInformation {
    protected String username;
    protected String password;
    protected String FirstName;
    protected String LastName;
    protected String PassportId;
    protected Date dateOfBirth;
    protected String Gender;
    protected int contact;
    
    public ClientInformation(String username,String password,String FirstName, String LastName, String PassportId, Date dateOfBirth, String Gender, int number) {
        this.username=username;
        this.password=password;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PassportId = PassportId;
        this.dateOfBirth = dateOfBirth;
        this.Gender = Gender;
        this.contact = number;
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPassportId(String PassportId) {
        this.PassportId = PassportId;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setContact(int number) {
        this.contact = number;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    

    public String getPassportId() {
        return PassportId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public int getContact() {
        return contact;
    }
    
    @Override
    public String toString() {
        return "USERNAME : "+username+ " ,  " +"PASSWORD :"+ password+" ,  "+"FIRST NAME :"+ FirstName +" ,  "+"LAST NAME :" + LastName +" ,  "+ "PASSPORTID :" + PassportId+" ,  " + "DATE OF BIRTH :" + dateOfBirth +" ,  "+ "GENDER :" + Gender+" ,  " + "CONTACT :" + contact;
    }

}

