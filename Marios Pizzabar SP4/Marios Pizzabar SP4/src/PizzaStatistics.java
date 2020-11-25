import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//@Author Daniel Pedersen

public class PizzaStatistics {

    public void PizzaStatistics () {
        JFrame frame;
        JTable table;

        String driverName = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/SP4?serverTimezone=Europe/Rome";
        String userName = "root";
        String password = "herr1234";
        String[] columnNames = {"ID", "OrderID", "PizzaID"};

        frame = new JFrame("Most Popular Pizzas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setSize(500, 400);

        DefaultTableModel model = new DefaultTableModel(new String[]{}, 0);
        model.setColumnIdentifiers(columnNames);
        table = new JTable(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(url, userName, password);
            String sql = "SELECT * FROM OrdersPizza ORDER BY PizzaId DESC";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while(rs.next())
            {
                String OrderId = rs.getString("OrderPizzaId");
                String TotalPrice = rs.getString("OrderId");
                String PickUpTime = rs.getString("PizzaId");
                model.addRow(new Object[]{OrderId, TotalPrice, PickUpTime});
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        frame.add(scroll);
        frame.setVisible(true);
        frame.setSize(400, 300);

    }
}