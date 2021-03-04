package assignment4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import java.awt.TextArea;

public class Client3Frame4 extends JFrame {

	private JPanel contentPane;
	private JButton btnWorkouts;
	private JButton btnUsers;
	private TextArea textAreaTraining;
	
	//getters setters
	public JButton getBtnWorkouts() {
		return btnWorkouts;
	}
	public JButton getBtnUsers() {
		return btnUsers;
	}
	
	public TextArea getTextAreaTraining(){
		return textAreaTraining;
	}

	/**
	 * Launch the application.
	 */


	//this is made in apllication
	/**
	 * Create the frame.
	 */
	
	
	public Client3Frame4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Get Users
		btnUsers = new JButton("Get Users");
		btnUsers.setBounds(250, 38, 117, 23);
		contentPane.add(btnUsers);
		
		//Get Workouts
		btnWorkouts = new JButton("Get Workouts");
		btnWorkouts.setBounds(66, 38, 129, 23);
		contentPane.add(btnWorkouts);
		
		textAreaTraining = new TextArea();
		textAreaTraining.setEditable(false);
		textAreaTraining.setBounds(66, 78, 298, 160);
		contentPane.add(textAreaTraining);
		
		
		
	}
}
