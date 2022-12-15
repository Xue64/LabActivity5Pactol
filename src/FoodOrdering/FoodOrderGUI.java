package FoodOrdering;

import javax.swing.*;
import java.awt.*;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JCheckBox getcPizza() {
        return cPizza;
    }

    public void setcPizza(JCheckBox cPizza) {
        this.cPizza = cPizza;
    }

    public JRadioButton getRbNone() {
        return rbNone;
    }

    public void setRbNone(JRadioButton rbNone) {
        this.rbNone = rbNone;
    }

    public JButton getBtnOrder() {
        return btnOrder;
    }

    public void setBtnOrder(JButton btnOrder) {
        this.btnOrder = btnOrder;
    }

    public JRadioButton getRb5() {
        return rb5;
    }

    public void setRb5(JRadioButton rb5) {
        this.rb5 = rb5;
    }

    public JRadioButton getRb10() {
        return rb10;
    }

    public void setRb10(JRadioButton rb10) {
        this.rb10 = rb10;
    }

    public JRadioButton getRb15() {
        return rb15;
    }

    public void setRb15(JRadioButton rb15) {
        this.rb15 = rb15;
    }

    public JCheckBox getcBurger() {
        return cBurger;
    }

    public void setcBurger(JCheckBox cBurger) {
        this.cBurger = cBurger;
    }

    public JCheckBox getcFries() {
        return cFries;
    }

    public void setcFries(JCheckBox cFries) {
        this.cFries = cFries;
    }

    public JCheckBox getcSoftDrinks() {
        return cSoftDrinks;
    }

    public void setcSoftDrinks(JCheckBox cSoftDrinks) {
        this.cSoftDrinks = cSoftDrinks;
    }

    public JCheckBox getcTea() {
        return cTea;
    }

    public void setcTea(JCheckBox cTea) {
        this.cTea = cTea;
    }

    public JCheckBox getcSundae() {
        return cSundae;
    }

    public void setcSundae(JCheckBox cSundae) {
        this.cSundae = cSundae;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public FoodOrderGUI() throws HeadlessException {
        setTitle("Food Ordering System");
    }
}
