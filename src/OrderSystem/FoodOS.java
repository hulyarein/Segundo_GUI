package OrderSystem;

import javax.swing.*;

public class FoodOS extends JFrame {
    private JCheckBox PizzaCB;
    private JCheckBox FriesCB;
    private JCheckBox softDCB;
    private JCheckBox BurgerCB;
    private JCheckBox TeaCB;
    private JRadioButton TenRB;
    private JRadioButton fifteenRB;
    private JRadioButton FiveRB;
    private JRadioButton noneRB;
    private JCheckBox SundaeCB;
    private JButton b1;
    private JPanel jpanel;

    public FoodOS() {
        b1.addActionListener(e -> {
            double total = 0;

            if (!PizzaCB.isSelected() && !FriesCB.isSelected() && !TeaCB.isSelected() && BurgerCB.isSelected() && softDCB.isSelected() && SundaeCB.isSelected()) {
                JOptionPane.showMessageDialog(this, "You did not order anything");
            } else {
                if (PizzaCB.isSelected()) total += 100;
                if (FriesCB.isSelected()) total += 65;
                if (TeaCB.isSelected()) total += 50;
                if (BurgerCB.isSelected()) total += 80;
                if (softDCB.isSelected()) total += 55;
                if (SundaeCB.isSelected()) total += 40;
            }

            if (FiveRB.isSelected())
                total = total - (total * 0.05);
            if (TenRB.isSelected())
                total = total - (total * 0.10);
            if (fifteenRB.isSelected())
                total = total - (total * 0.15);
            if (noneRB.isSelected())
                total = total;


            JOptionPane.showMessageDialog(this, "The total price is Php " + total);
        });
    }
    public static void main (String[] args) {
        FoodOS app = new FoodOS();
        app.setContentPane(app.jpanel);
        app.setSize(200, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Hello Meow");
    }
}
