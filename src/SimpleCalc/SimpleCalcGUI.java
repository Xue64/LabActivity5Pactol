package SimpleCalc;

import javax.swing.*;
import java.awt.*;

public class SimpleCalcGUI extends JFrame {
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

