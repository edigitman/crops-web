package ro.agitman.crops.database.dao;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

/**
 * Created by d-uu31cq on 23.06.2016.
 */
public class BasicDao<T, ID> {

    private Dao<T, ID> dao;

    protected BasicDao(ConnectionSource connectionSource, Class<T> clazz) throws SQLException {
        this.dao = DaoManager.createDao(connectionSource, clazz);
    }

    protected Dao<T, ID> getDao() {
        return dao;
    }

    public int create(T data) throws SQLException {
        return dao.create(data);
    }

    public int refresh(T data) throws SQLException {
        return dao.refresh(data);
    }

    public Dao.CreateOrUpdateStatus createOrUpdate(T data) throws SQLException {
        return dao.createOrUpdate(data);
    }

    public int update(T data) throws SQLException {
        return dao.update(data);
    }

    public int delete(T data) throws SQLException {
        return dao.delete(data);
    }

    public int deleteById(ID id) throws SQLException {
        return dao.deleteById(id);
    }

    public int delete(Collection<T> datas) throws SQLException {
        return dao.delete(datas);
    }

    public int deleteIds(Collection<ID> ids) throws SQLException {
        return dao.deleteIds(ids);
    }

    public boolean idExists(ID id) throws SQLException {
        return dao.idExists(id);
    }

    public List<T> queryForAll() throws SQLException {
        return dao.queryForAll();
    }

    public List<T> queryForMatchingArgs(T matchObj) throws SQLException {
        return dao.queryForMatchingArgs(matchObj);
    }

    public T queryForId(ID id) throws SQLException {
        return dao.queryForId(id);
    }

    public long countOf() throws SQLException {
        return dao.countOf();
    }
}
