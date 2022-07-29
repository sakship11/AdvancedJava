//Program  to demonstrate FlowLayout Manager 

import java.awt.*;
class FlowLayoutDemo extends Frame
{
	Button b1, b2;
	FlowLayoutDemo()
	{
		//FlowLayout fy = new FlowLayout(FlowLayout.RIGHT);
		FlowLayout fy = new FlowLayout(FlowLayout.RIGHT, 50 ,50);
		setLayout(fy);
		
		b1 = new Button("OK");
		b2 = new Button("SAVE");
		
		add(b1);
		add(b2);
	}
	public static void main(String s[])
	{
		FlowLayoutDemo f1 = new FlowLayoutDemo();
		f1.setVisible(true);
		f1.setTitle("FileDialogDemo");
		f1.setSize(800,800);
	}
}