package pe.edu.utp.VirtualFitnessGym.models;

/**
 * Created by Administrador on 25/02/2017.
 */
public class Plan {

    private institution institution;
    private int id;
    private String typePlan;
    private double price;

    public Plan() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypePlan() {
        return typePlan;
    }

    public void setTypePlan(String typePlan) {
        this.typePlan = typePlan;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public institution getInstitution() {
        return institution;
    }

    public void setInstitution(pe.edu.utp.VirtualFitnessGym.models.institution institution) {
        this.institution = institution;
    }
}
