package ro.agitman.crops.core.service.impl;

import ro.agitman.crops.core.service.PlantService;
import ro.agitman.crops.database.DaoFactory;
import ro.agitman.crops.database.dao.PlantDao;
import ro.agitman.crops.database.model.Plant;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

/**
 * Created by d-uu31cq on 23.06.2016.
 */
public class PlantServiceImpl implements PlantService {

    private PlantDao plantDao;

    public PlantDao getPlantDao() {
        if (this.plantDao == null) {
            this.plantDao = DaoFactory.INSTANCE.getPlantDao();
        }
        return plantDao;
    }

    @Override
    public List<Plant> getAll() {
        try {
            return getPlantDao().queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    @Override
    public void create(Plant plant){
        try {
            getPlantDao().create(plant);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
