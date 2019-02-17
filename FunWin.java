import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class FunWin extends Frame implements WindowListener,ActionListener {
        TextField text = new TextField(40);
        Button b;
        Button b2;
        Button b3;
        Button b4;
        Button b5;
        Button b6;
        private int numClicks = 0;
        private String choice = "";
        Gradebook g;

        public FunWin(String title) {


                super(title);
                setLayout(new FlowLayout());
                setBackground(Color.blue);
                addWindowListener(this);

                //Create Gradebook
                g = new Gradebook("grades.txt");

                b = new Button("Top Grade");
                add(b);

                b2 = new Button("Low Grade");
                add(b2);

                b3= new Button("Mean Grade");
                add(b3);

                b4= new Button("Grade Spread");
                add(b4);

                b5 = new Button("Teacher");
                add(b5);

                b6 = new Button("Student Roster");
                add(b6);

                add(text);
                b.setBackground(Color.red);
                Color c = new Color(2,7,80);
                b2.setBackground(Color.red);
                b3.setBackground(Color.red);
                b4.setBackground(Color.red);
                b5.setBackground(Color.red);
                b6.setBackground(Color.red);
                b.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);
                b4.addActionListener(this);
                b5.addActionListener(this);
                b6.addActionListener(this);
        }

        public static void main(String[] args) {
                FunWin myWindow = new FunWin("Buttons Examples");
                myWindow.setSize(400,400);
                myWindow.setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
          Object src = e.getSource();
            if (src == b){
              text.setText(Double.toString(g.topGrade()));
            }
            if (src == b2){
              text.setText(Double.toString(g.lowGrade()));
            }
            if (src == b3) {
              text.setText(Double.toString(g.meanGrade()));
            }
           if(src == b4){

            int[] grades = g.gradeSpread();
          ;
              String x = "";

              String[] _V = new String[5];
              _V[0] = "A";
              _V[1] = "B";
              _V[2] = "C";
              _V[3] = "D";
              _V[4] = "F";

              for (int i=0; i < grades.length; i++) {
                if (i == 0){
                  x = "There is " + grades[i] +" "+ _V[i] +"'s ";
                }
                if(i == 1) {
                  x += " "+grades[i] +" "+ _V[i] +"'s ";
                }
                if(i==2){
                  x += " " + grades[i] +" "+ _V[i] +"'s ";
                }
                if(i==3){
                  x += " " + grades[i] +" "+ _V[i] +"'s ";
                }
                if(i==4){
                  x += " " + grades[i] +" "+ _V[i] +"'s ";
                }
              }
              text.setText(x);


            }
            if (src == b5){
              text.setText(g.getTeacher().toString());
            }
            if(src == b6){
              text.setText(g.getStudents().toString());
            }

        }

        public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
        }

        public void windowOpened(WindowEvent e) {}
        public void windowActivated(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}
        public void windowClosed(WindowEvent e) {}

}
