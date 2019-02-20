//interact with stuff and then make a bill

//three buttons
//a checkbox for each button
//a dropbox for each button
//display choices once clicked
//text area for other comments

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Restaurant extends Frame {
  Button nuts;
  Button bis;
  Button cup;
  JTextArea a;
  CheckboxGroup nut;
  Checkbox van;
  Checkbox choc;
  Checkbox straw;

  public Restaurant() {
//    addWindowListener(this);

    setLayout(null);
    a=new JTextArea();
    a.setBounds(400,250,100,100);
    add(a);

    nuts = new Button("Donuts");
    nuts.setBounds(20, 100, 100, 30);
    add(nuts);

    bis = new Button("Biscuits");
    bis.setBounds(20, 200, 100, 30);
    add(bis);

    cup= new Button("Cakes");
    cup.setBounds(20, 300, 100, 30);
    add(cup);

    van = new Checkbox("Vanilla");
    van.setBounds(40, 100, 100, 100);
    choc = new Checkbox("Chocolate", nut, false);
    straw = new Checkbox("Strawberry", nut, false);
    add(van);
    add(choc);
    add(straw);

    addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
         System.exit(0);
        } //windowClosing
    } );

  }

  public static void main(String[] args) {
    Restaurant myWindow = new Restaurant();
    myWindow.setSize(800,400);
    myWindow.setVisible(true);
  }


}
