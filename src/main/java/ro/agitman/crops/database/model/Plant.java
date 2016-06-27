package ro.agitman.crops.database.model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by d-uu31cq on 23.06.2016.
 * <p>
 * A plant by its self
 */
@DatabaseTable(tableName = "plants")
public class Plant {

    @DatabaseField(columnName = "id", canBeNull = false, generatedId = true)
    private Long id;

    @DatabaseField(columnName = "name", unique = true, index = true)
    private String name;

    @DatabaseField(columnName = "size", dataType = DataType.ENUM_STRING)
    private PlantSize plantSize;

    @DatabaseField(columnName = "startPeriod")
    private String startPeriod;

    @DatabaseField(columnName = "endPeriod")
    private String endPeriod;

    @DatabaseField(columnName = "incubation")
    private Long incubationDays;

    @DatabaseField(columnName = "humidity", dataType = DataType.ENUM_STRING)
    private PlantHumidity humidity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlantSize getPlantSize() {
        return plantSize;
    }

    public void setPlantSize(PlantSize plantSize) {
        this.plantSize = plantSize;
    }

    public String getStartPeriod() {
        return startPeriod;
    }

    public void setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
    }

    public String getEndPeriod() {
        return endPeriod;
    }

    public void setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
    }

    public Long getIncubationDays() {
        return incubationDays;
    }

    public void setIncubationDays(Long incubationDays) {
        this.incubationDays = incubationDays;
    }

    public PlantHumidity getHumidity() {
        return humidity;
    }

    public void setHumidity(PlantHumidity humidity) {
        this.humidity = humidity;
    }
}
