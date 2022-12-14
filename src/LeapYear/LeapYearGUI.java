package LeapYear;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

public class LeapYearGUI extends JFrame {
    private JPanel leapYearFrame;
    private JTextField tfYear;

    public LeapYearGUI() throws HeadlessException {

        btnCheckYear.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                boolean isLeap = false;
                int year = 0;
                try {

                    year = Integer.parseInt(tfYear.getText());
                } catch (NumberFormatException error) {
                    JOptionPane.showMessageDialog(leapYearFrame, "Not a number! Please enter a valid number!");
                    return;
                } catch (Exception error){
                    JOptionPane.showMessageDialog(leapYearFrame, "Caught error! Please try again.");
                    return;
                }
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            isLeap = true;
                        }
                    } else {
                        isLeap = true;
                    }
                }
                try {

                    if (year < 0) {
                        throw new InputMismatchException("INPUT MISMATCH");
                    } if (year == 0){
                        throw new ArithmeticException("ERROR!");
                    }
                }  catch (InputMismatchException error){
                    JOptionPane.showMessageDialog(leapYearFrame, "Year cannot be negative!");
                    return;
                } catch (ArithmeticException error){
                JOptionPane.showMessageDialog(leapYearFrame, "Year cannot be zero!");
                return;
            }
                if (isLeap) {
                    JOptionPane.showMessageDialog(leapYearFrame, "Leap year");
                } else {
                    JOptionPane.showMessageDialog(leapYearFrame, "Not a leap year");
                }
            }
        });

    }

    public JPanel getLeapYearFrame() {
        return leapYearFrame;
    }

    public void setLeapYearFrame(JPanel leapYearFrame) {
        this.leapYearFrame = leapYearFrame;
    }

    public JTextField getTfYear() {
        return tfYear;
    }

    public void setTfYear(JTextField tfYear) {
        this.tfYear = tfYear;
    }

    public JButton getBtnCheckYear() {
        return btnCheckYear;
    }

    public void setBtnCheckYear(JButton btnCheckYear) {
        this.btnCheckYear = btnCheckYear;
    }

    private JButton btnCheckYear;
}
