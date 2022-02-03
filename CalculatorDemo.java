//Program to create Calculator Application 

import java.awt.*;
import java.awt.event.*;
class CalculatorDemo extends Frame implements ActionListener
{
	Label L1,L2,L3,L4,L5;
	TextField tf1, tf2, tf3;
	Button b1,b2,b3,b4,b5;
	CalculatorDemo()
	{
		setLayout(null);
		setBackground(Color.cyan);
		
		L1= new Label("Simple Calculator");
		Font f1= new Font("Times New Roman",Font.BOLD, 40);
		L1.setFont(f1);
		
		Font f2 = new Font("Times New Roman", Font.BOLD,16);
		
		L2 = new Label("First No:");
		L2.setFont(f2);
		tf1 = new TextField(30);
		tf1.setFont(f2);
		L3 = new Label("Second No:");
		L3.setFont(f2);
		tf2 = new TextField(30);
		tf2.setFont(f2);
		L4 = new Label("Result");
		L4.setFont(f2);
		tf3 = new TextField(30);
		tf3.setFont(f2);
		b1 = new Button("ADD");
		b1.setFont(f2);
		b2 = new Button("SUB");
		b2.setFont(f2);
		b3 = new Button("MUL");
		b3.setFont(f2);
		b4 = new Button("DIV");
		b4.setFont(f2);
		b5 = new Button("CLEAR");
		b5.setFont(f2);
		L5 = new Label("Developed by : @Sakshi");
		
		L1.setBounds(240,55,600,40);
		L2.setBounds(100,150,100,30);
		tf1.setBounds(200,150,120,30);
		L3.setBounds(400,150,100,30);
		tf2.setBounds(500,150,120,30);
		L4.setBounds(250,220,100,30);
		tf3.setBounds(350,220,120,30);
		b1.setBounds(100,330,100,30);
		b2.setBounds(230,330,100,30);
		b3.setBounds(360,330,100,30);
		b4.setBounds(490,330,100,30);
		b5.setBounds(620,330,100,30);
		L5.setBounds(300,550,200,30); 
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		add(L1);
		add(L2);add(tf1);add(L3);add(tf2);
		add(L4);add(tf3);
		add(b1);add(b2);add(b3);add(b4);add(b5);
		add(L5);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int x = Integer.parseInt(tf1.getText());
		int y = Integer.parseInt (tf2.getText());
		if (ae.getSource()==b1 )   //getSource is the method of ActionEvent class
		{
			int z = x+y;
			tf3.setText(z+"");
		}
		else if (ae.getSource()==b2 )  
		{
			int z = x-y;
			tf3.setText(z+"");
		}
		else if (ae.getSource()==b3 )  
		{
			int z = x*y;
			tf3.setText(z+"");
		}
		else if (ae.getSource()==b4 )  
		{
			int z = x/y;
			tf3.setText(z+"");
		}
		else if(ae.getSource()==b5)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
	}
	public static void main(String args[])
	{
		CalculatorDemo cd = new CalculatorDemo();
		cd.setVisible(true);
		cd.setTitle("Calculator");
		cd.setSize(850,600);
	}
}