package pe.edu.utp.VirtualFitnessGym.models;

import java.sql.ResultSet;
import java.util.List;
import java.sql.SQLException;

/**
 * Created by Administrador on 25/02/2017.
 */
public class LivingRoomEntity extends BaseEntity{
    private static String DEFAULT_SQL ="SELECT * FROM living_rooms";

    public List<LivingRoom> findAll(){
        if(getConnection() !=null){
            try{
                ResultSet resultSet = getConnection().createStatement().executeQuery(DEFAULT_SQL);
                while(resultSet.next()){
                    LivingRoom  livingroom = new LivingRoom(resultSet.getInt("room_id"),resultSet.getInt("number_room"));
                }
            }catch (SQLException e){
                e.printStackTrace();
            }

        }

    return null;
    }

}
