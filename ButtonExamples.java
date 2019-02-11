import javax.swing.*;
import javax.swing.SwingUtilities;
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

public class ButtonExamples extends JFrame {
  public ButtonExamples(){
    setTitle("Button Examples");
    setSize(400,400);

    setLayout(new BorderLayout());
    Container c = getContentPane();
    JTextArea a = new JTextArea();
    c.add(a, BorderLayout.CENTER);

//    final String picPath = "C:/Desktop/snail.png";
      ImageIcon image = new ImageIcon("C:\\Desktop\\snail.png");
      JLabel imageLabel = new JLabel(image);
      imageLabel.setBounds(100, 100, 100, 100);
      //setVisible(true);



    JButton yeet = new JButton("Yeet");
    yeet.setBackground(Color.yellow);
    yeet.setForeground(Color.red);
    yeet.setOpaque(true);
    c.add(yeet, BorderLayout.NORTH);

    JButton yote = new JButton("Yote");
    yote.setBackground(Color.red);
    yote.setForeground(Color.yellow);
    yote.setOpaque(true);
    c.add(yote, BorderLayout.SOUTH);

    yeet.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        a.append("To the left\n");

      }
    });

    yote.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        a.append("Cha Cha real smooth\n");
      }
    });

    addWindowListener(new WindowAdapter() { //this makes it so when the window is closed it terminates
        public void windowClosing(WindowEvent e) {
         System.exit(0);
        } //windowClosing
    } );

  }

  public static void main(String[] args) {
    JFrame f = new ButtonExamples();
    f.show();
  }

}
