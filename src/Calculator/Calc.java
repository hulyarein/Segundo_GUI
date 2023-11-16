package Calculator;

import javax.swing.*;

public class Calc extends JFrame{
    private JTextField t1;
    private JTextField t2;
    private JTextArea textArea1;
    private JComboBox cB1;
    private JPanel jpanel;
    private JButton b1;

    public Calc() {
        b1.addActionListener(e -> {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int result;
            String res;
            //String op = (String) cbProgram.getSelectedItem();

            if (cB1.getSelectedIndex() == 1) {
                result = num1 + num2;
                res =  Integer.toString(result);
                textArea1.setText(res);
            } else if (cB1.getSelectedIndex() == 2) {
                result = num1 - num2;
                res =  Integer.toString(result);
                textArea1.setText(res);
            } else if (cB1.getSelectedIndex() == 3) {
                result = num1 * num2;
                res =  Integer.toString(result);
                textArea1.setText(res);
            } else if (cB1.getSelectedIndex() == 4) {
                result = num1 / num2;
                res =  Integer.toString(result);
                textArea1.setText(res);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Input");
            }

        });
    }
    public static void main (String[] args) {
        Calc app = new Calc();
        app.setContentPane(app.jpanel);
        app.setSize(200, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Hello Meow");
    }
}
