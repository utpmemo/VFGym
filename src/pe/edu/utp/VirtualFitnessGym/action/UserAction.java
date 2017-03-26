package pe.edu.utp.VirtualFitnessGym.action;

import pe.edu.utp.VirtualFitnessGym.models.Skills;
import pe.edu.utp.VirtualFitnessGym.models.User;
import pe.edu.utp.VirtualFitnessGym.service.GymService;

import java.util.List;

/**
 * Created by GUILLERMO on 25/03/2017.
 */
public class UserAction {
    private String skills;
    private String surname;
    private String name;
    private String sex;
    private String phone;
    private String rol;

    private List<User> users;
    private GymService service;

    public UserAction() { service = new GymService();}

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }


    public String execute() {
        return "error";
    }

    public String registro() {
        GymService service = new GymService();
        return service.Registrar_Usuario(getSurname(),getName(),getSex(),getPhone(),getRol(),getSkills()) ?
                "success" : "error";
    }

    public List<User> getUsers() { return users;}

    public String list() {
        users = service.findAllUser();
        return "success";
    }

}
