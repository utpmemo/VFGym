package pe.edu.utp.VirtualFitnessGym.service;

import pe.edu.utp.VirtualFitnessGym.models.User;
import pe.edu.utp.VirtualFitnessGym.models.UsersEntity;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by GUILLERMO on 04/03/2017.
 */
public class UserService {

    private Connection connection;
    private UsersEntity usersEntity;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    protected UsersEntity getUsersEntity() {
        if(getConnection() != null) {
            if(usersEntity == null) {
                usersEntity = new UsersEntity();
                usersEntity.setConnection(getConnection());
                //usersEntity.setRegionsEntity(getRegionsEntity());
            }
        }
        return usersEntity;
    }

    public  int creatUser( User user)  {
        //  return getUsersEntity().create(user);
       return getUsersEntity() != null ? getUsersEntity().create(user):null;
    };



}
