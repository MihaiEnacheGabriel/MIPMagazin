public class Salariu {
    private int angajat_id;
    private float venit_net;
    private float bonusuri;

    // getters
    public int getAngajatId() {
        return angajat_id;
    }
    public float getVenitNet() {
        return venit_net;
    }
    public float getBonusuri() {
        return bonusuri;
    }

    // setters
    public void setAngajatId(int angajat_id) {
        this.angajat_id = angajat_id;
    }
    public void setVenitNet(float venit_net) {
        this.venit_net = venit_net;
    }
    public void setBonusuri(float bonusuri) {
        this.bonusuri = bonusuri;
    }
}