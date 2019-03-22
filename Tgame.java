/*
the major flaw I was not able to fix is when the user sets up a two-way win, the computer will
go in both places to stop the user from winning
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Tgame extends Frame implements ItemListener, ActionListener { //inheritance from frame, implement the listeners here allows me to create a big method later on
Image board = new ImageIcon("Board.png").getImage(); //makes an image appear (constructor)

Button getResults; //initialization of various components

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
    setLayout(null); //I wanted to be able to set the size of everything so I set the layout to null

    getResults = new Button("Get Results"); //various constructor methods to set up a button and checkboxes
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
        public void windowClosing(WindowEvent e) { //but I can declare it in the class
         System.exit(0);
        }
    } );
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == getResults) {
      Win(); //I call two methods to test to see if the user has won or not
      Lose(); //I made this button to only do this because when I called these methods else where they would not wait until the game was finished
    } //so calling it only once lets the method go once the game is finished
  }

  public void itemStateChanged(ItemEvent e) {

    if(e.getSource() == topLeft) { //for Tgame I tried to do a "code for every possibility"
          topLeft.setBackground(Color.RED); //mainly, I tried to step it up so if two were in a row then the computer would stop it
          if(middleLeft.getState() == true) {
          lowLeft.setBackground(Color.YELLOW); //the player's piece is red while the computer's piece is yellow
        }
        else {
          if(topCenter.getState() == false) {
          topCenter.setBackground(Color.YELLOW);
          }
        }
          if(middleCenter.getState() == true) {
          lowRight.setBackground(Color.YELLOW);
        }
          if(topCenter.getState() == true) {
            topRight.setBackground(Color.YELLOW);
          }

         if(lowRight.getState() == true) {
           lowCenter.setBackground(Color.YELLOW);
         }

    }

    if(e.getSource() == topCenter) {
        topCenter.setBackground(Color.RED);
        if(middleCenter.getState() == true) {
        lowCenter.setBackground(Color.YELLOW);
      }
      if(middleCenter.getState() == false) {
        if(topRight.getState() == false) {
          middleCenter.setBackground(Color.YELLOW);
        }
        if(topRight.getState() == true) {
          topLeft.setBackground(Color.YELLOW);
        }
      }
     }

    if(e.getSource() == topRight) {
        topRight.setBackground(Color.RED);
          if(topCenter.getState() == true) {
          topLeft.setBackground(Color.YELLOW);
        }
        if(middleRight.getState() == true) {
          lowRight.setBackground(Color.YELLOW);
        }
        else{
          if(lowLeft.getState() == true) {
            middleLeft.setBackground(Color.YELLOW);
          }
          if(lowLeft.getState() == false) {
            lowLeft.setBackground(Color.YELLOW);
          }
        }
      }

    if(e.getSource() == middleLeft){
      middleLeft.setBackground(Color.RED);
      if(topLeft.getState() == true) {
        lowLeft.setBackground(Color.YELLOW);
      }
        if(middleCenter.getState() == true) {
       middleRight.setBackground(Color.YELLOW);
    }
    else {
      lowCenter.setBackground(Color.YELLOW);
   }
      if(lowLeft.getState() == true) {
        topLeft.setBackground(Color.YELLOW);
     }
    }

    if(e.getSource() == middleCenter) {
      middleCenter.setBackground(Color.RED);
      if(topCenter.getState() == true) {
      lowCenter.setBackground(Color.YELLOW);
     }
     if(topLeft.getState() == true) {
       lowRight.setBackground(Color.YELLOW);
     }
     if(lowCenter.getState() == true) {
       topCenter.setBackground(Color.YELLOW);
     }
     if(middleRight.getState() == true) {
       middleLeft.setBackground(Color.YELLOW);
     }
     if(lowLeft.getState() == true) {
       topRight.setBackground(Color.YELLOW);
     }
     if(topRight.getState() == true) {
       lowLeft.setBackground(Color.YELLOW);
     }
     else{
       if(topLeft.getState() == false) {
       topLeft.setBackground(Color.YELLOW);
      }
     }
     if(middleLeft.getState() == true) {
       middleRight.setBackground(Color.YELLOW);
     }
    }

    if(e.getSource() == middleRight) {
      middleRight.setBackground(Color.RED);
      if(topRight.getState() == true) {
        lowRight.setBackground(Color.YELLOW);
      }
      else {
      middleLeft.setBackground(Color.YELLOW);
      }
      if(lowRight.getState() == true) {
        topRight.setBackground(Color.YELLOW);
      }
    }

    if(e.getSource() == lowLeft) {
      lowLeft.setBackground(Color.RED);
      if(middleCenter.getState() == true) {
        if(topRight.getState() == true) {
         lowRight.setBackground(Color.YELLOW);
        }
        if(topRight.getState() == false) {
        topRight.setBackground(Color.YELLOW);
        }
      }
      if(middleCenter.getState() == false) {
        if(middleLeft.getState() == true) {
          topLeft.setBackground(Color.YELLOW);
        }
        if(middleLeft.getState() == false) {
        middleCenter.setBackground(Color.YELLOW);
        }
        if(middleLeft.getState() == true) {
          lowCenter.setBackground(Color.YELLOW);
        }
      }
    }

    if(e.getSource() == lowCenter) {
      lowCenter.setBackground(Color.RED);
      if(lowRight.getState() == true) {
        lowLeft.setBackground(Color.YELLOW);
      }
      else{
        topCenter.setBackground(Color.YELLOW);
      }
    }

    if(e.getSource() == lowRight) {
      lowRight.setBackground(Color.RED);
      if(lowCenter.getState() == true) {
        lowLeft.setBackground(Color.YELLOW);
      }
      else {
        if(topLeft.getState() == false) {
         topLeft.setBackground(Color.YELLOW);
        }
        if(topLeft.getState() == true) {
          middleCenter.setBackground(Color.YELLOW);
        }
        if(middleRight.getState() == true) {
        topRight.setBackground(Color.YELLOW);
       }
      }
    }
  }

  public void Win() { //the win method checks every possible way the user could win and prints in the terminal if the user has matched one
    if(topLeft.getState() == true) {
      if(topCenter.getState() == true) {
        if(topRight.getState() == true) {
          System.out.println("you win");
        }
      }
      if(middleLeft.getState() == true) {
        if(lowLeft.getState() == true) {
          System.out.println("you win");
        }
      }
      if(middleCenter.getState() == true) {
        if(lowRight.getState() == true) {
          System.out.println("you win");
        }
      }
    }
    if(topCenter.getState() == true) {
      if(middleCenter.getState() == true) {
        if(lowCenter.getState() == true) {
          System.out.println("you win");
        }
      }
    }
    if(topRight.getState() == true) {
      if(middleCenter.getState() == true) {
        if(lowLeft.getState() == true) {
          System.out.println("you win");
        }
      }
      if(middleRight.getState() == true) {
        if(lowRight.getState() == true) {
          System.out.println("you Win");
        }
      }
    }
    if(middleLeft.getState() == true) {
      if(middleCenter.getState() == true) {
        if(middleRight.getState() == true) {
          System.out.println("you win");
        }
      }
    }
    if(lowLeft.getState() == true) {
      if(lowCenter.getState() == true) {
        if(lowRight.getState() == true) {
          System.out.println("you win");
        }
      }
    }
    else {
      System.out.println("draw");
    }
  }

  public void Lose() { //lose method does the same as the win method- but for if the checkbox is not checked
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
