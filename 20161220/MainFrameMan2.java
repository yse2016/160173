import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrameMan2{
	public static void main(String[] args){
		FrameMan fm = new FrameMan();

	}
}

// Actionlistener を実装(implements)する。
class FrameMan implements ActionListener{
	// 変数作成
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JFrame frame = new JFrame("眠さがある。");
	JLabel label = new JLabel("HELLO!");
	JButton button = new JButton("ClickMe!");
	JTextField field = new JTextField(15);
	String data;

	public FrameMan(){
			// Windowの設定
		button.addActionListener(this);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(750,50,300,300);

		// frame.setLayout(new FlowLayout());
		frame.setLayout(new BorderLayout());

		Container ctnr = frame.getContentPane();
		/* ctnr.add(field);
		ctnr.add(button);
		ctnr.add(label); */
		panel1.add(field);
		panel1.add(button);
		panel2.add(label);
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.CENTER);

			// 可視化
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		data = field.getText();
		label.setText(data);
	}
}