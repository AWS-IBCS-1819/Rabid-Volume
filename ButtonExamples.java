import javax.swing.*;
import javax.swing.SwingUtilities;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class ButtonExamples extends JFrame {
  public ButtonExamples(){
    setTitle("Button Examples");
    setSize(400,400);

    setLayout(new BorderLayout());
    Container c = getContentPane();
    JTextArea a = new JTextArea();
    c.add(a, BorderLayout.CENTER);

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
        a.append("Cool Beans");
      }
    });

    yote.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        a.append("Cha Cha real smooth");
      }
    });

    addWindowListener(new WindowAdapter() { //this makes it so when the window is closed it terminates
        public void windowClosing(WindowEvent e) {
         System.exit(0);
        } //windowClosing
    } );

    c.add(new JLabel(new ImageIcon("snail.png")));
  }

  public static void main(String[] args) {
    JFrame f = new ButtonExamples();
    f.show();
  }

}
