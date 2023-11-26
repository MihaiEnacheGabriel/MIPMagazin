public class Magazin {
    private int magazin_id;
    private int cod_postal;
    private String Nume;

    public String getNume()
    {

        return this.Nume;
    }

    public int getCodPostal()
    {

        return this.cod_postal;
    }

    public int getMagazinID()
    {

        return this.magazin_id;
    }


    public Magazin(int magazin_id, int cod_postal, String Nume)
    {
        this.Nume = Nume;
        this.cod_postal = cod_postal;
        this.magazin_id = magazin_id;
    }
    public String GetWelcomeMessage()
    {
        String sb = "Welcome to " + this.Nume +
                "!";
        return sb;
    }

}