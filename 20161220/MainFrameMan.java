import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrameMan{
	public static void main(String[] args) {
		FrameMan fm = new FrameMan();
	}
}

class FrameMan implements ActionListener{
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton button;
	public void FrameMan(){
		//windowの設定
		frame = new JFrame("ふれいむまん");
		frame.setBounds(100,100,300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		//パーツを作る
		panel = new JPanel();
		label = new JLabel("はろー");
		button = new JButton("クリックしてね");


		button.addActionListener(this);


		//ラベルとボタンを張り付ける
		frame.add(panel);
		panel.add(label);
		panel.add(button);

		//windowを表示する
		frame.setVisible(true);
	}
}