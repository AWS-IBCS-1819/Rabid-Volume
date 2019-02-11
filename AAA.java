import javax.swing.*;
import java.awt.*;


public class AAA extends JFrame {
  Image image = new ImageIcon("snail.png").getImage();

  public AAA(){
    setBounds(100,100,500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void paint(Graphics g){
    g.setColor(Color.black);
    g.fillRect(0,0,500,500);

    g.setColor(Color.white);
    g.fillRect(30,40,100,50);

    g.setColor(Color.cyan);
    g.fillOval(150,150,200,200);

    g.drawImage(image, 250,250,null);
  }

  public static void main(String[] args) {
    new AAA();
  }

}
