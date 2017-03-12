package pe.edu.utp.VirtualFitnessGym.models;

/**
 * Created by Administrador on 25/02/2017.
 */
public class LivingRoom {
    private int id;
    private int number;

    public LivingRoom() {
    }

    public LivingRoom(int id, int number) {
        this.id = id;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}
