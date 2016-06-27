package ro.agitman.crops.core.service.impl;

import ro.agitman.crops.core.service.AnsambluService;
import ro.agitman.crops.core.service.MetadataService;
import ro.agitman.crops.core.service.PlantService;

/**
 * Created by d-uu31cq on 20.06.2016.
 */
public enum ServiceFactory {

    INSTANCE;

    private PlantService plantService;
    private AnsambluService ansambluService;
    private MetadataService metadataService;

    public PlantService getPlantService() {
        if (this.plantService == null) {
            this.plantService = new PlantServiceImpl();
        }
        return this.plantService;
    }

    public AnsambluService getAnsambluService() {
        if (this.ansambluService == null) {
            this.ansambluService = new AnsambluServiceImpl();
        }
        return this.ansambluService;
    }

    public MetadataService getMetadataService() {
        if (this.metadataService == null) {
            this.metadataService = new MetadataServiceImpl();
        }
        return this.metadataService;
    }
}
