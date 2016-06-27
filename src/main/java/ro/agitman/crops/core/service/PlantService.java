package ro.agitman.crops.core.service;

import ro.agitman.crops.database.model.Plant;

import java.util.List;

/**
 * Created by d-uu31cq on 23.06.2016.
 */
public interface PlantService {

    List<Plant> getAll();

    void create(Plant plant);
}
