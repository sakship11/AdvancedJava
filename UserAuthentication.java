// importing the necessary libraries  
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


//class that implements the ActionListener interface
class UserAuthentication extends JFrame implements ActionListener
{
	JTextField tf1;
	JPasswordField jp;
	JButton b1,b2;
	
	//Class constructor
	UserAuthentication()
	{
		
		setLayout(null);
		
		Font f1=new Font("Times New Roman", Font.BOLD|Font.ITALIC,40);
		Font f2=new Font("Times New Roman", Font.BOLD,22);
		Font f3=new Font("Times New Roman", Font.BOLD,20);
		
		////create swing components and setting font and placing on frame
		JLabel l1=new JLabel("User Authentication Mechanism");
		l1.setBounds(80,50,800,50);
		l1.setFont(f1);
		l1.setForeground(Color.blue);
		
		JLabel l2=new JLabel("Username:");
		l2.setBounds(140,200,130,30);
		l2.setFont(f2);
		l2.setForeground(Color.black);
		
		JLabel l3=new JLabel("Password:");
		l3.setBounds(140,260,130,30);
		l3.setFont(f2);
		l3.setForeground(Color.black);
		
		tf1=new JTextField(150);
		tf1.setFont(f3);
		tf1.setBounds(320,200,250,30);
		
		jp=new JPasswordField(150);
		jp.setFont(f3);
		jp.setBounds(320,260,250,30);
		
		b1=new JButton("CLEAR");
		b1.setBounds(180,380,130,40);
		b1.setFont(f2);
		b1.setBackground(Color.red);
		
		b2=new JButton("LOGIN");
		b2.setBounds(380,380,130,40);
		b2.setFont(f2);
		b2.setBackground(Color.green);
		
		ImageIcon ii =new ImageIcon("clg.jpeg");
		JLabel li =new JLabel(ii);
		li.setBounds(0,0,700,700);
		
		//add components on frame
		add(l1);
		add(l2);
		add(l3);
		add(tf1);
		add(jp);
		add(b1);
		add(b2);
		add(li);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	////action to be performed on clicking the button
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b2)
		{
			try
			{
				//Database connectivity
				//step1 load the driver class
				Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gptlogin","root","");
            String s="select * from gptuserlogin where username=? and password=?";
            PreparedStatement ps = con.prepareStatement(s);
            ps.setString(1,tf1.getText());
            ps.setString(2,jp.getText());
            ResultSet rs= ps.executeQuery();
				if(rs.next())
				{
					JOptionPane.showMessageDialog(null,"Login Successful...!");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Please enter valid UserName/Password...!");
				}
				//step5 close the connection object 
				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		else if(ae.getSource()==b1)
		{
			tf1.setText("");
			jp.setText("");
		}
	}
	//Main method
	public static void main(String args[])
	{
		//create object
		UserAuthentication gs=new UserAuthentication();
		//setting the size, layout and name to the frame
		gs.setVisible(true);
		gs.setSize(700,700);
		gs.setTitle("Authentication Mechanism");
	}
}