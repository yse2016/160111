import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Idea{
	public static void main(String[] args) {
		Ideaman ideaman = new Ideaman();
	}
}

class Ideaman implements ActionListener{
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton btnOpen;
	JButton btnSave;
	JButton btnWord;
	JButton btn;
	JTextField tF;
	JTextField tF2;
	JScrollPane scrollPane;
	JTextArea textArea;
	String textdata;
	JFileChooser fc;

	public Ideaman(){
		frame = new JFrame("あいでぃあん");
		frame.setBounds(400,400,500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLayout(new FlowLayout());
		panel = new JPanel();
		//btn = new JButton("くりっくみー");
		btnOpen = new JButton("おーぷん");
		btnSave = new JButton("ほぞん");
		btnWord = new JButton("たんご");
		tF = new JTextField(8);
		tF2 = new JTextField(8);
		textArea = new JTextArea(10, 30);
		scrollPane = new JScrollPane(textArea);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));

		btnOpen.addActionListener(this);
		btnOpen.setActionCommand("open");
		btnSave.addActionListener(this);
		btnSave.setActionCommand("save");
		btnWord.addActionListener(this);
		btnWord.setActionCommand("word");

		con.add(panel);
		panel.add(tF);
		panel.add(tF2);
		panel.add(btnOpen);
		panel.add(btnSave);
		panel.add(btnWord);
		con.add(scrollPane);

		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){
		Random rnd = new Random(); 
		String cmd = ae.getActionCommand();
		String[] word1 = {"1","2","3","4","5"};
		String[] word2 = {"6","7","8","9","10"};
		//textdata = tF.getText();
		if(cmd.equals("open")){
			fc= new JFileChooser();
			fc.setCurrentDirectory(new File("."));
			int ret = fc.showOpenDialog(frame);
			if(ret == JFileChooser.APPROVE_OPTION) {
			// 選ばれたファイル
				File file = fc.getSelectedFile();

				textdata = file.getAbsolutePath();

				//tF.setText(textdata);
			}
			try{
				File f = new File(textdata);
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String line;
				textArea.setText("");
				while ((line = br.readLine()) != null) {
					textArea.append(line);
					textArea.append("\n");
				}

				br.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}else if(cmd.equals("save")){
			fc= new JFileChooser();
			fc.setCurrentDirectory(new File("."));
			int ret = fc.showSaveDialog(frame);
			if(ret == JFileChooser.APPROVE_OPTION) {
			// 選ばれたファイル
				File file = fc.getSelectedFile();

				textdata = file.getAbsolutePath();

				//tF.setText(textdata);
			}
			try{
				File f = new File(textdata);
				FileWriter fw = new FileWriter(f);
				BufferedWriter bw = new BufferedWriter(fw);			
				PrintWriter pw = new PrintWriter(bw);
				String data = textArea.getText();

				pw.println(data);

				pw.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(cmd.equals("word")){
			int wordR = rnd.nextInt(4);
			int wordR2 = rnd.nextInt(4);
			tF.setText(word1[wordR]);
			tF2.setText(word2[wordR2]);
		}
	}
}