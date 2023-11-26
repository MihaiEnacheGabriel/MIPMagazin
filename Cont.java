public class Cont {
    private int client_id;
    private String card_bancar;
    private int achizitie_id;

    // getters
    public int getClientId() {
        return client_id;
    }
    public String getCardBancar() {
        return card_bancar;
    }
    public int getAchizitieId() {
        return achizitie_id;
    }

    // setters
    public void setClientId(int client_id) {
        this.client_id = client_id;
    }
    public void setCardBancar(String card_bancar) {
        this.card_bancar = card_bancar;
    }
    public void setAchizitieId(int achizitie_id) {
        this.achizitie_id = achizitie_id;
    }
}