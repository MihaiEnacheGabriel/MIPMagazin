import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class FrameWindow extends JFrame {


public FrameWindow(String FrameTitle,CardLayout cardLayout,JPanel cardPanel){
    super(FrameTitle);
    //setLayout(new GridLayout(1, 2));
setSize(1100,500);
setLocation(100,100);
   // addWindowListener(this);


JMenuBar AwtMenu=new JMenuBar();
setJMenuBar(AwtMenu);

JMenu mnuInsert= new JMenu("Insert");
JMenu mnuDelete= new JMenu("Delete");
JMenu mnuBack=new JMenu("Back");
AwtMenu.add(mnuDelete);
AwtMenu.add(mnuInsert);

JMenuItem i1=new JMenuItem("Magazin");
JMenuItem i2=new JMenuItem("Client");
JMenuItem i3=new JMenuItem("Cont");
JMenuItem i4=new JMenuItem("Adresa");
JMenuItem back=new JMenuItem("Back");
JMenuItem i5=new JMenuItem("Magazin");
JMenuItem i6=new JMenuItem("Client");
JMenuItem i7=new JMenuItem("Cont");
JMenuItem i8=new JMenuItem("Adresa");
JMenuItem i9=new JMenuItem("Angajati");
mnuInsert.add(i1);
mnuInsert.add(i2);
mnuInsert.add(i3);
mnuInsert.add(i4);
mnuDelete.add(i5);
mnuDelete.add(i6);
mnuDelete.add(i7);
mnuDelete.add(i8);
mnuDelete.add(i9);

    back.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // Your action here
            cardLayout.show(cardPanel, "Start");
        }   });
mnuBack.add(back);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    AwtMenu.add(mnuBack);
}
}
