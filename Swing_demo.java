//package swing_demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



class MyFrame extends JFrame implements ActionListener
{
    JButton b;
    JLabel l;
    int count=0;
    MyFrame(){
    super("Swing Demo");
    setLayout(new FlowLayout());
    l=new JLabel("clicked" + count +"Times");
    b=new JButton("Click");
    add(l);
    add(b);
    b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        count++;
        l.setText("clicked" + count +"Times");
        
    }
}

public class Swing_demo {

    public static void main(String[] args) {
        
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}