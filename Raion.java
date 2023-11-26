public class Raion {
    private int raion_id;
    private String categorie;
    private int nr_randuri;
    private int magazin_id;

    // getters
    public int getRaionId() {
        return raion_id;
    }
    public String getCategorie() {
        return categorie;
    }
    public int getNrRanduri() {
        return nr_randuri;
    }
    public int getMagazinId() {
        return magazin_id;
    }

    // setters
    public void setRaionId(int raion_id) {
        this.raion_id = raion_id;
    }
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    public void setNrRanduri(int nr_randuri) {
        this.nr_randuri = nr_randuri;
    }
    public void setMagazinId(int magazin_id) {
        this.magazin_id = magazin_id;
    }
}