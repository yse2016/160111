import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.script.*;
import java.util.*;

public class Tmp{
	public static void main(String[] args) {
		TmpMan tm = new TmpMan();
	}
}

class TmpMan{
 	JFrame frame;
 	JPanel panel;
 	JLabel label;

 	public TmpMan(){
		frame = new JFrame("tmp");
		frame.setBounds(500,250,300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();

		label = new JLabel("");

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(1,1));

		panel.setBackground(new Color(66,232,244));

		con.add(panel);
		panel.add(label);
		frame.addKeyListener(new Tmpkeyman());
		frame.setVisible(true);
 	}

 }//TmpMan
