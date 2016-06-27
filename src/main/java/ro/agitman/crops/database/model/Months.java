package ro.agitman.crops.database.model;

/**
 * Created by d-uu31cq on 27.06.2016.
 */
public enum Months {

    Ianuarie(1),
    Februarie(2),
    Martie(3),
    Aprilie(4),
    Mai(5),
    Iunie(6),
    Iulie(7),
    August(8),
    Septembrie(9),
    Octombrie(10),
    Noiembrie(11),
    Decembrie(12);

    private int index;

    Months(int index) {
        this.index = index;
    }


    public int getIndex() {
        return index;
    }
}
