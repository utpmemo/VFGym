package pe.edu.utp.VirtualFitnessGym.models;

/**
 * Created by Administrador on 25/02/2017.
 */
public class User {


    private int id;
    private String surname;
    private String name;
    private String sex;
    private String phone;
    private String rol;
    private String skills;

    public User(int user_id, String surnames, String names, String sex, int phone, String rol, int skill_id) {
    }

    public User() {

    }


    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {this.skills = skills;   }

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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
