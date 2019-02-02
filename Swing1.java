import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.swing.JButton;
import java.swing.JTextArea;

public class Swing1 extends JFrame {

  public MainFrame(String title){
    super(title);
    //setlayout manager
    setLayout(new BorderLayout());
    //createswing component
    JTextArea textArea = new JTextArea();
    JButton button = new JButton("Click me");
    //add swing components to conent pane
		Container c = getContentPane();
		c.add(textArea, BorderLayout.CENTER);
		c.add(button, BorderLayout.SOUTH);

		//add behaviour
		button.addActionListner(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				textArea.append("Hello");
			}
		});

  }
}
