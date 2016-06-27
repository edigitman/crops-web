package ro.agitman.crops.database;

import com.j256.ormlite.jdbc.JdbcPooledConnectionSource;
import com.j256.ormlite.table.TableUtils;
import ro.agitman.crops.database.dao.AnsambluDao;
import ro.agitman.crops.database.dao.PlantDao;
import ro.agitman.crops.database.model.Ansamblu;
import ro.agitman.crops.database.model.GenPlant;
import ro.agitman.crops.database.model.Generation;
import ro.agitman.crops.database.model.Plant;

import java.sql.SQLException;

/**
 * Created by d-uu31cq on 17.06.2016.
 */
public enum DaoFactory {

    INSTANCE;
    private final JdbcPooledConnectionSource connectionSource;
    private final String CONNECTION_SOURCE_URL = "jdbc:sqlite:crops.db";

    // All Dao
    private PlantDao plantDao;
    private AnsambluDao ansambluDao;

    DaoFactory() {
        try {
            // pooled connection source
            this.connectionSource = new JdbcPooledConnectionSource(CONNECTION_SOURCE_URL);
            // only keep the connections open for 5 minutes
            this.connectionSource.setMaxConnectionAgeMillis(5 * 60 * 1000);

            initTables();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(
                    this.getClass().getSimpleName() + ": Cannot create connectionSource " + CONNECTION_SOURCE_URL);
        }

    }

    /**
     * This method will create if not exist the tables of the application.
     *
     * @throws SQLException
     */
    public void initTables() throws SQLException {
        TableUtils.createTableIfNotExists(getConnectionSource(), Plant.class);
//        TableUtils.createTableIfNotExists(getConnectionSource(), Generation.class);
//        TableUtils.createTableIfNotExists(getConnectionSource(), GenPlant.class);
//        TableUtils.createTableIfNotExists(getConnectionSource(), Ansamblu.class);
    }

    public PlantDao getPlantDao() {
        if (this.plantDao == null) {
            try {
                this.plantDao = new PlantDao(getConnectionSource());
            } catch (SQLException e) {
                throw new RuntimeException(
                        this.getClass().getSimpleName() + ": Cannot create " + PlantDao.class.getSimpleName());
            }
        }
        return this.plantDao;
    }

    public AnsambluDao getaAnsambluDao() {
        if (this.ansambluDao == null) {
            try {
                this.ansambluDao = new AnsambluDao(getConnectionSource());
            } catch (SQLException e) {
                throw new RuntimeException(
                        this.getClass().getSimpleName() + ": Cannot create " + PlantDao.class.getSimpleName());
            }
        }
        return this.ansambluDao;
    }


    private JdbcPooledConnectionSource getConnectionSource() {
        return connectionSource;
    }
}
