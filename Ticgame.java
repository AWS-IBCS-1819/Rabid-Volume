import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Ticgame extends Frame implements ItemListener, ActionListener {
Image board = new ImageIcon("Board.png").getImage();

Button getResults;

Checkbox topLeft;
Checkbox topCenter;
Checkbox topRight;
Checkbox middleLeft;
Checkbox middleCenter;
Checkbox middleRight;
Checkbox lowLeft;
Checkbox lowCenter;
Checkbox lowRight;

boolean turn = true;
boolean weird = false;

Integer temp = 0;

  public Ticgame() {
    setLayout(null);

    getResults = new Button("Get Results");
    getResults.addActionListener(this);
    getResults.setBounds(250, 30, 100, 30);
    add(getResults);

    topLeft = new Checkbox();
    topLeft.addItemListener(this);
    topLeft.setBounds(80, 80, 100, 100);
    add(topLeft);

    topCenter = new Checkbox();
    topCenter.addItemListener(this);
    topCenter.setBounds(250, 80, 100, 100);
    add(topCenter);

    topRight = new Checkbox();
    topRight.addItemListener(this);
    topRight.setBounds(430, 80, 100, 100);
    add(topRight);

    middleLeft = new Checkbox();
    middleLeft.addItemListener(this);
    middleLeft.setBounds(80, 250, 100, 100);
    add(middleLeft);

    middleCenter = new Checkbox();
    middleCenter.addItemListener(this);
    middleCenter.setBounds(250, 250, 100, 100);
    add(middleCenter);

    middleRight = new Checkbox();
    middleRight.addItemListener(this);
    middleRight.setBounds(430, 250, 100, 100);
    add(middleRight);

    lowLeft = new Checkbox();
    lowLeft.addItemListener(this);
    lowLeft.setBounds(80, 420, 100, 100);
    add(lowLeft);

    lowCenter = new Checkbox();
    lowCenter.addItemListener(this);
    lowCenter.setBounds(250, 420, 100, 100);
    add(lowCenter);

    lowRight = new Checkbox();
    lowRight.addItemListener(this);
    lowRight.setBounds(430, 420, 100, 100);
    add(lowRight);

    addWindowListener(new WindowAdapter() { //only two things could be implemented in the inheritance decleration
        public void windowClosing(WindowEvent e) { //declaring it within the class is the only way to do it
         System.exit(0);
        }
    } );
  }

  public void actionPerformed(ActionEvent e) {
    System.out.println("o_o");
  }

  public void itemStateChanged(ItemEvent e) {

    playGame();

    if(turn == false) {
      if(temp == 1) {
        if(topCenter.getState() == true) {
           notRight(true);
        }
        if(topCenter.getState() == false) {
          topCenter.setBackground(Color.YELLOW);
          topCenter.setState(true);
        }
      }
      if(temp == 2) {
        if(topRight.getState() == true) {
          notRight(true);
        }
        if(topRight.getState() == false) {
          topRight.setBackground(Color.YELLOW);
          topRight.setState(true);
        }
      }
      if(temp == 3) {
        if(middleRight.getState() == true) {
          notRight(true);
        }
        if(middleRight.getState() == false) {
        middleRight.setBackground(Color.YELLOW);
        middleRight.setState(true);
        }
      }
      if(temp == 4) {
        if(middleCenter.getState() == true) {
          notRight(true);
        }
        if(middleCenter.getState() == false) {
          middleCenter.setBackground(Color.YELLOW);
          middleCenter.setState(true);
        }
      }
      if(temp == 5) {
        if(middleRight.getState() == true) {
          notRight(true);
        }
        if(middleRight.getState() == false) {
          middleRight.setBackground(Color.YELLOW);
          middleRight.setState(true);
      }
     }
     if(temp == 6) {
       if(lowRight.getState() == true) {
         notRight(true);
       }
       if(lowRight.getState() == false) {
         lowRight.setBackground(Color.YELLOW);
         lowRight.setState(true);
       }
     }
     if(temp == 7) {
//       if(lowCenter.getState() == true) {
//         notRight(true);
//       }
       if(lowCenter.getState() == false) {
         lowCenter.setBackground(Color.YELLOW);
         lowCenter.setState(true);
       }
     }
     if(temp == 8) {
       if(lowRight.getState() == true) {
         notRight(true);
       }
       if(lowRight.getState() == false) {
         lowRight.setBackground(Color.YELLOW);
         lowRight.setState(true);
       }
     }
     if(temp == 9) {
       if(lowLeft.getState() == true) {
         notRight(true);
       }
       if(lowLeft.getState() == false) {
         lowLeft.setBackground(Color.YELLOW);
         lowLeft.setState(true);
       }
     }
     turn = true;
    }

  }

  public void playGame() {
    if(turn == true) {
      if(topLeft.getState() == true) {
        temp = 1;
      }
      if(topCenter.getState() == true) {
        temp = 2;
      }
      if(topRight.getState() == true) {
        temp = 3;
      }
      if(middleLeft.getState() == true) {
        temp = 4;
      }
      if(middleCenter.getState() == true) {
        temp = 5;
      }
      if(middleRight.getState() == true) {
        temp = 6;
      }
      if(lowLeft.getState() == true) {
        temp = 7;
      }
      if(lowCenter.getState() == true) {
        temp = 8;
      }
      if(lowRight.getState() == true) {
        temp = 9;
      }
      turn = false;
      notRight(false);
    }
  }

  public void notRight(boolean weird) {
      Random r = new Random();
      temp = r.nextInt(9);
      turn = false;
      playGame();
  }

   public void paint(Graphics g) {
     g.drawImage(board, 50,50, null);
   }

  public static void main(String[] args) {
    Ticgame j = new Ticgame();
    j.setSize(600, 600);
    j.setVisible(true);
  }

}
