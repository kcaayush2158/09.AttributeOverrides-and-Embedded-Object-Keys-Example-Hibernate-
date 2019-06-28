package com.application.model;

import javax.naming.NameAlreadyBoundException;
import javax.persistence.*;

@Entity
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "username")
    private String username;
    @Embedded
    @AttributeOverrides({
    @AttributeOverride(name="street",column = @Column(name = "HOME_STREET")),
    @AttributeOverride(name="pincode", column = @Column(name = "HOME_PINCODE")),
    @AttributeOverride(name="city",column = @Column(name = "HOME_CITY")),
    @AttributeOverride(name="state",column = @Column(name="HOME_STATE"))
    })
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
