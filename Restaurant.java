//interact with stuff and then make a bill

//three buttons
//a checkbox for each button
//a dropbox for each button for amount
//display choices once clicked
//text area for other comments

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

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
  JComboBox amount;
  JComboBox b;
  JComboBox c;
  JComboBox amoun;
  JComboBox h;
  JComboBox j;
  JComboBox amou;
  JComboBox d;
  JComboBox f;
  JComboBox l;
  JLabel nut;
  ArrayList receipt;


  public Restaurant() {

    setLayout(null);
    a=new JTextArea();
    a.setBounds(600,400,150,200);
    add(a);

    nuts = new Button("Donuts"); //actionPerformed for the button could be showing the checkbox
    nuts.setBounds(20, 100, 100, 30);
    add(nuts);

    nut = new JLabel("Order:");
    add(nut);
    nut.setBounds(550, 50, 200, 300);

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

    van.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e){
        boolean checked = van.getState();
          if(checked == true) {
            amount.setVisible(true);
          } else if (checked == false) {
            amount.setVisible(false);
            nut.setText("Order:");
          }
      }
    });

    choc.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e){
        boolean checked = choc.getState();
          if(checked == true) {
            b.setVisible(true);
          } else if (checked == false) {
            b.setVisible(false);
            nut.setText("Order:");
          }
      }
    });

    straw.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e){
        boolean checked = straw.getState();
          if(checked == true) {
            c.setVisible(true);
          } else if (checked == false) {
            c.setVisible(false);
          }
      }
    });

    String[] s1 = {"0","1", "2","3", "4", "5"};
    amount = new JComboBox<String>(s1);
    add(amount);
    amount.setBounds(250, 120, 70, 50);
    amount.setVisible(false);

    amount.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e){
        nut.setText(amount.getSelectedItem() + " Vanilla Donut");
        System.out.println("Vanilla Donut"+ amount.getSelectedItem());
      }
    });

    b = new JComboBox<String>(s1);
    add(b);
    b.setBounds(250, 180, 70, 50);
    b.setVisible(false);

    b.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e){
        nut.setText(b.getSelectedItem() + " Chocolate Donut");
        System.out.println("Chocolate Donut"+ b.getSelectedItem());
      }
    });

    c = new JComboBox<String>(s1);
    add(c);
    c.setBounds(250, 240, 70, 50);
    c.setVisible(false);

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

    va.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e){
        boolean checked = va.getState();
          if(checked == true) {
            amoun.setVisible(true);
          } else if (checked == false) {
            amoun.setVisible(false);
          }
      }
    });

    cho.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e){
        boolean checked = cho.getState();
          if(checked == true) {
            h.setVisible(true);
          } else if (checked == false) {
            h.setVisible(false);
          }
      }
    });

    stra.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e){
        boolean checked = stra.getState();
          if(checked == true) {
            j.setVisible(true);
          } else if (checked == false) {
            j.setVisible(false);
          }
      }
    });

    amoun = new JComboBox<String>(s1);
    add(amoun);
    amoun.setBounds(300, 320, 70, 50);
    amoun.setVisible(false);

    h = new JComboBox<String>(s1);
    add(h);
    h.setBounds(250, 386, 70, 50);
    h.setVisible(false);

    j = new JComboBox<String>(s1);
    add(j);
    j.setBounds(300, 440, 70, 50);
    j.setVisible(false);

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

    vanilla.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e){
        boolean checked = vanilla.getState();
          if(checked == true) {
            amou.setVisible(true);
          } else if (checked == false) {
            amou.setVisible(false);
          }
      }
    });

    chunk.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e){
        boolean checked = chunk.getState();
          if(checked == true) {
            d.setVisible(true);
          } else if (checked == false) {
            d.setVisible(false);
          }
      }
    });

    butter.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e){
        boolean checked = butter.getState();
          if(checked == true) {
            f.setVisible(true);
          } else if (checked == false) {
            f.setVisible(false);
          }
      }
    });

    cream.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e){
        boolean checked = cream.getState();
          if(checked == true) {
            l.setVisible(true);
          } else if (checked == false) {
            l.setVisible(false);
          }
      }
    });

    amou = new JComboBox<String>(s1);
    add(amou);
    amou.setBounds(250, 520, 70, 50);
    amou.setVisible(false);

    d = new JComboBox<String>(s1);
    add(d);
    d.setBounds(250, 580, 70, 50);
    d.setVisible(false);

    f = new JComboBox<String>(s1);
    add(f);
    f.setBounds(445, 520, 70, 50);
    f.setVisible(false);

    l = new JComboBox<String>(s1);
    add(l);
    l.setBounds(445, 580, 70, 50);
    l.setVisible(false);

    cup.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        vanilla.setVisible(true);
        chunk.setVisible(true);
        butter.setVisible(true);
        cream.setVisible(true);
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
