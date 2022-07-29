
//Write a program to generate following output using BorderLayout 


import java.awt.*;
class BorderLayoutPratical extends Frame
{
	BorderLayoutPratical()
	{
		BorderLayout br = new BorderLayout();
		setLayout(br);
		
		Button b1 = new Button("East");
		Button b2 = new Button("West");
		Button b3 = new Button("North");
		Button b4 = new Button("South");
		Button b5 = new Button("Center");
		
		add(b1,BorderLayout.EAST);
		add(b2,BorderLayout.WEST);
		add(b3,BorderLayout.NORTH);
		add(b4,BorderLayout.SOUTH);
		add(b5,BorderLayout.CENTER);
	}
	public static void main(String args[])
	{
		BorderLayoutPratical bd = new BorderLayoutPratical();
		bd.setVisible(true);
		bd.setTitle("BorderLayout Demo");
		bd.setSize(400,400);
	}
} 