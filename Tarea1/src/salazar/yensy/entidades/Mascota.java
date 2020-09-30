package salazar.yensy.entidades;

public class Mascota {

    private String nombrePet;
    private String observaciones;
    private String ranking;
    private String foto;
    private Duenno duenno;

    public String getNombrePet() {
        return nombrePet;
    }

    public void setNombrePet(String nombrePet) {
        this.nombrePet = nombrePet;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Duenno getDuenno() {
        return duenno;
    }

    public void setDuenno(Duenno duenno) {
        this.duenno = duenno;
    }

    public Mascota(String nombrePet, String observaciones, String ranking, String foto, Duenno duenno) {
        this.nombrePet = nombrePet;
        this.observaciones = observaciones;
        this.ranking = ranking;
        this.foto = foto;
        this.duenno = duenno;
    }

    public Mascota(String nombrePet, String duenno, String ranking, String observaciones, String foto) {
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombrePet='" + nombrePet + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", ranking='" + ranking + '\'' +
                ", foto='" + foto + '\'' +
                ", duenno=" + duenno +
                '}';
    }
}

