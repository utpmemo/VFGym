package pe.edu.utp.VirtualFitnessGym.models;

import java.sql.SQLException;

/**
 * Created by GUILLERMO on 04/03/2017.
 */
public class UsersEntity extends  BaseEntity {

    public int create(User user)   {
        int results = 0;

        if(getConnection() != null) {
            String sql = " insert into users (";
            sql+=" surnames , names , sex , phone , rol ";
            sql+=" ) values (";
            sql+=" '" + user.getSurname() + "' , '"+user.getName()+"' , '"+ user.getSex()+"' ," +
                    " '"+ user.getPhone()+"' , '" + user.getRol() +"'";
            sql+="";
            sql+=" ) ";

            try {
                results = getConnection().createStatement().executeUpdate(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return results;
    }



}
