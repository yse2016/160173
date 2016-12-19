import java.awt.FlowLayout;
import javax.swing.*;
public class Main{
	public static void main(String[] args){
		// 1.変数・データ準備。
		JFrame frame = new JFrame();
		JLabel label = new JLabel("HELLO WORLD!");
		JLabel label2 = new JLabel("ALOHA WORLD!");
		JButton button = new JButton("押してね");
		JButton button2 = new JButton("押さないでね");

		// 2.GUIの作成。
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(button);
		frame.getContentPane().add(label);
		frame.getContentPane().add(label2);
		frame.getContentPane().add(button2);

		// 3.閉じる設定。
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 4.サイズの設定。
		frame.setSize(250,200);

		// 5.可視化の設定。
		frame.setVisible(true);
	}
}