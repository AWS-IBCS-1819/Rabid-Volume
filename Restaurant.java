//need to set a price thingie
//need to do colors
//need to make it pretty

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Restaurant extends Frame implements ActionListener, ItemListener {
  Button nuts;
  Button bis;
  Button cup;
  Button submit;
  Button finalSumbit;

  JTextArea a;
  JTextArea u;

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

  JLabel nut;
  JLabel title;
  JLabel instruct;

  String s1[] = {"0","1", "2","3", "4", "5"};
  Double s2[] = {2.01, 3.01, 4.01, 5.01, 6.01};
  Double totalOrder = 0.0;

  public Restaurant() {

    setLayout(null);
    setBackground(Color.ORANGE);
    a=new JTextArea();
    a.setBounds(600,100,150,200);
    add(a);
    a.setVisible(false);

    title = new JLabel("Welcome to the online ordering system of Sweets and Treats!");
    add(title);
    title.setBounds(160, 50, 400, 20);

    instruct = new JLabel("To place your order, click 'submit item to order' after each item. Comments do not need to be submitted.");
    add(instruct);
    instruct.setBounds(50, 80, 700, 20);

    finalSumbit = new Button("Submit your Order");
    finalSumbit.setBounds(550, 500, 200, 30);
    add(finalSumbit);
    finalSumbit.addActionListener(this);
    finalSumbit.setBackground(Color.MAGENTA);

    u= new JTextArea();
    u.setBounds(550, 300, 200, 150);
    add(u);
    u.append("Other Comments or Concerns?\n");

    submit = new Button("Sumbit Item to Order");
    submit.setBounds(550, 150, 200, 30);
    add(submit);
    submit.setBackground(Color.MAGENTA);

    submit.addActionListener(this);

    nuts = new Button("Donuts"); //actionPerformed for the button could be showing the checkbox
    nuts.setBounds(20, 100, 100, 30);
    add(nuts);
    nuts.setBackground(Color.YELLOW);

    nut = new JLabel("Order:");
    add(nut);
    nut.setBounds(550, 50, 250, 300);

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

    van.addItemListener(this);
    choc.addItemListener(this);
    straw.addItemListener(this);

    amount = new JComboBox<String>(s1);
    add(amount);
    amount.setBounds(250, 120, 70, 50);
    amount.setVisible(false);

    amount.addItemListener(this);

    b = new JComboBox<String>(s1);
    add(b);
    b.setBounds(250, 180, 70, 50);
    b.setVisible(false);

    b.addItemListener(this);

    c = new JComboBox<String>(s1);
    add(c);
    c.setBounds(250, 240, 70, 50);
    c.setVisible(false);

    c.addItemListener(this);

    nuts.addActionListener(this);

    bis = new Button("Biscuits");
    bis.setBounds(20, 300, 100, 30);
    add(bis);
    bis.addActionListener(this);
    bis.setBackground(Color.YELLOW);

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

    va.addItemListener(this);
    cho.addItemListener(this);
    stra.addItemListener(this);

    amoun = new JComboBox<String>(s1);
    add(amoun);
    amoun.setBounds(300, 320, 70, 50);
    amoun.setVisible(false);

    amoun.addItemListener(this);

    h = new JComboBox<String>(s1);
    add(h);
    h.setBounds(250, 386, 70, 50);
    h.setVisible(false);

    h.addItemListener(this);

    j = new JComboBox<String>(s1);
    add(j);
    j.setBounds(300, 440, 70, 50);
    j.setVisible(false);

    j.addItemListener(this);

    cup= new Button("Cakes");
    cup.setBounds(20, 500, 100, 30);
    add(cup);
    cup.addActionListener(this);
    cup.setBackground(Color.YELLOW);

    vanilla = new Checkbox("Vanilla");
    vanilla.setBounds(150, 500, 100, 100);
    chunk = new Checkbox("Chocolate");
    chunk.setBounds(150, 560, 100, 100);
    add(vanilla);
    add(chunk);

    butter = new Checkbox("Buttercream");
    butter.setBounds(320, 500, 150, 100);
    cream = new Checkbox("Cream Cheese");
    cream.setBounds(320, 560, 150, 100);
    add(butter);
    add(cream);

    vanilla.setVisible(false);
    chunk.setVisible(false);
    butter.setVisible(false);
    cream.setVisible(false);

    vanilla.addItemListener(this);
    chunk.addItemListener(this);
    butter.addItemListener(this);
    cream.addItemListener(this);

    amou = new JComboBox<String>(s1);
    add(amou);
    amou.setBounds(250, 520, 70, 50);
    amou.setVisible(false);

    amou.addItemListener(this);

    d = new JComboBox<String>(s1);
    add(d);
    d.setBounds(250, 580, 70, 50);
    d.setVisible(false);

    d.addItemListener(this);

    addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
         System.exit(0);
        }
    } );
  }

  public void actionPerformed(ActionEvent e){
    Object src = e.getSource();

    if(src == finalSumbit){
      JFrame j = new JFrame("Receipt");
      j.setVisible(true);
      j.setSize(300, 300);
      JTextArea h = new JTextArea();
      j.add(h);
      h.setBounds(0, 0, 300, 300);
      h.setBackground(Color.PINK);
      moneyAmount();
      h.append("Your order is:\n"+a.getText() + "\nTotal is " + totalOrder + "\n" + u.getText()+ "\n\nHave a lovely day!");
    }

    if(src == submit){
      a.append(nut.getText()+"\n");
      nut.setText("Item Submited!");
    }

    if(src == nuts){
      van.setVisible(true);
      choc.setVisible(true);
      straw.setVisible(true);
    }

    if(src == bis) {
      va.setVisible(true);
      cho.setVisible(true);
      stra.setVisible(true);
    }

    if(src == cup){
      vanilla.setVisible(true);
      chunk.setVisible(true);
    }
  }

  public void itemStateChanged(ItemEvent e){

    if(e.getSource() == van) {
    boolean checked = van.getState();
      if(checked == true) {
        amount.setVisible(true);
      } else if (checked == false) {
        amount.setVisible(false);
        nut.setText("Order:");
      }
    }

    if(e.getSource() == choc) {
      boolean checked = choc.getState();
        if(checked == true) {
          b.setVisible(true);
        } else if (checked == false) {
          b.setVisible(false);
          nut.setText("Order:");
        }
    }

    if(e.getSource() == straw) {
      boolean checked = straw.getState();
        if(checked == true) {
          c.setVisible(true);
        } else if (checked == false) {
          c.setVisible(false);
        }
    }

    if(e.getSource() == amount) {
      if(amount.getSelectedItem() == s1[1]){
        nut.setText(amount.getSelectedItem() + " Vanilla Donut .... " + s2[0]);
      }
      if(amount.getSelectedItem() == s1[2]) {
        nut.setText(amount.getSelectedItem() + " Vanilla Donuts .... " + s2[1]);
      }
      if(amount.getSelectedItem() == s1[3]) {
        nut.setText(amount.getSelectedItem() + " Vanilla Donuts .... " + s2[2]);
      }
      if(amount.getSelectedItem() == s1[4]) {
        nut.setText(amount.getSelectedItem() + " Vanilla Donuts .... " + s2[3]);
      }
      if(amount.getSelectedItem() == s1[5]) {
        nut.setText(amount.getSelectedItem() + " Vanilla Donuts .... " + s2[4]);
      }
    }

    if(e.getSource() == b) {
      if(b.getSelectedItem() == s1[1]){
        nut.setText(b.getSelectedItem() + " Chocolate Donut .... " + s2[0]);
      }
      if(b.getSelectedItem() == s1[2]) {
        nut.setText(b.getSelectedItem() + " Chocolate Donuts .... " + s2[1]);
      }
      if(b.getSelectedItem() == s1[3]) {
        nut.setText(b.getSelectedItem() + " Chocolate Donuts .... " + s2[2]);
      }
      if(b.getSelectedItem() == s1[4]) {
        nut.setText(b.getSelectedItem() + " Chocolate Donuts .... " + s2[3]);
      }
      if(b.getSelectedItem() == s1[5]) {
        nut.setText(b.getSelectedItem() + " Chocolate Donuts .... " + s2[4]);
      }
    }

    if(e.getSource() == c) {
      if(c.getSelectedItem() == s1[1]){
        nut.setText(c.getSelectedItem() + " Strawberry Donut .... " + s2[0]);
      }
      if(c.getSelectedItem() == s1[2]) {
        nut.setText(c.getSelectedItem() + " Strawberry Donuts .... " + s2[1]);
      }
      if(c.getSelectedItem() == s1[3]) {
        nut.setText(c.getSelectedItem() + " Strawberry Donuts .... " + s2[2]);
      }
      if(c.getSelectedItem() == s1[4]) {
        nut.setText(c.getSelectedItem() + " Strawberry Donuts .... " + s2[3]);
      }
      if(c.getSelectedItem() == s1[5]) {
        nut.setText(c.getSelectedItem() + " Strawberry Donuts .... " + s2[4]);
      }
    }

    if(e.getSource() == va) {
      boolean checked = va.getState();
        if(checked == true) {
          amoun.setVisible(true);
        } else if (checked == false) {
          amou.setVisible(false);
          nut.setText("Order:");
        }
    }

    if(e.getSource() == cho){
      boolean checked = cho.getState();
        if(checked == true) {
          h.setVisible(true);
        } else if (checked == false) {
          h.setVisible(false);
          nut.setText("Order:");
        }
    }

    if(e.getSource() == stra) {
      boolean checked = stra.getState();
      if(checked == true) {
        j.setVisible(true);
      } else if (checked == false) {
        j.setVisible(false);
        nut.setText("Order:");
      }
    }

    if(e.getSource() == amoun){
      if(amoun.getSelectedItem() == s1[1]){
        nut.setText(amoun.getSelectedItem() + " Snickerdoodle .... " + s2[0]);
      }
      if(amoun.getSelectedItem() == s1[2]) {
        nut.setText(amoun.getSelectedItem() + " Snickerdoodles .... " + s2[1]);
      }
      if(amoun.getSelectedItem() == s1[3]) {
        nut.setText(amoun.getSelectedItem() + " Snickerdoodles .... " + s2[2]);
      }
      if(amoun.getSelectedItem() == s1[4]) {
        nut.setText(amoun.getSelectedItem() + " Snickerdoodles .... " + s2[3]);
      }
      if(amoun.getSelectedItem() == s1[5]) {
        nut.setText(amoun.getSelectedItem() + " Snickerdoodles .... " + s2[4]);
      }
    }

    if(e.getSource()== h){
      if(h.getSelectedItem() == s1[1]){
        nut.setText(h.getSelectedItem() + " Sugar Biscuit .... " + s2[0]);
      }
      if(h.getSelectedItem() == s1[2]) {
        nut.setText(h.getSelectedItem() + " Sugar Biscuits .... " + s2[1]);
      }
      if(h.getSelectedItem() == s1[3]) {
        nut.setText(h.getSelectedItem() + " Sugar Biscuits .... " + s2[2]);
      }
      if(h.getSelectedItem() == s1[4]) {
        nut.setText(h.getSelectedItem() + " Sugar Biscuits .... " + s2[3]);
      }
      if(h.getSelectedItem() == s1[5]) {
        nut.setText(h.getSelectedItem() + " Sugar Biscuits .... " + s2[4]);
      }
    }

    if(e.getSource() == j) {
      if(j.getSelectedItem() == s1[1]){
        nut.setText(j.getSelectedItem() + " Ginger Snap .... " + s2[0]);
      }
      if(j.getSelectedItem() == s1[2]) {
        nut.setText(j.getSelectedItem() + " Ginger Snaps .... " + s2[1]);
      }
      if(j.getSelectedItem() == s1[3]) {
        nut.setText(j.getSelectedItem() + " Ginger Snaps .... " + s2[2]);
      }
      if(j.getSelectedItem() == s1[4]) {
        nut.setText(j.getSelectedItem() + " Ginger Snaps .... " + s2[3]);
      }
      if(j.getSelectedItem() == s1[5]) {
        nut.setText(j.getSelectedItem() + " Ginger Snaps .... " + s2[4]);
      }
    }

    if(e.getSource() == vanilla) {
      boolean checked = vanilla.getState();
        if(checked == true) {
          amou.setVisible(true);
          butter.setVisible(true);
          cream.setVisible(true);
        } else if (checked == false) {
          amou.setVisible(false);
          butter.setVisible(false);
          cream.setVisible(false);
          nut.setText("Order:");
        }
    }

    if(e.getSource() == chunk){
      boolean checked = chunk.getState();
        if(checked == true) {
          d.setVisible(true);
          butter.setVisible(true);
          cream.setVisible(true);
        } else if (checked == false) {
          d.setVisible(false);
          butter.setVisible(false);
          cream.setVisible(false);
          nut.setText("Order:");
        }
    }

    if(e.getSource() == butter) {
      boolean checked = butter.getState();
        if(checked == true) {
          nut.setText("Buttercream Frosting");
        } else if (checked == false) {
          nut.setText("Order:");
        }
    }

    if(e.getSource() == cream){
      boolean checked = cream.getState();
        if(checked == true) {
          nut.setText("Cream Cheese Frosting");
        } else if (checked == false) {
          nut.setText("Order:");
        }
    }

    if(e.getSource() == amou) {
      if(amou.getSelectedItem() == s1[1]){
        nut.setText(amou.getSelectedItem() + " Vanilla Cake .... " + s2[2]);
      }
      if(amou.getSelectedItem() == s1[2]) {
        nut.setText(amou.getSelectedItem() + " Vanilla Cakes .... " + s2[3]);
      }
      if(amou.getSelectedItem() == s1[3]) {
        nut.setText(amou.getSelectedItem() + " Vanilla Cakes .... " + s2[3]);
      }
      if(amou.getSelectedItem() == s1[4]) {
        nut.setText(amou.getSelectedItem() + " Vanilla Cakes .... " + s2[4]);
      }
      if(amou.getSelectedItem() == s1[5]) {
        nut.setText(amou.getSelectedItem() + " Vanilla Cakes .... " + s2[4]);
      }
    }

    if(e.getSource() == d){
      if(d.getSelectedItem() == s1[1]){
        nut.setText(d.getSelectedItem() + " Chocolate Cake .... " + s2[2]);
      }
      if(d.getSelectedItem() == s1[2]) {
        nut.setText(d.getSelectedItem() + " Chocolate Cakes .... " + s2[3]);
      }
      if(d.getSelectedItem() == s1[3]) {
        nut.setText(d.getSelectedItem() + " Chocolate Cakes .... " + s2[3]);
      }
      if(d.getSelectedItem() == s1[4]) {
        nut.setText(d.getSelectedItem() + " Chocolate Cakes .... " + s2[4]);
      }
      if(d.getSelectedItem() == s1[5]) {
        nut.setText(d.getSelectedItem() + " Chocolate Cakes .... " + s2[4]);
      }
    }
  }

  public void moneyAmount() {

    if(amount.getSelectedItem() == s1[1]) {
      totalOrder = totalOrder + s2[0];
    }
    if(amount.getSelectedItem() == s1[2]) {
      totalOrder = totalOrder + s2[1];
    }
    if(amount.getSelectedItem() == s1[3]) {
      totalOrder = totalOrder + s2[2];
    }
    if(amount.getSelectedItem() == s1[4]) {
      totalOrder = totalOrder + s2[3];
    }
    if(amount.getSelectedItem() == s1[5]){
      totalOrder = totalOrder + s2[4];
    }

    if(b.getSelectedItem() == s1[1]) {
      totalOrder = totalOrder + s2[0];
    }
    if(b.getSelectedItem() == s1[2]) {
      totalOrder = totalOrder + s2[1];
    }
    if(b.getSelectedItem() == s1[3]) {
      totalOrder = totalOrder + s2[2];
    }
    if(b.getSelectedItem() == s1[4]) {
      totalOrder = totalOrder + s2[3];
    }
    if(b.getSelectedItem() == s1[5]) {
      totalOrder = totalOrder + s2[4];
    }

    if(c.getSelectedItem() == s1[1]) {
      totalOrder = totalOrder + s2[0];
    }
    if(c.getSelectedItem() == s1[2]) {
      totalOrder = totalOrder + s2[1];
    }
    if(c.getSelectedItem() == s1[3]) {
      totalOrder = totalOrder + s2[2];
    }
    if(c.getSelectedItem() == s1[4]) {
      totalOrder = totalOrder + s2[3];
    }
    if(c.getSelectedItem() == s1[5]) {
      totalOrder = totalOrder + s2[4];
    }

    if(amoun.getSelectedItem() == s1[1]) {
      totalOrder = totalOrder + s2[0];
    }
    if(amoun.getSelectedItem() == s1[2]) {
      totalOrder = totalOrder + s2[1];
    }
    if(amoun.getSelectedItem() == s1[3]) {
      totalOrder = totalOrder + s2[2];
    }
    if(amoun.getSelectedItem() == s1[4]) {
      totalOrder = totalOrder + s2[3];
    }
    if(amoun.getSelectedItem() == s1[5]) {
      totalOrder = totalOrder + s2[4];
    }

    if(h.getSelectedItem() == s1[1]) {
      totalOrder = totalOrder + s2[0];
    }
    if(h.getSelectedItem() == s1[2]) {
      totalOrder = totalOrder + s2[1];
    }
    if(h.getSelectedItem() == s1[3]) {
      totalOrder = totalOrder + s2[2];
    }
    if(h.getSelectedItem() == s1[4]) {
      totalOrder = totalOrder + s2[3];
    }
    if(h.getSelectedItem() == s1[5]) {
      totalOrder = totalOrder + s2[4];
    }

    if(j.getSelectedItem() == s1[1]) {
      totalOrder = totalOrder + s2[0];
    }
    if(j.getSelectedItem() == s1[2]) {
      totalOrder = totalOrder + s2[1];
    }
    if(j.getSelectedItem() == s1[3]) {
      totalOrder = totalOrder + s2[2];
    }
    if(j.getSelectedItem() == s1[4]) {
      totalOrder = totalOrder + s2[3];
    }
    if(j.getSelectedItem() == s1[5]) {
      totalOrder = totalOrder + s2[4];
    }

    if(amou.getSelectedItem() == s1[1]) {
      totalOrder = totalOrder + s2[2];
    }
    if(amou.getSelectedItem() == s1[2]) {
      totalOrder = totalOrder + s2[3];
    }
    if(amou.getSelectedItem() == s1[3]) {
      totalOrder = totalOrder + s2[3];
    }
    if(amou.getSelectedItem() == s1[4]) {
      totalOrder = totalOrder + s2[4];
    }
    if(amou.getSelectedItem() == s1[5]) {
      totalOrder = totalOrder + s2[4];
    }

    if(d.getSelectedItem() == s1[1]) {
      totalOrder = totalOrder + s2[2];
    }
    if(d.getSelectedItem() == s1[2]) {
      totalOrder = totalOrder + s2[3];
    }
    if(d.getSelectedItem() == s1[3]) {
      totalOrder = totalOrder + s2[3];
    }
    if(d.getSelectedItem() == s1[4]) {
      totalOrder = totalOrder + s2[4];
    }
    if(d.getSelectedItem() == s1[5]) {
      totalOrder = totalOrder + s2[4];
    }

  }

  public static void main(String[] args) {
    Restaurant myWindow = new Restaurant();
    myWindow.setSize(800,700);
    myWindow.setVisible(true);
  }

}
