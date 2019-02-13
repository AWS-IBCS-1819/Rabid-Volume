import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class ButtonExamples extends JFrame {
  public ButtonExamples(){
    setTitle("Button Examples");
    setSize(400,400);

    setLayout(new FlowLayout());
//    setLayout(new BorderLayout());
//    Container c = getContentPane();
    JTextArea a = new JTextArea();
    add(a);
//    c.add(a, BorderLayout.CENTER);

//    final String picPath = "C:/Desktop/snail.png";
      ImageIcon snailpng = new ImageIcon("C:snail.png", "snail");
      JLabel label1 = new JLabel("Snail", snailpng, JLabel.CENTER);
      add(label1);

    JButton yeet = new JButton("Yeet");
    yeet.setBackground(Color.yellow);
    yeet.setForeground(Color.red);
    yeet.setOpaque(false);
    add(yeet);
//    yeet.setBounds(10,10,10,10);
//    c.add(yeet, BorderLayout.NORTH);

  JButton yote = new JButton("Yote");
  yote.setBackground(Color.red);
  yote.setForeground(Color.yellow);
  yote.setOpaque(false);
  add(yote);

  CheckboxGroup gg = new CheckboxGroup();
  Checkbox za = new Checkbox("Great", gg, false);
  Checkbox ff = new Checkbox("Jeet", gg, false);
  add(za);
  add(ff);

//    yote.setOpaque(true);
//    c.add(yote, BorderLayout.SOUTH);

    yeet.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        a.append("Fliip\n");
        yote.setOpaque(true);
        yeet.setOpaque(false);
      }
    });

    yote.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        a.append("Flip\n");
        yote.setOpaque(false);
        yeet.setOpaque(true);
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
