import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import javax.swing.*;

public class MainClass {
    public static void main(String[] args) {
        JFrame f = new JFrame("Magazin");
        f.setLayout(new FlowLayout());

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
            f.dispose();
        });

        f.add(lblNume);
        f.add(txtNume);
        f.add(btnOk);
        f.add(btnCancel);
        f.pack();

        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
