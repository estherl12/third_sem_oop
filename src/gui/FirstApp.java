package gui;
import java.awt.*;
public class FirstApp extends Frame{
    FirstApp(){
        Button btn1 = new Button("click");
        btn1.setBounds(100,200,50,100);
        add(btn1);
        setLayout(null);
        setSize(500,500);
        setVisible(true);
    }
}
