package pe.edu.utp.VirtualFitnessGym.models;
import java.util.Date;
/**
 * Created by Administrador on 25/02/2017.
 */
public class Session {

    private User user;
    private LivingRoom livingRoom;
    private int id;
    private Date schedule;

    public Session() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getSchedule() {
        return schedule;
    }

    public void setSchedule(Date schedule) {
        this.schedule = schedule;
    }
}
