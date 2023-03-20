package demo06.anonymousInnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * @author 烂醉花间
 * @date 2023/3/20  22:36
 */
public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock();
        clock.start(1000,true);

        JOptionPane.showMessageDialog(null,"Quit program");
        System.exit(0);
    }
}

class TalkingClock {
    public void start(int interval, boolean beep) {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone,the time is"+ Instant.ofEpochMilli(e.getWhen()));
                if (beep){
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        };
        Timer timer = new Timer(interval, actionListener);
        timer.start();
    }
}
