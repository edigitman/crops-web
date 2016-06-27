package ro.agitman.crops.core.service;

import ro.agitman.crops.database.model.Months;
import ro.agitman.crops.database.model.PlantHumidity;
import ro.agitman.crops.database.model.PlantSize;

import java.util.List;

/**
 * Created by d-uu31cq on 24.06.2016.
 */
public interface MetadataService {

    List<PlantSize> getAllPlantSizes();

    List<PlantHumidity> getAllPlantHumidity();

    List<Months> getAllMonths();

}
