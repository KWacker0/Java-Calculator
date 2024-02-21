package Project;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class master {


    public static void main(String[] args) {
        //creates my custom calc logic class 
        String num1S;
        String num2S;
        double num1;
        double num2;
        CalcLogic calculator = new CalcLogic();

        // Sets up the Frame
        JFrame frame = new JFrame("Calculator");
        JPanel button = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,1080);

        JMenuBar menuBar = new JMenuBar();
        JMenu Item1 = new JMenu("Report A Problem");
        JMenu Item2 = new JMenu("How to Use");
        menuBar.add(Item1);
        menuBar.add(Item2);
        JMenuItem MItem1 = new JMenuItem("Github");
        JMenuItem MItem2 = new JMenuItem("Email");
        JMenuItem M2Item1 = new JMenuItem("This is a Calculator Figure it out");
        Item1.add(MItem1);
        Item1.add(MItem2);
        Item2.add(M2Item1);
        JTextArea textArea = new JTextArea();

        //Extablishes all the buttons 
        Button b1 = new Button("1");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append(b1.getLabel());;
            }
        });
        Button b2 = new Button("2");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append(b2.getLabel());;
            }
        });
        Button b3 = new Button("3");
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append(b3.getLabel());;
            }
        });
        Button b4 = new Button("4");
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append(b4.getLabel());;
            }
        });
        Button b5 = new Button("5");
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append(b5.getLabel());;
            }
        });
        Button b6 = new Button("6");
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append(b6.getLabel());;
            }
    });
        Button b7 = new Button("7");
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append(b7.getLabel());;
            }
        });
        Button b8 = new Button("8");
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append(b8.getLabel());;
            }
        });
        Button b9 = new Button("9");
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append(b9.getLabel());;
            }
        });
        Button b0 = new Button("0");
        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append(b0.getLabel());;
            }
        });
        Button bAdd = new Button(" + ");
        bAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               // num1S = textArea.getText();
            }
        });
        Button bMin = new Button(" - ");
        bMin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append(bMin.getLabel());;
            }
        });
        Button bEqu = new Button(" = ");
        bEqu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        Button bMult = new Button(" X ");
        bMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append(bMult.getLabel());;
            }
        });
        Button bDiv = new Button(" / ");
        bDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append(bDiv.getLabel());;
            }
        });
        Button bLPar = new Button("(");
        bLPar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append(bLPar.getLabel());;
            }
        });
        Button bRPar = new Button(")");
        bRPar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append(bRPar.getLabel());;
            }
        });


        //Sets up the are that will be used to make calsulator look
        GridLayout buttonZone = new GridLayout(5,4);
        // Adds all the buttons to the Button Panel
        button.setLayout(buttonZone);
        button.add(b1);
        button.add(b2);
        button.add(b3);
        button.add(bMult);
        button.add(b4);
        button.add(b5);
        button.add(b6);
        button.add(bAdd);
        button.add(b7);
        button.add(b8);
        button.add(b9);
        button.add(bMin);
        button.add(b0);
        button.add(bLPar);
        button.add(bRPar);
        button.add(bDiv);
        button.add(bEqu);

        frame.getContentPane().add(BorderLayout.NORTH, textArea);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.getContentPane().add(BorderLayout.SOUTH, menuBar);
        
        frame.setVisible(true);
    }
}