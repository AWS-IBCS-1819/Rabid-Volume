import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class AA extends JFrame {

    Image image = new ImageIcon("snail.png").getImage();

    public void paint(Graphics g){
      g.setColor(Color.black);
      g.fillRect(0,0,500,500);

      g.setColor(Color.white);
      g.fillRect(30,40,100,50);

      g.setColor(Color.cyan);
      g.fillOval(150,150,200,200);

      g.drawImage(image, 250,250,null);
    }

  public AA(){
    setTitle("I JUST WANT THE PICTURE TO SHOW UP");
    setSize(400,400);

    setVisible(true);

    setLayout(new BorderLayout());
    Container c = getContentPane();

    JButton yeet = new JButton("Yeet");
    yeet.setBackground(Color.yellow);
    yeet.setForeground(Color.red);
    yeet.setOpaque(true);
    c.add(yeet, BorderLayout.NORTH);

    yeet.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        new paint();
      }
    });

    addWindowListener(new WindowAdapter() { //this makes it so when the window is closed it terminates
        public void windowClosing(WindowEvent e) {
         System.exit(0);
        } //windowClosing
    } );

  }

  public static void main(String[] args) {
    JFrame f = new AA();
    f.show();
  }

}
