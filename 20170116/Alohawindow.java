import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Alohawindow{
	public static void main(String[] args) {
		Alohawindowman awm = new Alohawindowman();
	}
}

class Alohawindowman implements ActionListener{
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton btnOpen;
	JButton btnSave;
	JButton btn;
	JTextField tF;
	JScrollPane scrollPane;
	JTextArea textArea;
	FileReader fr;
	BufferedReader br;

	public Alohawindowman(){
		frame = new JFrame("あろはうぃんどうまん");
		frame.setBounds(400,400,500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLayout(new FlowLayout());

		panel = new JPanel();
		label = new JLabel("あろは");
		//btn = new JButton("くりっくみー");
		btnOpen = new JButton("おーぷん");
		btnSave = new JButton("ほぞん");
		tF = new JTextField("あろは",10);
		textArea = new JTextArea(10, 30);
		scrollPane = new JScrollPane(textArea);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));

		btnOpen.addActionListener(this);
		btnOpen.setActionCommand("open");
		btnSave.addActionListener(this);
    	btnSave.setActionCommand("save");

		con.add(panel);
		panel.add(tF);
		panel.add(btnOpen);
		panel.add(btnSave);
		panel.add(label);
		con.add(scrollPane);

		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();
		if(cmd.equals("open")){
	try {
		String textFile = fileName.getText();
		fr = new FileReader(textFile);
		br = new BufferedReader(fr);

		String data = br.readLine();	// １行読む
		textArea.setText(data);	// 書き込み・表示
	} catch(IOException e) {
		System.out.println("IO error.");
	} 
		}else if(cmd.equals("save")){
	while((data = br.readLine()) != null) {
		textArea.append(data + '\n');
	}
		}
	}
}