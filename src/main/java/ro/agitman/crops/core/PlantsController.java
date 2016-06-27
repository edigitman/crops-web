package ro.agitman.crops.core;

import com.google.gson.Gson;
import ro.agitman.crops.core.service.PlantService;
import ro.agitman.crops.database.model.Plant;
import ro.agitman.crops.database.model.PlantHumidity;
import ro.agitman.crops.database.model.PlantSize;

import java.util.List;
import java.util.Map;

import static spark.Spark.*;

/**
 * Created by d-uu31cq on 23.06.2016.
 */
public class PlantsController {

    public PlantsController(final PlantService plantService) {

        Gson gson = new Gson();

        get("/plants/all", (request, response) -> {
            return gson.toJson(plantService.getAll());
        });

        get("/plants/:id", (request, response) -> {
            String id = request.params(":id");
            return "";
        });
        post("/plants", (request, response) -> {
            Plant plant = gson.fromJson(request.body(), Plant.class);
            plantService.create(plant);
            return "{\"status\" : \"ok\"}";
        });
        put("/plants", (request, response) -> {
            return "";
        });
        delete("/plants/:id", (request, response) -> {
            return "";
        });
    }
}
