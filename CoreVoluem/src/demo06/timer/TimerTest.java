package demo06.timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * @author 烂醉花间
 * @date 2023/3/19  16:13
 */
public class TimerTest {
    public static void main(String[] args) {
        TimePrinter listener = new TimePrinter();

        Timer timer = new Timer(1000, listener);
        timer.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone,the time is"+ Instant.ofEpochMilli(e.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}