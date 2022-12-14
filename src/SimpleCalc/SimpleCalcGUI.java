package SimpleCalc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SimpleCalcGUI extends JFrame {
    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JTextField getTfNumber1() {
        return tfNumber1;
    }

    public void setTfNumber1(JTextField tfNumber1) {
        this.tfNumber1 = tfNumber1;
    }

    public JComboBox getCbOperations() {
        return cbOperations;
    }

    public void setCbOperations(JComboBox cbOperations) {
        this.cbOperations = cbOperations;
    }

    public JButton getBtnCompute() {
        return btnCompute;
    }

    public void setBtnCompute(JButton btnCompute) {
        this.btnCompute = btnCompute;
    }

    public JTextField getTfNumber2() {
        return tfNumber2;
    }

    public void setTfNumber2(JTextField tfNumber2) {
        this.tfNumber2 = tfNumber2;
    }

    public JTextField getLblResult() {
        return lblResult;
    }

    public void setLblResult(JTextField lblResult) {
        this.lblResult = lblResult;
    }

    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI() throws HeadlessException {
        this.setTitle("Simple Calculator");
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                double num_1 = Integer.parseInt(tfNumber1.getText());
                double num_2 = Integer.parseInt(tfNumber2.getText());
                Double result = new Double(0);
                char operation= cbOperations.getModel().getSelectedItem().toString().charAt(0);
                    switch (operation) {
                        case '+':
                            result = num_2 + num_1;
                            break;
                        case '-':
                            result = num_1 - num_2;
                            break;
                        case '*':
                            result = num_1 * num_2;
                            break;
                        case '/':
                            if (num_2==0){
                                throw new ArithmeticException();
                            }
                            result = num_1 / num_2;
                    }

                String of_result = result.toString();
                String resulter = new String();
                if (result%1==0){
                    for (int i=0; i<of_result.length(); i++){
                        if (of_result.charAt(i)=='.'){
                            break;
                        } else {
                            resulter+=of_result.charAt(i);
                        }
                    }
                    getLblResult().setText(resulter);
                } else {
                    getLblResult().setText(of_result);
                }
                } catch (ArithmeticException error){
                    JOptionPane.showMessageDialog(panel1, "Cannot Divide by Zero!");
                    return;
                } catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(panel1, "Not a Number (NaN) error!");
                    return;
                }
                catch (Exception error){
                    JOptionPane.showMessageDialog(panel1, "Math Error! [Check buffer overflow]");
                    return;
                }


            }
        });
    }
}

