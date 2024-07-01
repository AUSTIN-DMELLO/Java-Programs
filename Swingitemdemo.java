import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener
{
    JFrame f;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;
    JLabel l1,l2;
    MyFrame()
    {
        super("Demo");
        f = new JFrame();
        l1 = new JLabel("Enter number 1");
        add(l1);
        t1=new JTextField();
        t1.setLocation(200,100);
        add(t1);
        t1.setColumns(20);

        l2 = new JLabel("Enter number 2");
        add(l2);
        t2=new JTextField();
        add(t2);
        t2.setColumns(20);
        
        b1 = new JButton("Add");
        b1.setBackground(Color.RED);
        add(b1);
        b2 = new JButton("Sub");
        b2.setBackground(Color.MAGENTA);
        add(b2);

        b3 = new JButton("Mul");
        add(b3);
        b3.setBackground(Color.ORANGE);
        b4 = new JButton("Div");
        b4.setBackground(Color.PINK);
        add(b4);
    
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        b1.setActionCommand("Add");
        b2.setActionCommand("Sub");
        b3.setActionCommand("Mul");
        b4.setActionCommand("Div");
        
        setLayout(new FlowLayout());
    }
    
    public void actionPerformed(ActionEvent ae)
    { 
        int a,b,c;
        switch(ae.getActionCommand())
        {
            case "Add": a = Integer.parseInt(t1.getText());
                        b = Integer.parseInt(t2.getText());
                        c = a + b;
                        JOptionPane.showMessageDialog(f,"Addition is "+c);
                        break;
            case "Sub": a = Integer.parseInt(t1.getText());
                        b = Integer.parseInt(t2.getText());
                        c = a - b;
                        JOptionPane.showMessageDialog(f,"Subtraction is "+c);
                           break;
            case "Mul": a = Integer.parseInt(t1.getText());
                        b = Integer.parseInt(t2.getText());
                        c = a*b;
                        JOptionPane.showMessageDialog(f,"Multiplication is "+c);
                        break;
            case "Div": a = Integer.parseInt(t1.getText());
                        b = Integer.parseInt(t2.getText());
                        c = a / b;
                        JOptionPane.showMessageDialog(f,"Division is "+c);
                           break;
        }
       
        
    }
    
    
}


public class Swingitemdemo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        MyFrame f=new MyFrame();
        f.setSize(1000,1000);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
