import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AlohaWindow2{
	public static void main(String[] args){
		AlohaWindowMan2 awm2 = new AlohaWindowMan2();
	}
}

// class AlohaWindowMan implements ActionListener{
class AlohaWindowMan2 {
	// field
	JFrame frame;
	// JButton button;
	MyButton button;
	JPanel panel;
	JTextField fileNameField;

	// method
	public AlohaWindowMan2(){

		// フレームづくり。
		frame = new JFrame("AlohaWindow");
		frame.setLocation(400,400);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ボタンとフィールドをパネルに乗せようね。
		// button = new JButton("Click me");
		button = new MyButton("Click me");
		fileNameField = new JTextField("ALOHA!",20);

		panel = new JPanel();
		panel.add(fileNameField);
		panel.add(button);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2,1));
		con.add(panel);

		// 表示しよな。
		frame.setVisible(true);

		// button.addActionListener(this);
	}
	/* public void actionPerformed(ActionEvent e) {
		fileNameField.setText("Clicked");
	} */

	class MyButton extends JButton implements ActionListener{
		public MyButton(String str){
			super(str);
			addActionListener(this);
		}

		public void actionPerformed(ActionEvent ae) {
			fileNameField.setText("HELLO");
		}
	}
}