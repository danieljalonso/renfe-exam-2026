package edu.iesam.features.domain; //cambiar por la ruta correcta

public class Train {
    private String id;
    private String color;
    private String capacidad;
    private String longitud;

    public Train(String id, String color, String capacidad, String longitud) {
        this.id = id;
        this.color = color;
        this.capacidad = capacidad;
        this.longitud = longitud;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
