import java.util.*;

public class Galamsey {
    private int colour_value;
    private double latitude;
    private double longitude;
    private Date year_event;


    public Galamsey(){}

    public Galamsey(int colour_value, double latitude, double longitude, Date year_event) {
        this.colour_value = colour_value;
        this.latitude = latitude;
        this.longitude = longitude;
        /**
         * // We are creating a new copy of Date field otherwise
         * reference to year_event field may leak
         */
        this.year_event = new Date(year_event.getTime());
    }

    public int getColour_value() {
        return colour_value;
    }

    public void setColour_value(int colour_value) {
        this.colour_value = colour_value;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * We are returning defensive copy of Date field instead of directly returning the
     * reference of instance variable.
     *
     * @return
     */
    public Date getYear_event() {
        return new Date(year_event.getTime()); //
    }

    public void setYear_event(Date year_event) {
        this.year_event = year_event;
    }


    enum vegetation_colour {
        Green,
        Yellow,
        Brown
    }
    ;

}