package assignment5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.ScrollPane;
import java.awt.Color;
import java.awt.TextArea;

public class ClientFrame5 extends JFrame {

	private JPanel contentPane;
	private JButton btnUpdate; 
	private JButton btnDelete; 
	private JButton btnCreate; 
	private JTextField textFieldFirstName;
	private JTextField textFieldLastName;
	private JTextField textFieldAddress;
	private JTextField textFieldJob;
	private JTextField textFieldNbr;
	private JLabel lblLastName;
	private JLabel lblJobRole;
	private JLabel lblAddress;
	private JLabel lblEmployeeNumber;
	private JTextField textFieldEmail;
	private JTextPane textPaneEmployee;
	private JLabel lblErrorMessage;
	private JButton btnEmpNbr;
	private ScrollPane scrollPaneEmployee;
	private TextArea textAreaEmpNbr;
	private JLabel lblInsertNewInformation;
	private JLabel lblNewLabel;
	
	//getters 
	public ScrollPane getScrollPaneEmployee() {
		return scrollPaneEmployee;
	}
	
	public TextArea getTextAreaEmpNbr() {
		return textAreaEmpNbr;
	}
	
	public JLabel getLblErrorMessage() {
		return lblErrorMessage;
	}
	
	public JTextPane getTextPaneEmployee() {
		return textPaneEmployee;
	}
	
	public JPanel getContentPane() {
		return contentPane;
	}
	public JButton getBtnUpdate() {
		return btnUpdate;
	}
	public JButton getBtnDelete() {
		return btnDelete;
	}
	public JButton getBtnCreate() {
		return btnCreate;
	}
	
	public JButton getBtnEmpNbr() {
		return btnEmpNbr;
	}
	
	public JTextField getTextFieldLastName() {
		return textFieldLastName;
	}
	public JTextField getTextFieldFirstName() {
		return textFieldFirstName;
	}
	public JTextField getTextFieldAddress() {
		return textFieldAddress;
	}
	public JTextField getTextFieldJob() {
		return textFieldJob;
	}
	public JTextField getTextFieldNbr() {
		return textFieldNbr;
	}
	
	public JTextField getTextFieldEmail() {
		return textFieldEmail;
	}


	/**
	 * Launch the application.
	 */

	

	//this is made in application
	/**
	 * Create the frame.
	 */
	
	
	public ClientFrame5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 11, 574, 406);
		contentPane.add(tabbedPane);
		
		JPanel panelUppg5 = new JPanel();
		tabbedPane.addTab("Uppgift 5", null, panelUppg5, null);
		panelUppg5.setLayout(null);
		
		//Update Employee
		btnUpdate = new JButton("Update");
		btnUpdate.setBounds(335, 131, 89, 23);
		panelUppg5.add(btnUpdate);
		
		//Create Employee
		btnCreate = new JButton("Create");
		btnCreate.setBounds(77, 216, 89, 23);
		panelUppg5.add(btnCreate);
		
		//Delete Employee
		btnDelete = new JButton("Delete");
		btnDelete.setBounds(335, 100, 89, 23);
		panelUppg5.add(btnDelete);
		
		//Read EmpNbr
		btnEmpNbr = new JButton("Read employees");
		btnEmpNbr.setBounds(313, 216, 143, 23);
		panelUppg5.add(btnEmpNbr);
	
		//textfields + labels 
		textFieldFirstName = new JTextField();
		textFieldFirstName.setToolTipText("Name");
		textFieldFirstName.setBounds(117, 39, 86, 20);
		panelUppg5.add(textFieldFirstName);
		textFieldFirstName.setColumns(10);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setToolTipText("Name");
		textFieldLastName.setColumns(10);
		textFieldLastName.setBounds(117, 70, 86, 20);
		panelUppg5.add(textFieldLastName);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setBounds(117, 132, 86, 20);
		panelUppg5.add(textFieldAddress);
		textFieldAddress.setColumns(10);
		
		textFieldJob = new JTextField();
		textFieldJob.setText("");
		textFieldJob.setBounds(117, 101, 86, 20);
		panelUppg5.add(textFieldJob);
		textFieldJob.setColumns(10);
		
		textFieldNbr = new JTextField();
		textFieldNbr.setBounds(338, 39, 86, 20);
		panelUppg5.add(textFieldNbr);
		textFieldNbr.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First name:");
		lblFirstName.setBounds(20, 39, 66, 20);
		panelUppg5.add(lblFirstName);
		
		lblLastName = new JLabel("Last name:");
		lblLastName.setBounds(20, 70, 66, 20);
		panelUppg5.add(lblLastName);
		
		lblJobRole = new JLabel("Job role:");
		lblJobRole.setBounds(20, 101, 66, 20);
		panelUppg5.add(lblJobRole);
		
		lblAddress = new JLabel("Address:");
		lblAddress.setBounds(20, 132, 66, 20);
		panelUppg5.add(lblAddress);
		
		lblEmployeeNumber = new JLabel("Employee number:");
		lblEmployeeNumber.setBounds(226, 38, 117, 23);
		panelUppg5.add(lblEmployeeNumber);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(20, 163, 46, 14);
		panelUppg5.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(117, 163, 86, 20);
		panelUppg5.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		textPaneEmployee = new JTextPane();
		textPaneEmployee.setEditable(false);
		textPaneEmployee.setBounds(20, 250, 207, 117);
		panelUppg5.add(textPaneEmployee);
		
		lblErrorMessage = new JLabel("");
		lblErrorMessage.setBounds(20, 194, 368, 14);
		panelUppg5.add(lblErrorMessage);
		
		
		//textArea
		textAreaEmpNbr = new TextArea();
		textAreaEmpNbr.setColumns(1);
		textAreaEmpNbr.setBackground(Color.WHITE);
		textAreaEmpNbr.setEditable(false);
		textAreaEmpNbr.setBounds(260, 250, 287, 117);
		panelUppg5.add(textAreaEmpNbr);
		
		lblInsertNewInformation = new JLabel("Insert new information and");
		lblInsertNewInformation.setBounds(313, 165, 156, 12);
		panelUppg5.add(lblInsertNewInformation);
		
		lblNewLabel = new JLabel("employee number to update.");
		lblNewLabel.setBounds(313, 179, 171, 14);
		panelUppg5.add(lblNewLabel);
	}
}
