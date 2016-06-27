package ro.agitman.crops.database.dao;

import com.j256.ormlite.support.ConnectionSource;
import ro.agitman.crops.database.model.Plant;

import java.sql.SQLException;

/**
 * Created by d-uu31cq on 23.06.2016.
 */
public class PlantDao extends BasicDao<Plant, Long>{

    public PlantDao(ConnectionSource connectionSource) throws SQLException {
        super(connectionSource, Plant.class);
    }

}
