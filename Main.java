import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        new ProgressBarDemo();

        ImageIcon og = new ImageIcon("image.png");
        Image img = og.getImage();
        img.getScaledInstance(10, 10, Image.SCALE_DEFAULT);
        ImageIcon icon = new ImageIcon(img);
        JOptionPane.showMessageDialog(null, "I love youuuu\nYou hardworking cringey weirdooo\nmwah mwahhhhhhh\n 1000 good job and im super duper proud of you kisses hehehehe", "Look what I can do!", JOptionPane.PLAIN_MESSAGE, icon);
    }
}
