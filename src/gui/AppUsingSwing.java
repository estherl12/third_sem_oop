package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppUsingSwing extends JFrame implements ActionListener{

    JButton btm1;
    JLabel lbl_output;
    AppUsingSwing(){



        getContentPane().setBackground(Color.cyan);
        Font f1 = new Font("Times New Roman",Font.ITALIC,30);   //of awt package
        Font f2 = new Font("Times New Roman",Font.BOLD,20);

        JLabel lbl_username = new JLabel(); //jlabel("Enter your name:")
        lbl_username.setForeground(Color.blue); //blue is a static variable of color class.
        lbl_username.setFont(f1);  //set font is method of jlabel with parameter object
        lbl_username.setText("Enter your name:");
        lbl_username.setBounds(50,50,250,50);


        JTextField txtfield_username = new JTextField();
        txtfield_username.setBounds(280,60,150,25);
        add(txtfield_username);
        add(lbl_username);

         lbl_output=new JLabel();
        lbl_output.setBounds(100,450,200,60);
        add(lbl_output);

         btm1 = new JButton("Submitt");
        btm1.setBounds(50 , 110,90,50);
        add(btm1);

        btm1.addActionListener(this);

        setLayout(null);
        setVisible(true);
        setSize(500,700);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==btm1){
            lbl_output.setText("submit ma click vayo! hurray");

        }

    }
}
