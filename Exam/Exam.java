import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exam{
	public static void main(String[] args){
		ExamMan em = new ExamMan();
	}
}

class ExamMan implements ActionListener{
	// field
	JFrame frame;
	JButton add;
	JButton sub;
	JButton multi;
	JButton div;
	JButton reset;
	JButton equal;

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

	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JPanel panel5;
	JPanel panel6;
	JTextField field;
	JTextArea area;

	int fielddata;
	int a;
	int b;
	int pl = 0;
	int res;
	String res2;
	String en = "";

	public ExamMan(){

		frame = new JFrame("Exam");
		frame.setLocation(500,250);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add = new JButton("+");
		sub = new JButton("-");
		multi = new JButton("×");
		div = new JButton("÷");
		reset = new JButton("cl");
		equal = new JButton("=");

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

		//field = new JTextField("0",10);
		// field.setEnabled(false);
		area = new JTextArea("0",1,10);

		panel1 = new JPanel();
		panel1.add(area);

		panel2 = new JPanel();
		panel2.add(seven);
		panel2.add(eight);
		panel2.add(nine);
		panel2.add(add);

		panel3 = new JPanel();
		panel3.add(four);
		panel3.add(five);
		panel3.add(six);
		panel3.add(sub);

		panel4 = new JPanel();
		panel4.add(one);
		panel4.add(two);
		panel4.add(three);
		panel4.add(multi);

		panel5 = new JPanel();
		panel5.add(zero);
		panel5.add(reset);
		panel5.add(equal);
		panel5.add(div);


		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(6,1));
		con.add(panel1);
		con.add(panel2);
		con.add(panel3);
		con.add(panel4);
		con.add(panel5);


		frame.setVisible(true);

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
	}

	public void actionPerformed(ActionEvent ae) {
		String cmd = ae.getActionCommand();
		// fielddata = Integer.parseInt(field.getText());
		if(pl == 0){
			if(cmd.equals("one")){
				area.setText("1");
				pl = 1;
			}
			if(cmd.equals("two")){
				area.setText("2");
				pl = 2;
			}
			if(cmd.equals("three")){
				area.setText("3");
				pl = 3;
			}
			if(cmd.equals("four")){
				area.setText("4");
				pl = 4;
			}
			if(cmd.equals("five")){
				area.setText("5");
				pl = 5;
			}
			if(cmd.equals("six")){
				area.setText("6");
				pl = 6;
			}
			if(cmd.equals("seven")){
				area.setText("7");
				pl = 7;
			}
			if(cmd.equals("eight")){
				area.setText("8");
				pl = 8;
			}
			if(cmd.equals("nine")){
				area.setText("9");
				pl = 9;
			}
			if(cmd.equals("zero")){
				area.setText("0");
				pl = 0;
			}
		}else{
			if(cmd.equals("zero")){
				area.append("0");
				pl = Integer.parseInt(area.getText());
			}
			if(cmd.equals("one")){
				area.append("1");
				pl = Integer.parseInt(area.getText());
			}
			if(cmd.equals("two")){
				area.append("2");
				pl = Integer.parseInt(area.getText());
			}
			if(cmd.equals("three")){
				area.append("3");
				pl = Integer.parseInt(area.getText());
			}
			if(cmd.equals("four")){
				area.append("4");
				pl = Integer.parseInt(area.getText());
			}
			if(cmd.equals("five")){
				area.append("5");
				pl = Integer.parseInt(area.getText());
			}
			if(cmd.equals("six")){
				area.append("6");
				pl = Integer.parseInt(area.getText());
			}
			if(cmd.equals("seven")){
				area.append("7");
				pl = Integer.parseInt(area.getText());
			}
			if(cmd.equals("eight")){
				area.append("8");
				pl = Integer.parseInt(area.getText());
			}
			if(cmd.equals("nine")){
				area.append("9");
				pl = Integer.parseInt(area.getText());
			}
		}

		if(cmd.equals("reset")){
			area.setText("0");
			pl = 0;
			a = 0;
			b = 0;
		}


		if(cmd.equals("add")){
			en = "+";
			pl = Integer.parseInt(area.getText());
			a = pl;
			pl = 0;
		}
		if(cmd.equals("sub")){
			en = "-";
			pl = Integer.parseInt(area.getText());
			a = pl;
			pl = 0;
		}
		if(cmd.equals("multi")){
			en = "*";
			pl = Integer.parseInt(area.getText());
			a = pl;
			pl = 0;
		}
		if(cmd.equals("div")){
			en = "/";
			pl = Integer.parseInt(area.getText());
			a = pl;
			pl = 0;
		}

		if(cmd.equals("equal")){
			if(en.equals("+")){
				b = pl;
				res = a + b;
				res2 = Integer.toString(res);

				area.setText(res2);
				a = res;
			}
			if(en.equals("-")){
				b = pl;
				res = a - b;
				res2 = Integer.toString(res);

				area.setText(res2);
				a = res;
			}
			if(en.equals("*")){
				b = pl;
				res = a * b;
				res2 = Integer.toString(res);

				area.setText(res2);
				a = res;
			}
			if(en.equals("/")){
				b = pl;
				res = a / b;
				res2 = Integer.toString(res);

				area.setText(res2);
				 a = res;
			}else{

			}
		}
	}
}