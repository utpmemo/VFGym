package pe.edu.utp.VirtualFitnessGym.action;

import pe.edu.utp.VirtualFitnessGym.service.GymService;

/**
 * Created by GUILLERMO on 25/03/2017.
 */
public class LoginAction {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute() {
        return "error";
    }

    public String validate() {
        GymService service = new GymService();
        return service.validateUser(getUserName(), getPassword()) ?
                "success" : "error";
    }

}
