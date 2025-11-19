public class producto{
    private String id;
    private String name;
    private double price;
    private boolean disponibilidad;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public producto(String id, String name, double price, boolean disponibilidad) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.disponibilidad = disponibilidad;
    }

}