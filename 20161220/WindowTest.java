import java.awt.*;
import javax.swing.*;

public class WindowTest{
	public static void main(String[] args){
		// 変数作成
		JFrame frame = new JFrame("眠さがある。");
		JLabel label = new JLabel("HELLO!");
		JButton button = new JButton("ClickMe!");

		// Windowの設定
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(750,50,300,300);
		frame.setLayout(new FlowLayout());

		Container ctnr = frame.getContentPane();
		ctnr.add(label);
		ctnr.add(button);


		// 可視化
		frame.setVisible(true);
	}
}