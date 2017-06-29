package de.deepkai.minws.model;

import java.time.LocalDateTime;

/**
 * Created by Kai on 29.06.2017.
 */
public class TestModel {
    private String time;
    private Double temperatur;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getTemperatur() {
        return temperatur;
    }

    public void setTemperatur(Double temperatur) {
        this.temperatur = temperatur;
    }

    public TestModel() {
    }
}
