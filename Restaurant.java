import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Restaurant extends Frame implements ActionListener, ItemListener { //inheritance also initializes ActionListener and ItemListener
  Button nuts;
  Button bis; //initializes all these objects
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
  JLabel instruct;
  JLabel blah;
  JLabel hh;

  String s1[] = {"0","1", "2","3", "4", "5"}; //declare these dudes here so the entire program can use them
  Double s2[] = {2.01, 3.01, 4.01, 5.01, 6.01};
  Double totalOrder = 0.0;

  public Restaurant() { //the class that the main method will be using

    setLayout(null); //null means each object added to the frame can be manually set
    setBackground(Color.ORANGE);

    a=new JTextArea(); //constructor for JTextArea
    a.setBounds(600,100,150,200);
    add(a);
    a.setVisible(false); //all the items the user picks goes to this JTextArea and that is what is printed on the Receipt
    //makes it easer to print the Receipt

    instruct = new JLabel("You need to 'submit item to order' after choosing an item amount."); //constructor for JLabel
    add(instruct);
    instruct.setBounds(140, 40, 700, 20);
    instruct.setFont(new Font("Comic Sans", Font.BOLD, 15));
    instruct.setForeground(Color.RED);

    JLabel instruct2 = new JLabel("Otherwise the item will not be added."); //could not do multiple lines with a label so made multiple labels
    add(instruct2);
    instruct2.setBounds(230, 60, 700, 20);
    instruct2.setFont(new Font("Comic Sans", Font.BOLD, 15));
    instruct2.setForeground(Color.RED);

    blah = new JLabel("Comments are automatically");
    add(blah);
    blah.setBounds(550, 250, 200, 20);

    hh = new JLabel("submitted.");
    add(hh);
    hh.setBounds(560, 270, 200, 20);

    finalSumbit = new Button("Submit your Order"); //finalSumbit is the button that creates the Receipt
    finalSumbit.setBounds(550, 500, 200, 30);
    add(finalSumbit);
    finalSumbit.addActionListener(this);
    finalSumbit.setBackground(Color.MAGENTA);

    u= new JTextArea(); //constructor for JTextArea
    u.setBounds(550, 300, 200, 150);
    add(u);
    u.append("Other Comments or Concerns?\n");

    submit = new Button("Sumbit Item to Order"); //this button is used to add to JTextArea a
    submit.setBounds(550, 150, 200, 30);
    add(submit);
    submit.setBackground(Color.MAGENTA);

    submit.addActionListener(this);

    nuts = new Button("Donuts"); //this button is used to introduce items
    nuts.setBounds(20, 100, 100, 30);
    add(nuts);
    nuts.setBackground(Color.YELLOW);

    nut = new JLabel("Order:"); //constructor for JLabel
    add(nut);
    nut.setBounds(550, 50, 250, 300);

    van = new Checkbox("Vanilla"); //constructor for Checkboxes
    van.setBounds(150, 100, 100, 100); //checkboxes allow the user to pick between any of the falvors
    choc = new Checkbox("Chocolate"); //JComboBox only lets the user pick one- which is why Checkbox works better
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

    amount = new JComboBox<String>(s1); //constructor for a JComboBox
    add(amount);
    amount.setBounds(250, 120, 70, 50); //the JComboBoxes are being used for choosing an amount of an item
    amount.setVisible(false);

    amount.addItemListener(this);

    b = new JComboBox<String>(s1); //constructor for a JComboBox
    add(b);
    b.setBounds(250, 180, 70, 50);
    b.setVisible(false);

    b.addItemListener(this);

    c = new JComboBox<String>(s1); //constructor for a JComboBox
    add(c);
    c.setBounds(250, 240, 70, 50);
    c.setVisible(false);

    c.addItemListener(this);

    nuts.addActionListener(this);

    bis = new Button("Biscuits"); //constructor for a button. Button bis does the same as nuts
    bis.setBounds(20, 300, 100, 30);
    add(bis);
    bis.addActionListener(this);
    bis.setBackground(Color.YELLOW);

    va = new Checkbox("Snickerdoodle"); //constructor for checkboxes
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

    amoun = new JComboBox<String>(s1); //constructor for a JComboBox
    add(amoun);
    amoun.setBounds(300, 320, 70, 50);
    amoun.setVisible(false);

    amoun.addItemListener(this);

    h = new JComboBox<String>(s1); //constructor for a JComboBox
    add(h);
    h.setBounds(250, 386, 70, 50);
    h.setVisible(false);

    h.addItemListener(this);

    j = new JComboBox<String>(s1); //constructor for a JComboBox
    add(j);
    j.setBounds(300, 440, 70, 50);
    j.setVisible(false);

    j.addItemListener(this);

    cup= new Button("Cakes"); //constructor for new button. does the same as bis and nuts
    cup.setBounds(20, 500, 100, 30);
    add(cup);
    cup.addActionListener(this);
    cup.setBackground(Color.YELLOW);

    vanilla = new Checkbox("Vanilla"); //constructor for a Checkbox
    vanilla.setBounds(150, 500, 100, 100);
    chunk = new Checkbox("Chocolate");
    chunk.setBounds(150, 560, 100, 100);
    add(vanilla);
    add(chunk);

    butter = new Checkbox("Buttercream"); //constructor for a checkbox
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

    amou = new JComboBox<String>(s1); //constructor for a JComboBox
    add(amou);
    amou.setBounds(250, 520, 70, 50);
    amou.setVisible(false);

    amou.addItemListener(this);

    d = new JComboBox<String>(s1); //constructor for a JComboBox
    add(d);
    d.setBounds(250, 580, 70, 50);
    d.setVisible(false);

    d.addItemListener(this);

    addWindowListener(new WindowAdapter() { //only two things could be implemented in the inheritance decleration
        public void windowClosing(WindowEvent e) { //declaring it within the class is the only way to do it
         System.exit(0);
        }
    } );
  }

  public void actionPerformed(ActionEvent e){ //because all the ActionListener are (this) a method can be made to encompass all of them
    Object src = e.getSource();

    if(src == finalSumbit){ //finalSumbit makes a new frame that takes the items printed into JTextArea a and prints it on the frame
      JFrame j = new JFrame("Receipt");
      j.setVisible(true);
      j.setSize(300, 300);
      JTextArea h = new JTextArea();
      j.add(h);
      h.setBounds(0, 0, 300, 300);
      h.setBackground(Color.PINK);
      moneyAmount(); //a method created to calculate the price of the order
      h.append("Your order is:\n"+a.getText() + "\nTotal is " + totalOrder + "\n" + u.getText()+ "\n\nHave a lovely day!");
    }

    if(src == submit){ //submit takes whatever is the JLabel and puts it into JTextArea a
      a.append(nut.getText()+"\n");
      nut.setText("Item Submited!");
    }

    if(src == nuts){ //the button nuts is clicked and the flavor checkboxes appear
      van.setVisible(true);
      choc.setVisible(true);
      straw.setVisible(true);
    }

    if(src == bis) { //the button bis is clicked and the flavor checkboxes appear
      va.setVisible(true);
      cho.setVisible(true);
      stra.setVisible(true);
    }

    if(src == cup){ //the button cup is clicked and the flavor checkboxes appear
      vanilla.setVisible(true);
      chunk.setVisible(true);
    }
  }

  public void itemStateChanged(ItemEvent e){ //ActionListener is for buttons and ItemListener is for most other things

    if(e.getSource() == van) { //if the checkbox van is checked- then the JComboBoxes appears. Which is the amount of the item
    boolean checked = van.getState();
      if(checked == true) {
        amount.setVisible(true);
      } else if (checked == false) {
        amount.setVisible(false); //if the checkbox is not clicked- then the JComboBox does not need to be there
        nut.setText("Order:");
      }
    }

    if(e.getSource() == choc) { //if the checkbox choc is checked- then the JComboBoxes appears.
      boolean checked = choc.getState();
        if(checked == true) {
          b.setVisible(true);
        } else if (checked == false) {
          b.setVisible(false);
          nut.setText("Order:");
        }
    }

    if(e.getSource() == straw) { //if the checkbox straw is checked- then the JComboBoxes appears.
      boolean checked = straw.getState();
        if(checked == true) {
          c.setVisible(true);
        } else if (checked == false) {
          c.setVisible(false);
        }
    }

    if(e.getSource() == amount) { //JComboBox adds how much of an item the user is getting to JLabel nut
      if(amount.getSelectedItem() == s1[1]){
        nut.setText(amount.getSelectedItem() + " Vanilla Donut .... " + s2[0]);
      }
      /*
      an if statement is used for each of the amount options because a different amount of an item
      has a different price. I couldn't figure out a way to streamline this. These if statements
      are used for each falvor option available.
      */
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

    if(e.getSource() == b) { //JComboBox adds how much of an item the user is getting to JLabel nut
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

    if(e.getSource() == c) { //JComboBox adds how much of an item the user is getting to JLabel nut
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

    if(e.getSource() == va) { //if the checkbox va is checked- then the JComboBoxes appears.
      boolean checked = va.getState();
        if(checked == true) {
          amoun.setVisible(true);
        } else if (checked == false) {
          amou.setVisible(false);
          nut.setText("Order:");
        }
    }

    if(e.getSource() == cho){ //if the checkbox cho is checked- then the JComboBoxes appears.
      boolean checked = cho.getState();
        if(checked == true) {
          h.setVisible(true);
        } else if (checked == false) {
          h.setVisible(false);
          nut.setText("Order:");
        }
    }

    if(e.getSource() == stra) { //if the checkbox stra is checked- then the JComboBoxes appears.
      boolean checked = stra.getState();
      if(checked == true) {
        j.setVisible(true);
      } else if (checked == false) {
        j.setVisible(false);
        nut.setText("Order:");
      }
    }

    if(e.getSource() == amoun){ //JComboBox adds how much of an item the user is getting to JLabel nut
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

    if(e.getSource()== h){ //JComboBox adds how much of an item the user is getting to JLabel nut
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

    if(e.getSource() == j) { //JComboBox adds how much of an item the user is getting to JLabel nut
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

    if(e.getSource() == vanilla) { //if the checkbox vanilla is checked- then the JComboBoxes appears.
      boolean checked = vanilla.getState();
        if(checked == true) {
          amou.setVisible(true);
        } else if (checked == false) {
          amou.setVisible(false);
          nut.setText("Order:");
        }
    }

    if(e.getSource() == chunk){ //if the checkbox chunk is checked- then the JComboBoxes appears.
      boolean checked = chunk.getState();
        if(checked == true) {
          d.setVisible(true);
        } else if (checked == false) {
          d.setVisible(false);
          nut.setText("Order:");
        }
    }

    if(e.getSource() == butter) { //if the checkbox butter is checked- then it is added to the label nut.
      boolean checked = butter.getState(); //frosting does not cost anything so it does not need an amount (JComboBox)
        if(checked == true) {
          nut.setText("Buttercream Frosting");
        } else if (checked == false) {
          nut.setText("Order:");
        }
    }

    if(e.getSource() == cream){ //if the checkbox butter is checked- then it is added to the label nut.
      boolean checked = cream.getState();
        if(checked == true) {
          nut.setText("Cream Cheese Frosting");
        } else if (checked == false) {
          nut.setText("Order:");
        }
    }

    if(e.getSource() == amou) { //JComboBox adds how much of an item the user is getting to JLabel nut
      if(amou.getSelectedItem() == s1[1]){
        nut.setText(amou.getSelectedItem() + " Vanilla Cake .... " + s2[2]);
        butter.setVisible(true);
        cream.setVisible(true);
      }
      if(amou.getSelectedItem() == s1[2]) {
        nut.setText(amou.getSelectedItem() + " Vanilla Cakes .... " + s2[3]);
        butter.setVisible(true);
        cream.setVisible(true);
      }
      if(amou.getSelectedItem() == s1[3]) {
        nut.setText(amou.getSelectedItem() + " Vanilla Cakes .... " + s2[3]);
        butter.setVisible(true);
        cream.setVisible(true);
      }
      if(amou.getSelectedItem() == s1[4]) {
        nut.setText(amou.getSelectedItem() + " Vanilla Cakes .... " + s2[4]);
        butter.setVisible(true);
        cream.setVisible(true);
      }
      if(amou.getSelectedItem() == s1[5]) {
        nut.setText(amou.getSelectedItem() + " Vanilla Cakes .... " + s2[4]);
        butter.setVisible(true);
        cream.setVisible(true);
      }
    }

    if(e.getSource() == d){ //JComboBox adds how much of an item the user is getting to JLabel nut
      if(d.getSelectedItem() == s1[1]){
        nut.setText(d.getSelectedItem() + " Chocolate Cake .... " + s2[2]);
        butter.setVisible(true);
        cream.setVisible(true);
      }
      if(d.getSelectedItem() == s1[2]) {
        nut.setText(d.getSelectedItem() + " Chocolate Cakes .... " + s2[3]);
        butter.setVisible(true);
        cream.setVisible(true);
      }
      if(d.getSelectedItem() == s1[3]) {
        nut.setText(d.getSelectedItem() + " Chocolate Cakes .... " + s2[3]);
        butter.setVisible(true);
        cream.setVisible(true);
      }
      if(d.getSelectedItem() == s1[4]) {
        nut.setText(d.getSelectedItem() + " Chocolate Cakes .... " + s2[4]);
        butter.setVisible(true);
        cream.setVisible(true);
      }
      if(d.getSelectedItem() == s1[5]) {
        nut.setText(d.getSelectedItem() + " Chocolate Cakes .... " + s2[4]);
        butter.setVisible(true);
        cream.setVisible(true);
      }
    }
  }

  public void moneyAmount() {
    /*
    moneyAmount is a method created to calculate how much a user owns.
    It consits of MANY if statements- again I could not find a way to streamline it.
    There is an if statement for each of the amount options- which is 5. And there
    is an if statement for each checkbox.
    */
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
    Restaurant myWindow = new Restaurant(); //creates a new frame that does the class Restaurant 
    myWindow.setSize(800,700);
    myWindow.setVisible(true);
    myWindow.setTitle("Welcome to the online ordering system of Sweets and Treats!");
  }

}
