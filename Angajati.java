
public class Angajati {
    private int angajat_id;
    private String nume;
    private String email;
   // private Date data_nasterii; de gasit cum sa implementam o data
  //  private Date data_angajarii;
    private String telefon;
    private int cod_postal;
    private int magazin_id;
    public int getAngajatId() {
        return angajat_id;
    }
    public String getNume() {
        return nume;
    }
    public String getEmail() {
        return email;
    }
    //public Date getDataNasterii() { return data_nasterii; }
   // public Date getDataAngajarii() { return data_angajarii; }
    public String getTelefon() {
        return telefon;
    }
    public int getCodPostal() {
        return cod_postal;
    }
    public int getMagazinId() {
        return magazin_id;
    }
    public void setAngajatId(int angajat_id) {
        this.angajat_id = angajat_id;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public void setEmail(String email) {
        this.email = email;
    }
   // public void setDataNasterii(Date data_nasterii) { this.data_nasterii = data_nasterii; }
  //  public void setDataAngajarii(Date data_angajarii) { this.data_angajarii = data_angajarii; }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void setCodPostal(int cod_postal) {
        this.cod_postal = cod_postal;
    }
    public void setMagazinId(int magazin_id) {
        this.magazin_id = magazin_id;
    }

}
