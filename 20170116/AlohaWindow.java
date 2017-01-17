import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class AlohaWindow{
	public static void main(String[] args){
		AlohaWindowMan awm = new AlohaWindowMan();
	}
}

class AlohaWindowMan implements ActionListener{
	// field
	JFrame frame;
	JButton btnOpen;
	JButton btnSave;
	JPanel panel;
	JPanel panel2;
	JTextField field;
	JTextArea area;
	JScrollPane scrollPane;
	String filedata;
	String textdata;

	// method
	public AlohaWindowMan(){

		frame = new JFrame("AlohaWindow");
		frame.setLocation(500,250);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btnOpen = new JButton("Open data");
		btnSave = new JButton("Save data");

		field = new JTextField(20);
		area = new JTextArea(10,30);
		area.setLineWrap(true);

		panel = new JPanel();
		panel.add(field);
		panel.add(btnOpen);
		panel.add(btnSave);

		scrollPane = new JScrollPane(area);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2,1));
		con.add(panel);
		con.add(scrollPane);

		// 表示させる。
		frame.setVisible(true);

		btnOpen.addActionListener(this);
		btnOpen.setActionCommand("open");

		btnSave.addActionListener(this);
		btnSave.setActionCommand("save");
	}

	public void actionPerformed(ActionEvent ae) {
		String cmd = ae.getActionCommand();
		if(cmd.equals("open")){
			// field.setText("Open clicked");
			filedata = field.getText();
			try {
				File inFile				= new File(filedata);
				FileReader fr		= new FileReader(inFile);
				BufferedReader br	= new BufferedReader(fr);

				String line;
				while((line = br.readLine()) != null){
					area.append(line);
					area.append("\n");
				}
			} catch(IOException e){
					System.out.println("error");
			}
		}else if(cmd.equals("save")){
			// field.setText("Save clicked");
			filedata = field.getText();
			textdata = area.getText();
			try {
				File outFile				= new File(filedata);
				FileWriter fw				= new FileWriter(outFile);
				BufferedWriter bw 			= new BufferedWriter(fw);
				PrintWriter pw				= new PrintWriter(bw);

				pw.println(textdata);

			} catch(IOException e){
				System.out.println("error");
			}
		}
	}
}