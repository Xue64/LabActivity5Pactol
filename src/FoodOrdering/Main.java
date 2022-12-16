package FoodOrdering;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FoodOrderGUI gui = new FoodOrderGUI();
        gui.setVisible(true);
        gui.setSize(500, 500);
        gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gui.setContentPane(gui.getPanel1());
    }
}
