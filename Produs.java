public class Produs {
    private int produs_id;
    private String nume;
    private int nr_bucati;
    private float valoare;
    private float greutate;
    private float marime;
    private boolean in_stoc;
    private int rand_id;

    // getters
    public int getProdusId() { return produs_id; }
    public String getNume() { return nume; }
    public int getNrBucati() { return nr_bucati; }
    public float getValoare() { return valoare; }
    public float getGreutate() { return greutate; }
    public float getMarime() { return marime; }
    public boolean isInStoc() { return in_stoc; }
    public int getRandId() { return rand_id; }

    // setters
    public void setProdusId(int produs_id) {
        this.produs_id = produs_id;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public void setNrBucati(int nr_bucati) {
        this.nr_bucati = nr_bucati;
    }
    public void setValoare(float valoare) {
        this.valoare = valoare;
    }
    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }
    public void setMarime(float marime) {
        this.marime = marime;
    }
    public void setInStoc(boolean in_stoc) {
        this.in_stoc = in_stoc;
    }
    public void setRandId(int rand_id) {
        this.rand_id = rand_id;
    }
}