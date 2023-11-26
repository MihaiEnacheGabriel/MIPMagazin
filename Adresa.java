public class Adresa {
    private int cod_postal;
    private String judet;
    private String oras;
    private String strada;
    private int nr_strada;

    // getters
    public int getCodPostal() {
        return cod_postal;
    }
    public String getJudet() {
        return judet;
    }
    public String getOras() {
        return oras;
    }
    public String getStrada() {
        return strada;
    }
    public int getNrStrada() {
        return nr_strada;
    }

    // setters
    public void setCodPostal(int cod_postal) {
        this.cod_postal = cod_postal;
    }
    public void setJudet(String judet) {
        this.judet = judet;
    }
    public void setOras(String oras) {
        this.oras = oras;
    }
    public void setStrada(String strada) {
        this.strada = strada;
    }
    public void setNrStrada(int nr_strada) {
        this.nr_strada = nr_strada;
    }
}