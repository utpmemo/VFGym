package pe.edu.utp.VirtualFitnessGym.models;

/**
 * Created by Administrador on 25/02/2017.
 */
public class Skills {
    private int id;
    private String name;

    public Skills() {
    }

    public Skills(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
