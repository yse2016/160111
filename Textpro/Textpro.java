import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Textpro{
	public static void main(String[] args) {
		Textproman textman = new Textproman();
	}
}

class Textproman implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton btnpro;
	String textdata;
	JFileChooser fc;
	// int l=10000;
	// String[] words = new String[l];
	int i;
	int n;

	public Textproman(){
		frame = new JFrame("テキスト処理");
		frame.setBounds(400,400,300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();

		btnpro = new JButton("処理");

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(1, 1));

		panel.setBackground(new Color(255,94,25));

		btnpro.addActionListener(this);
		btnpro.setActionCommand("pro");

		con.add(panel);
		panel.add(btnpro);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();

		if(cmd.equals("pro")){
			fc= new JFileChooser();
			fc.setCurrentDirectory(new File("."));
			int ret = fc.showOpenDialog(frame);
			if(ret == JFileChooser.APPROVE_OPTION) {
			// 選ばれたファイル
				File file = fc.getSelectedFile();

				textdata = file.getAbsolutePath();
			}
			try{
				File f = new File(textdata);
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String line;
				while ((line = br.readLine()) != null) {
				}
					line = line.replace(",","");
					line = line.replace(".","");
					line = line.replace("'s","");
					String[] words = line.split(" ");
					System.out.println(words.length);

				br.close();
			}catch (Exception e) {
				e.printStackTrace();
			}




	// 	}else if(cmd.equals("save")){
	// 		fc= new JFileChooser();
	// 		fc.setCurrentDirectory(new File("."));
	// 		int ret = fc.showSaveDialog(frame);
	// 		if(ret == JFileChooser.APPROVE_OPTION) {
	// 		// 選ばれたファイル
	// 			File file = fc.getSelectedFile();

	// 			textdata = file.getAbsolutePath();

	// 			label3.setText(textdata);
	// 		}
	// 		try{
	// 			File f = new File(textdata);
	// 			FileWriter fw = new FileWriter(f);
	// 			BufferedWriter bw = new BufferedWriter(fw);			
	// 			PrintWriter pw = new PrintWriter(bw);
	// 			String data = textArea.getText();

	// 			pw.println(data);

	// 			pw.close();
	// 		}catch (Exception e) {
	// 			e.printStackTrace();
	// 		}
	// 	}
	// 	if(cmd.equals("word")){
	// 		Random rnd = new Random();
	// 		if(n<=1){
	// 			fc= new JFileChooser();
	// 			fc.setCurrentDirectory(new File("."));
	// 			int ret = fc.showSaveDialog(frame);
	// 			if(ret == JFileChooser.APPROVE_OPTION) {
	// 		// 選ばれたファイル
	// 				File file = fc.getSelectedFile();

	// 				textdata = file.getAbsolutePath();

	// 			//tF.setText(textdata);
	// 			}
	// 			try{
	// 				File f = new File(textdata);
	// 				FileInputStream fis = new FileInputStream(f);
	// 				InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
	// 				BufferedReader br = new BufferedReader(isr);
	// 				//FileReader fr = new FileReader(f);
	// 				//BufferedReader br = new BufferedReader(fr);
	// 				String line;
	// 				StringTokenizer token;
	// 				while ((line = br.readLine()) != null) {
	// 					token = new StringTokenizer(line,",");

	// 					while(token.hasMoreTokens()){
	// 				//System.out.println(token.nextToken());
	// 					//pw.println(token.nextToken());
	// 						words[i] = token.nextToken();
	// 						i++;

	// 					}
	// 				}

	// 				br.close();
	// 			}catch(IOException e){
	// 				e.printStackTrace();
	// 			}
	// 			n=2;
	// 		}
	// 		int wordR1 = rnd.nextInt(i);
	// 		int wordR2 = rnd.nextInt(i);
	// 		label1.setText(words[wordR1]);
	// 		label2.setText(words[wordR2]);
		}
	}
}