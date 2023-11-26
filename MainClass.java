import com.sun.source.tree.NewArrayTree;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import javax.swing.*;

public class MainClass {
    public static void main(String[] args) {
        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);
        FrameWindow fw = new FrameWindow("Magazin");
        MyPanel panel=new MyPanel("Exterior",cardLayout,cardPanel);
        //fw.add(panel);
        MyPanel panel1=new MyPanel("Interior",cardLayout,cardPanel);
        //fw.add(panel1);
        JPanel groupedPanel = new JPanel(new GridLayout(1,2));
        groupedPanel.add(panel);
        groupedPanel.add(panel1);
        cardPanel.add(groupedPanel,"StartPage");
        fw.add(cardPanel);
        fw.setVisible(true);


        MyPanel Clienti=new MyPanel("Clienti");
        MyPanel Adrese=new MyPanel("Adrese");
        MyPanel Achizitii=new MyPanel("Achizitii");
        MyPanel Conturi=new MyPanel("Conturi");
        MyPanel Magazine=new MyPanel("Magazine");
        MyPanel Angajati=new MyPanel("Angajati");
        MyPanel Manageri=new MyPanel("Manageri");
        MyPanel Produse=new MyPanel("Produse");
        MyPanel Raioane=new MyPanel("Raioane");
        MyPanel Randuri=new MyPanel("Randuri");

        cardPanel.add(Clienti,"Clienti");
        cardPanel.add(Adrese,"Adrese");
        cardPanel.add(Achizitii,"Achizitii");
        cardPanel.add(Conturi,"Conturi");
        cardPanel.add(Magazine,"Magazine");
        cardPanel.add(Angajati,"Angajati");
        cardPanel.add(Manageri,"Manageri");
        cardPanel.add(Produse,"Produse");
        cardPanel.add(Raioane,"Raioane");
        cardPanel.add(Randuri,"Randuri");

       // System.out.println(cardPanel.getName());
        /*
        JFrame f = new JFrame("Magazin and Adresa");
        f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));

        // Add components for Magazin
        JLabel lblNume = new JLabel("Nume: ");
        JTextArea txtNume = new JTextArea();
        JButton btnOkMagazin = new JButton("Ok Magazin");
        JButton btnCancelMagazin = new JButton("Cancel Magazin");

        btnOkMagazin.addActionListener(e -> {
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

        btnCancelMagazin.addActionListener(e -> {
            f.dispose();
        });

        f.add(lblNume);
        f.add(txtNume);
        f.add(btnOkMagazin);
        f.add(btnCancelMagazin);

        // Add components for Adresa
        JLabel lblCodPostal = new JLabel("Cod Postal: ");
        JTextArea txtCodPostal = new JTextArea(2, 10);
        JLabel lblJudet = new JLabel("Judet: ");
        JTextArea txtJudet = new JTextArea(2, 10);
        JLabel lblOras = new JLabel("Oras: ");
        JTextArea txtOras = new JTextArea(2, 10);
        JLabel lblStrada = new JLabel("Strada: ");
        JTextArea txtStrada = new JTextArea(2, 10);
        JLabel lblNrStrada = new JLabel("Numar Strada: ");
        JTextArea txtNrStrada = new JTextArea(2, 10);
        JButton btnOkAdresa = new JButton("Ok Adresa");
        JButton btnCancelAdresa = new JButton("Cancel Adresa");

        btnOkAdresa.addActionListener(e -> {
            Adresa adresa = new Adresa(
                    Integer.parseInt(txtCodPostal.getText()),
                    txtJudet.getText(),
                    txtOras.getText(),
                    txtStrada.getText(),
                    Integer.parseInt(txtNrStrada.getText())
            );

            DbUtils.insertAdresa(adresa);
        });

        btnCancelAdresa.addActionListener(e -> {
            f.dispose();
        });

        f.add(lblCodPostal);
        f.add(txtCodPostal);
        f.add(lblJudet);
        f.add(txtJudet);
        f.add(lblOras);
        f.add(txtOras);
        f.add(lblStrada);
        f.add(txtStrada);
        f.add(lblNrStrada);
        f.add(txtNrStrada);
        f.add(btnOkAdresa);
        f.add(btnCancelAdresa);

        // Set up the JFrame
        f.pack();
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }*/

    }}
