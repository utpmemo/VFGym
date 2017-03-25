package pe.edu.utp.VirtualFitnessGym.models;

import java.text.DecimalFormat;
import java.util.Date;

/**
 * Created by Administrador on 25/02/2017.
 */
public class CustomerProfile {
    private User user;
    private int id;
    private Date dateEntry;
    private int age;
    private double weight;
    private double size;
    private double doughBodily;


    public CustomerProfile(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateEntry() {
        return dateEntry;
    }

    public void setDateEntry(Date dateEntry) {
        this.dateEntry = dateEntry;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getDoughBodily() {
        return doughBodily;
    }

    public void setDoughBodily(double doughBodily) {
        this.doughBodily = doughBodily;
    }
}
