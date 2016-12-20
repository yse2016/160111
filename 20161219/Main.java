import java.awt.FlowLayout;
import javax.swing.*;
public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame(/*"はじめてのGUI"*/);
		//JLabel label = new JLabel("Aloha!!");
		for(int i=0;i<70;i++){
			if(i%3 != 0){
		JButton button = new JButton("押してね");
		frame.getContentPane().add(button);
			}else{
		JButton button = new JButton("押し○す");
		frame.getContentPane().add(button);				
			}
		}
		frame.getContentPane().setLayout(new FlowLayout());
		//frame.getContentPane().add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
}
