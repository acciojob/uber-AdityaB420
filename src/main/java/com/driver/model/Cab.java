package com.driver.model;



import javax.persistence.*;

@Entity
@Table

public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private int perKmRate;
    private boolean isAvailable;
    @OneToOne(mappedBy = "cab",cascade = CascadeType.ALL)
    private Driver driver;

    public Cab() {
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}