package ro.agitman.crops.core;

import com.google.gson.Gson;
import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import ro.agitman.crops.core.service.PlantService;
import ro.agitman.crops.core.service.impl.ServiceFactory;
import spark.ModelAndView;
import spark.Request;
import spark.Session;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

/**
 * Created by d-uu31cq on 17.06.2016.
 */
public class ServerCoreMain {

    private static final FreeMarkerEngine TEMPLATE_ENGINE = new FreeMarkerEngine();

    /**
     * @param args program arguments
     */
    public static void main(String[] args) {

        // Set default port for our web-app.
        port(4567);

        // All contents in src/main/resources/public are now accessible.
        // ex: http://YOUR_IP:PORT/js/jquery.min.js
        staticFileLocation("/public");

        // Configure templates engine.
        Configuration freeMarkerConfig = new Configuration();
        freeMarkerConfig.setTemplateLoader(new ClassTemplateLoader(ServerCoreMain.class, "/templates"));
        TEMPLATE_ENGINE.setConfiguration(freeMarkerConfig);

        Gson gson = new Gson();

        // Open a default route: http://YOUR_IP:PORT/
        // The server returns the templates "index.html" in
        // src/main/resources/templates
        get("/", (request, response) -> new ModelAndView(null, "index.html"), TEMPLATE_ENGINE);
        get("/plants", (request, response) -> new ModelAndView(null, "plants.html"), TEMPLATE_ENGINE);
        get("/generate", (request, response) -> new ModelAndView(null, "generate.html"), TEMPLATE_ENGINE);


        new PlantsController(ServiceFactory.INSTANCE.getPlantService());
        new AnsambluController(ServiceFactory.INSTANCE.getAnsambluService());
        new MetadataController(ServiceFactory.INSTANCE.getMetadataService());
    }
}
