
package events;

/*
 * Beeper.java requires no other files.
 */

import java.awt.*; //imports a library
import javax.swing.JFrame; //imports a library(Frame)
import javax.swing.JPanel; //imports a library(Panel)
import javax.swing.JButton; //imports a library (Button)
import javax.swing.JComponent; //imports a library (component)

import java.awt.Toolkit; //imports a library (Toolkit)
import java.awt.BorderLayout; //imports a library (BorderLayout)
import java.awt.event.ActionListener; //imports a library (ActionListener)
import java.awt.event.ActionEvent; //imports a library(ActionEvent)

public class Beeper extends JPanel //Beeper is the subclass of JPanel
                    implements ActionListener { //also uses ActionListener extensivly
  //  JButton button;

    public Beeper() { //constructor class
        super(new BorderLayout()); //recalls the methods from JPanel. Specifically BorderLayout
        JButton button = new JButton("Click Me"); //creation of a button that is called click me
        button.setPreferredSize(new Dimension(200, 80)); //sets the size of the button
        add(button, BorderLayout.CENTER); //sets where the button is on the frame
        button.addActionListener(this); //sets input from the button
    }

    public void actionPerformed(ActionEvent e) { //says what the button should do
        Toolkit.getDefaultToolkit().beep(); //the button should beep
    }


    public static void main(String[] args) { //main method
      JFrame frame = new JFrame("Beeper"); //creates a frame that is called beeper
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //termination of the program when window is closed

      JComponent newContentPane = new Beeper(); //sets where the method of beeper is going to be
      newContentPane.setOpaque(true); //sets a color
      frame.setContentPane(newContentPane); //creates a plane for stuff to be on

      frame.pack(); //sets the frame to be the size that has everything at its preferred size
      frame.setVisible(true); //makes the frame pop up
    }
}
