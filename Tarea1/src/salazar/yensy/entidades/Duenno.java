package salazar.yensy.entidades;

public class Duenno {

    private String nombreDueno;

    public String getNombre() {
        return nombreDueno;
    }

    public void setNombre(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public Duenno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    @Override
    public String toString() {
        return "Duenno{" +
                "nombreDueno='" + nombreDueno + '\'' +
                '}';
    }
}