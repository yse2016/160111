import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Game{
	public static void main(String[] args) {
		Dq dq = new Dq();
	}
}

class Dq implements ActionListener{
	Random rnd = new Random();
	JFrame frame;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JTextField name;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel iconp;
	JLabel label5;
	JLabel nameL;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	String namedata;
	JLabel label12;
	JLabel label13;
	JLabel label14;
	ImageIcon icon = new ImageIcon("sample.png");

	int php = rnd.nextInt(400)+100;
	int pmp = rnd.nextInt(350)+100;
	int ehp = rnd.nextInt(400)+300;
	int patk;
	int pmatk;
	int eatk;
	int csp;

	public Dq(){
		frame = new JFrame("どら〇え");
		frame.setBounds(400,400,500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		name = new JTextField(7);
		nameL = new JLabel("名前を入力してね⇒");
		label2 = new JLabel("HP:"+php);
		label3 = new JLabel("MP:"+pmp);
		label4 = new JLabel("スライム");
		iconp = new JLabel();
		label5 = new JLabel("HP:"+ehp);
		btn1 = new JButton("攻撃");
		btn2 = new JButton("魔法(攻撃)");
		btn3 = new JButton("魔法(回復)");
		label12 = new JLabel();
		label13 = new JLabel();
		label14 = new JLabel();

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(4, 1));

		panel1.setBackground(new Color(30,168,6));
		panel2.setBackground(new Color(255,94,25));
		panel3.setBackground(new Color(180,180,180));
		panel4.setBackground(new Color(30,168,6));

		btn1.addActionListener(this);
		btn1.setActionCommand("attack");
		btn2.addActionListener(this);
		btn2.setActionCommand("mattack");
		btn3.addActionListener(this);
		btn3.setActionCommand("covery");

		con.add(panel1);
		con.add(panel2);
		con.add(panel3);
		con.add(panel4);

		panel1.add(nameL);
		panel1.add(name);
		panel1.add(label2);
		panel1.add(label3);

		panel2.add(iconp);
		iconp.setIcon(icon);
		panel2.add(label4);
		panel2.add(label5);

		panel3.add(label12);
		panel3.add(label13);
		panel3.add(label14);


		panel4.add(btn1);
		panel4.add(btn2);
		panel4.add(btn3);

		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();
		namedata = name.getText();

		if(php >= 0 && ehp >=0){
			if(cmd.equals("attack")){
				patk = rnd.nextInt(10)+5;
				eatk = rnd.nextInt(10)+5;
				if(php> 0 && ehp>0) {
					ehp = ehp - patk;
				}else if(php<= 0){
					ehp = ehp;
				}
				if(ehp > 0 && php > 0){
					php = php - eatk;
				}else if(ehp <= 0){
					php = php;
				}
				label12.setText("スライムに"+String.valueOf(patk)+"ダメージ!	");
				label13.setText(namedata+"は"+String.valueOf(eatk)+"ダメージをうけた！	");
				label2.setText("HP:"+String.valueOf(php));
				label5.setText("HP:"+String.valueOf(ehp));
			}//attack
			if(cmd.equals("mattack")){
				pmatk = rnd.nextInt(30)+10;
				eatk = rnd.nextInt(10)+5;
				csp = rnd.nextInt(50)+30;
				if(php> 0 && ehp>0) {
					if(pmp >= csp){
					ehp = ehp - pmatk;
					pmp = pmp - csp;
					}
				}else if(php<= 0){
					ehp = ehp;
				}
				if(ehp > 0 && php > 0){
					php = php - eatk;
				}else if(ehp <= 0){
					php = php;
				}
				if(pmp >= csp){
					label12.setText("スライムに"+String.valueOf(pmatk)+"ダメージ!	");
					label14.setText(namedata+"はMPを"+String.valueOf(csp)+"消費した！	");
				}else{
					label12.setText("MPが足りないよ？	");
					label14.setText("");
				}
				label13.setText(namedata+"は"+String.valueOf(eatk)+"ダメージをうけた！	");
				label2.setText("HP:"+String.valueOf(php));				
				label3.setText("MP:"+String.valueOf(pmp));
				label5.setText("HP:"+String.valueOf(ehp));
			}//mattack

			if(cmd.equals("covery")){
				eatk = rnd.nextInt(10)+5;
				csp = rnd.nextInt(70)+50;
				if(php> 0 && ehp>0) {
					if (pmp >= csp) {
						php = php + csp;
					}
				}else if(php<= 0){
					ehp = ehp;
				}
				if(ehp > 0 && php > 0){
					php = php - eatk;
				}else if(ehp <= 0){
					php = php;
				}
				if(pmp >= csp){
					label12.setText(namedata+"はHPを"+String.valueOf(csp)+"回復した！	");
					label14.setText(namedata+"はMPを"+String.valueOf(csp)+"消費した！	");
				}else{
					label12.setText("MPが足りないよ？	");
					label14.setText("");
				}
				label13.setText(namedata+"は"+String.valueOf(eatk)+"ダメージをうけた！	");
				label2.setText("HP:"+String.valueOf(php));				
				label3.setText("MP:"+String.valueOf(pmp));
				label5.setText("HP:"+String.valueOf(ehp));				
			}//covery

		}//php >= 0 && ehp >=0
		if(php <= 0 || ehp <= 0){
			if(php <= 0){
			label12.setText("スライムの勝利");
			}else if(ehp <= 0){
			label12.setText(namedata+"の勝利");
			}
			label13.setText("");
			label14.setText("");
		}
	}//actionPerformed














}//Dq