package com.example.demo;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity

public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="customerid")
private long id;
@Column (name="title")
private String title;
@Column(name="firstname")
private String firstname;
@Column(name="lastname")
private String lastname;
@Column(name="streetaddress")
private String streetaddress;
@Column(name="cityID")
private String city;
@Column(name="stateID")
private String state;
@Column(name="zipcode")
private String zipcode;
@Column(name="emailaddress")
private String emailaddress;


    public Customer(String title, String firstname, String lastname, String streetaddress, String city, String state, String zipcode, String emailaddress) {
        this.title = title;
        this.firstname = firstname;
        this.lastname = lastname;
        this.streetaddress = streetaddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.emailaddress = emailaddress;
    }

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStreetaddress() {
        return streetaddress;
    }

    public void setStreetaddress(String streetaddress) {
        this.streetaddress = streetaddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
}
