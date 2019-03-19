import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Tgame extends Frame implements ItemListener, ActionListener {
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

  public Tgame() {
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
    if(e.getSource() == getResults) {
      Win();
      Lose(true);
    }
  }

  public void itemStateChanged(ItemEvent e) {

    if(e.getSource() == topLeft) {
          topLeft.setBackground(Color.RED);
          if(middleLeft.getState() == true) {
          lowLeft.setBackground(Color.YELLOW);
  //        lowLeft.setState(true);
        }
        else {
          topCenter.setBackground(Color.YELLOW);
    //      topCenter.setState(true);
        }
          if(middleCenter.getState() == true) {
          lowRight.setBackground(Color.YELLOW);
  //        lowRight.setState(true);
        }
          if(topCenter.getState() == true) {
            topRight.setBackground(Color.YELLOW);
  //          topRight.setState(true);
          }

         if(lowRight.getState() == true) {
           lowCenter.setBackground(Color.YELLOW);
//           lowCenter.setState(true);
         }

    }

    if(e.getSource() == topCenter) {
        topCenter.setBackground(Color.RED);
        if(middleCenter.getState() == true) {
        lowCenter.setBackground(Color.YELLOW);
  //      lowCenter.setState(true);
      }
      if(middleCenter.getState() == false) {
        if(topRight.getState() == false) {
          middleCenter.setBackground(Color.YELLOW);
  //        middleRight.setState(true);
        }
        if(topRight.getState() == true) {
          topLeft.setBackground(Color.YELLOW);
  //        topLeft.setState(true);
        }
      }
/*      else {
        if(lowRight.getState() == false) {
          lowRight.setBackground(Color.YELLOW);
        }
        if(lowRight.getState() == true){
          middleRight.setBackground(Color.YELLOW);
        }
      }
*/
     }

    if(e.getSource() == topRight) {
        topRight.setBackground(Color.RED);
        if(topCenter.getState() == true) {
          if(topLeft.getState() == false) {
            middleLeft.setBackground(Color.YELLOW);
  //          middleLeft.setState(true);
          }
          if(topCenter.getState() == false) {
          topLeft.setBackground(Color.YELLOW);
  //        topLeft.setState(true);
        }
        }
        if(middleRight.getState() == true) {
          lowRight.setBackground(Color.YELLOW);
  //        lowRight.setState(true);
        }
        else{
          if(lowLeft.getState() == true) {
            middleLeft.setBackground(Color.YELLOW);
  //          middleLeft.setState(true);
          }
          if(lowLeft.getState() == false) {
            lowLeft.setBackground(Color.YELLOW);
  //          lowLeft.setState(true);
          }
        }
      }

    if(e.getSource() == middleLeft){
      middleLeft.setBackground(Color.RED);
      if(topLeft.getState() == true) {
        lowLeft.setBackground(Color.YELLOW);
  //      lowLeft.setState(true);
      }
        if(middleCenter.getState() == true) {
       middleRight.setBackground(Color.YELLOW);
  //    middleRight.setState(true);
    }
    else {
      lowCenter.setBackground(Color.YELLOW);
   }
      if(lowLeft.getState() == true) {
        topLeft.setBackground(Color.YELLOW);
  //      topCenter.setState(true);
     }
    }

    if(e.getSource() == middleCenter) {
      middleCenter.setBackground(Color.RED);
      if(topCenter.getState() == true) {
      lowCenter.setBackground(Color.YELLOW);
  //    lowCenter.setState(true);
     }
     if(topLeft.getState() == true) {
       lowRight.setBackground(Color.YELLOW);
     }
     if(lowCenter.getState() == true) {
       topCenter.setBackground(Color.YELLOW);
  //     topCenter.setState(true);
     }
     if(middleRight.getState() == true) {
       middleLeft.setBackground(Color.YELLOW);
  //     middleLeft.setState(true);
     }
     if(lowLeft.getState() == true) {
       topRight.setBackground(Color.YELLOW);
  //     topRight.setState(true);
     }
     if(topRight.getState() == true) {
       lowLeft.setBackground(Color.YELLOW);
     }
     if(middleLeft.getState() == true) {
       middleRight.setBackground(Color.YELLOW);
     }
     else{
       topLeft.setBackground(Color.YELLOW);
     }
    }

    if(e.getSource() == middleRight) {
      middleRight.setBackground(Color.RED);
      if(topRight.getState() == true) {
        lowRight.setBackground(Color.YELLOW);
  //      lowRight.setState(true);
      }
      if(lowRight.getState() == true) {
        topRight.setBackground(Color.YELLOW);
      }
      else {
      middleLeft.setBackground(Color.YELLOW);
  //    middleLeft.setState(true);
      }
    }

    if(e.getSource() == lowLeft) {
      lowLeft.setBackground(Color.RED);
      if(middleCenter.getState() == true) {
        if(topRight.getState() == true) {
         lowRight.setBackground(Color.YELLOW);
  //       lowRight.setState(true);
        }
        if(topRight.getState() == false) {
        topRight.setBackground(Color.YELLOW);
  //      topRight.setState(true);
        }
      }
      if(middleCenter.getState() == false) {
        if(middleLeft.getState() == true) {
          topLeft.setBackground(Color.YELLOW);
  //        topLeft.setState(true);
        }
        if(middleLeft.getState() == false) {
        middleCenter.setBackground(Color.YELLOW);
  //      middleCenter.setState(true);
        }
      }
    }

    if(e.getSource() == lowCenter) {
      lowCenter.setBackground(Color.RED);
      if(lowRight.getState() == true) {
        lowLeft.setBackground(Color.YELLOW);
  //      lowLeft.setState(true);
      }
      else{
        topCenter.setBackground(Color.YELLOW);
  //      topCenter.setState(true);
      }
    }

    if(e.getSource() == lowRight) {
      lowRight.setBackground(Color.RED);
      if(lowCenter.getState() == true) {
        lowLeft.setBackground(Color.YELLOW);
//        lowLeft.setState(true);
      }
      else {
        if(topLeft.getState() == false) {
         topLeft.setBackground(Color.YELLOW);
//         topLeft.setState(true);
        }
        if(topLeft.getState() == true) {
          middleCenter.setBackground(Color.YELLOW);
//          middleRight.setState(true);
        }
        if(middleRight.getState() == true) {
        topRight.setBackground(Color.YELLOW);
//        middleCenter.setState(true);
       }
      }
    }
  }

  boolean K = true;

  public void Win() {
    if(topLeft.getState() == true) {
      if(topCenter.getState() == true) {
        if(topRight.getState() == true) {
          System.out.println("you win");
          Lose(false);
        }
      }
      if(middleLeft.getState() == true) {
        if(lowLeft.getState() == true) {
          System.out.println("you win");
          Lose(false);
        }
      }
      if(middleCenter.getState() == true) {
        if(lowRight.getState() == true) {
          System.out.println("you win");
          Lose(false);
        }
      }
    }
    if(topCenter.getState() == true) {
      if(middleCenter.getState() == true) {
        if(lowCenter.getState() == true) {
          System.out.println("you win");
          Lose(false);
        }
      }
    }
    if(topRight.getState() == true) {
      if(middleCenter.getState() == true) {
        if(lowLeft.getState() == true) {
          System.out.println("you win");
          Lose(false);
        }
      }
      if(middleRight.getState() == true) {
        if(lowRight.getState() == true) {
          System.out.println("you Win");
          Lose(false);
        }
      }
    }
    if(middleLeft.getState() == true) {
      if(middleCenter.getState() == true) {
        if(middleRight.getState() == true) {
          System.out.println("you win");
          Lose(false);
        }
      }
    }
    if(lowLeft.getState() == true) {
      if(lowCenter.getState() == true) {
        if(lowRight.getState() == true) {
          System.out.println("you win");
          Lose(false);
        }
      }
    }
  }

  public void Lose(boolean K) {
    if(topLeft.getState() == false) {
      if(topCenter.getState() == false) {
        if(topRight.getState() == false) {
          System.out.println("computer win");
        }
      }
      if(middleLeft.getState() == false) {
        if(lowLeft.getState() == false) {
          System.out.println("computer win");
        }
      }
      if(middleCenter.getState() == false) {
        if(lowRight.getState() == false) {
          System.out.println("computer win");
        }
      }
    }
    if(topCenter.getState() == false) {
      if(middleCenter.getState() == false) {
        if(lowCenter.getState() == false) {
          System.out.println("computer win");
        }
      }
    }
    if(topRight.getState() == false) {
      if(middleCenter.getState() == false) {
        if(lowLeft.getState() == false) {
          System.out.println("Computer win");
        }
      }
      if(middleRight.getState() == false) {
        if(lowRight.getState() == false) {
          System.out.println("Computer Win");
        }
      }
    }
    if(middleLeft.getState() == false) {
      if(middleCenter.getState() == false) {
        if(middleRight.getState() == false) {
          System.out.println("Computer win");
        }
      }
    }
    if(lowLeft.getState() == false) {
      if(lowCenter.getState() == false) {
        if(lowRight.getState() == false) {
          System.out.println("Computer win");
        }
      }
    }
    else {
      System.out.println("Draw");
    }
  }

   public void paint(Graphics g) {
     g.drawImage(board, 50,50, null);
   }

  public static void main(String[] args) {
    Tgame j = new Tgame();
    j.setSize(600, 600);
    j.setVisible(true);
  }

}
