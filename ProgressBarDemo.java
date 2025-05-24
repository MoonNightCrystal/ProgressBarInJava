import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();
    ProgressBarDemo(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bar.setValue(0);
        bar.setPreferredSize(new Dimension(420, 50));
        bar.setStringPainted(true);

        frame.add(bar);
        frame.pack();
        frame.setVisible(true);

        fill();
    }

    public void fill(){
        bar.setValue(10);
        int counter = 0;

        while(counter<=100){
            bar.setValue(counter);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter++;
        }
    }
}
