import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrameMan2{
	public static void main(String[] args) {
		FrameMan fm = new FrameMan();
		fm.FrameMan();
	}
}

class FrameMan implements ActionListener{
	JFrame frame;
	JPanel panel1;
	JPanel panel2;
	JLabel label;
	JButton button;
	JTextField textField;
	public void FrameMan(){
		//windowの設定
		frame = new JFrame("ふれいむまん");
		frame.setBounds(100,100,300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLayout(new FlowLayout());
		frame.setLayout(new BorderLayout());

		//パーツを作る
		panel1 = new JPanel();
		panel2 = new JPanel();
		label = new JLabel("はろー");
		button = new JButton("クリックしてね");
		textField = new JTextField(10);


		button.addActionListener(this);


		//ラベルとボタンを張り付ける
		//frame.add(panel);
		panel1.add(textField);
		panel1.add(button);
		panel2.add(label);
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);
		//windowを表示する
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		label.setText(textField.getText());
	}
}