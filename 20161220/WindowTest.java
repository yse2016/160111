import java.awt.*;
import javax.swing.*;

public class WindowTest{
	public static void main(String[] args) {

		//変数を作る
		JFrame frame = new JFrame();
		JLabel label = new JLabel("はろー");
		JButton button = new JButton("クリックしてね");

		//windowの設定
		frame.setBounds(100,100,300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		//ラベルとボタンを張り付ける
		Container ctnr = frame.getContentPane();
		ctnr.add(label);
		ctnr.add(button);

		//windowを表示する
		frame.setVisible(true);
	}
}


