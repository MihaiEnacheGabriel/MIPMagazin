import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import javax.swing.*;

public class MainClass {
    public static void main(String[] args) {
        JFrame fMagazin = new JFrame("Magazin");
        fMagazin.setLayout(new FlowLayout());
        fMagazin.setLocation(100, 100);

        JLabel lblNume = new JLabel("Nume: ");
        JTextArea txtNume = new JTextArea();

        JButton btnOk = new JButton("Ok");
        JButton btnCancel = new JButton("Cancel");

        btnOk.addActionListener(e -> {
            List<Magazin> magazine;
            List<String> welcomeMessages;
            magazine = new ArrayList<Magazin>();
            welcomeMessages = new ArrayList<String>();

            Magazin m1 = new Magazin(1, 500000, txtNume.getText());
            Magazin m2 = new Magazin(2, 600000, txtNume.getText());

            try {
                magazine.add(m1);
                magazine.add(m2);

                welcomeMessages = Utils.Execute(magazine);

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                //log error
            } finally {
                System.out.println("Mesaj in finally");
            }

            if (welcomeMessages.isEmpty()) {
                System.out.println("Niciun mesaj trimis, niciun magazin din lista nu are nume.");
            }

            for (String welcomeMessage : welcomeMessages) {
                System.out.println(welcomeMessage);
            }

        });

        btnCancel.addActionListener(e -> {
            fMagazin.dispose();
        });

        fMagazin.add(lblNume);
        fMagazin.add(txtNume);
        fMagazin.add(btnOk);
        fMagazin.add(btnCancel);
        fMagazin.pack();

        fMagazin.setLocationRelativeTo(null);
        fMagazin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fMagazin.setVisible(true);
///
        ////
        ////
        JFrame fAdresa = new JFrame("Adresa");
        fAdresa.setLayout(new FlowLayout());
        fAdresa.setLocation(500, 100);

        JLabel lblCodPostal = new JLabel("Cod Postal: ");
        JTextArea txtCodPostal = new JTextArea(2, 20);

        JLabel lblJudet = new JLabel("Judet: ");
        JTextArea txtJudet = new JTextArea(2, 20);

        JLabel lblOras = new JLabel("Oras: ");
        JTextArea txtOras = new JTextArea(2, 20);

        JLabel lblStrada = new JLabel("Strada: ");
        JTextArea txtStrada = new JTextArea(2, 20);

        JLabel lblNrStrada = new JLabel("Numar Strada: ");
        JTextArea txtNrStrada = new JTextArea(2, 20);

        btnOk = new JButton("Ok");
        btnCancel = new JButton("Cancel");

        btnOk.addActionListener(e -> {
            Adresa adresa = new Adresa(
                    Integer.parseInt(txtCodPostal.getText()),
                    txtJudet.getText(),
                    txtOras.getText(),
                    txtStrada.getText(),
                    Integer.parseInt(txtNrStrada.getText())
            );

             DbUtils.insertAdresa(adresa);
        });

        btnCancel.addActionListener(e -> {
            fAdresa.dispose();
        });

        fAdresa.add(lblCodPostal);
        fAdresa.add(txtCodPostal);
        fAdresa.add(lblJudet);
        fAdresa.add(txtJudet);
        fAdresa.add(lblOras);
        fAdresa.add(txtOras);
        fAdresa.add(lblStrada);
        fAdresa.add(txtStrada);
        fAdresa.add(lblNrStrada);
        fAdresa.add(txtNrStrada);
        fAdresa.add(btnOk);
        fAdresa.add(btnCancel);
        fAdresa.pack();

        fAdresa.setLocationRelativeTo(null);
        fAdresa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fAdresa.setVisible(true);
    }
}
