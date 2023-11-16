package LeapYear;

import javax.swing.*;

public class LY extends JFrame{
    private JTextField t1;
    private JButton b1;
    private JPanel jpanel;


    public LY() {
        b1.addActionListener(e -> {
            int year = Integer.parseInt(t1.getText());
            boolean leap = false;

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        leap = true;
                    else
                        leap = false;
                }
                else
                    leap = true;
            }
            else
                leap = false;

            if (leap)
                JOptionPane.showMessageDialog(this, "Leap year");
            else
                JOptionPane.showMessageDialog(this, "Not a leap year");
        });
    }
    public static void main (String[] args) {
        LY app = new LY();
        app.setContentPane(app.jpanel);
        app.setSize(200, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");
    }
}
