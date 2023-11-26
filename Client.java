public class Client {
    private int client_id;
    private String nume;
    private String prenume;
    private String telefon;
    private String email;
   // private Date data_nasterii;

    // getters
    public int getClientId() {
        return client_id;
    }
    public String getNume() {
        return nume;
    }
    public String getPrenume() {
        return prenume;
    }
    public String getTelefon() {
        return telefon;
    }
    public String getEmail() {
        return email;
    }
   // public Date getDataNasterii() {return data_nasterii;}

    // setters
    public void setClientId(int client_id) {
        this.client_id = client_id;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void setEmail(String email) {
        this.email = email;
    }
  //  public void setDataNasterii(Date data_nasterii) { this.data_nasterii = data_nasterii; }
}