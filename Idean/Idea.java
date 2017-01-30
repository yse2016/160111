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
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JButton btnOpen;
	JButton btnSave;
	JButton btnWord;
	JButton btn;
	JTextField tF;
	JTextField tF2;
	JTextField tF3;
	JScrollPane scrollPane;
	JTextArea textArea;
	String textdata;
	JFileChooser fc;
	int l=10000;
	String[] words = new String[l];
	int i;
	int n;

	public Ideaman(){
		frame = new JFrame("あいでぃあん");
		frame.setBounds(400,100,500,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLayout(new FlowLayout());
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		//btn = new JButton("くりっくみー");
		btnOpen = new JButton("おーぷん");
		btnSave = new JButton("ほぞん");
		btnWord = new JButton("たんご");
		tF = new JTextField(17);
		tF2 = new JTextField(17);
		tF3 = new JTextField(26);
		label1 = new JLabel("単語1");
		label2 = new JLabel("単語2");
		label3 = new JLabel("メモ帳を開く↓");
		textArea = new JTextArea(10, 30);
		scrollPane = new JScrollPane(textArea);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(5, 1));
		//panel1.setLayout(new BorderLayout());
		//panel2.setLayout(new BorderLayout());

		panel1.setBackground(new Color(255,94,25));
		panel2.setBackground(new Color(255,94,25));
		panel3.setBackground(new Color(30,168,6));
		panel4.setBackground(new Color(30,168,6));

		btnOpen.addActionListener(this);
		btnOpen.setActionCommand("open");
		btnSave.addActionListener(this);
		btnSave.setActionCommand("save");
		btnWord.addActionListener(this);
		btnWord.setActionCommand("word");

		con.add(panel1);
		con.add(panel2);
		con.add(panel3);
		con.add(panel4);
		// panel.add(tF);
		// panel.add(tF2);
		panel1.add(label1);
		panel1.add(label2);
		panel2.add(btnWord);
		// panel.add(tF3);
		panel3.add(label3);
		panel4.add(btnOpen);
		panel4.add(btnSave);
		con.add(scrollPane);

		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();
		//textdata = tF.getText();
		if(cmd.equals("open")){
			fc= new JFileChooser();
			fc.setCurrentDirectory(new File("."));
			int ret = fc.showOpenDialog(frame);
			if(ret == JFileChooser.APPROVE_OPTION) {
			// 選ばれたファイル
				File file = fc.getSelectedFile();

				textdata = file.getAbsolutePath();

				label3.setText(textdata);
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

				label3.setText(textdata);
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
			Random rnd = new Random();
			if(n<=1){
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
					FileInputStream fis = new FileInputStream(f);
					InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
					BufferedReader br = new BufferedReader(isr);
					//FileReader fr = new FileReader(f);
					//BufferedReader br = new BufferedReader(fr);
					String line;
					StringTokenizer token;
					while ((line = br.readLine()) != null) {
						token = new StringTokenizer(line,",");

						while(token.hasMoreTokens()){
					//System.out.println(token.nextToken());
						//pw.println(token.nextToken());
							words[i] = token.nextToken();
							i++;

						}
					}

					br.close();
				}catch(IOException e){
					e.printStackTrace();
				}
				n=2;
			}
			int wordR1 = rnd.nextInt(i);
			int wordR2 = rnd.nextInt(i);
			label1.setText(words[wordR1]);
			label2.setText(words[wordR2]);
		}
	}
}