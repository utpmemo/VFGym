package pe.edu.utp.VirtualFitnessGym.models;

/**
 * Created by Administrador on 25/02/2017.
 */
public class User {


    private int id;
    private String surname;
    private String name;
    private String sex;
    private int phone;
    private String rol;
    private int skills;

    public User(int id, String surname, String name, String sex, int phone, String rol, int skills) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.rol = rol;
        this.skills = skills;
    }

    public User() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getSkills() {
        return skills;
    }

    public void setSkills(int skills) {
        this.skills = skills;
    }
}
