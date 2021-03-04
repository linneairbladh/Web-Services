package assignment6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTextArea;
import java.awt.TextArea;
import java.awt.SystemColor;

public class Client2Frame6 extends JFrame {

	private JPanel contentPane;
	private JButton btnAllEmployees;
	private JButton btnEmpRelatives;
	private JButton btnSickness;
	private JButton btnMostAbsent;
	private JButton btnShowAllKeys;
	private JButton btnAllIndexes;
	private JButton btnConstraints;
	private JButton btnAllTables1;
	private JButton btnAllTables2;
	private JButton btnAllColumns1;
	private JButton btnAllColumns2;
	private TextArea textAreaMetaData;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	
	//getters 
	public JPanel getContentPane() {
		return contentPane;}

	public JButton getBtnAllEmployees() {
		return btnAllEmployees;}

	public JButton getBtnEmpRelatives() {
		return btnEmpRelatives;}

	public JButton getBtnSickness() {
		return btnSickness;}

	public JButton getBtnMostAbsent() {
		return btnMostAbsent;}

	public JButton getBtnShowAllKeys() {
		return btnShowAllKeys;}

	public JButton getBtnAllIndexes() {
		return btnAllIndexes;}

	public JButton getBtnConstraints() {
		return btnConstraints;}

	public JButton getBtnAllTables1() {
		return btnAllTables1;}

	public JButton getBtnAllTables2() {
		return btnAllTables2;}

	public JButton getBtnAllColumns1() {
		return btnAllColumns1;}

	public JButton getBtnAllColumns2() {
		return btnAllColumns2;}
	
	public TextArea getTextAreaMetaData() {
		return textAreaMetaData;}
	
	public Client2Frame6() {
		setTitle("CRONUS Sverige AB");
		setForeground(SystemColor.inactiveCaption);
		setBackground(SystemColor.inactiveCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 464);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//buttons
		btnAllEmployees = new JButton("Get all employees");
		btnAllEmployees.setBounds(602, 270, 149, 23);
		contentPane.add(btnAllEmployees);
		
		btnEmpRelatives = new JButton("Employee / relatives");
		btnEmpRelatives.setBounds(602, 304, 149, 23);
		contentPane.add(btnEmpRelatives);
		
		btnSickness = new JButton("Sickness 2004");
		btnSickness.setBounds(602, 338, 149, 23);
		contentPane.add(btnSickness);
		
		btnMostAbsent = new JButton("Most absent");
		btnMostAbsent.setBounds(602, 367, 149, 23);
		contentPane.add(btnMostAbsent);
		
		btnShowAllKeys = new JButton("Show all keys");
		btnShowAllKeys.setBounds(602, 32, 149, 23);
		contentPane.add(btnShowAllKeys);
		
		btnAllIndexes = new JButton("Show all indexes");
		btnAllIndexes.setBounds(602, 65, 149, 23);
		contentPane.add(btnAllIndexes);
		
		btnConstraints = new JButton("All table constraints");
		btnConstraints.setBounds(602, 100, 149, 23);
		contentPane.add(btnConstraints);
		
		btnAllTables1 = new JButton("All tables (1)");
		btnAllTables1.setBounds(602, 134, 149, 23);
		contentPane.add(btnAllTables1);
		
		btnAllTables2 = new JButton("All tables (2)");
		btnAllTables2.setBounds(602, 168, 149, 23);
		contentPane.add(btnAllTables2);
		
		btnAllColumns1 = new JButton("All columns (1)");
		btnAllColumns1.setBounds(602, 202, 149, 23);
		contentPane.add(btnAllColumns1);
		
		btnAllColumns2 = new JButton("All columns (2)");
		btnAllColumns2.setBounds(602, 236, 149, 23);
		contentPane.add(btnAllColumns2);
		
		//textarea
		textAreaMetaData = new TextArea();
		textAreaMetaData.setEditable(false);
		textAreaMetaData.setBounds(20, 21, 564, 371);
		contentPane.add(textAreaMetaData);
		
	}
}
