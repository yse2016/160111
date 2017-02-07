import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Omikuzi{
	public static void main(String[] args) {
		Omikuziman am = new Omikuziman();
	}
}

class Omikuziman implements ActionListener{
	JFrame frame;
	JPanel panel1;
	JPanel panel2;
	JLabel label;
	JButton btn;
	Random rnd = new Random();

	public Omikuziman(){
		frame = new JFrame("おみくじ");
		frame.setBounds(400,400,300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel1 = new JPanel();
		panel2 = new JPanel();
		label = new JLabel("ボタンを押してね！");
		label.setFont(new Font("utf8", Font.PLAIN, 28));
		btn = new JButton("おみくじを引く！");

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		
		panel1.setBackground(new Color(255,94,25));
		panel2.setBackground(new Color(255,94,25));

		btn.addActionListener(this);
		btn.setActionCommand("omikuzi");

		con.add(panel1);
		con.add(panel2);
		panel1.add(label);
		panel2.add(btn);

		frame.setVisible(true);

	}//public Alohaman()

	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();
		String[] omkz = {"大吉","中吉","吉","小吉","末吉","凶","大凶"};
		int omkzR = rnd.nextInt(7);

		if(cmd.equals("omikuzi")){
			label.setText("今日の運勢は:"+omkz[omkzR]);
		}
	}//actionPerformed

}//class Alohaman
