import java.util.Date;

public class Tranzactii {
    private int tranzactie_id;
    private float suma;
    //private Date data_efectuarii;
    private int manager_id;

    // getters
    public int getTranzactieId() {
        return tranzactie_id;
    }
    public float getSuma() {
        return suma;
    }
   // public Date getDataEfectuarii() { return data_efectuarii; }
    public int getManagerId() {
        return manager_id;
    }

    // setters
    public void setTranzactieId(int tranzactie_id) {
        this.tranzactie_id = tranzactie_id;
    }
    public void setSuma(float suma) {
        this.suma = suma;
    }
   // public void setDataEfectuarii(Date data_efectuarii) { this.data_efectuarii = data_efectuarii; }
    public void setManagerId(int manager_id) {
        this.manager_id = manager_id;
    }
}