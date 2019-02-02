import javax.swing.*;
import javax.swing.SwingUtilities;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class Swing1 extends JFrame {

public Swing1(){
  setTitle("My Empty Frame"); //this sets up the window size
  setSize(300,300);
  setLocation(10,200);

  setLayout(new BorderLayout());
  Container c = getContentPane();
  JTextArea a = new JTextArea();
  c.add(a, BorderLayout.CENTER);

  JButton redButton = new JButton("Joke");
  JButton blueButton = new JButton("Punchline");
  c.add(redButton, BorderLayout.NORTH);
  c.add(blueButton, BorderLayout.SOUTH);

  redButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e){
      a.append("What's a ghosts favorite ice cream flavor?\n");
    }
  });
  blueButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
      a.append("Booberry!\n");
    }
  });

  addWindowListener(new WindowAdapter() { //this makes it so when the window is closed it terminates
      public void windowClosing(WindowEvent e) {
       System.exit(0);
      } //windowClosing
  } );
}

  //      redButton.addActionListener(this);
  //      blueButton.addActionListener(this);


  //      Color color = getBackground();
  //      public void actionPerformed(ActionEvent eve) {
  //        if (eve.getSource() == redButton) {
  //        color = Color.red;
  //      }
  //       else if (eve.getSource() == blueButton) {
  //          color = Color.blue;
  //        }
  //        setBackground(color);
  //        repaint();
  //      }


      /*  Color color = getBackground();  // color will be set
	      Object source = title.getSource();
	      if (source == redButton) {
        color = Color.red;
      }
	      else if (source == blueButton) {
          color = Color.blue;
        }
	      setBackground(color);
	      repaint();  // when do we need this??
      }
    }
    JButton button = new JButton("Click me");
    //add swing components to conent pane
		Container c = getContentPane();
		c.add(textArea, BorderLayout.CENTER);
		c.add(button, BorderLayout.SOUTH);

		//add behaviour
		button.addActionListner(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				textArea.append("Hello");
*/
public static void main(String[] args) {
  JFrame f = new Swing1();
  f.show();
}
}
