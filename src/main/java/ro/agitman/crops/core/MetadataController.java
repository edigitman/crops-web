package ro.agitman.crops.core;

import com.google.gson.Gson;
import ro.agitman.crops.core.service.MetadataService;

import static spark.Spark.get;

/**
 * Created by d-uu31cq on 24.06.2016.
 */
public class MetadataController {

    public MetadataController(MetadataService service) {
        Gson gson = new Gson();

        get("/md/size", (request, response) -> {
            return gson.toJson(service.getAllPlantSizes());
        });

        get("/md/months", (request, response) -> {
            return gson.toJson(service.getAllMonths());
        });

        get("/md/humidity", (request, response) -> {
            return gson.toJson(service.getAllPlantHumidity());
        });
    }
}
