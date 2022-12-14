package SimpleCalc;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        SimpleCalcGUI gui = new SimpleCalcGUI();
        gui.setContentPane(gui.getPanel1());
        gui.setVisible(true);
        gui.setSize(600, 250);
        gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
