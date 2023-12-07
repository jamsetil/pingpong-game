package ping.pong;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    GameFrame(){
    this.add(new GamePanel());
    this.setTitle("Pong Game");
    this.setResizable(false);
    this.setBackground(Color.black);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);

    }
}
