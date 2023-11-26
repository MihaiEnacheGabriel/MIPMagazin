import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class MyPanel extends JPanel {
    Connection conn = null;
    PreparedStatement pstmt = null;
    Statement stmt;
    JButton btn;
    ArrayList<String> categorii=new ArrayList<>(Arrays.asList("Clienti","Conturi","Achizitii",
            "Magazine","Adrese","Angajati","Manageri","Produse","Raioane","Randuri","Others"));
    public  MyPanel(String nume,CardLayout cardLayout,JPanel cardPanel){
    setBorder(BorderFactory.createTitledBorder(nume));
    setLayout(new GridLayout(3,2,10,10));
    setSize(200,200);
    if(nume=="Exterior")
        for(int i=0;i<5;i++) {
            String btnName=categorii.get(i);
            btn = new JButton(categorii.get(i));
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    cardLayout.show(cardPanel, btnName);
                    System.out.println(btnName);
                }
            });
            add(btn);
        }
    else {
        for(int j=5;j<categorii.size();j++)
        {
            String btnName=categorii.get(j);
            btn = new JButton(categorii.get(j));
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    cardLayout.show(cardPanel, btnName);
                }
            });
            add(btn);
        }
    }
    }
    public MyPanel(String nume) {
        setSize(200, 200);
        setLayout(new GridBagLayout());
        JLabel title = new JLabel(nume);
        add(title);
        AddTables(nume,this);
    }
    public void AddTables(String nume,JPanel Panel){
        try {
            conn = DbUtils.getConnection();
            String sql = "SELECT * from "+ nume;
            if(conn!=null) {
                stmt = conn.createStatement();
               // pstmt = conn.prepareStatement(sql);
                ResultSet rs= stmt.executeQuery(sql);
                ResultSetMetaData metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount();


                Vector<String> columnNames = new Vector<>();
                for (int column = 1; column <= columnCount; column++) {
                    columnNames.add(metaData.getColumnName(column));
                }
                System.out.println(columnNames);

                // Get data
                Vector<Vector<Object>> data = new Vector<>();
                while (rs.next()) {
                    Vector<Object> vector = new Vector<>();
                    for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                        vector.add(rs.getObject(columnIndex));
                    }
                    data.add(vector);
                }
                JTable table = new JTable(data, columnNames);

                JScrollPane scrollPane = new JScrollPane(table);
                Panel.add(scrollPane, BorderLayout.CENTER);
                Panel.setSize(700, 150);
                Panel.setVisible(true);

                rs.close();
                stmt.close();
                conn.close();
            }

        }
        catch(Exception ex){};
    }
}
