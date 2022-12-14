package LeapYear;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel leapYearFrame;
    private JTextField tfYear;

    public LeapYearGUI() throws HeadlessException {

        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isLeap = false;
                int year = Integer.parseInt(tfYear.getText());
                if (year%4==0){
                    if (year%100==0){
                        if (year%400==0){
                            isLeap = true;
                        }
                    } else {
                        isLeap = true;
                    }
                }
                if (isLeap){
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
