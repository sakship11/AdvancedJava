//Practical No:4  Exercise:2
//write java program to display following output

import java.awt.*;
import javax.swing.*;
class GridBagLayoutForm extends JFrame 
{
    GridBagLayoutForm() 
	{
		//GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        //setLayout(grid);
        GridBagLayout layout = new GridBagLayout();
        JLabel L1 = new JLabel("Name");
        JLabel L2 = new JLabel("Comments");
        JTextField T1 = new JTextField();
        JTextArea T2 = new JTextArea(6, 15);
        JScrollPane SP = new JScrollPane(T2);
        SP.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		SP.setVisible(true);
        this.setLayout(layout);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(L1, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(T1, gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(L2, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(T2, gbc);
        this.getContentPane().add(SP);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 1;
        this.add(new Button("Submit"), gbc);
		setPreferredSize(getSize());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) 
	{
        GridBagLayoutForm g = new GridBagLayoutForm();
		g.setSize(600, 600);
        g.setVisible(true);
		g.setTitle("GridBag Layout Example");
    }
}