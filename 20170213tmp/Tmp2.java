import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.script.*;
import java.util.*;

public class Tmp2{
	public static void main(String[] args) {
		TmpMan2 tm = new TmpMan2();
		tm.TmpMan();
	}
}

class TmpMan2 implements KeyListener{
 	JFrame frame;
 	JPanel panel;
 	JLabel label;
 	int keyCode;

 	public void TmpMan(){
		frame = new JFrame("tmp");
		frame.setBounds(500,250,300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();

		label = new JLabel("ここ");

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(1,1));

		panel.setBackground(new Color(66,232,244));

		con.add(panel);
		panel.add(label);
		frame.addKeyListener(new TmpMan2());
		frame.setVisible(true);
 	}


	public void keyPressed(KeyEvent ke){
		keyCode = ke.getKeyCode();
		label.setText(String.valueOf(keyCode));
		System.out.println(keyCode);
	}//keyPressed

	public void keyReleased(KeyEvent ke){
		keyCode = ke.getKeyCode();
		//何もしない
	}//keyReleased

	public void keyTyped(KeyEvent ke){
		keyCode = ke.getKeyCode();
	}//keyTyped

 }//TmpMan2