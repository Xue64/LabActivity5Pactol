package LeapYear;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel leapYearFrame;
    private JTextField tfYear;

    public LeapYearGUI() throws HeadlessException {

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
