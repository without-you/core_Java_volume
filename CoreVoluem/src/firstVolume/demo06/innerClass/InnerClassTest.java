package firstVolume.demo06.innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;


/**
 * @author 烂醉花间
 * @date 2023/3/20  22:21
 */
public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock talkingClock = new TalkingClock(1000, true);
        talkingClock.start();

        JOptionPane.showMessageDialog(null,"Quit program");
        System.exit(0);
    }
}

class TalkingClock{
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep)  {
        this.interval = interval;
        this.beep = beep;
    }

    public void start(){
        TimerPrinter timerPrinter = new TimerPrinter();
        Timer timer = new Timer(interval, timerPrinter);
        timer.start();
    }

    public class TimerPrinter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone,the time is"+ Instant.ofEpochMilli(e.getWhen()));
            if (beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }

}
