package assignment6;

import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import org.tempuri.GetAllKeys;
import org.tempuri.GetAllKeysResponseGetAllKeysResult;
import org.tempuri.WebService6Soap;
import org.tempuri.WebService6SoapProxy;

public class Controller6 {

	private Client2Frame6 frame;
	private WebService6Soap proxy;
	
	public Controller6(Client2Frame6 frame) {
		
		this.frame = frame;
		proxy = new WebService6SoapProxy();
		initialize();
	}
	
	private void initialize() {
		
		
		
		//btn to get all employees
		frame.getBtnAllEmployees().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String tmp = "";
				
				try {
					String[] allEmployees  = proxy.getAllEmployeesJava();
					
					for(String g : allEmployees) {
						tmp += g + "\n";
					}
					frame.getTextAreaMetaData().setText(tmp);
					
					}	catch (RemoteException e1) {
							e1.printStackTrace();
				}
			}
		});
		
		//btn employee and relatives 
		frame.getBtnEmpRelatives().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String tmp = "";
				
				try {
					String[] relatives  = proxy.getAllEmployeesRelativesJava();
					
					for(String g : relatives) {
						tmp += g + "\n";
					}
					frame.getTextAreaMetaData().setText(tmp);
					
					}	catch (RemoteException e1) {
							e1.printStackTrace();
				}
				
			}
		});
		
		//most sick
		frame.getBtnSickness().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tmp = "";
				
				try {
					String[] sickness  = proxy.getAllSickEmployees2004Java();
					
					for(String g : sickness) {
						tmp += g + "\n";
					}
					frame.getTextAreaMetaData().setText(tmp);
					
					}	catch (RemoteException e1) {
							e1.printStackTrace();
				}

			}
		});
		
		//most absent
		frame.getBtnMostAbsent().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tmp = "";
				
				try {
					String[] mostAbsent  = proxy.getMostAbsentEmployeeJava();
					
					for(String g : mostAbsent) {
						tmp += g + "\n";
					}
					frame.getTextAreaMetaData().setText(tmp);
					
					}	catch (RemoteException e1) {
							e1.printStackTrace();
				}

			}
			
		});
		
		//all keys
		frame.getBtnShowAllKeys().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		

				String tmp = "";
				
				try {
					String[] allKeys  = proxy.getAllKeysJava();
					
					for(String g : allKeys) {
						tmp += g + "\n";
					}
					frame.getTextAreaMetaData().setText(tmp);
					
					}	catch (RemoteException e1) {
							e1.printStackTrace();
				}
			}
		});
		
		
		
		//all indexes
		frame.getBtnAllIndexes().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tmp = "";
				
				try {
					String[] allIndex  = proxy.getAllIndexJava();
					
					for(String g : allIndex) {
						tmp += g + "\n";
					}
					frame.getTextAreaMetaData().setText(tmp);
					
					}	catch (RemoteException e1) {
							e1.printStackTrace();
				}
				
			}
		});
		
		//all constraints
		frame.getBtnConstraints().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tmp = "";
				
				try {
					String[] allTableConstrains  = proxy.getAllTableConstraintsJava();
					
					for(String g : allTableConstrains) {
						tmp += g + "\n";
					}
					frame.getTextAreaMetaData().setText(tmp);
					
					}	catch (RemoteException e1) {
							e1.printStackTrace();
				}
			}
		});
		
		//all tables, solution 1
		frame.getBtnAllTables1().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tmp = "";
				
				try {
					String[] allTable1  = proxy.getAllTables1Java();
					
					for(String g : allTable1) {
						tmp += g + "\n";
					}
					frame.getTextAreaMetaData().setText(tmp);
					
					}	catch (RemoteException e1) {
							e1.printStackTrace();
				}
			}
		});
		
		//all tables, solution 2
		frame.getBtnAllTables2().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tmp = "";
				
				try {
					String[] allTable2  = proxy.getAllTables2Java();
					
					for(String g : allTable2) {
						tmp += g + "\n";
					}
					frame.getTextAreaMetaData().setText(tmp);
					
					}	catch (RemoteException e1) {
							e1.printStackTrace();
				}
			}
		});
		
		//all columns, solution 1 
		frame.getBtnAllColumns1().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tmp = "";
				
				try {
					String[] allColumns1  = proxy.getAllColumnsEmployees1Java();
					
					for(String g : allColumns1) {
						tmp += g + "\n";
					}
					frame.getTextAreaMetaData().setText(tmp);
					
					}	catch (RemoteException e1) {
							e1.printStackTrace();
				}
			}
		});
		
		//all columns, solution 2 
				frame.getBtnAllColumns2().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String tmp = "";
						
						try {
							String[] allColumns2  = proxy.getAllColumnsEmployees2Java();
							
							for(String g : allColumns2) {
								tmp += g + "\n";
							}
							frame.getTextAreaMetaData().setText(tmp);
							
							}	catch (RemoteException e1) {
									e1.printStackTrace();
						}
					}
				});
						
	
}
}
