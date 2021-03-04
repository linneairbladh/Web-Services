package assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;

public class Client3Frame3 extends JFrame {

	private JPanel contentPane;
	private JButton btnReadFile;
	private JTextField textFieldFileName;
	private JTextField textFieldOutputFileName;
	
	//getters setters
	public JTextField getTextFieldFileName() {
		return textFieldFileName;
	}
	public JTextField getTextFieldOutputFileName() {
		return textFieldOutputFileName;
	}
	public void setTextFieldOutputFileName(JTextField textFieldOutputFileName) {
		this.textFieldOutputFileName = textFieldOutputFileName;
	}
	public JButton getBtnReadFile() {
		return btnReadFile;
	}

	/**
	 * Launch the application.
	 */

	//this is made in application
	/**
	 * Create the frame.
	 */
	
	public Client3Frame3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//read file
		btnReadFile = new JButton("Read text file");
		btnReadFile.setBounds(99, 95, 117, 23);
		contentPane.add(btnReadFile);
		
		textFieldFileName = new JTextField();
		textFieldFileName.setBounds(63, 43, 199, 20);
		contentPane.add(textFieldFileName);
		textFieldFileName.setColumns(10);
		
		textFieldOutputFileName = new JTextField();
		textFieldOutputFileName.setEditable(false);
		textFieldOutputFileName.setBounds(60, 145, 202, 105);
		contentPane.add(textFieldOutputFileName);
		textFieldOutputFileName.setColumns(10);
		
		JLabel lblInsertFilePath = new JLabel("Insert file path, remember to remove \"\".");
		lblInsertFilePath.setBounds(63, 70, 237, 14);
		contentPane.add(lblInsertFilePath);
	}
}
