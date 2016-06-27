package ro.agitman.crops.core.service.impl;

import ro.agitman.crops.core.service.AnsambluService;
import ro.agitman.crops.database.DaoFactory;
import ro.agitman.crops.database.dao.AnsambluDao;
import ro.agitman.crops.database.dao.PlantDao;

/**
 * Created by d-uu31cq on 23.06.2016.
 */
public class AnsambluServiceImpl implements AnsambluService {

    private AnsambluDao ansambluDao;

    public AnsambluDao ansambluDao() {
        if (this.ansambluDao == null) {
            this.ansambluDao = DaoFactory.INSTANCE.getaAnsambluDao();
        }
        return ansambluDao;
    }

}
