package pe.edu.utp.VirtualFitnessGym.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GUILLERMO on 04/03/2017.
 */
public class UsersEntity extends  BaseEntity {

    public int create(User user)   {
        int results = 0;

        if(getConnection() != null) {
            String sql = " insert into users (";
            sql+=" surnames , names , sex , phone , rol ,skill_id";
            sql+=" ) values (";
            sql+=" '" + user.getSurname() + "' , '"+user.getName()+"' , '"+ user.getSex()+"' ," +
                    " '"+ user.getPhone()+"' , '" + user.getRol() +"' , '" + user.getSkills()+"'";
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

    public void Update(User user){
        if (getConnection()!=null){
            String sql = " update users set";
            sql+=" surnames='"+ user.getSurname()+"'";
            sql+=" names='"+ user.getName()+"'";
            sql+=" sex='"+ user.getSex()+"'";
            sql+=" phone='"+ user.getPhone()+"'";
            sql+=" rol='"+ user.getRol()+"' where user_id = '"+ user.getId() + "'";
        }

    }

    public List<User> findAll() {
        String sql = "select * from gym.users;";
        List<User> users = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection().createStatement().executeQuery(sql);
            while(resultSet.next()) {
                users.add(new User(resultSet.getInt("user_id"),
                        resultSet.getString("surnames"),
                        resultSet.getString("names"),
                        resultSet.getString("sex"),
                        resultSet.getInt("phone"),
                        resultSet.getString("rol"),
                        resultSet.getInt("skill_id")));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }



}
