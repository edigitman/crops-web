package ro.agitman.crops.core;

import ro.agitman.crops.core.service.AnsambluService;

import static spark.Spark.*;

/**
 * Created by d-uu31cq on 23.06.2016.
 */
public class AnsambluController {

    public AnsambluController(final AnsambluService ansambluService) {
        get("/gen/all", (request, response) -> {
            return "";
        });
        get("/gen/:id", (request, response) -> {
            String id = request.params(":id");
            return "";
        });
        post("/gen", (request, response) -> {
            return "";
        });
        put("/gen", (request, response) -> {
            return "";
        });
        delete("/gen/:id", (request, response) -> {
            return "";
        });
    }

}
