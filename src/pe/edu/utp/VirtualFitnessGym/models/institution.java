package pe.edu.utp.VirtualFitnessGym.models;

/**
 * Created by Administrador on 25/02/2017.
 */
public class institution {
    private User user;
    private int id;
    private int ruc;
    private String RSocial;
    private String address;
    private int phone;

    public institution() {

    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getRSocial() {
        return RSocial;
    }

    public void setRSocial(String RSocial) {
        this.RSocial = RSocial;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
