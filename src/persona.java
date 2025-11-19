public abstract class persona{
    protected int tipoAcceso;
    protected String nombre;
    protected String idPersona;
    public String getNombre() {

        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIdPersona() {
        return idPersona;
    }
    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }
    public persona(int tipoAcceso, String nombre, String idPersona) {
        this.tipoAcceso = tipoAcceso;
        this.nombre = nombre;
        this.idPersona = idPersona;
    }
    
}