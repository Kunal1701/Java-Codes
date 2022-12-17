import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Calci implements ActionListener{


    // TODO Auto-generated method stub
    JFrame f;
    JLabel l;
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,div,mul,sub,dec,add,AC,per,del,eq;
    static double a=0,b=0,result=0;
    static int operator=0;
    Calci(){
        f=new JFrame("Calculator Application");
        l=new JLabel("Calculator By Kunal");
        l.setFont(new Font("Calibri",Font.BOLD,24));
        l.setBounds(140,10,250,180);
        t=new JTextField("");
        t.setBounds(140,115,215,40);
        b7=new JButton("7");
        b7.setBounds(140,160,50,50);
        b8=new JButton("8");
        b8.setBounds(195,160,50,50);
        b9=new JButton("9");
        b9.setBounds(250,160,50,50);
        div=new JButton("/");
        div.setBounds(305,160,50,50);
        b4=new JButton("4");
        b4.setBounds(140,220,50,50);
        b5=new JButton("5");
        b5.setBounds(195,220,50,50);
        b6=new JButton("6");
        b6.setBounds(250,220,50,50);
        mul=new JButton("*");
        mul.setBounds(305,220,50,50);
        b1=new JButton("1");
        b1.setBounds(140,280,50,50);
        b2=new JButton("2");
        b2.setBounds(195,280,50,50);
        b3=new JButton("3");
        b3.setBounds(250,280,50,50);
        sub=new JButton("-");
        sub.setBounds(305,280,50,50);
        b0=new JButton("0");
        b0.setBounds(140,340,50,50);
        dec=new JButton(".");
        dec.setBounds(195,340,50,50);
        add=new JButton("+");
        add.setBounds(250,340,50,50);
        AC=new JButton("AC");
        AC.setBounds(305,340,50,50);
        per=new JButton("%");
        per.setBounds(140,400,50,50);
        del=new JButton("DEL");
        del.setBounds(195,400,80,50);
        eq=new JButton("=");
        eq.setBounds(280,400,75,50);
        f.add(l);
        f.add(t);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(div);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(mul);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(sub);
        f.add(b0);
        f.add(dec);
        f.add(add);
        f.add(AC);
        f.add(per);
        f.add(del);
        f.add(eq);
        l.setForeground(Color.BLUE);
        t.setHorizontalAlignment(JTextField.RIGHT);
        Border border=BorderFactory.createLineBorder(Color.RED,2);
        t.setBorder(border);
        f.setSize(500,600);
        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        div.addActionListener(this);
        mul.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        per.addActionListener(this);
        del.addActionListener(this);
        AC.addActionListener(this);
        eq.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            t.setText(t.getText().concat("1"));
        }
        if(e.getSource()==b2) {
            t.setText(t.getText().concat("2"));
        }
        if(e.getSource()==b3) {
            t.setText(t.getText().concat("3"));
        }
        if(e.getSource()==b4) {
            t.setText(t.getText().concat("4"));
        }
        if(e.getSource()==b5) {
            t.setText(t.getText().concat("5"));
        }
        if(e.getSource()==b6) {
            t.setText(t.getText().concat("6"));
        }
        if(e.getSource()==b7) {
            t.setText(t.getText().concat("7"));
        }
        if(e.getSource()==b8) {
            t.setText(t.getText().concat("8"));
        }
        if(e.getSource()==b9) {

            t.setText(t.getText().concat("9"));
        }
        if(e.getSource()==b0) {
            t.setText(t.getText().concat("0"));
        }
        if(e.getSource()==dec) {
            t.setText(t.getText().concat("."));
        }
        if(e.getSource()==add)
        {
            a=Double.parseDouble(t.getText());
            operator=1;
            t.setText("");
        }
        if(e.getSource()==sub)
        {
            a=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
        }
        if(e.getSource()==mul)
        {
            a=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
        }
        if(e.getSource()==div)
        {
            a=Double.parseDouble(t.getText());
            operator=4;
            t.setText("");
        }
        if(e.getSource()==per)
        {
            a=Double.parseDouble(t.getText());
            operator=5;
            t.setText("");
        }
        if(e.getSource()==eq)
        {
            b=Double.parseDouble(t.getText());
            switch(operator)
            {
                case 1:result=a+b;
                    break;
                case 2:result=a-b;
                    break;
                case 3:result=a*b;
                    break;
                case 4:result=a/b;
                    break;
                case 5:result=a%b;
                    break;
                default:result=0;
            }
            t.setText(" "+result);
        }
        if(e.getSource()==AC)
        {
            t.setText("");
        }
        if(e.getSource()==del)
        {
            String s=t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++)
            {
                t.setText(t.getText()+s.charAt(i));
            }
        }}

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new Calci();
            }
        });
    }}
