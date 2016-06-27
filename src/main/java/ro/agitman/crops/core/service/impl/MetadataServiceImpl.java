package ro.agitman.crops.core.service.impl;

import ro.agitman.crops.core.service.MetadataService;
import ro.agitman.crops.database.model.Months;
import ro.agitman.crops.database.model.PlantHumidity;
import ro.agitman.crops.database.model.PlantSize;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by d-uu31cq on 27.06.2016.
 */
public class MetadataServiceImpl implements MetadataService {

    @Override
    public List<PlantSize> getAllPlantSizes() {
        return Arrays.asList(PlantSize.values());
    }

    @Override
    public List<PlantHumidity> getAllPlantHumidity() {
        return Arrays.asList(PlantHumidity.values());
    }

    @Override
    public List<Months> getAllMonths() {
        return Arrays.asList(Months.values());
    }
}
