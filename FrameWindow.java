import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class FrameWindow extends JFrame {


public FrameWindow(String FrameTitle){
    super(FrameTitle);
    //setLayout(new GridLayout(1, 2));
setSize(1100,500);
setLocation(100,100);
   // addWindowListener(this);


MenuBar AwtMenu=new MenuBar();
setMenuBar(AwtMenu);

Menu mnuInsert= new Menu("Insert");
Menu mnuDelete= new Menu("Delete");
AwtMenu.add(mnuDelete);
AwtMenu.add(mnuInsert);

MenuItem i1=new MenuItem("Magazin");
MenuItem i2=new MenuItem("Client");
MenuItem i3=new MenuItem("Cont");
MenuItem i4=new MenuItem("Adresa");

MenuItem i5=new MenuItem("Magazin");
MenuItem i6=new MenuItem("Client");
MenuItem i7=new MenuItem("Cont");
MenuItem i8=new MenuItem("Adresa");
MenuItem i9=new MenuItem("Angajati");
mnuInsert.add(i1);
mnuInsert.add(i2);
mnuInsert.add(i3);
mnuInsert.add(i4);
mnuDelete.add(i5);
mnuDelete.add(i6);
mnuDelete.add(i7);
mnuDelete.add(i8);
mnuDelete.add(i9);



setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
