public class Achizitii {
    private int achizitie_id;
    private float suma;
    private String metoda_de_plata;
   // private Date data;
    private int produs_id;
    private int client_id;

    // getters
    public int getAchizitieId() {
        return achizitie_id;
    }
    public float getSuma() {
        return suma;
    }
    public String getMetodaDePlata() {
        return metoda_de_plata;
    }
    //public Date getData() {return data;}
    public int getProdusId() {
        return produs_id;
    }
    public int getClientId() {
        return client_id;
    }

    // setters
    public void setAchizitieId(int achizitie_id) {
        this.achizitie_id = achizitie_id;
    }
    public void setSuma(float suma) {
        this.suma = suma;
    }
    public void setMetodaDePlata(String metoda_de_plata) {
        this.metoda_de_plata = metoda_de_plata;
    }
    //public void setData(Date data) { this.data = data; }
    public void setProdusId(int produs_id) {
        this.produs_id = produs_id;
    }
    public void setClientId(int client_id) {
        this.client_id = client_id;
    }
}