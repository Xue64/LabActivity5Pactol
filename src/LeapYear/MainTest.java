package LeapYear;

import javax.swing.*;

public class MainTest {
    public static void main(String[] args) {
        LeapYearGUI frame = new LeapYearGUI();
        frame.setContentPane(frame.getLeapYearFrame());
        frame.setVisible(true);
        frame.setTitle("Leap Year Checker");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
    }
}
