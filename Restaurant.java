//interact with stuff and then make a bill

//three buttons
//a checkbox for each button
//a dropbox for each button for amount
//display choices once clicked
//text area for other comments

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Restaurant extends JFrame {
  Button nuts;
  Button bis;
  Button cup;
  JTextArea a;
  Checkbox van;
  Checkbox choc;
  Checkbox straw;
  Checkbox va;
  Checkbox cho;
  Checkbox stra;
  Checkbox vanilla;
  Checkbox chunk;
  Checkbox butter;
  Checkbox cream;

  public Restaurant() {

    setLayout(null);
    a=new JTextArea();
    a.setBounds(600,300,100,200);
    add(a);

    nuts = new Button("Donuts"); //actionPerformed for the button could be showing the checkbox
    nuts.setBounds(20, 100, 100, 30);
    add(nuts);

    van = new Checkbox("Vanilla");
    van.setBounds(150, 100, 100, 100);
    choc = new Checkbox("Chocolate");
    choc.setBounds(150, 160, 100, 100);
    straw = new Checkbox("Strawberry");
    straw.setBounds(150, 220, 100, 100);
    add(van);
    add(choc);
    add(straw);

    van.setVisible(false);
    choc.setVisible(false);
    straw.setVisible(false);

    nuts.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        van.setVisible(true);
        choc.setVisible(true);
        straw.setVisible(true);
      }
    });

    bis = new Button("Biscuits");
    bis.setBounds(20, 300, 100, 30);
    add(bis);

    va = new Checkbox("Snickerdoodle");
    va.setBounds(150, 300, 150, 100);
    cho = new Checkbox("Sugar");
    cho.setBounds(150, 360, 100, 100);
    stra = new Checkbox("Ginger Snap");
    stra.setBounds(150, 420, 150, 100);
    add(va);
    add(cho);
    add(stra);

    va.setVisible(false);
    cho.setVisible(false);
    stra.setVisible(false);

    bis.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        va.setVisible(true);
        cho.setVisible(true);
        stra.setVisible(true);
      }
    });

    cup= new Button("Cakes");
    cup.setBounds(20, 500, 100, 30);
    add(cup);

    //frosting
    //cake flavors
    vanilla = new Checkbox("Vanilla");
    vanilla.setBounds(150, 500, 100, 100);
    chunk = new Checkbox("Chocolate");
    chunk.setBounds(150, 560, 100, 100);
    add(vanilla);
    add(chunk);

    butter = new Checkbox("Buttercream");
    butter.setBounds(300, 500, 150, 100);
    cream = new Checkbox("Cream Cheese");
    cream.setBounds(300, 560, 150, 100);
    add(butter);
    add(cream);

    vanilla.setVisible(false);
    chunk.setVisible(false);
    butter.setVisible(false);
    cream.setVisible(false);

    cup.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        vanilla.setVisible(true);
        chunk.setVisible(true);
        cream.setVisible(true);
        butter.setVisible(true);
      }
    });

    addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
         System.exit(0);
        } //windowClosing
    } );

  }

  public static void main(String[] args) {
    Restaurant myWindow = new Restaurant();
    myWindow.setSize(800,700);
    myWindow.setVisible(true);
  }

}
