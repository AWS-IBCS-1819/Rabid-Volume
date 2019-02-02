import javax.swing.*;
import javax.swing.SwingUtilities;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JTextArea;


class MyFrame extends JFrame {
  public MyFrame() {
    setTitle("My Empty Frame");
    setSize(300,200);
    setLocation(10,200);
    Container c = getContentPane();
    JButton button = new JButton ("Yeet It");
    c.add(button, BorderLayout.SOUTH);
    addWindowListener(new WindowAdapter() {
  	  	public void windowClosing(WindowEvent e) {
  		   System.exit(0);
  	  	} //windowClosing
  	} );
    JTextArea a = new JTextArea ();
    c.add(a, BorderLayout.CENTER);

    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
				a.append("YEET ME OVER THE RAINBOW\nYEET ME REALLY FAR\n"); 
			}
    });
}

  public static void main(String[] args) {
    BorderLayout j = new BorderLayout();
    JFrame f = new MyFrame();
    f.show(); //shows actual window

  }
}
