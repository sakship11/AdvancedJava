
//Write a program using JPasswordField and JTextField to demonstrate the use of user authentication. 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JPasswordFieldDemo extends JFrame implements ActionListener
{
	JLabel l1,l2,l4;
	JTextField tf1;
	JPasswordField jp;
	JButton b1;
	JPasswordFieldDemo()
	{
		setLayout(null);
		Font f1=new Font("Times New Roman", Font.BOLD|Font.ITALIC,14);
		l1 = new JLabel("Username:");
		l1.setBounds(100,90,70,40);
		
		tf1 = new JTextField(40);
		tf1.setBounds(190,90,120,30);
		
		l2= new JLabel("Password:");
		l2.setBounds(100,150,70,40);
		
		jp = new JPasswordField(40);
		//jp.setEchoChar('*');
		jp.setBounds(190,150,120,30);
		
		b1 = new JButton("Sign in");
		b1.setBounds(150,250,100,40);
		
		l4 = new JLabel("							                                      ");
		l4.setFont(f1);
		l4.setBounds(80,300,400,40);
		l4.setForeground(Color.red);
		
		add(l1);
		add(l2);
		add(tf1);
		add(jp);
		add(b1);
		
		add(l4);
		
		b1.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent ar)
	{
		String  un =tf1.getText();
		String  psw = jp.getText();
		if(un.equals("sakshi")&& psw.equals("SakshiPawar"))
		{
			l4.setText("Login successful");
		}
		else 
		{
			l4.setText("Please check your username and password and try again...");
		}
		
	}
	public static void main(String args[])
	{
		JPasswordFieldDemo j = new JPasswordFieldDemo();
		j.setVisible(true);
		j.setSize(500,500);
	}
} 