import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class TextEditor{
	public static void main(String[] args){
		TextEditorMan tem = new TextEditorMan();
	}
}

class TextEditorMan implements ActionListener{
	// field
	JFrame frame;
	JButton btnOpen;
	JButton btnSave;
	JPanel panel;
	JTextField field;
	JTextArea area;
	JTextArea area2;
	JScrollPane scrollPane;
	String filedata;
	String textdata;

	// method
	public TextEditorMan(){

		frame = new JFrame("TextEditor");
		frame.setLocation(400,250);
		frame.setSize(500,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btnOpen = new JButton("Open data");
		btnSave = new JButton("Save data");

		field = new JTextField(20);
		area = new JTextArea(10,30);
		area2 = new JTextArea(5,20);
		area.setLineWrap(true);

		panel = new JPanel();
		panel.add(field);
		panel.add(btnOpen);
		panel.add(btnSave);
		panel.add(area2);

		scrollPane = new JScrollPane(area);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2,1));
		con.add(panel);
		con.add(scrollPane);

		frame.setVisible(true);

		btnOpen.addActionListener(this);
		btnOpen.setActionCommand("open");

		btnSave.addActionListener(this);
		btnSave.setActionCommand("save");

	}

	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();
		if(cmd.equals("open")){
			// filedata = field.getText();
			JFileChooser fc = new JFileChooser();

			// 表示するdirを決める。
			fc.setCurrentDirectory(new File("."));

			// ダイアログを開く。
			int ret = fc.showOpenDialog(frame);

			// 選ばれたファイルを、調べる。
			if(ret == JFileChooser.APPROVE_OPTION){
				// 選ばれたファイル
				File file = fc.getSelectedFile();
				// ファイル名、保存場所を調べる。
				filedata = file.getAbsolutePath();
				field.setText(filedata);
			}

			try {
				File inFile					= new File(filedata);
				FileReader fr				= new FileReader(inFile);
				BufferedReader br			= new BufferedReader(fr);

				String line;
				while((line = br.readLine()) != null){
					area.append(line);
					area.append("\n");
				}

				br.close();

			} catch(IOException e){
				System.out.println("IO Error");
			}
		}else if (cmd.equals("save")){
			// filedata = field.getText();
			JFileChooser fc = new JFileChooser();

			// 表示するdirを決める。
			fc.setCurrentDirectory(new File("."));

			// ダイアログを開く。
			int ret = fc.showSaveDialog(frame);

			// 選ばれたファイルを、調べる。
			if(ret == JFileChooser.APPROVE_OPTION){
				// 選ばれたファイル
				File file = fc.getSelectedFile();
				// ファイル名、保存場所を調べる。
				filedata = file.getAbsolutePath();
			}

			textdata = area.getText();
			try {
				File outFile				= new File(filedata);
				FileWriter fw				= new FileWriter(outFile);
				BufferedWriter bw			= new BufferedWriter(fw);
				PrintWriter pw				= new PrintWriter(bw);

				area2.setText(textdata);
				pw.println(textdata);

				pw.close();

			} catch(IOException e){
				System.out.println("IO Error");
			}
		}
	}
}