package SimpleCalc;

import javax.swing.*;
import java.awt.*;

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
    }
}

