package pe.edu.utp.VirtualFitnessGym.service;

import pe.edu.utp.VirtualFitnessGym.models.User;
import pe.edu.utp.VirtualFitnessGym.models.UsersEntity;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by GUILLERMO on 11/03/2017.
 */
public class GymService {

    private Connection connection;
    private UsersEntity usersEntity;
    public GymService() {

    }



    public boolean validateUser(String userName, String password) {
        return (userName.equalsIgnoreCase("admin") &&
                password.equalsIgnoreCase("password"));
    }
    public boolean Registrar_Usuario(int id,String surnames, String name,String sex, int phone, String rol , int skill) {

        User   user = new User() ;
        user.setId(id);
        user.setSurname(surnames);
        user.setName(name);
        user.setSex(sex);
        user.setPhone(phone);
        user.setRol(rol);
        user.setSkills(skill);

        UsersEntity  usersEntity = new UsersEntity();
        usersEntity.create(user);
return  true;
    }


    public Connection getConnection() {
        if(connection == null) {
            try {
                InitialContext ctx = new InitialContext();
                connection = ((DataSource) ctx.lookup("jdbc/MySQLDatasourcE")).getConnection();
            } catch (NamingException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    protected UsersEntity getUsersEntity() {
        if(usersEntity == null) {
            usersEntity= new UsersEntity();
            usersEntity.setConnection(getConnection());
        }
        return usersEntity;
    }

    public void setUsersEntity(UsersEntity usersEntity) {
        this.usersEntity = usersEntity;
    }

    public List<User> findAllUser() {
        return getUsersEntity().findAll();
    }
}
