
//Write java Program to demonstrate Grid of 5*5

import java.awt.*;
class  GridLayoutDemo2 extends Frame
{
	GridLayoutDemo2()
	{
		setBackground(Color.red);
		GridLayout gl = new GridLayout(5,5);
		setLayout(gl);
		
		for(int i=1; i<=25; i++)
		{
			add(new Button(i+""));
		}
	}
	public static void main(String args[])
	{
		GridLayoutDemo2 gd = new GridLayoutDemo2();
		gd.setVisible(true);
		gd.setTitle("GridLayout");
		gd.setSize(600,600);
	}
}
