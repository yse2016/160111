import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.script.*;
import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		Calculatorman cm = new Calculatorman();
	}
}

class Calculatorman implements ActionListener, KeyListener{
	JFrame frame;

	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JPanel panel5;

	JButton zero;
	JButton one;
	JButton two;
	JButton three;
	JButton four;
	JButton five;
	JButton six;
	JButton seven;
	JButton eight;
	JButton nine;
	JButton dot;

	JButton add;//+
	JButton sub;//-
	JButton multi;//*
	JButton div;///
	JButton reset;
	JButton equal;
	
	JTextArea area;

	int num=0;
	int dotnum=0;
	int symbol=0;

	String data;

	int keyCode;

	Object result;
	ScriptEngineManager sem = new ScriptEngineManager();
	ScriptEngine engine = sem.getEngineByName("JavaScript");

	public Calculatorman(){
		frame = new JFrame("電卓");
		frame.setBounds(500,250,300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();

		zero = new JButton("0");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		dot = new JButton(".");

		add = new JButton("+");
		sub = new JButton("-");
		multi = new JButton("×");
		div = new JButton("÷");
		reset = new JButton("del");
		equal = new JButton("=");

		area = new JTextArea(/*"0",*/1,10);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(5,1));

		panel1.setBackground(new Color(66,232,244));
		panel2.setBackground(new Color(66,232,244));
		panel3.setBackground(new Color(66,232,244));
		panel4.setBackground(new Color(66,232,244));
		panel5.setBackground(new Color(66,232,244));

		zero.addActionListener(this);
		zero.setActionCommand("zero");

		one.addActionListener(this);
		one.setActionCommand("one");

		two.addActionListener(this);
		two.setActionCommand("two");

		three.addActionListener(this);
		three.setActionCommand("three");

		four.addActionListener(this);
		four.setActionCommand("four");

		five.addActionListener(this);
		five.setActionCommand("five");

		six.addActionListener(this);
		six.setActionCommand("six");

		seven.addActionListener(this);
		seven.setActionCommand("seven");

		eight.addActionListener(this);
		eight.setActionCommand("eight");

		nine.addActionListener(this);
		nine.setActionCommand("nine");

		dot.addActionListener(this);
		dot.setActionCommand("dot");

		add.addActionListener(this);
		add.setActionCommand("add");

		sub.addActionListener(this);
		sub.setActionCommand("sub");

		multi.addActionListener(this);
		multi.setActionCommand("multi");

		div.addActionListener(this);
		div.setActionCommand("div");

		equal.addActionListener(this);
		equal.setActionCommand("equal");

		reset.addActionListener(this);
		reset.setActionCommand("reset");

		con.add(panel1);
		con.add(panel2);
		con.add(panel3);
		con.add(panel4);
		con.add(panel5);

		panel1.add(area);
		panel1.add(reset);

		panel2.add(seven);
		panel2.add(eight);
		panel2.add(nine);
		panel2.add(div);

		panel3.add(four);
		panel3.add(five);
		panel3.add(six);
		panel3.add(multi);

		panel4.add(one);
		panel4.add(two);
		panel4.add(three);
		panel4.add(sub);

		panel5.add(dot);
		panel5.add(zero);
		panel5.add(equal);
		panel5.add(add);

		frame.addKeyListener(new key_input());
		frame.setVisible(true);	

	}//public Calculatorman

	public void actionPerformed(ActionEvent ae) {
		String cmd = ae.getActionCommand();

		if(num==0){

			if (cmd.equals("zero")) {
				area.setText("0");
				num=1;
				symbol=0;
			}
			if (cmd.equals("one")) {
				area.setText("1");
				num=1;
				symbol=0;
			}
			if (cmd.equals("two")) {
				area.setText("2");
				num=1;
				symbol=0;
			}
			if (cmd.equals("three")) {
				area.setText("3");
				num=1;
				symbol=0;
			}
			if (cmd.equals("four")) {
				area.setText("4");
				num=1;
				symbol=0;
			}
			if (cmd.equals("five")) {
				area.setText("5");
				num=1;
				symbol=0;		
			}
			if (cmd.equals("six")) {
				area.setText("6");
				num=1;
				symbol=0;
			}
			if (cmd.equals("seven")) {
				area.setText("7");
				num=1;
				symbol=0;
			}
			if (cmd.equals("eight")) {
				area.setText("8");
				num=1;
				symbol=0;
			}
			if (cmd.equals("nine")) {
				area.setText("9");
				num=1;
				symbol=0;
			}
			if (cmd.equals("dot")) {
				if(dotnum==0){
				area.setText(".");
				}
				num=1;
				dotnum=1;
				symbol=1;
			}

		}else{//(num==0)

			if (cmd.equals("zero")) {
				area.append("0");
				symbol=0;
			}
			if (cmd.equals("one")) {
				area.append("1");
				symbol=0;
			}
			if (cmd.equals("two")) {
				area.append("2");
				symbol=0;
			}
			if (cmd.equals("three")) {
				area.append("3");
				symbol=0;
			}
			if (cmd.equals("four")) {
				area.append("4");
				symbol=0;
			}
			if (cmd.equals("five")) {
				area.append("5");
				symbol=0;
			}
			if (cmd.equals("six")) {
				area.append("6");
				symbol=0;
			}
			if (cmd.equals("seven")) {
				area.append("7");
				symbol=0;	
			}
			if (cmd.equals("eight")) {
				area.append("8");
				symbol=0;
			}
			if (cmd.equals("nine")) {
				area.append("9");
				symbol=0;
			}
			if (cmd.equals("dot")) {
				if (dotnum==0) {
					area.append(".");
				}
					dotnum=1;
					symbol=1;
			}
			if(cmd.equals("add")){
				if (symbol==0) {
				area.append("+");
				}
				symbol=1;
			}
			if(cmd.equals("sub")){
				if (symbol==0) {
				area.append("-");
				}
				symbol=1;
			}
			if(cmd.equals("multi")){
				if (symbol==0) {
				area.append("*");
				}
				symbol=1;
			}
			if(cmd.equals("div")){
				if (symbol==0) {
				area.append("/");
				}
				symbol=1;
			}

		}//else(num==0)

		if(cmd.equals("reset")){
			area.setText("0");
			num=0;
			dotnum=0;
		}


		if(cmd.equals("equal")){
			data = area.getText();
				try {
					result = engine.eval(data);
					area.setText(String.valueOf(result));
				} catch (ScriptException se) {
					throw new RuntimeException(se);
				}
		}

	}//actionPerformed

	public void keyPressed(KeyEvent ke){
		//何もしない
	}//keyPressed

	public void keyReleased(KeyEvent ke){
		//何もしない
	}//keyReleased

	public void keyTyped(KeyEvent event){

		keyCode = event.getKeyCode();

		System.out.println(keyCode);
	}//keyTyped

}//class Calculatorman