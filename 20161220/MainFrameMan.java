import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrameMan{
	public static void main(String[] args){
		FrameMan fm = new FrameMan();

	}
}

// Actionlistener を実装(implements)する。
class FrameMan implements ActionListener{
	// 変数作成
	JFrame frame = new JFrame("眠さがある。");
	JLabel label = new JLabel("HELLO!");
	JButton button = new JButton("ClickMe!");

	public FrameMan(){
			// Windowの設定
		button.addActionListener(this);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(750,50,300,300);
		frame.setLayout(new FlowLayout());

		Container ctnr = frame.getContentPane();
		ctnr.add(label);
		ctnr.add(button);

			// 可視化
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		label.setText("Aloha!");
	}
}